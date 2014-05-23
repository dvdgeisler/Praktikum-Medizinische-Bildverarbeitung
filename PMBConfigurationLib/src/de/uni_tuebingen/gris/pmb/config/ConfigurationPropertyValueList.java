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
	public int size() {
		return this.list.size();
	}

	/**
	 * {@inheritDoc}
	 */
	public boolean isEmpty() {
		return this.list.isEmpty();
	}

	/**
	 * {@inheritDoc}
	 */
	public boolean contains(Object o) {
		return this.list.contains(o);
	}

	/**
	 * {@inheritDoc}
	 */
	public Iterator<T> iterator() {
		return this.list.iterator();
	}

	/**
	 * {@inheritDoc}
	 */
	public Object[] toArray() {
		return this.list.toArray();
	}

	/**
	 * {@inheritDoc}
	 */
	public <R> R[] toArray(R[] a) {
		return this.list.toArray(a);
	}

	/**
	 * {@inheritDoc}
	 */
	public boolean add(T e) {
		return this.list.add(e);
	}

	/**
	 * {@inheritDoc}
	 */
	public boolean remove(Object o) {
		return this.list.remove(o);
	}

	/**
	 * {@inheritDoc}
	 */
	public boolean containsAll(Collection<?> c) {
		return this.list.containsAll(c);
	}

	/**
	 * {@inheritDoc}
	 */
	public boolean addAll(Collection<? extends T> c) {
		return this.list.addAll(c);
	}

	/**
	 * {@inheritDoc}
	 */
	public boolean removeAll(Collection<?> c) {
		return this.list.removeAll(c);
	}

	/**
	 * {@inheritDoc}
	 */
	public boolean retainAll(Collection<?> c) {
		return this.list.retainAll(c);
	}

	/**
	 * {@inheritDoc}
	 */
	public void clear() {
		this.list.clear();
	}

	/**
	 * {@inheritDoc}
	 */
	public boolean equals(Object o) {
		return this.list.equals(o);
	}

	/**
	 * {@inheritDoc}
	 */
	public int hashCode() {
		return this.list.hashCode();
	}
	
}
