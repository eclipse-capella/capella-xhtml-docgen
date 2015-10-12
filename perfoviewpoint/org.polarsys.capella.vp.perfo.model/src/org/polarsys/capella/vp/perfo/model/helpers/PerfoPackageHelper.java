/*******************************************************************************
 * Copyright (c) 2006, 2015 Thales Global Services
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 * 
 *   Contributors:
 *      Thales - initial API and implementation
 ******************************************************************************/

package org.polarsys.capella.vp.perfo.model.helpers;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.IHelper;
import org.polarsys.capella.vp.perfo.perfo.PerformanceCapacity;
import org.polarsys.capella.vp.perfo.perfo.PerformanceConsumption;
import org.polarsys.capella.vp.perfo.perfo.PerformanceCriteria;
import org.polarsys.capella.vp.perfo.perfo.UnityElement;
import org.polarsys.capella.vp.perfo.perfo.timeCapacity;
import org.polarsys.capella.vp.perfo.perfo.timeConsumption;

/**
 * @generated 
 */
public class PerfoPackageHelper implements IHelper {

	/**
	 * @generated
	 */
	public Object getValue(EObject object, EStructuralFeature feature,
			EAnnotation annotation) {
		Object ret = null;

		if (ret == null && object instanceof PerformanceCriteria) {
			ret = PerformanceCriteriaHelper.getInstance().doSwitch(
					(PerformanceCriteria) object, feature);
		}
		if (ret == null && object instanceof PerformanceConsumption) {
			ret = PerformanceConsumptionHelper.getInstance().doSwitch(
					(PerformanceConsumption) object, feature);
		}
		if (ret == null && object instanceof PerformanceCapacity) {
			ret = PerformanceCapacityHelper.getInstance().doSwitch(
					(PerformanceCapacity) object, feature);
		}
		if (ret == null && object instanceof timeConsumption) {
			ret = TimeConsumptionHelper.getInstance().doSwitch(
					(timeConsumption) object, feature);
		}
		if (ret == null && object instanceof timeCapacity) {
			ret = TimeCapacityHelper.getInstance().doSwitch(
					(timeCapacity) object, feature);
		}
		if (ret == null && object instanceof UnityElement) {
			ret = UnityElementHelper.getInstance().doSwitch(
					(UnityElement) object, feature);
		}
		return ret;
	}

}
