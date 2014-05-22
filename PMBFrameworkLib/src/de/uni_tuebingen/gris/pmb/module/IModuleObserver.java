package de.uni_tuebingen.gris.pmb.module;

import de.uni_tuebingen.gris.pmb.utils.listener.IObserver;

public abstract interface IModuleObserver extends IObserver<IModuleListener>
{
  public abstract boolean addListener(IModuleListener paramIModuleListener);

  public abstract boolean removeListener(IModuleListener paramIModuleListener);
}

/* Location:           /home/david/Documents/Documents/Studium/Praktikum Medizinische Bildverarbeitung/git/PMBFrameworkLib/src/
 * Qualified Name:     de.uni_tuebingen.gris.pmb.module.IModuleObserver
 * JD-Core Version:    0.6.2
 */