package de.uni_tuebingen.gris.pmb.utils.listener;

public abstract interface IEvent<T extends IListener<T>>
{
  public abstract IObservable<T> getSource();

  public abstract IObserver<T> getObserver();

  public abstract IEvent<T> clone();
}

/* Location:           /home/david/Documents/Documents/Studium/Praktikum Medizinische Bildverarbeitung/git/PMBFrameworkLib/src/
 * Qualified Name:     de.uni_tuebingen.gris.pmb.utils.listener.IEvent
 * JD-Core Version:    0.6.2
 */