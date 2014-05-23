package de.uni_tuebingen.gris.pmb.config;

import de.uni_tuebingen.gris.pmb.utils.listener.IListener;

public interface IConfigurationListener extends IListener<IConfigurationListener> {

	void onConfigurationPropertyChanged(IConfigurationPropertyChangedEvent<?> event);
}
