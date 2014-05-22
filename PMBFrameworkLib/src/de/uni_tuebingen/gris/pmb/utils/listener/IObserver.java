package de.uni_tuebingen.gris.pmb.utils.listener;

public abstract interface IObserver<T extends IListener<T>>
{
  public abstract boolean addListener(T paramT);

  public abstract boolean removeListener(T paramT);
}