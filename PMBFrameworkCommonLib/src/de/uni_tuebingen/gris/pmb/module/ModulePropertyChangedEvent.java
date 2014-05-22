package de.uni_tuebingen.gris.pmb.module;

import de.uni_tuebingen.gris.pmb.utils.listener.DefaultEvent;

/**
 * TODO no doc
 * @author david
 *
 */
public class ModulePropertyChangedEvent extends DefaultEvent<IModuleListener> implements IModulePropertyChangedEvent {

	/**
	 * TODO no doc
	 */
	private final String key;

	/**
	 * TODO no doc
	 */
	private final String oldValue;

	/**
	 * TODO no doc
	 */
	private final String newValue;
	
	/**
	 * TODO no doc
	 * @param event
	 */
	protected ModulePropertyChangedEvent(ModulePropertyChangedEvent event) {
		super(event.getSource(),event.getObserver());
		this.key = event.getKey();
		this.oldValue = event.getOldValue();
		this.newValue = event.getNewValue();
	}
	
	/**
	 * TODO no doc
	 * @param source
	 * @param observer
	 * @param key
	 * @param oldValue
	 * @param newValue
	 */
	public ModulePropertyChangedEvent(IModule source, IModuleObserver observer, String key, String oldValue, String newValue) {
		super(source, observer);
		this.key = key;
		this.oldValue = oldValue;
		this.newValue = newValue;
	}
	
	/**
	 * TODO no doc
	 * @param source
	 * @param key
	 * @param oldValue
	 * @param newValue
	 */
	public ModulePropertyChangedEvent(IModule source, String key, String oldValue, String newValue) {
		this(source,source.getObserver(), key, oldValue, newValue);
	}

	/* (non-Javadoc)
	 * @see de.uni_tuebingen.gris.pmb.module.IModulePropertyChangedEvent#getKey()
	 */
	@Override
	public String getKey() {
		return this.key;
	}
	
	/* (non-Javadoc)
	 * @see de.uni_tuebingen.gris.pmb.module.IModulePropertyChangedEvent#getOldValue()
	 */
	@Override
	public String getOldValue() {
		return this.oldValue;
	}
	
	/* (non-Javadoc)
	 * @see de.uni_tuebingen.gris.pmb.module.IModulePropertyChangedEvent#getNewValue()
	 */
	@Override
	public String getNewValue() {
		return this.newValue;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public IModulePropertyChangedEvent clone() {
		return new ModulePropertyChangedEvent(this);
	}

}
