package de.uni_tuebingen.gris.pmb.utils.listener;

public abstract interface IObserver<T extends IListener<T>> {
	
	boolean addListener(T listener);

	boolean removeListener(T listener);
}