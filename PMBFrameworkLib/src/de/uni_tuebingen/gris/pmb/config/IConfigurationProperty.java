package de.uni_tuebingen.gris.pmb.config;

import java.io.Serializable;

public abstract interface IConfigurationProperty<T extends Serializable> extends Serializable
{
  public abstract String getKey();

  public abstract T getValue();
}