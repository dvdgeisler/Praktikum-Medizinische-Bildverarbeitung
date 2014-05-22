package de.uni_tuebingen.gris.pmb.module;

import de.uni_tuebingen.gris.pmb.utils.listener.IEvent;

public abstract interface IModuleManagerModuleLoadedEvent extends IEvent<IModuleManagerListener>
{
  public abstract IModule getModule();

  public abstract String getModuleIdentifier();

  public abstract IModuleManagerModuleLoadedEvent clone();
}