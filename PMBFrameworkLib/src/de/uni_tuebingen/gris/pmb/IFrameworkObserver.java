package de.uni_tuebingen.gris.pmb;

import de.uni_tuebingen.gris.pmb.utils.listener.IObserver;

public abstract interface IFrameworkObserver extends IObserver<IFrameworkListener>
{
  public abstract boolean addListener(IFrameworkListener paramIFrameworkListener);

  public abstract boolean removeListener(IFrameworkListener paramIFrameworkListener);
}

/* Location:           /home/david/Documents/Documents/Studium/Praktikum Medizinische Bildverarbeitung/git/PMBFrameworkLib/src/
 * Qualified Name:     de.uni_tuebingen.gris.pmb.IFrameworkObserver
 * JD-Core Version:    0.6.2
 */