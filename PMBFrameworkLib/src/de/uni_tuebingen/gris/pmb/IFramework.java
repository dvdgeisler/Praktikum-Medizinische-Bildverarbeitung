package de.uni_tuebingen.gris.pmb;

import de.uni_tuebingen.gris.pmb.config.IConfigurable;
import de.uni_tuebingen.gris.pmb.module.IModuleManager;
import de.uni_tuebingen.gris.pmb.utils.listener.IObservable;

public interface IFramework extends IObservable<IFrameworkListener>, IConfigurable {

    /**
     * TODO no doc
     * @return
    **/
    IModuleManager getModuleManager();
    
    void loadFramework();

}
