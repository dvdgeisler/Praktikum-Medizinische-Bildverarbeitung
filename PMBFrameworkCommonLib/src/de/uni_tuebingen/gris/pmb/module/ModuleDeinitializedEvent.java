package de.uni_tuebingen.gris.pmb.module;

import de.uni_tuebingen.gris.pmb.utils.listener.DefaultEvent;

public class ModuleDeinitializedEvent extends DefaultEvent<IModuleListener> implements IModuleDeinitializedEvent {

	protected ModuleDeinitializedEvent(ModuleDeinitializedEvent event) {
		super(event);
	}
	
	public ModuleDeinitializedEvent(IModule source, IModuleObserver observer) {
		super(source, observer);
	}
	
	public ModuleDeinitializedEvent(IModule source) {
		super(source, source.getObserver());
	}

	@Override
	public ModuleDeinitializedEvent clone() {
		return new ModuleDeinitializedEvent(this);
	}

}
