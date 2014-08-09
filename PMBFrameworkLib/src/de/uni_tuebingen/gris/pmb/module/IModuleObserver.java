package de.uni_tuebingen.gris.pmb.module;

import de.uni_tuebingen.gris.pmb.data.IImage;
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

	/**
	 * TODO no doc
	 * @param module
	 * @param img
	 */
	void fireModulePerformedEvent(IModule source, IImage img);
	
	/**
	 * TODO no doc
	 * @param event
	 */
	void fireModulePerformedEvent(IModulePerformedEvent event);
	
	/**
	 * TODO no doc
	 * @param source
	 */
	void fireModuleInitializedEvent(IModule source);

	/**
	 * TODO no doc
	 * @param event
	 */
	void fireModuleInitializedEvent(IModuleInitializedEvent event);
	
	/**
	 * TODO no doc
	 * @param source
	 */
	void fireModuleDeinitializedEvent(IModule source);
	
	/**
	 * TODO no doc
	 * @param event
	 */
	void fireModuleDeinitializedEvent(IModuleDeinitializedEvent event);
}