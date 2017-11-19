/*******************************************************************************
 * (c) Crown owned copyright (2017) (UK Ministry of Defence)
 *
 * All rights reserved. This program and the accompanying materials are 
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *      University of Southampton - Initial API and implementation
 *******************************************************************************/

package ac.soton.coda.vhdl.impl;

import ac.soton.coda.vhdl.IVHDLIfClause;
import ac.soton.coda.vhdl.IVHDLPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class VHDLIfClause extends VHDLGuardedStatementElement implements IVHDLIfClause {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VHDLIfClause() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IVHDLPackage.Literals.VHDL_IF_CLAUSE;
	}

} //VHDLIfClause
