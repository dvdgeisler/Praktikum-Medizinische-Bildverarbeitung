package de.uni_tuebingen.gris.pmb;

import de.uni_tuebingen.gris.pmb.module.IModuleManager;
import de.uni_tuebingen.gris.pmb.utils.listener.IObservable;

public abstract interface IFramework extends IObservable<IFrameworkListener>
{
  public abstract IModuleManager getModuleManager();
}

/* Location:           /home/david/Documents/Documents/Studium/Praktikum Medizinische Bildverarbeitung/git/PMBFrameworkLib/src/
 * Qualified Name:     de.uni_tuebingen.gris.pmb.IFramework
 * JD-Core Version:    0.6.2
 */