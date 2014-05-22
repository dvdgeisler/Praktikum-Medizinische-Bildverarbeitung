package de.uni_tuebingen.gris.pmb.module;

import de.uni_tuebingen.gris.pmb.utils.listener.IEvent;

public abstract interface IModulePropertyChangedEvent extends IEvent<IModuleListener>
{
  public abstract String getKey();

  public abstract String getOldValue();

  public abstract String getNewValue();

  public abstract IModulePropertyChangedEvent clone();
}