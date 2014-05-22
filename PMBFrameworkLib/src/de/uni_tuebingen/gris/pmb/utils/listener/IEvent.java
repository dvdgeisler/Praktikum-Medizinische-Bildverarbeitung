package de.uni_tuebingen.gris.pmb.utils.listener;

public interface IEvent<T extends IListener<T>> extends Cloneable {
	
	IObservable<T> getSource();

	IObserver<T> getObserver();

	IEvent<T> clone();
}