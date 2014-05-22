package de.uni_tuebingen.gris.pmb.utils.listener;

public abstract interface IObservable<T extends IListener<T>>
{
  public abstract IObserver<T> getObserver();
}