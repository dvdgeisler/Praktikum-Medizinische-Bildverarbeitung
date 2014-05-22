package de.uni_tuebingen.gris.pmb.module;

import de.uni_tuebingen.gris.pmb.data.IImage;
import de.uni_tuebingen.gris.pmb.utils.listener.IEvent;

public abstract interface IModulePerformedEvent extends IEvent<IModuleListener>
{
  public abstract IImage getImage();

  public abstract IModulePerformedEvent clone();
}

/* Location:           /home/david/Documents/Documents/Studium/Praktikum Medizinische Bildverarbeitung/git/PMBFrameworkLib/src/
 * Qualified Name:     de.uni_tuebingen.gris.pmb.module.IModulePerformedEvent
 * JD-Core Version:    0.6.2
 */