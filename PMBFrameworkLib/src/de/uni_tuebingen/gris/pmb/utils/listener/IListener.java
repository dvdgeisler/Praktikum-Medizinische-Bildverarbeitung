package de.uni_tuebingen.gris.pmb.utils.listener;

public abstract interface IListener<T extends IListener<T>>
{
  public abstract void onEventRaised(IEvent<T> paramIEvent);
}