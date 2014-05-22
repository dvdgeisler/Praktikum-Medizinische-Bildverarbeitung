package de.uni_tuebingen.gris.pmb.config;

import java.io.Serializable;

public abstract interface IConfigurationPropertyList<T extends Serializable> extends IConfigurationProperty<IConfigurationPropertyValueList<T>>
{
}