package de.uni_tuebingen.gris.pmb.utils.listener;

public interface IListener<T extends IListener<T>> {
	
	void onEventRaised(IEvent<T> event);
}