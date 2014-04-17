/**
 */
package model.provider;

import java.util.ArrayList;
import java.util.Collection;

import model.util.ModelAdapterFactory;

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
public class ModelItemProviderAdapterFactory extends ModelAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	protected Collection supportedTypes = new ArrayList();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link model.CloudStandby} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CloudStandbyItemProvider cloudStandbyItemProvider;

	/**
	 * This creates an adapter for a {@link model.CloudStandby}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createCloudStandbyAdapter() {
		if (cloudStandbyItemProvider == null) {
			cloudStandbyItemProvider = new CloudStandbyItemProvider(this);
		}

		return cloudStandbyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link model.Component} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentItemProvider componentItemProvider;

	/**
	 * This creates an adapter for a {@link model.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		if (componentItemProvider == null) {
			componentItemProvider = new ComponentItemProvider(this);
		}

		return componentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link model.FederatedInstance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FederatedInstanceItemProvider federatedInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link model.FederatedInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createFederatedInstanceAdapter() {
		if (federatedInstanceItemProvider == null) {
			federatedInstanceItemProvider = new FederatedInstanceItemProvider(this);
		}

		return federatedInstanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link model.FederatedVirtualMachine} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FederatedVirtualMachineItemProvider federatedVirtualMachineItemProvider;

	/**
	 * This creates an adapter for a {@link model.FederatedVirtualMachine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createFederatedVirtualMachineAdapter() {
		if (federatedVirtualMachineItemProvider == null) {
			federatedVirtualMachineItemProvider = new FederatedVirtualMachineItemProvider(this);
		}

		return federatedVirtualMachineItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link model.StandardImage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StandardImageItemProvider standardImageItemProvider;

	/**
	 * This creates an adapter for a {@link model.StandardImage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createStandardImageAdapter() {
		if (standardImageItemProvider == null) {
			standardImageItemProvider = new StandardImageItemProvider(this);
		}

		return standardImageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link model.FederatedImage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FederatedImageItemProvider federatedImageItemProvider;

	/**
	 * This creates an adapter for a {@link model.FederatedImage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createFederatedImageAdapter() {
		if (federatedImageItemProvider == null) {
			federatedImageItemProvider = new FederatedImageItemProvider(this);
		}

		return federatedImageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link model.Cloud} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CloudItemProvider cloudItemProvider;

	/**
	 * This creates an adapter for a {@link model.Cloud}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createCloudAdapter() {
		if (cloudItemProvider == null) {
			cloudItemProvider = new CloudItemProvider(this);
		}

		return cloudItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link model.VirtualMachine} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualMachineItemProvider virtualMachineItemProvider;

	/**
	 * This creates an adapter for a {@link model.VirtualMachine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createVirtualMachineAdapter() {
		if (virtualMachineItemProvider == null) {
			virtualMachineItemProvider = new VirtualMachineItemProvider(this);
		}

		return virtualMachineItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link model.DistributedSystem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DistributedSystemItemProvider distributedSystemItemProvider;

	/**
	 * This creates an adapter for a {@link model.DistributedSystem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createDistributedSystemAdapter() {
		if (distributedSystemItemProvider == null) {
			distributedSystemItemProvider = new DistributedSystemItemProvider(this);
		}

		return distributedSystemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link model.Role} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleItemProvider roleItemProvider;

	/**
	 * This creates an adapter for a {@link model.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createRoleAdapter() {
		if (roleItemProvider == null) {
			roleItemProvider = new RoleItemProvider(this);
		}

		return roleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link model.BashScript} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BashScriptItemProvider bashScriptItemProvider;

	/**
	 * This creates an adapter for a {@link model.BashScript}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createBashScriptAdapter() {
		if (bashScriptItemProvider == null) {
			bashScriptItemProvider = new BashScriptItemProvider(this);
		}

		return bashScriptItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link model.ScriptCollection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScriptCollectionItemProvider scriptCollectionItemProvider;

	/**
	 * This creates an adapter for a {@link model.ScriptCollection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createScriptCollectionAdapter() {
		if (scriptCollectionItemProvider == null) {
			scriptCollectionItemProvider = new ScriptCollectionItemProvider(this);
		}

		return scriptCollectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link model.BashScriptCollection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BashScriptCollectionItemProvider bashScriptCollectionItemProvider;

	/**
	 * This creates an adapter for a {@link model.BashScriptCollection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createBashScriptCollectionAdapter() {
		if (bashScriptCollectionItemProvider == null) {
			bashScriptCollectionItemProvider = new BashScriptCollectionItemProvider(this);
		}

		return bashScriptCollectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link model.Attribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeItemProvider attributeItemProvider;

	/**
	 * This creates an adapter for a {@link model.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		if (attributeItemProvider == null) {
			attributeItemProvider = new AttributeItemProvider(this);
		}

		return attributeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link model.Federation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FederationItemProvider federationItemProvider;

	/**
	 * This creates an adapter for a {@link model.Federation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createFederationAdapter() {
		if (federationItemProvider == null) {
			federationItemProvider = new FederationItemProvider(this);
		}

		return federationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link model.Infrastructure} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfrastructureItemProvider infrastructureItemProvider;

	/**
	 * This creates an adapter for a {@link model.Infrastructure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createInfrastructureAdapter() {
		if (infrastructureItemProvider == null) {
			infrastructureItemProvider = new InfrastructureItemProvider(this);
		}

		return infrastructureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link model.Installation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstallationItemProvider installationItemProvider;

	/**
	 * This creates an adapter for a {@link model.Installation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createInstallationAdapter() {
		if (installationItemProvider == null) {
			installationItemProvider = new InstallationItemProvider(this);
		}

		return installationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link model.TemplateFile} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateFileItemProvider templateFileItemProvider;

	/**
	 * This creates an adapter for a {@link model.TemplateFile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createTemplateFileAdapter() {
		if (templateFileItemProvider == null) {
			templateFileItemProvider = new TemplateFileItemProvider(this);
		}

		return templateFileItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link model.Instance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceItemProvider instanceItemProvider;

	/**
	 * This creates an adapter for a {@link model.Instance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createInstanceAdapter() {
		if (instanceItemProvider == null) {
			instanceItemProvider = new InstanceItemProvider(this);
		}

		return instanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link model.ConfiguredImage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfiguredImageItemProvider configuredImageItemProvider;

	/**
	 * This creates an adapter for a {@link model.ConfiguredImage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createConfiguredImageAdapter() {
		if (configuredImageItemProvider == null) {
			configuredImageItemProvider = new ConfiguredImageItemProvider(this);
		}

		return configuredImageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link model.TemplateDir} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateDirItemProvider templateDirItemProvider;

	/**
	 * This creates an adapter for a {@link model.TemplateDir}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createTemplateDirAdapter() {
		if (templateDirItemProvider == null) {
			templateDirItemProvider = new TemplateDirItemProvider(this);
		}

		return templateDirItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link model.RsyncJob} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RsyncJobItemProvider rsyncJobItemProvider;

	/**
	 * This creates an adapter for a {@link model.RsyncJob}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createRsyncJobAdapter() {
		if (rsyncJobItemProvider == null) {
			rsyncJobItemProvider = new RsyncJobItemProvider(this);
		}

		return rsyncJobItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link model.CloudStandbyReplication} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CloudStandbyReplicationItemProvider cloudStandbyReplicationItemProvider;

	/**
	 * This creates an adapter for a {@link model.CloudStandbyReplication}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createCloudStandbyReplicationAdapter() {
		if (cloudStandbyReplicationItemProvider == null) {
			cloudStandbyReplicationItemProvider = new CloudStandbyReplicationItemProvider(this);
		}

		return cloudStandbyReplicationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link model.AdditionalDrive} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdditionalDriveItemProvider additionalDriveItemProvider;

	/**
	 * This creates an adapter for a {@link model.AdditionalDrive}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createAdditionalDriveAdapter() {
		if (additionalDriveItemProvider == null) {
			additionalDriveItemProvider = new AdditionalDriveItemProvider(this);
		}

		return additionalDriveItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link model.BashJob} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BashJobItemProvider bashJobItemProvider;

	/**
	 * This creates an adapter for a {@link model.BashJob}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createBashJobAdapter() {
		if (bashJobItemProvider == null) {
			bashJobItemProvider = new BashJobItemProvider(this);
		}

		return bashJobItemProvider;
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
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class) || (((Class)type).isInstance(adapter))) {
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
		if (cloudStandbyItemProvider != null) cloudStandbyItemProvider.dispose();
		if (componentItemProvider != null) componentItemProvider.dispose();
		if (federatedInstanceItemProvider != null) federatedInstanceItemProvider.dispose();
		if (federatedVirtualMachineItemProvider != null) federatedVirtualMachineItemProvider.dispose();
		if (standardImageItemProvider != null) standardImageItemProvider.dispose();
		if (federatedImageItemProvider != null) federatedImageItemProvider.dispose();
		if (cloudItemProvider != null) cloudItemProvider.dispose();
		if (virtualMachineItemProvider != null) virtualMachineItemProvider.dispose();
		if (distributedSystemItemProvider != null) distributedSystemItemProvider.dispose();
		if (roleItemProvider != null) roleItemProvider.dispose();
		if (bashScriptItemProvider != null) bashScriptItemProvider.dispose();
		if (scriptCollectionItemProvider != null) scriptCollectionItemProvider.dispose();
		if (bashScriptCollectionItemProvider != null) bashScriptCollectionItemProvider.dispose();
		if (attributeItemProvider != null) attributeItemProvider.dispose();
		if (federationItemProvider != null) federationItemProvider.dispose();
		if (infrastructureItemProvider != null) infrastructureItemProvider.dispose();
		if (installationItemProvider != null) installationItemProvider.dispose();
		if (templateFileItemProvider != null) templateFileItemProvider.dispose();
		if (instanceItemProvider != null) instanceItemProvider.dispose();
		if (configuredImageItemProvider != null) configuredImageItemProvider.dispose();
		if (templateDirItemProvider != null) templateDirItemProvider.dispose();
		if (rsyncJobItemProvider != null) rsyncJobItemProvider.dispose();
		if (cloudStandbyReplicationItemProvider != null) cloudStandbyReplicationItemProvider.dispose();
		if (additionalDriveItemProvider != null) additionalDriveItemProvider.dispose();
		if (bashJobItemProvider != null) bashJobItemProvider.dispose();
	}

}
