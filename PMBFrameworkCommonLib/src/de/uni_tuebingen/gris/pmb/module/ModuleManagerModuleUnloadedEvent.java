package de.uni_tuebingen.gris.pmb.module;

import de.uni_tuebingen.gris.pmb.utils.listener.DefaultEvent;

/**
 * TODO no doc
 * @author david
 *
 */
public class ModuleManagerModuleUnloadedEvent extends DefaultEvent<IModuleManagerListener> implements IModuleManagerModuleUnloadedEvent {

	/**
	 * TODO no doc
	 */
	private final IModule module;
	
	/**
	 * TODO no doc
	 */
	private final String moduleIdentifier;
	
	/**
	 * TODO no doc
	 * @param event
	 */
	protected ModuleManagerModuleUnloadedEvent(ModuleManagerModuleUnloadedEvent event) {
		super(event);
		this.module = event.getModule();
		this.moduleIdentifier = event.getModuleIdentifier();
	}
	
	/**
	 * TODO no doc
	 * @param source
	 * @param observer
	 * @param module
	 * @param moduleIdentifier
	 */
	public ModuleManagerModuleUnloadedEvent(IModuleManager source, IModuleManagerObserver observer, IModule module, String moduleIdentifier) {
		super(source,observer);
		this.module = module;
		this.moduleIdentifier = moduleIdentifier;
	}
	
	/**
	 * TODO no doc
	 * @param source
	 * @param observer
	 * @param module
	 */
	public ModuleManagerModuleUnloadedEvent(IModuleManager source, IModuleManagerObserver observer, IModule module) {
		this(source, observer, module, source.getModuleIdentifier(module));
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public IModule getModule() {
		return this.module;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getModuleIdentifier() {
		return this.moduleIdentifier;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public IModuleManagerModuleUnloadedEvent clone() {
		return new ModuleManagerModuleUnloadedEvent(this);
	}

}
