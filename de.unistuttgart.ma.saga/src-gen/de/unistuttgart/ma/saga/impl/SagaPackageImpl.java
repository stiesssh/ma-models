/**
 */
package de.unistuttgart.ma.saga.impl;

import de.unistuttgart.gropius.GropiusPackage;

import de.unistuttgart.gropius.impl.GropiusPackageImpl;

import de.unistuttgart.ma.saga.ChainLink;
import de.unistuttgart.ma.saga.ComponentAdapter;
import de.unistuttgart.ma.saga.ComponentInterfaceAdapter;
import de.unistuttgart.ma.saga.ElementWithSLO;
import de.unistuttgart.ma.saga.IdentifiableElement;
import de.unistuttgart.ma.saga.Impact;
import de.unistuttgart.ma.saga.Notification;
import de.unistuttgart.ma.saga.Project;
import de.unistuttgart.ma.saga.Saga;
import de.unistuttgart.ma.saga.SagaFactory;
import de.unistuttgart.ma.saga.SagaPackage;
import de.unistuttgart.ma.saga.SagaStep;
import de.unistuttgart.ma.saga.Violation;

import gropius.slo.SloPackage;

import gropius.slo.impl.SloPackageImpl;

import org.eclipse.bpmn2.Bpmn2Package;

import org.eclipse.bpmn2.di.BpmnDiPackage;

import org.eclipse.bpmn2.di.impl.BpmnDiPackageImpl;

import org.eclipse.bpmn2.impl.Bpmn2PackageImpl;

import org.eclipse.dd.dc.DcPackage;

import org.eclipse.dd.dc.impl.DcPackageImpl;

import org.eclipse.dd.di.DiPackage;

import org.eclipse.dd.di.impl.DiPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SagaPackageImpl extends EPackageImpl implements SagaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentAdapterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentInterfaceAdapterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sagaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sagaStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementWithSLOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass violationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass impactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chainLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifiableElementEClass = null;

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
	 * @see de.unistuttgart.ma.saga.SagaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SagaPackageImpl() {
		super(eNS_URI, SagaFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SagaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SagaPackage init() {
		if (isInited) return (SagaPackage)EPackage.Registry.INSTANCE.getEPackage(SagaPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSagaPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SagaPackageImpl theSagaPackage = registeredSagaPackage instanceof SagaPackageImpl ? (SagaPackageImpl)registeredSagaPackage : new SagaPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Bpmn2Package.eNS_URI);
		Bpmn2PackageImpl theBpmn2Package = (Bpmn2PackageImpl)(registeredPackage instanceof Bpmn2PackageImpl ? registeredPackage : Bpmn2Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DiPackage.eNS_URI);
		DiPackageImpl theDiPackage = (DiPackageImpl)(registeredPackage instanceof DiPackageImpl ? registeredPackage : DiPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BpmnDiPackage.eNS_URI);
		BpmnDiPackageImpl theDiPackage_1 = (BpmnDiPackageImpl)(registeredPackage instanceof BpmnDiPackageImpl ? registeredPackage : BpmnDiPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DcPackage.eNS_URI);
		DcPackageImpl theDcPackage = (DcPackageImpl)(registeredPackage instanceof DcPackageImpl ? registeredPackage : DcPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SloPackage.eNS_URI);
		SloPackageImpl theSloPackage = (SloPackageImpl)(registeredPackage instanceof SloPackageImpl ? registeredPackage : SloPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GropiusPackage.eNS_URI);
		GropiusPackageImpl theGropiusPackage = (GropiusPackageImpl)(registeredPackage instanceof GropiusPackageImpl ? registeredPackage : GropiusPackage.eINSTANCE);

		// Load packages
		theBpmn2Package.loadPackage();

		// Create package meta-data objects
		theSagaPackage.createPackageContents();
		theDiPackage.createPackageContents();
		theDiPackage_1.createPackageContents();
		theDcPackage.createPackageContents();
		theSloPackage.createPackageContents();
		theGropiusPackage.createPackageContents();

		// Initialize created meta-data
		theSagaPackage.initializePackageContents();
		theDiPackage.initializePackageContents();
		theDiPackage_1.initializePackageContents();
		theDcPackage.initializePackageContents();
		theSloPackage.initializePackageContents();
		theGropiusPackage.initializePackageContents();

		// Fix loaded packages
		theBpmn2Package.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theSagaPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SagaPackage.eNS_URI, theSagaPackage);
		return theSagaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProject() {
		return projectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_Sagas() {
		return (EReference)projectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_Processes() {
		return (EReference)projectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_Components() {
		return (EReference)projectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_Notifications() {
		return (EReference)projectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentAdapter() {
		return componentAdapterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentInterfaceAdapter() {
		return componentInterfaceAdapterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInterfaceAdapter_NextLevelElements() {
		return (EReference)componentInterfaceAdapterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSaga() {
		return sagaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSaga_Steps() {
		return (EReference)sagaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSagaStep() {
		return sagaStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSagaStep_NextLevelElements() {
		return (EReference)sagaStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSagaStep_NextStep() {
		return (EReference)sagaStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementWithSLO() {
		return elementWithSLOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementWithSLO_SloRules() {
		return (EReference)elementWithSLOEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViolation() {
		return violationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViolation_PassingImpacts() {
		return (EReference)violationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViolation_ViolatedRule() {
		return (EReference)violationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImpact() {
		return impactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImpact_CausedBy() {
		return (EReference)impactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChainLink() {
		return chainLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChainLink_LocationId() {
		return (EAttribute)chainLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotification() {
		return notificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotification_Chainlinks() {
		return (EReference)notificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotification_TopLevelImpact() {
		return (EReference)notificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifiableElement() {
		return identifiableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiableElement_Id() {
		return (EAttribute)identifiableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiableElement_Name() {
		return (EAttribute)identifiableElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SagaFactory getSagaFactory() {
		return (SagaFactory)getEFactoryInstance();
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
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		projectEClass = createEClass(PROJECT);
		createEReference(projectEClass, PROJECT__SAGAS);
		createEReference(projectEClass, PROJECT__PROCESSES);
		createEReference(projectEClass, PROJECT__COMPONENTS);
		createEReference(projectEClass, PROJECT__NOTIFICATIONS);

		componentAdapterEClass = createEClass(COMPONENT_ADAPTER);

		componentInterfaceAdapterEClass = createEClass(COMPONENT_INTERFACE_ADAPTER);
		createEReference(componentInterfaceAdapterEClass, COMPONENT_INTERFACE_ADAPTER__NEXT_LEVEL_ELEMENTS);

		sagaEClass = createEClass(SAGA);
		createEReference(sagaEClass, SAGA__STEPS);

		sagaStepEClass = createEClass(SAGA_STEP);
		createEReference(sagaStepEClass, SAGA_STEP__NEXT_LEVEL_ELEMENTS);
		createEReference(sagaStepEClass, SAGA_STEP__NEXT_STEP);

		elementWithSLOEClass = createEClass(ELEMENT_WITH_SLO);
		createEReference(elementWithSLOEClass, ELEMENT_WITH_SLO__SLO_RULES);

		violationEClass = createEClass(VIOLATION);
		createEReference(violationEClass, VIOLATION__PASSING_IMPACTS);
		createEReference(violationEClass, VIOLATION__VIOLATED_RULE);

		impactEClass = createEClass(IMPACT);
		createEReference(impactEClass, IMPACT__CAUSED_BY);

		chainLinkEClass = createEClass(CHAIN_LINK);
		createEAttribute(chainLinkEClass, CHAIN_LINK__LOCATION_ID);

		notificationEClass = createEClass(NOTIFICATION);
		createEReference(notificationEClass, NOTIFICATION__CHAINLINKS);
		createEReference(notificationEClass, NOTIFICATION__TOP_LEVEL_IMPACT);

		identifiableElementEClass = createEClass(IDENTIFIABLE_ELEMENT);
		createEAttribute(identifiableElementEClass, IDENTIFIABLE_ELEMENT__ID);
		createEAttribute(identifiableElementEClass, IDENTIFIABLE_ELEMENT__NAME);
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
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		Bpmn2Package theBpmn2Package = (Bpmn2Package)EPackage.Registry.INSTANCE.getEPackage(Bpmn2Package.eNS_URI);
		GropiusPackage theGropiusPackage = (GropiusPackage)EPackage.Registry.INSTANCE.getEPackage(GropiusPackage.eNS_URI);
		SloPackage theSloPackage = (SloPackage)EPackage.Registry.INSTANCE.getEPackage(SloPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		projectEClass.getESuperTypes().add(this.getIdentifiableElement());
		componentAdapterEClass.getESuperTypes().add(this.getElementWithSLO());
		componentAdapterEClass.getESuperTypes().add(theGropiusPackage.getComponent());
		componentInterfaceAdapterEClass.getESuperTypes().add(this.getElementWithSLO());
		componentInterfaceAdapterEClass.getESuperTypes().add(theGropiusPackage.getComponentInterface());
		sagaEClass.getESuperTypes().add(this.getIdentifiableElement());
		sagaStepEClass.getESuperTypes().add(this.getIdentifiableElement());
		violationEClass.getESuperTypes().add(this.getChainLink());
		impactEClass.getESuperTypes().add(this.getChainLink());
		notificationEClass.getESuperTypes().add(this.getIdentifiableElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(projectEClass, Project.class, "Project", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProject_Sagas(), this.getSaga(), null, "sagas", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Processes(), theBpmn2Package.getProcess(), null, "processes", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Components(), theGropiusPackage.getComponent(), null, "components", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Notifications(), this.getNotification(), null, "notifications", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentAdapterEClass, ComponentAdapter.class, "ComponentAdapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(componentInterfaceAdapterEClass, ComponentInterfaceAdapter.class, "ComponentInterfaceAdapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentInterfaceAdapter_NextLevelElements(), this.getSagaStep(), null, "nextLevelElements", null, 0, -1, ComponentInterfaceAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sagaEClass, Saga.class, "Saga", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSaga_Steps(), this.getSagaStep(), null, "steps", null, 0, -1, Saga.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sagaStepEClass, SagaStep.class, "SagaStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSagaStep_NextLevelElements(), theBpmn2Package.getTask(), null, "nextLevelElements", null, 1, -1, SagaStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSagaStep_NextStep(), this.getSagaStep(), null, "nextStep", null, 0, 1, SagaStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementWithSLOEClass, ElementWithSLO.class, "ElementWithSLO", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElementWithSLO_SloRules(), theSloPackage.getSloRule(), null, "sloRules", null, 0, -1, ElementWithSLO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(violationEClass, Violation.class, "Violation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViolation_PassingImpacts(), this.getChainLink(), null, "passingImpacts", null, 0, -1, Violation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getViolation_ViolatedRule(), theSloPackage.getSloRule(), null, "violatedRule", null, 1, 1, Violation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(impactEClass, Impact.class, "Impact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImpact_CausedBy(), this.getChainLink(), null, "causedBy", null, 1, 1, Impact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chainLinkEClass, ChainLink.class, "ChainLink", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChainLink_LocationId(), ecorePackage.getEString(), "locationId", null, 1, 1, ChainLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notificationEClass, Notification.class, "Notification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNotification_Chainlinks(), this.getChainLink(), null, "chainlinks", null, 0, -1, Notification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNotification_TopLevelImpact(), this.getImpact(), null, "topLevelImpact", null, 1, 1, Notification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identifiableElementEClass, IdentifiableElement.class, "IdentifiableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifiableElement_Id(), ecorePackage.getEString(), "id", null, 1, 1, IdentifiableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentifiableElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, IdentifiableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SagaPackageImpl
