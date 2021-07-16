/**
 */
package de.unistuttgart.ma.saga.provider;

import de.unistuttgart.ma.saga.util.SagaAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SagaItemProviderAdapterFactory extends SagaAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SagaItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.unistuttgart.ma.saga.Project} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectItemProvider projectItemProvider;

	/**
	 * This creates an adapter for a {@link de.unistuttgart.ma.saga.Project}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProjectAdapter() {
		if (projectItemProvider == null) {
			projectItemProvider = new ProjectItemProvider(this);
		}

		return projectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.unistuttgart.ma.saga.ComponentAdapter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentAdapterItemProvider componentAdapterItemProvider;

	/**
	 * This creates an adapter for a {@link de.unistuttgart.ma.saga.ComponentAdapter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentAdapterAdapter() {
		if (componentAdapterItemProvider == null) {
			componentAdapterItemProvider = new ComponentAdapterItemProvider(this);
		}

		return componentAdapterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.unistuttgart.ma.saga.ComponentInterfaceAdapter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentInterfaceAdapterItemProvider componentInterfaceAdapterItemProvider;

	/**
	 * This creates an adapter for a {@link de.unistuttgart.ma.saga.ComponentInterfaceAdapter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentInterfaceAdapterAdapter() {
		if (componentInterfaceAdapterItemProvider == null) {
			componentInterfaceAdapterItemProvider = new ComponentInterfaceAdapterItemProvider(this);
		}

		return componentInterfaceAdapterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.unistuttgart.ma.saga.Saga} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SagaItemProvider sagaItemProvider;

	/**
	 * This creates an adapter for a {@link de.unistuttgart.ma.saga.Saga}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSagaAdapter() {
		if (sagaItemProvider == null) {
			sagaItemProvider = new SagaItemProvider(this);
		}

		return sagaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.unistuttgart.ma.saga.SagaStep} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SagaStepItemProvider sagaStepItemProvider;

	/**
	 * This creates an adapter for a {@link de.unistuttgart.ma.saga.SagaStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSagaStepAdapter() {
		if (sagaStepItemProvider == null) {
			sagaStepItemProvider = new SagaStepItemProvider(this);
		}

		return sagaStepItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.unistuttgart.ma.saga.Violation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViolationItemProvider violationItemProvider;

	/**
	 * This creates an adapter for a {@link de.unistuttgart.ma.saga.Violation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createViolationAdapter() {
		if (violationItemProvider == null) {
			violationItemProvider = new ViolationItemProvider(this);
		}

		return violationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.unistuttgart.ma.saga.Impact} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImpactItemProvider impactItemProvider;

	/**
	 * This creates an adapter for a {@link de.unistuttgart.ma.saga.Impact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createImpactAdapter() {
		if (impactItemProvider == null) {
			impactItemProvider = new ImpactItemProvider(this);
		}

		return impactItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.unistuttgart.ma.saga.Notification} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotificationItemProvider notificationItemProvider;

	/**
	 * This creates an adapter for a {@link de.unistuttgart.ma.saga.Notification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNotificationAdapter() {
		if (notificationItemProvider == null) {
			notificationItemProvider = new NotificationItemProvider(this);
		}

		return notificationItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (projectItemProvider != null) projectItemProvider.dispose();
		if (componentAdapterItemProvider != null) componentAdapterItemProvider.dispose();
		if (componentInterfaceAdapterItemProvider != null) componentInterfaceAdapterItemProvider.dispose();
		if (sagaItemProvider != null) sagaItemProvider.dispose();
		if (sagaStepItemProvider != null) sagaStepItemProvider.dispose();
		if (violationItemProvider != null) violationItemProvider.dispose();
		if (impactItemProvider != null) impactItemProvider.dispose();
		if (notificationItemProvider != null) notificationItemProvider.dispose();
	}

}
