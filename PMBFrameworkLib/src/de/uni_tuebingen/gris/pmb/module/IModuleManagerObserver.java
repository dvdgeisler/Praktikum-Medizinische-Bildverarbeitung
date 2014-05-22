package de.uni_tuebingen.gris.pmb.module;

import de.uni_tuebingen.gris.pmb.utils.listener.IObserver;

public abstract interface IModuleManagerObserver extends IObserver<IModuleManagerListener>
{
  public abstract boolean addListener(IModuleManagerListener paramIModuleManagerListener);

  public abstract boolean removeListener(IModuleManagerListener paramIModuleManagerListener);

  public abstract void fireModuleLoadedEvent(IModuleManagerModuleLoadedEvent paramIModuleManagerModuleLoadedEvent);

  public abstract void fireModuleLoadedEvent(IModuleManager paramIModuleManager, IModule paramIModule, String paramString);

  public abstract void fireModuleUnloadedEvent(IModuleManagerModuleUnloadedEvent paramIModuleManagerModuleUnloadedEvent);

  public abstract void fireModuleUnloadedEvent(IModuleManager paramIModuleManager, IModule paramIModule, String paramString);
}

/* Location:           /home/david/Documents/Documents/Studium/Praktikum Medizinische Bildverarbeitung/git/PMBFrameworkLib/src/
 * Qualified Name:     de.uni_tuebingen.gris.pmb.module.IModuleManagerObserver
 * JD-Core Version:    0.6.2
 */