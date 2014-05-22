package de.uni_tuebingen.gris.pmb.utils.listener;

public abstract interface IObserver<T extends IListener<T>>
{
  public abstract boolean addListener(T paramT);

  public abstract boolean removeListener(T paramT);
}

/* Location:           /home/david/Documents/Documents/Studium/Praktikum Medizinische Bildverarbeitung/git/PMBFrameworkLib/src/
 * Qualified Name:     de.uni_tuebingen.gris.pmb.utils.listener.IObserver
 * JD-Core Version:    0.6.2
 */