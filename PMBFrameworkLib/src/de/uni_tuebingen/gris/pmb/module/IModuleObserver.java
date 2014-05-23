package de.uni_tuebingen.gris.pmb.module;

import de.uni_tuebingen.gris.pmb.utils.listener.IObserver;

public interface IModuleObserver extends IObserver<IModuleListener> {
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	boolean addListener(IModuleListener listener);

	/**
	 * {@inheritDoc}
	 */
	@Override
  	boolean removeListener(IModuleListener listener);
}