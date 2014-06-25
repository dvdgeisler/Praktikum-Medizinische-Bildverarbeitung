package de.uni_tuebingen.gris.pmb;

import java.util.logging.Logger;

import org.opencv.core.Core;
import org.opencv.highgui.Highgui;

import de.uni_tuebingen.gris.pmb.config.ConfigurationRootModuleNotSpecifiedException;
import de.uni_tuebingen.gris.pmb.data.IImage;
import de.uni_tuebingen.gris.pmb.module.IModule;
import de.uni_tuebingen.gris.pmb.module.IModuleManager;
import de.uni_tuebingen.gris.pmb.module.IModuleManagerListener;
import de.uni_tuebingen.gris.pmb.module.IModuleManagerModuleDeinitializedEvent;
import de.uni_tuebingen.gris.pmb.module.IModuleManagerModuleInitializedEvent;
import de.uni_tuebingen.gris.pmb.module.IModuleManagerModuleLoadedEvent;
import de.uni_tuebingen.gris.pmb.module.IModuleManagerModuleUnloadedEvent;
import de.uni_tuebingen.gris.pmb.module.ModuleManager;
import de.uni_tuebingen.gris.pmb.utils.listener.IEvent;
import de.uni_tuebingen.gris.pmb.utils.listener.IObserver;

public class Framework implements IFramework {

    /**
     * 
     */
    private final FrameworkObserver observer;

    /**
     *
     */
    private final FrameworkConfiguration configuration;

    /**
     * 
     */
    private final ModuleManager moduleManager;

    {
        this.observer = new FrameworkObserver();
    }

    /**
     * TODO no doc
     */
    public Framework(FrameworkConfiguration configuration) {
        this.configuration = configuration;
        this.moduleManager = new ModuleManager(this.getConfiguration().getModuleManagerConfiguration());
    }

    /**
     * {@inheritDoc}
     */
	@Override
	public void loadFramework() {
		this.getModuleManager().getObserver().addListener(new IModuleManagerListener() {
			
			@Override
			public void onModuleLoaded(IModuleManagerModuleLoadedEvent event) {
				Logger.getGlobal().info(String.format("module loaded: %s %s",event.getModuleIdentifier(),event.getModule().getClass().getCanonicalName()));
				event.getModule().setFramework(Framework.this);
			}

			@Override
			public void onModuleUnloaded(IModuleManagerModuleUnloadedEvent event) {
				Logger.getGlobal().info(String.format("module unloaded: %s %s",event.getModuleIdentifier(),event.getModule().getClass().getCanonicalName()));
				event.getModule().setFramework(null);
			}

			@Override
			public void onModuleInitialized(IModuleManagerModuleInitializedEvent event) {
				Logger.getGlobal().info(String.format("module initialized: %s %s",event.getModuleIdentifier(),event.getModule().getClass().getCanonicalName()));
			}

			@Override
			public void onModuleDeinitialized(IModuleManagerModuleDeinitializedEvent event) {
				Logger.getGlobal().info(String.format("module deinitialized: %s %s",event.getModuleIdentifier(),event.getModule().getClass().getCanonicalName()));
			}

			@Override
			public void onEventRaised(IEvent<IModuleManagerListener> event) {}
		});
		
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		Logger.getGlobal().info(String.format("opencv loaded: %s",Core.VERSION));
		
		this.getModuleManager().loadModules();
	}

    /**
     * {@inheritDoc}
     */
    @Override
    public IModuleManager getModuleManager() {
        return this.moduleManager;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IObserver<IFrameworkListener> getObserver() {
        return this.observer;
    }

    /**
     * TODO no doc
     * @throws ConfigurationRootModuleNotSpecifiedException 
     */
    private void run() throws ConfigurationRootModuleNotSpecifiedException {
    	IModule module;
    	IImage image;
    	
        module = this.getModuleManager().getModule(this.getConfiguration().getRootModuleId());
        image = module.perform();
        
        Highgui.imwrite(this.getConfiguration().getResultPath(),image.getData());
    }

    /**
     * TODO no doc
     * @param args command line arguments
     */
    public static void main(String[] args) {
        FrameworkConfiguration c;
        Framework f;

        try {
	        c = FrameworkConfiguration.parseArguments(args);
	        f = new Framework(c);
	        f.loadFramework();
			f.run();
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}

        /*
         * success
         */
        System.exit(0);
    }

    /**
     * @{inheritDoc}
     */
    @Override
    public IFrameworkConfiguration getConfiguration() {
        return this.configuration;
    }

}
