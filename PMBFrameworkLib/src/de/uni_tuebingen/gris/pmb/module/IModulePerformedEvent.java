package de.uni_tuebingen.gris.pmb.module;

import de.uni_tuebingen.gris.pmb.data.IImage;
import de.uni_tuebingen.gris.pmb.utils.listener.IEvent;

public interface IModulePerformedEvent extends IEvent<IModuleListener> {
  
	IImage getImage();

	@Override
	IModulePerformedEvent clone();
}