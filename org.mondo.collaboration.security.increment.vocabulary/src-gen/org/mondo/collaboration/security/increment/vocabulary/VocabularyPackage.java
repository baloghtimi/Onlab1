/**
 */
package org.mondo.collaboration.security.increment.vocabulary;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.mondo.collaboration.security.increment.vocabulary.VocabularyFactory
 * @model kind="package"
 * @generated
 */
public interface VocabularyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "vocabulary";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mondo.org/collaboration/security/increment/vocabulary";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "vocabulary";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VocabularyPackage eINSTANCE = org.mondo.collaboration.security.increment.vocabulary.impl.VocabularyPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.mondo.collaboration.security.increment.vocabulary.AccessibilityLevel <em>Accessibility Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mondo.collaboration.security.increment.vocabulary.AccessibilityLevel
	 * @see org.mondo.collaboration.security.increment.vocabulary.impl.VocabularyPackageImpl#getAccessibilityLevel()
	 * @generated
	 */
	int ACCESSIBILITY_LEVEL = 0;

	/**
	 * The meta object id for the '{@link org.mondo.collaboration.security.increment.vocabulary.OperationType <em>Operation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mondo.collaboration.security.increment.vocabulary.OperationType
	 * @see org.mondo.collaboration.security.increment.vocabulary.impl.VocabularyPackageImpl#getOperationType()
	 * @generated
	 */
	int OPERATION_TYPE = 1;

	/**
	 * Returns the meta object for enum '{@link org.mondo.collaboration.security.increment.vocabulary.AccessibilityLevel <em>Accessibility Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Accessibility Level</em>'.
	 * @see org.mondo.collaboration.security.increment.vocabulary.AccessibilityLevel
	 * @generated
	 */
	EEnum getAccessibilityLevel();

	/**
	 * Returns the meta object for enum '{@link org.mondo.collaboration.security.increment.vocabulary.OperationType <em>Operation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operation Type</em>'.
	 * @see org.mondo.collaboration.security.increment.vocabulary.OperationType
	 * @generated
	 */
	EEnum getOperationType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VocabularyFactory getVocabularyFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.mondo.collaboration.security.increment.vocabulary.AccessibilityLevel <em>Accessibility Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mondo.collaboration.security.increment.vocabulary.AccessibilityLevel
		 * @see org.mondo.collaboration.security.increment.vocabulary.impl.VocabularyPackageImpl#getAccessibilityLevel()
		 * @generated
		 */
		EEnum ACCESSIBILITY_LEVEL = eINSTANCE.getAccessibilityLevel();

		/**
		 * The meta object literal for the '{@link org.mondo.collaboration.security.increment.vocabulary.OperationType <em>Operation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mondo.collaboration.security.increment.vocabulary.OperationType
		 * @see org.mondo.collaboration.security.increment.vocabulary.impl.VocabularyPackageImpl#getOperationType()
		 * @generated
		 */
		EEnum OPERATION_TYPE = eINSTANCE.getOperationType();

	}

} //VocabularyPackage
