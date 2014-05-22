package de.uni_tuebingen.gris.pmb.module;

import de.uni_tuebingen.gris.pmb.utils.listener.IEvent;

public abstract interface IModuleManagerModuleUnloadedEvent extends IEvent<IModuleManagerListener>
{
  public abstract IModule getModule();

  public abstract String getModuleIdentifier();

  public abstract IModuleManagerModuleUnloadedEvent clone();
}