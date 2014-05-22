package de.uni_tuebingen.gris.pmb.module;

import de.uni_tuebingen.gris.pmb.utils.listener.IEvent;

public abstract interface IModulePropertyChangedEvent extends IEvent<IModuleListener>
{
  public abstract String getKey();

  public abstract String getOldValue();

  public abstract String getNewValue();

  public abstract IModulePropertyChangedEvent clone();
}

/* Location:           /home/david/Documents/Documents/Studium/Praktikum Medizinische Bildverarbeitung/git/PMBFrameworkLib/src/
 * Qualified Name:     de.uni_tuebingen.gris.pmb.module.IModulePropertyChangedEvent
 * JD-Core Version:    0.6.2
 */