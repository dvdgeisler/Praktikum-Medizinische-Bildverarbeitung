package de.uni_tuebingen.gris.pmb.utils.listener;

public abstract interface IListener<T extends IListener<T>>
{
  public abstract void onEventRaised(IEvent<T> paramIEvent);
}

/* Location:           /home/david/Documents/Documents/Studium/Praktikum Medizinische Bildverarbeitung/git/PMBFrameworkLib/src/
 * Qualified Name:     de.uni_tuebingen.gris.pmb.utils.listener.IListener
 * JD-Core Version:    0.6.2
 */