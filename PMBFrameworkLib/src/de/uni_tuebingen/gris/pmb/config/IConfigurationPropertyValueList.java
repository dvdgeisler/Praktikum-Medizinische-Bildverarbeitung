package de.uni_tuebingen.gris.pmb.config;

import java.io.Serializable;
import java.util.Collection;

public abstract interface IConfigurationPropertyValueList<T extends Serializable> extends Serializable, Collection<T>
{
}