package de.uni_tuebingen.gris.pmb;

import de.uni_tuebingen.gris.pmb.utils.listener.IObserver;

public abstract interface IFrameworkObserver extends IObserver<IFrameworkListener>
{
  public abstract boolean addListener(IFrameworkListener paramIFrameworkListener);

  public abstract boolean removeListener(IFrameworkListener paramIFrameworkListener);
}