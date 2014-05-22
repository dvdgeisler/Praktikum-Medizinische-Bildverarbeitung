package de.uni_tuebingen.gris.pmb.module;

import de.uni_tuebingen.gris.pmb.utils.listener.IObserver;

public abstract interface IModuleObserver extends IObserver<IModuleListener>
{
  public abstract boolean addListener(IModuleListener paramIModuleListener);

  public abstract boolean removeListener(IModuleListener paramIModuleListener);
}