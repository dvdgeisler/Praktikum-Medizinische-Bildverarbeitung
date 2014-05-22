package de.uni_tuebingen.gris.pmb.utils.listener;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * TODO no doc
 * @author david
 *
 * @param <T>
 */
public class DefaultObserver<T extends IListener<T>> implements IObserver<T> {

	/**
	 * TODO no doc
	 * @author david
	 *
	 * @param <A>
	 * @param <B>
	 */
	protected interface CustomEventHandler<A extends IListener<A>,B extends IEvent<A>> {
		
		/**
		 * TODO no doc
		 * @param listener
		 * @param event
		 */
		void callEventHandler(A listener, B event);
	}
	
	/**
	 * TODO no doc
	 */
	private final Set<T> listeners;
	
	{
		this.listeners = new HashSet<T>();
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean addListener(T listener) {
		return this.listeners.add(listener);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean removeListener(T listener) {
		return this.listeners.remove(listener);
	}
	
	/**
	 * TODO no doc
	 * @return
	 */
	protected Collection<T> getListeners() {
		return this.listeners;
	}

	/**
	 * TODO no doc
	 * @param event
	 */
	public void fireEvent(IEvent<T> event) {
		for(T listener : this.listeners)
			listener.onEventRaised(event.clone());
	}
	
	/**
	 * TODO no doc
	 * @param event
	 * @param customEventHandler
	 */
	public <R extends IEvent<T>> void fireEvent(R event, CustomEventHandler<T, R> customEventHandler) {
		this.fireEvent(event);
		for(T listener : this.listeners)
			customEventHandler.callEventHandler(listener, event);
	}
	
}
