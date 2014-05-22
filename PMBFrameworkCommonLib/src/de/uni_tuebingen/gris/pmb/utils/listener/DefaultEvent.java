package de.uni_tuebingen.gris.pmb.utils.listener;

/**
 * TODO no doc
 * @author david
 *
 * @param <T>
 */
public abstract class DefaultEvent<T extends IListener<T>> implements IEvent<T> {

	/**
	 * TODO no doc
	 */
	private final IObservable<T> source;
	
	/**
	 * TODO no doc
	 */
	private final IObserver<T> observer;
	
	/**
	 * TODO no doc
	 * @param source
	 * @param observer
	 */
	public DefaultEvent(IObservable<T> source, IObserver<T> observer) {
		this.source = source;
		this.observer = observer;
	}
	
	/**
	 * TODO no doc
	 * @param event
	 */
	protected DefaultEvent(DefaultEvent<T> event) {
		this(event.getSource(), event.getObserver());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IObservable<T> getSource() {
		return this.source;
	}

	/**IEvent<T> clone();
	 * {@inheritDoc}
	 */
	@Override
	public IObserver<T> getObserver() {
		return this.observer;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public abstract IEvent<T> clone();
}
