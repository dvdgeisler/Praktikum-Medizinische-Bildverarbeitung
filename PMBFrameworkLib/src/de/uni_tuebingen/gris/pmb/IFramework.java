package de.uni_tuebingen.gris.pmb;

import de.uni_tuebingen.gris.pmb.module.IModuleManager;
import de.uni_tuebingen.gris.pmb.utils.listener.IObservable;

public abstract interface IFramework extends IObservable<IFrameworkListener>
{
  public abstract IModuleManager getModuleManager();
}