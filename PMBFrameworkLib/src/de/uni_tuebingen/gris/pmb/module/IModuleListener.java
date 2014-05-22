package de.uni_tuebingen.gris.pmb.module;

import de.uni_tuebingen.gris.pmb.utils.listener.IListener;

public interface IModuleListener extends IListener<IModuleListener> {
  
	void onModulePerformed(IModulePerformedEvent event);

	void onModulePropertyChanged(IModulePropertyChangedEvent event);
}