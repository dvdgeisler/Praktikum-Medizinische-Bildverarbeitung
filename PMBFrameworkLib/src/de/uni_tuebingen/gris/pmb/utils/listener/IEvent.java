package de.uni_tuebingen.gris.pmb.utils.listener;

public abstract interface IEvent<T extends IListener<T>>
{
  public abstract IObservable<T> getSource();

  public abstract IObserver<T> getObserver();

  public abstract IEvent<T> clone();
}