package de.uni_tuebingen.gris.pmb.module;

import de.uni_tuebingen.gris.pmb.data.IImage;
import de.uni_tuebingen.gris.pmb.utils.listener.IObservable;

public interface IModule extends IObservable<IModuleListener> {
  
	/**
	 * TODO no doc
	 * @return
	 */
	IModuleConfiguration getModuleConfiguration();
	
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