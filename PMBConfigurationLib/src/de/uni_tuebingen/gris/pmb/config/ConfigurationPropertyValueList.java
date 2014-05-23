package de.uni_tuebingen.gris.pmb.config;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ConfigurationPropertyValueList<T extends Serializable> implements IConfigurationPropertyValueList<T> {

	/**
	 * TODO no doc
	 */
	private static final long serialVersionUID = -1040666337766340696L;
	
	/**
	 * TODO no doc
	 */
	@XmlElement
	private List<T> list;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int size() {
		return this.list.size();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isEmpty() {
		return this.list.isEmpty();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean contains(Object o) {
		return this.list.contains(o);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Iterator<T> iterator() {
		return this.list.iterator();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object[] toArray() {
		return this.list.toArray();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <R> R[] toArray(R[] a) {
		return this.list.toArray(a);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean add(T e) {
		return this.list.add(e);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean remove(Object o) {
		return this.list.remove(o);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean containsAll(Collection<?> c) {
		return this.list.containsAll(c);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean addAll(Collection<? extends T> c) {
		return this.list.addAll(c);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean removeAll(Collection<?> c) {
		return this.list.removeAll(c);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean retainAll(Collection<?> c) {
		return this.list.retainAll(c);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void clear() {
		this.list.clear();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object o) {
		return this.list.equals(o);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		return this.list.hashCode();
	}
	
}
