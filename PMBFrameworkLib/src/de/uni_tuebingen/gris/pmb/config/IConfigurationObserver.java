package de.uni_tuebingen.gris.pmb.config;

import de.uni_tuebingen.gris.pmb.utils.listener.IObserver;

public interface IConfigurationObserver extends IObserver<IConfigurationListener> {

	/**
	 * {@inheritDoc}
	 */
	@Override
	boolean addListener(IConfigurationListener listener);

	/**
	 * {@inheritDoc}
	 */
	@Override
	boolean removeListener(IConfigurationListener listener);
}
