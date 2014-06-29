package de.uni_tuebingen.gris.pmb.module;

import de.uni_tuebingen.gris.pmb.data.IImage;
import de.uni_tuebingen.gris.pmb.utils.listener.IEvent;

public interface IModulePerformedEvent extends IEvent<IModuleListener> {
	
	/**
	 * TODO no doc
	 * @return
	 */
	IImage getImage();

	/**
	 * {@inheritDoc}
	 */
	@Override
	IModulePerformedEvent clone();
}