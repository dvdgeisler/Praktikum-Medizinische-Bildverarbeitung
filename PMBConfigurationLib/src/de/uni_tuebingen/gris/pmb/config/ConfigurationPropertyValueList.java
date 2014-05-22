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
	 * 
	 */
	private static final long serialVersionUID = -1040666337766340696L;
	
	@XmlElement
	private List<T> list;

	public int size() {
		return this.list.size();
	}

	public boolean isEmpty() {
		return this.list.isEmpty();
	}

	public boolean contains(Object o) {
		return this.list.contains(o);
	}

	public Iterator<T> iterator() {
		return this.list.iterator();
	}

	public Object[] toArray() {
		return this.list.toArray();
	}

	public <R> R[] toArray(R[] a) {
		return this.list.toArray(a);
	}

	public boolean add(T e) {
		return this.list.add(e);
	}

	public boolean remove(Object o) {
		return this.list.remove(o);
	}

	public boolean containsAll(Collection<?> c) {
		return this.list.containsAll(c);
	}

	public boolean addAll(Collection<? extends T> c) {
		return this.list.addAll(c);
	}

	public boolean removeAll(Collection<?> c) {
		return this.list.removeAll(c);
	}

	public boolean retainAll(Collection<?> c) {
		return this.list.retainAll(c);
	}

	public void clear() {
		this.list.clear();
	}

	public boolean equals(Object o) {
		return this.list.equals(o);
	}

	public int hashCode() {
		return this.list.hashCode();
	}
	

}
