package de.uni_tuebingen.gris.pmb.module;

import de.uni_tuebingen.gris.pmb.utils.listener.IListener;

public abstract interface IModuleListener extends IListener<IModuleListener>
{
  public abstract void onModulePerformed(IModulePerformedEvent paramIModulePerformedEvent);

  public abstract void onModulePropertyChanged(IModulePropertyChangedEvent paramIModulePropertyChangedEvent);
}

/* Location:           /home/david/Documents/Documents/Studium/Praktikum Medizinische Bildverarbeitung/git/PMBFrameworkLib/src/
 * Qualified Name:     de.uni_tuebingen.gris.pmb.module.IModuleListener
 * JD-Core Version:    0.6.2
 */