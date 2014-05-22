package de.uni_tuebingen.gris.pmb;

import de.uni_tuebingen.gris.pmb.utils.listener.IObserver;

public interface IFrameworkObserver extends IObserver<IFrameworkListener> {
	
	@Override
	boolean addListener(IFrameworkListener listener);

	@Override
	boolean removeListener(IFrameworkListener listener);
	
}