package de.uni_tuebingen.gris.pmb.module;

import de.uni_tuebingen.gris.pmb.config.IConfigurable;
import de.uni_tuebingen.gris.pmb.data.IImage;
import de.uni_tuebingen.gris.pmb.utils.listener.IObservable;

public interface IModule extends IObservable<IModuleListener>, IConfigurable {
  
	/**
	 * @{inheritDoc}
	 */
    @Override
	IModuleConfiguration getConfiguration();
	
	/**
	 * TODO no doc
	 * @return
	 */
	IImage perform();

	/**
	 * {@inheritDoc}
	 */
	IModuleObserver getObserver();
}
