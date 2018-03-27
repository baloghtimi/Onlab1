/**
 */
package org.mondo.collaboration.security.increment.vocabulary.impl;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.mondo.collaboration.security.increment.vocabulary.AccessibilityLevel;
import org.mondo.collaboration.security.increment.vocabulary.OperationType;
import org.mondo.collaboration.security.increment.vocabulary.VocabularyFactory;
import org.mondo.collaboration.security.increment.vocabulary.VocabularyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VocabularyPackageImpl extends EPackageImpl implements VocabularyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum accessibilityLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operationTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.mondo.collaboration.security.increment.vocabulary.VocabularyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VocabularyPackageImpl() {
		super(eNS_URI, VocabularyFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link VocabularyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VocabularyPackage init() {
		if (isInited)
			return (VocabularyPackage) EPackage.Registry.INSTANCE.getEPackage(VocabularyPackage.eNS_URI);

		// Obtain or create and register package
		VocabularyPackageImpl theVocabularyPackage = (VocabularyPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof VocabularyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new VocabularyPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theVocabularyPackage.createPackageContents();

		// Initialize created meta-data
		theVocabularyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVocabularyPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VocabularyPackage.eNS_URI, theVocabularyPackage);
		return theVocabularyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAccessibilityLevel() {
		return accessibilityLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOperationType() {
		return operationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocabularyFactory getVocabularyFactory() {
		return (VocabularyFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create enums
		accessibilityLevelEEnum = createEEnum(ACCESSIBILITY_LEVEL);
		operationTypeEEnum = createEEnum(OPERATION_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Initialize enums and add enum literals
		initEEnum(accessibilityLevelEEnum, AccessibilityLevel.class, "AccessibilityLevel");
		addEEnumLiteral(accessibilityLevelEEnum, AccessibilityLevel.ALLOW);
		addEEnumLiteral(accessibilityLevelEEnum, AccessibilityLevel.DENY);

		initEEnum(operationTypeEEnum, OperationType.class, "OperationType");
		addEEnumLiteral(operationTypeEEnum, OperationType.READ);
		addEEnumLiteral(operationTypeEEnum, OperationType.WRITE);

		// Create resource
		createResource(eNS_URI);
	}

} //VocabularyPackageImpl
