package de.uni_tuebingen.gris.pmb.module;

import de.uni_tuebingen.gris.pmb.utils.listener.DefaultEvent;

public class ModuleInitializedEvent extends DefaultEvent<IModuleListener> implements IModuleInitializedEvent {

	protected ModuleInitializedEvent(ModuleInitializedEvent event) {
		super(event);
	}
	
	public ModuleInitializedEvent(IModule source, IModuleObserver observer) {
		super(source, observer);
	}
	
	public ModuleInitializedEvent(IModule source) {
		super(source, source.getObserver());
	}

	@Override
	public ModuleInitializedEvent clone() {
		return new ModuleInitializedEvent(this);
	}

}
