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
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.common.data.modellingcore.AbstractExchangeItem;
import org.polarsys.capella.common.helpers.EObjectExt;
import org.polarsys.capella.core.data.cs.ExchangeItemAllocation;
import org.polarsys.capella.core.data.fa.AbstractFunction;
import org.polarsys.capella.core.data.fa.ComponentExchange;
import org.polarsys.capella.core.data.fa.FunctionalExchange;
import org.polarsys.capella.core.data.information.AbstractEventOperation;
import org.polarsys.capella.core.data.information.ExchangeItem;
import org.polarsys.capella.core.data.interaction.AbstractEnd;
import org.polarsys.capella.core.data.interaction.Event;
import org.polarsys.capella.core.data.interaction.EventReceiptOperation;
import org.polarsys.capella.core.data.interaction.EventSentOperation;
import org.polarsys.capella.core.data.interaction.Execution;
import org.polarsys.capella.core.data.interaction.ExecutionEnd;
import org.polarsys.capella.core.data.interaction.InstanceRole;
import org.polarsys.capella.core.data.interaction.InteractionPackage;
import org.polarsys.capella.core.data.interaction.MessageEnd;
import org.polarsys.capella.core.data.interaction.Scenario;
import org.polarsys.capella.core.data.interaction.ScenarioKind;
import org.polarsys.capella.core.data.interaction.SequenceMessage;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;

/**
 * 
 */
public class AbstractScenarioHelper {
  /**
   * Retrieve the operation related to the given scenario element_p
   * @param element_p
   * @return
   */
  public static AbstractEventOperation getOperation(EObject element_p, IContext transfo_p) {

    AbstractEventOperation operation = null;
    if (element_p instanceof ExecutionEnd) {
      element_p = ((ExecutionEnd) element_p).getExecution().getStart();
    }

    if (element_p instanceof SequenceMessage) {
      operation = ((SequenceMessage) element_p).getInvokedOperation();
    }
    if (element_p instanceof EventSentOperation) {
      operation = ((EventSentOperation) element_p).getOperation();
    }
    if (element_p instanceof EventReceiptOperation) {
      operation = ((EventReceiptOperation) element_p).getOperation();
    }

    if (element_p instanceof AbstractEnd) {
      return getOperation(((AbstractEnd) element_p).getEvent(), transfo_p);
    }

    return operation;
  }

  public static InstanceRole getOppositeCoveredIR(AbstractEnd end_p) {
    MessageEnd messageEnd = null;
    if (end_p instanceof ExecutionEnd) {
      messageEnd = (MessageEnd) ((ExecutionEnd) end_p).getExecution().getStart();

    } else if (end_p instanceof MessageEnd) {
      messageEnd = (MessageEnd) end_p;
    }

    if (messageEnd != null) {
      MessageEnd opposite =
          messageEnd.getMessage().getSendingEnd() == messageEnd ? messageEnd.getMessage().getReceivingEnd() : messageEnd.getMessage().getSendingEnd();
      if (opposite != null) {
        return opposite.getCovered();
      }
    }

    return null;
  }

  public static InstanceRole getOppositeCoveredIR(ExecutionEnd executionEnd_p) {
    MessageEnd me = (MessageEnd) executionEnd_p.getExecution().getStart();
    return getOppositeCoveredIR(me);
  }

  /**
   * @param exec_p
   */
  public static InstanceRole getOppositeCoveredIR(Execution exec_p) {
    return getOppositeCoveredIR((MessageEnd) exec_p.getStart());
  }

  @SuppressWarnings("unchecked")
  public static Collection<AbstractEnd> getDirectRelateds(MessageEnd exec_p) {
    List<AbstractEnd> ends = new ArrayList<AbstractEnd>();

    AbstractEnd firstBound = exec_p.getMessage().getSendingEnd();
    if (firstBound != null) {
      ends.add(firstBound);
    }

    AbstractEnd otherBound = exec_p.getMessage().getReceivingEnd();
    if (otherBound != null) {
      ends.add(otherBound);
      List<Execution> allocations = (List) EObjectExt.getReferencers(otherBound, InteractionPackage.Literals.TIME_LAPSE__START);
      for (Execution obj : allocations) {
        if (obj.getFinish() instanceof ExecutionEnd) {
          ends.add((ExecutionEnd) obj.getFinish());
        }
      }
    }

    return ends;
  }

  static AbstractEventOperation getOperation(Event e) {
    AbstractEventOperation operation = null;
    if (e instanceof EventSentOperation) {
      EventSentOperation eso = (EventSentOperation) e;
      operation = eso.getOperation();
    }
    if (e instanceof EventReceiptOperation) {
      EventReceiptOperation ero = (EventReceiptOperation) e;
      operation = ero.getOperation();
    }
    return operation;

  }

  @SuppressWarnings("unchecked")
  public static AbstractEnd getEndEnd(MessageEnd exec_p) {

    AbstractEnd receivingEnd = null;

    if (exec_p.getEvent() instanceof EventSentOperation) {
      receivingEnd = exec_p.getMessage().getReceivingEnd();

    } else if (exec_p.getEvent() instanceof EventReceiptOperation) {
      receivingEnd = exec_p;
    }

    if (receivingEnd != null) {
      List<Execution> allocations = (List) EObjectExt.getReferencers(receivingEnd, InteractionPackage.Literals.TIME_LAPSE__START);
      for (Execution obj : allocations) {
        if (obj.getFinish() != null) {
          if (obj.getFinish() instanceof ExecutionEnd) {
            return (AbstractEnd) obj.getFinish();

          } else if (obj.getFinish() instanceof MessageEnd) {
            SequenceMessage messageReply = ((MessageEnd) obj.getFinish()).getMessage();
            if (messageReply != null) {
              if (obj.getFinish().equals(messageReply.getSendingEnd()) && (messageReply.getReceivingEnd() != null)) {
                return messageReply.getReceivingEnd();
              }
              return messageReply.getSendingEnd();
            }
          }
        }
      }
    }

    return exec_p;
  }

  /**
   * An INTERACTION scenario can be a FUNCTIONAL scenario or an DATA_FLOW scenario
   */
  public boolean isFunctionalScenario(Scenario scenario_p) {

    if (scenario_p.getKind() == ScenarioKind.FUNCTIONAL) {
      return true;

    } else if (scenario_p.getKind() == ScenarioKind.INTERACTION) {
      for (InstanceRole role : scenario_p.getOwnedInstanceRoles()) {
        if ((role.getRepresentedInstance() != null) && (role.getRepresentedInstance() instanceof AbstractFunction)) {
          return true;
        }
      }
    }
    return false;
  }

  static List<ExchangeItem> getExchangeItems(SequenceMessage mesg_p) {
    MessageEnd end = mesg_p.getSendingEnd();
    if (end == null) {
      end = mesg_p.getReceivingEnd();
    }
    return getExchangeItems(end);
  }

  static List<ExchangeItem> getExchangeItems(Execution exec) {
    return getExchangeItems((AbstractEnd) exec.getStart());
  }

  static List<ExchangeItem> getExchangeItems(AbstractEnd end_p) {
    if (end_p == null) {
      return new ArrayList<ExchangeItem>();
    }
    Event e = end_p.getEvent();
    if (e == null) {
      return new ArrayList<ExchangeItem>();
    }
    if (end_p instanceof ExecutionEnd) {
      return getExchangeItems(((ExecutionEnd) end_p).getExecution());
    }
    return getExchangeItems(e);
  }

  static List<ExchangeItem> getExchangeItems(Event e) {
    List<ExchangeItem> result = new ArrayList<ExchangeItem>();
    AbstractEventOperation operation = null;

    operation = getOperation(e);
    if (operation instanceof ExchangeItem) {
      result.add((ExchangeItem) operation);
    }
    if (operation instanceof ExchangeItemAllocation) {
      ExchangeItemAllocation allocation = (ExchangeItemAllocation) operation;
      if ((allocation.getAllocatedItem() != null) && (allocation.getAllocatedItem() instanceof ExchangeItem)) {
        result.add(allocation.getAllocatedItem());
      }
    }
    if (operation instanceof FunctionalExchange) {
      FunctionalExchange fe = (FunctionalExchange) operation;
      result.addAll(fe.getExchangedItems());

    } else if (operation instanceof ComponentExchange) {
      ComponentExchange connection = (ComponentExchange) operation;
      for (AbstractExchangeItem item : connection.getConvoyedInformations()) {
        if (item instanceof ExchangeItem) {
          result.add((ExchangeItem) item);
        }
      }
    }

    return result;

  }

  @SuppressWarnings("unchecked")
  static Collection<AbstractEnd> getRelateds(MessageEnd exec_p) {
    List<AbstractEnd> ends = new ArrayList<AbstractEnd>();

    AbstractEnd firstBound = exec_p.getMessage().getSendingEnd();
    if (firstBound != null) {
      ends.add(firstBound);
    }

    AbstractEnd otherBound = exec_p.getMessage().getReceivingEnd();
    if (otherBound != null) {
      ends.add(otherBound);

      List<Execution> allocations = (List) EObjectExt.getReferencers(otherBound, InteractionPackage.Literals.TIME_LAPSE__START);
      for (Execution obj : allocations) {
        if (obj.getFinish() instanceof ExecutionEnd) {
          ends.add((ExecutionEnd) obj.getFinish());

        } else if (obj.getFinish() instanceof MessageEnd) {
          SequenceMessage messageReply = ((MessageEnd) obj.getFinish()).getMessage();
          if (messageReply != null) {
            firstBound = messageReply.getSendingEnd();
            if (firstBound != null) {
              ends.add(firstBound);
            }

            otherBound = messageReply.getReceivingEnd();
            if (otherBound != null) {
              ends.add(otherBound);
            }
          }
        }
      }
    }

    return ends;
  }

}
