package de.uni_tuebingen.gris.pmb.module;

import de.uni_tuebingen.gris.pmb.data.IImage;
import de.uni_tuebingen.gris.pmb.utils.listener.IObservable;
import java.util.Collection;

public abstract interface IModule extends IObservable<IModuleListener>
{
  public abstract String setProperty(String paramString1, String paramString2)
    throws ModuleUnknownPropertyException, ModuleInvalidePropertyValueException;

  public abstract String removeProperty(String paramString)
    throws ModuleUnknownPropertyException, ModuleInvalidePropertyValueException;

  public abstract String getProperty(String paramString)
    throws ModuleUnknownPropertyException;

  public abstract Collection<String> getPropertyKeys();

  public abstract boolean isValidProperty(String paramString1, String paramString2)
    throws ModuleUnknownPropertyException;

  public abstract boolean isPropertyKey(String paramString);

  public abstract IImage perform();

  public abstract IModuleObserver getObserver();
}

/* Location:           /home/david/Documents/Documents/Studium/Praktikum Medizinische Bildverarbeitung/git/PMBFrameworkLib/src/
 * Qualified Name:     de.uni_tuebingen.gris.pmb.module.IModule
 * JD-Core Version:    0.6.2
 */