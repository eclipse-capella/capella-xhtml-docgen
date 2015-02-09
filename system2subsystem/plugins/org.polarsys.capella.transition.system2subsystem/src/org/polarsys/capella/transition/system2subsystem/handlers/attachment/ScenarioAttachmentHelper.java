/*******************************************************************************
 * Copyright (c) 2006, 2015 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.transition.system2subsystem.handlers.attachment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.osgi.util.NLS;
import org.polarsys.capella.common.data.activity.ActivityNode;
import org.polarsys.capella.common.data.modellingcore.AbstractType;
import org.polarsys.capella.common.helpers.EObjectExt;
import org.polarsys.capella.common.helpers.EcoreUtil2;
import org.polarsys.capella.common.ui.services.helper.EObjectLabelProviderHelper;
import org.polarsys.capella.core.data.cs.Component;
import org.polarsys.capella.core.data.cs.ExchangeItemAllocation;
import org.polarsys.capella.core.data.cs.Interface;
import org.polarsys.capella.core.data.cs.Part;
import org.polarsys.capella.core.data.fa.AbstractFunction;
import org.polarsys.capella.core.data.fa.ComponentExchange;
import org.polarsys.capella.core.data.fa.ComponentFunctionalAllocation;
import org.polarsys.capella.core.data.fa.FaPackage;
import org.polarsys.capella.core.data.fa.FunctionalExchange;
import org.polarsys.capella.core.data.helpers.interaction.services.SequenceMessageExt;
import org.polarsys.capella.core.data.information.AbstractEventOperation;
import org.polarsys.capella.core.data.information.AbstractInstance;
import org.polarsys.capella.core.data.information.InformationPackage;
import org.polarsys.capella.core.data.information.Partition;
import org.polarsys.capella.core.data.information.PartitionableElement;
import org.polarsys.capella.core.data.information.Port;
import org.polarsys.capella.core.data.interaction.AbstractEnd;
import org.polarsys.capella.core.data.interaction.Event;
import org.polarsys.capella.core.data.interaction.EventReceiptOperation;
import org.polarsys.capella.core.data.interaction.EventSentOperation;
import org.polarsys.capella.core.data.interaction.ExecutionEnd;
import org.polarsys.capella.core.data.interaction.InstanceRole;
import org.polarsys.capella.core.data.interaction.InteractionPackage;
import org.polarsys.capella.core.data.interaction.MessageEnd;
import org.polarsys.capella.core.data.interaction.MessageKind;
import org.polarsys.capella.core.data.interaction.Scenario;
import org.polarsys.capella.core.data.interaction.SequenceMessage;
import org.polarsys.capella.core.data.oa.ActivityAllocation;
import org.polarsys.capella.core.data.oa.OperationalActivity;
import org.polarsys.capella.core.data.oa.Role;
import org.polarsys.capella.core.data.oa.RoleAllocation;
import org.polarsys.capella.core.model.helpers.ComponentExchangeExt;
import org.polarsys.capella.core.model.utils.ListExt;
import org.polarsys.capella.core.transition.common.handlers.IHandler;
import org.polarsys.capella.core.transition.common.handlers.resolver.IResolverHandler;
import org.polarsys.capella.core.transition.common.handlers.resolver.ResolverHelper;
import org.polarsys.capella.core.transition.common.handlers.traceability.TraceabilityHandlerHelper;
import org.polarsys.capella.transition.system2subsystem.constants.ISubSystemConstants;
import org.polarsys.capella.transition.system2subsystem.constants.Messages;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;


/**
 * 
 */
public class ScenarioAttachmentHelper extends AbstractScenarioHelper implements IHandler {

  public static ScenarioAttachmentHelper getInstance(IContext context_p) {
    ScenarioAttachmentHelper handler = (ScenarioAttachmentHelper) context_p.get(ISubSystemConstants.SCENARIO_ATTACHMENT_HELPER);
    if (handler == null) {
      handler = new ScenarioAttachmentHelper();
      handler.init(context_p);
      context_p.put(ISubSystemConstants.SCENARIO_ATTACHMENT_HELPER, handler);
    }
    return handler;
  }

  private static String UNWANTED_OBJECTS = "unwantedObjects"; //$NON-NLS-1$

  @SuppressWarnings("unchecked")
  private List<EObject> getUnwantedList(IContext _transfo) {
    if (_transfo.get(UNWANTED_OBJECTS) == null) {
      _transfo.put(UNWANTED_OBJECTS, new ArrayList<EObject>());
    }
    return (List<EObject>) _transfo.get(UNWANTED_OBJECTS);
  }

  public boolean isUnwantedObject(EObject ir_p, IContext _transfo) {
    return getUnwantedList(_transfo).contains(ir_p);
  }

  public void registerUnwantedObject(EObject ir_p, IContext _transfo) {
    getUnwantedList(_transfo).add(ir_p);
  }

  /** List of instance roles */
  private static HashMap<Scenario, HashMap<AbstractInstance, InstanceRole>> _instanceRoles = null;

  /**
   * Cleanup the finalizer
   */
  private void clean() {

    if (_instanceRoles != null) {
      _instanceRoles.clear();
      _instanceRoles = null;
    }

  }

  private static HashMap<AbstractInstance, InstanceRole> getInstanceRoles(Scenario scenario) {
    if (_instanceRoles == null) {
      _instanceRoles = new HashMap<Scenario, HashMap<AbstractInstance, InstanceRole>>();
    }
    if (_instanceRoles.get(scenario) == null) {
      _instanceRoles.put(scenario, new HashMap<AbstractInstance, InstanceRole>());
    }
    return _instanceRoles.get(scenario);
  }

  public InstanceRole getInstanceRole(Scenario scenario, AbstractInstance ir_p) {
    return getInstanceRoles(scenario).get(ir_p);
  }

  public void registerInstanceRole(Scenario scenario, AbstractInstance instance, InstanceRole role) {
    getInstanceRoles(scenario).put(instance, role);
  }

  public IStatus init(IContext context_p) {
    return Status.OK_STATUS;
  }

  public IStatus dispose(IContext context_p) {
    clean();
    return Status.OK_STATUS;
  }

  static boolean mustInverse(AbstractEnd end, int i) {
    if (end instanceof MessageEnd) {
      return mustInverse(((MessageEnd) end).getMessage(), i);
    }
    if (end instanceof ExecutionEnd) {
      return mustInverse((AbstractEnd) ((ExecutionEnd) end).getExecution().getStart(), i);
    }
    return false;
  }

  static boolean mustInverse(SequenceMessage message_p, int i) {
    return false;
  }

  /**
   * Retrieve related instances which will be used in the transitioned instance role of the given instance role
   */
  @SuppressWarnings("unchecked")
  public List<AbstractInstance> getTracedInstances(InstanceRole role, IContext transfo_p) {
    List<AbstractInstance> partBounds = new ArrayList<AbstractInstance>();

    for (AbstractEnd end : role.getAbstractEnds()) {
      AbstractEventOperation operation = getOperation(end, transfo_p);
      AbstractInstance instance = getRelatedInstance(end, end, operation, transfo_p);
      if (instance != null) {
        partBounds.add(instance);
      }// else {
       //  registerUnwantedObject(end.getEvent(), transfo_p);
       //}
    }

    if ((partBounds.size() == 0) && (role.getRepresentedInstance() != null)) {
      String messageTxxt = Messages.Scenario_MultipleTransitionedElements;
      List<? extends EObject> availables = new ArrayList<EObject>();
      availables.addAll((Collection) getRelatedTracedInstances(role.getRepresentedInstance(), transfo_p));

      if (availables.size() <= 1) {
        partBounds.addAll((List) availables);
      } else {
        IResolverHandler resolver = ResolverHelper.getInstance(transfo_p);
        if (resolver != null) {
          List<EObject> res =
              resolver.resolve(role.getRepresentedInstance(), (List) availables, "TITLE", messageTxxt, false, transfo_p,
                  new EObject[] { role.getRepresentedInstance() });
          if ((res != null) && (res.size() > 0)) {
            partBounds.add((AbstractInstance) res.get(0));
          }
        }
      }
    }

    partBounds = (List) ListExt.removeDuplicates((List) partBounds);

    return partBounds;
  }

  /**
   * @param role_p
   * @return
   */
  protected Collection<AbstractInstance> getRelatedTracedInstances(AbstractInstance instance_p, IContext context_p) {
    List<AbstractInstance> partBounds = new ArrayList<AbstractInstance>();

    partBounds.addAll((Collection) TraceabilityHandlerHelper.getInstance(context_p).retrieveTracedElements(instance_p, context_p,
        InformationPackage.Literals.ABSTRACT_INSTANCE));

    if (partBounds.size() == 0) {
      if (instance_p instanceof Part) {
        AbstractType type = instance_p.getAbstractType();
        for (EObject element : TraceabilityHandlerHelper.getInstance(context_p).retrieveTracedElements(type, context_p,
            InformationPackage.Literals.PARTITIONABLE_ELEMENT)) {
          if (element instanceof PartitionableElement) {
            partBounds.addAll(((PartitionableElement) element).getRepresentingPartitions());
          }
        }
      }
    }

    return partBounds;
  }

  /**
   * Retrieve an instance for the given end and given operation_p. sourceEnd is used to restrict
   */
  @SuppressWarnings("unchecked")
  public AbstractInstance getRelatedInstance(AbstractEnd end, AbstractEnd sourceEnd, AbstractEventOperation operation_p, IContext transfo_p) {
    List<AbstractInstance> partBounds = new ArrayList<AbstractInstance>();

    boolean isLinked = false;
    List<AbstractInstance> relatedParts = getRelatedInstances(end, sourceEnd, operation_p, transfo_p);

    if (sourceEnd != null) {
      for (AbstractInstance relatedPart : relatedParts) {
        for (InstanceRole relatedRole : sourceEnd.getCoveredInstanceRoles()) {
          if (isCovered(relatedPart, relatedRole, transfo_p)) {
            isLinked = true;
            partBounds.add(relatedPart);
          }
        }
      }
    }

    if (!isLinked) {
      partBounds.addAll(relatedParts);
    }

    partBounds = (List) ListExt.removeDuplicates((List) partBounds);

    if (partBounds.size() == 0) {
      return null;
    } else if (partBounds.size() == 1) {
      return partBounds.get(0);
    }

    IResolverHandler resolver = ResolverHelper.getInstance(transfo_p);
    if (resolver == null) {
      return partBounds.get(0);
    }

    SequenceMessage message = getRelatedSequenceMessage(sourceEnd);
    boolean isSource = isEndRelatedToSendingRole(sourceEnd);

    String messageTxt =
        NLS.bind((isSource ? Messages.Scenario_SourceMessage : Messages.Scenario_TargetMessage),
            new Object[] { getPosition(message), EObjectLabelProviderHelper.getText(message), EObjectLabelProviderHelper.getText(operation_p),
                          EObjectLabelProviderHelper.getMetaclassLabel(operation_p, true) });

    EObject context = (isSource ? message.getSendingEnd() : message.getReceivingEnd());
    return (Partition) resolver.resolve(operation_p, (List) partBounds, "TITLE", messageTxt, false, transfo_p, new EObject[] { message, operation_p, context })
        .get(0);
  }

  /**
   * Returns whether the relatedPart is covered by the relatedRole
   * @param relatedPart_p
   * @param relatedRole_p
   * @return
   */
  public boolean isCovered(AbstractInstance relatedPart_p, InstanceRole relatedRole_p, IContext context_p) {
    return getRelatedTracedInstances(relatedRole_p.getRepresentedInstance(), context_p).contains(relatedPart_p);
  }

  /**
   * @param message_p
   * @return
   */
  private static String getPosition(SequenceMessage message_p) {
    EObject container = message_p.eContainer();
    EStructuralFeature reference = message_p.eContainingFeature();
    Object value = null;
    int position = 1;

    if ((container != null) && (reference != null) && reference.isMany()) {
      value = container.eGet(reference);
      if (value instanceof List<?>) {
        position = ((List<?>) value).indexOf(message_p) + 1;
      }
    }

    switch (position % 10) {
      case 1:
        return position + Messages.Scenario_First;
      case 2:
        return position + Messages.Scenario_Second;
      case 3:
        return position + Messages.Scenario_Third;
      default:
        return position + Messages.Scenario_Nth;
    }
  }

  /**
   * Retrieve for an abstract end and a related operation, instances which are related to the bound of the operation according to the end of the message For a
   * bound of a ce, returns related parts For a bound of a fe, returns related functions, or part according to scenario kind
   */
  protected List<AbstractInstance> getRelatedInstances(AbstractEnd end, AbstractEnd sourceEnd, EObject operation_p, IContext transfo_p) {

    Scenario scenario = (Scenario) EcoreUtil2.getFirstContainer(sourceEnd, InteractionPackage.Literals.SCENARIO);
    // On functional scenario, we return directly related function, otherwise, allocating parts
    boolean shouldRetrieveAllocating = !isFunctionalScenario(scenario);

    Event event = end.getEvent();
    boolean isSource = false;

    if (event instanceof EventSentOperation) {
      isSource = true;
    } else {
      isSource = false;
    }

    // Source and target
    if (sourceEnd instanceof MessageEnd) {
      if (((MessageEnd) sourceEnd).getMessage() != null) {
        isSource = (((MessageEnd) sourceEnd).getMessage().getKind() == MessageKind.REPLY ? !isSource : isSource);
      }
    }

    List<AbstractInstance> partBounds = new ArrayList<AbstractInstance>();

    EObject operation = operation_p;
    if (operation != null) {

      if (operation instanceof ExchangeItemAllocation) {
        ExchangeItemAllocation element = (ExchangeItemAllocation) operation;
        Interface itf = element.getAllocatingInterface();

        HashSet<Component> components = new HashSet<Component>();
        List<EReference> refs = new ArrayList<EReference>();
        if (isSource) {
          components.addAll(itf.getUserComponents());
          refs.add(InformationPackage.Literals.PORT__REQUIRED_INTERFACES);
        } else {
          components.addAll(itf.getImplementorComponents());
          refs.add(InformationPackage.Literals.PORT__PROVIDED_INTERFACES);
        }

        for (Object objectRef : EObjectExt.getReferencers(itf, refs)) {
          if (objectRef instanceof Port) {
            EObject objContainer = ((Port) objectRef).eContainer();
            if (objContainer instanceof Component) {
              components.add((Component) objContainer);
            }
          }
        }

        for (Component component : components) {
          partBounds.addAll(component.getRepresentingPartitions());
        }

      } else if (operation instanceof ComponentExchange) {
        // Retrieve related parts for a bound of a connection (the connected part or any representing parts of the connected type)
        Part partBound = null;
        Component typeBound = null;
        ComponentExchange connection = (ComponentExchange) operation;

        if (isSource || !connection.isOriented()) {
          // Retrieve parts for the source
          partBound = ComponentExchangeExt.getSourcePart((ComponentExchange) operation);
          typeBound = ComponentExchangeExt.getSourceComponent((ComponentExchange) operation);
          if (partBound != null) {
            partBounds.add(partBound);
          } else if (typeBound != null) {
            partBounds.addAll(typeBound.getRepresentingPartitions());
          }
        }

        if (!isSource || !connection.isOriented()) {
          // Retrieve parts for the target
          partBound = ComponentExchangeExt.getTargetPart((ComponentExchange) operation);
          typeBound = ComponentExchangeExt.getTargetComponent((ComponentExchange) operation);

          if (partBound != null) {
            partBounds.add(partBound);
          } else if (typeBound != null) {
            partBounds.addAll(typeBound.getRepresentingPartitions());
          }
        }

      } else if (operation instanceof FunctionalExchange) {
        // Retrieve related parts for a bound of a functional exchange (any representing parts of components allocating the function)
        FunctionalExchange exchange = (FunctionalExchange) operation;
        AbstractFunction function = null;

        ActivityNode current = exchange.getTarget();
        if (isSource) {
          current = exchange.getSource();
        }

        if (current != null) {
          if (current instanceof AbstractFunction) {
            function = (AbstractFunction) current;
          } else {
            function = (AbstractFunction) EcoreUtil2.getFirstContainer(current, FaPackage.Literals.ABSTRACT_FUNCTION);
          }
        }

        if (function != null) {
          if (shouldRetrieveAllocating) {
            for (ComponentFunctionalAllocation allocation : function.getComponentFunctionalAllocations()) {
              if ((allocation.getBlock() != null) && (allocation.getBlock() instanceof PartitionableElement)) {
                partBounds.addAll(((PartitionableElement) allocation.getBlock()).getRepresentingPartitions());
              }
            }

            if (function instanceof OperationalActivity) {
              for (ActivityAllocation allocation : ((OperationalActivity) function).getActivityAllocations()) {
                Role allocatingRole = allocation.getRole();
                if (allocatingRole != null) {
                  for (RoleAllocation roleAllocation : allocatingRole.getRoleAllocations()) {
                    if (roleAllocation.getEntity() != null) {
                      partBounds.addAll(((PartitionableElement) roleAllocation.getEntity()).getRepresentingPartitions());
                    }
                  }
                }
              }
            }

          } else {
            partBounds.add(function);
          }
        }
      }
    }

    List<AbstractInstance> partBoundsResult = new ArrayList<AbstractInstance>();
    for (AbstractInstance instance : partBounds) {
      for (EObject traced : getRelatedTracedInstances(instance, transfo_p)) {
        if (traced instanceof AbstractInstance) {
          partBoundsResult.add((AbstractInstance) traced);
        }
      }
    }
    return partBoundsResult;

  }

  /**
   * Returns the operation which should be replaced into the transitioned scenario
   */
  @SuppressWarnings("unchecked")
  public static AbstractEventOperation getTransitionedOperation(EObject element_p, IContext transfo_p) {

    if (element_p instanceof ExecutionEnd) {
      return getTransitionedOperation(((ExecutionEnd) element_p).getExecution().getStart(), transfo_p);
    }
    if (element_p instanceof AbstractEnd) {
      return getTransitionedOperation(((AbstractEnd) element_p).getEvent(), transfo_p);
    }

    if (element_p instanceof Event) {
      SequenceMessage message = getRelatedSequenceMessage((Event) element_p);
      AbstractEventOperation operation = getOperation(element_p, transfo_p);

      String messageTxxt = Messages.Scenario_MultipleTransitionedElements;

      Collection<? extends EObject> availables =
          TraceabilityHandlerHelper.getInstance(transfo_p).retrieveTracedElements(operation, transfo_p, InformationPackage.Literals.ABSTRACT_EVENT_OPERATION);
      if (availables.size() == 0) {
        return null;
      }
      if (availables.size() == 1) {
        return (AbstractEventOperation) availables.iterator().next();
      }
      IResolverHandler resolver = ResolverHelper.getInstance(transfo_p);
      if (resolver == null) {
        // If no resolver, return the first
        return (AbstractEventOperation) availables.iterator().next();
      }
      List<EObject> res = resolver.resolve(operation, (List) availables, "TITLE", messageTxxt, false, transfo_p, new EObject[] { operation, message });
      if ((res != null) && (res.size() > 0)) {
        return (AbstractEventOperation) res.get(0);
      }

    }

    return null;

  }

  /**
   * Should be message related to the event. If the message is a reply, should be the sender message to avoid different connections for sent and reply messages
   * @param event_p
   * @return
   */
  public static SequenceMessage getRelatedSequenceMessage(Event event_p) {
    for (EObject referencer : EObjectExt.getReferencers(event_p, InteractionPackage.Literals.ABSTRACT_END__EVENT)) {
      if (referencer instanceof AbstractEnd) {
        AbstractEnd end = (AbstractEnd) referencer;
        return getRelatedSequenceMessage(end);
      }
    }

    return null;
  }

  /**
   * Should be message related to the event. If the message is a reply, should be the sender message to avoid different connections for sent and reply messages
   * @param event_p
   * @return
   */
  public static SequenceMessage getRelatedSequenceMessage(AbstractEnd end_p) {
    AbstractEnd end = end_p;

    if (end instanceof ExecutionEnd) {
      ExecutionEnd eend = (ExecutionEnd) end;
      if (eend.getExecution() != null) {
        end = (AbstractEnd) eend.getExecution().getStart();
      }
    }

    if ((end != null) && (end instanceof MessageEnd)) {
      MessageEnd mend = (MessageEnd) end;
      SequenceMessage message = mend.getMessage();
      if (message.getKind() == MessageKind.REPLY) {
        message = SequenceMessageExt.getOppositeSequenceMessage(message);
      }
      return message;
    }
    return null;
  }

  /**
   * Returns whether the given end is an ends which is related to the sending instance role of the source message (for a reply message, should be the receiver
   * of the message)
   */
  public static boolean isEndRelatedToSendingRole(AbstractEnd end_p) {
    AbstractEnd end = end_p;

    if (end instanceof ExecutionEnd) {
      ExecutionEnd eend = (ExecutionEnd) end;
      if (eend.getExecution() != null) {
        end = (AbstractEnd) eend.getExecution().getStart();
      }
    }

    boolean result = false;
    if ((end != null) && (end instanceof MessageEnd)) {
      MessageEnd mend = (MessageEnd) end;
      SequenceMessage message = mend.getMessage();

      if (message.getKind() == MessageKind.REPLY) {
        result = mend.getEvent() instanceof EventReceiptOperation;
      } else {
        result = mend.getEvent() instanceof EventSentOperation;
      }
      if (mustInverse(message, 0)) {
        result = !result;
      }
    }
    return result;
  }

}
