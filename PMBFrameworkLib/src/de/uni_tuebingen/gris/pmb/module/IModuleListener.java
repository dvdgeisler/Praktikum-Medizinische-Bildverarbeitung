package de.uni_tuebingen.gris.pmb.module;

import de.uni_tuebingen.gris.pmb.utils.listener.IListener;

public abstract interface IModuleListener extends IListener<IModuleListener>
{
  public abstract void onModulePerformed(IModulePerformedEvent paramIModulePerformedEvent);

  public abstract void onModulePropertyChanged(IModulePropertyChangedEvent paramIModulePropertyChangedEvent);
}