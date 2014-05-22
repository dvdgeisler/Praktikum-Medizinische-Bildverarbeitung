package de.uni_tuebingen.gris.pmb.module;

import de.uni_tuebingen.gris.pmb.utils.listener.IObserver;

public interface IModuleObserver extends IObserver<IModuleListener> {
	
	@Override
	boolean addListener(IModuleListener listener);

	@Override
  	boolean removeListener(IModuleListener listener);
}