package de.uni_tuebingen.gris.pmb;

import de.uni_tuebingen.gris.pmb.module.IModuleManager;
import de.uni_tuebingen.gris.pmb.module.ModuleManager;
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
        this.moduleManager = new ModuleManager();
    }

    /**
     * TODO no doc
     */
    public Framework(FrameworkConfiguration configuration) {
        this.configuration = configuration;
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
     */
    private void run() {
        /*
         * TODO: write file down
         */
        this.getModuleManager().getModule(this.getConfiguration().getRootModuleId()).perform();
    }

    /**
     * TODO no doc
     * @param args command line arguments
     */
    public static void main(String[] args) {
        FrameworkConfiguration c;
        Framework f;

        c = FrameworkConfiguration.parseArguments(args);
        f = new Framework(c);
        f.run();

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
