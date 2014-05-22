package de.uni_tuebingen.gris.pmb.utils.listener;

public interface IObservable<T extends IListener<T>> {
  
	IObserver<T> getObserver();
}