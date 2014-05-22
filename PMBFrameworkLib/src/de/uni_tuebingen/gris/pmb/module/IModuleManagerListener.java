package de.uni_tuebingen.gris.pmb.module;

import de.uni_tuebingen.gris.pmb.utils.listener.IListener;

public abstract interface IModuleManagerListener extends IListener<IModuleManagerListener>
{
  public abstract void onModuleLoaded(IModuleManagerModuleLoadedEvent paramIModuleManagerModuleLoadedEvent);

  public abstract void onModuleUnloaded(IModuleManagerModuleUnloadedEvent paramIModuleManagerModuleUnloadedEvent);
}

/* Location:           /home/david/Documents/Documents/Studium/Praktikum Medizinische Bildverarbeitung/git/PMBFrameworkLib/src/
 * Qualified Name:     de.uni_tuebingen.gris.pmb.module.IModuleManagerListener
 * JD-Core Version:    0.6.2
 */