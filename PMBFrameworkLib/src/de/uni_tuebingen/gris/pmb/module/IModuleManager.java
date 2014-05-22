package de.uni_tuebingen.gris.pmb.module;

import de.uni_tuebingen.gris.pmb.utils.listener.IObservable;
import java.util.Collection;

public abstract interface IModuleManager extends IObservable<IModuleManagerListener>
{
  public abstract IModule getModule(String paramString);

  public abstract IModule addModule(String paramString, IModule paramIModule);

  public abstract IModule removeModule(String paramString);

  public abstract IModule removeModule(IModule paramIModule);

  public abstract Collection<IModule> getModules();

  public abstract Collection<IModule> getModules(Class<?> paramClass);

  public abstract String getModuleIdentifier(IModule paramIModule);

  public abstract IModuleManagerObserver getObserver();
}

/* Location:           /home/david/Documents/Documents/Studium/Praktikum Medizinische Bildverarbeitung/git/PMBFrameworkLib/src/
 * Qualified Name:     de.uni_tuebingen.gris.pmb.module.IModuleManager
 * JD-Core Version:    0.6.2
 */