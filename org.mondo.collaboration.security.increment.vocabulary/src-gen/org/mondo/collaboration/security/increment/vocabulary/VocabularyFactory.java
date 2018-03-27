/**
 */
package org.mondo.collaboration.security.increment.vocabulary;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.mondo.collaboration.security.increment.vocabulary.VocabularyPackage
 * @generated
 */
public interface VocabularyFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VocabularyFactory eINSTANCE = org.mondo.collaboration.security.increment.vocabulary.impl.VocabularyFactoryImpl
			.init();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VocabularyPackage getVocabularyPackage();

} //VocabularyFactory
