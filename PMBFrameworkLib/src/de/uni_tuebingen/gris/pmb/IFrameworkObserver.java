package de.uni_tuebingen.gris.pmb;

import de.uni_tuebingen.gris.pmb.utils.listener.IObserver;

public interface IFrameworkObserver extends IObserver<IFrameworkListener> {
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	boolean addListener(IFrameworkListener listener);

	/**
	 * {@inheritDoc}
	 */
	@Override
	boolean removeListener(IFrameworkListener listener);
	
}