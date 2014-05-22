package de.uni_tuebingen.gris.pmb.config;

import java.io.Serializable;

public abstract interface IConfigurationProperty<T extends Serializable> extends Serializable
{
  public abstract String getKey();

  public abstract T getValue();
}

/* Location:           /home/david/Documents/Documents/Studium/Praktikum Medizinische Bildverarbeitung/git/PMBFrameworkLib/src/
 * Qualified Name:     de.uni_tuebingen.gris.pmb.config.IConfigurationProperty
 * JD-Core Version:    0.6.2
 */