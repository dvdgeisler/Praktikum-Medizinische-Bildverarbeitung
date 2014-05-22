package de.uni_tuebingen.gris.pmb.utils.listener;

public abstract interface IObservable<T extends IListener<T>>
{
  public abstract IObserver<T> getObserver();
}

/* Location:           /home/david/Documents/Documents/Studium/Praktikum Medizinische Bildverarbeitung/git/PMBFrameworkLib/src/
 * Qualified Name:     de.uni_tuebingen.gris.pmb.utils.listener.IObservable
 * JD-Core Version:    0.6.2
 */