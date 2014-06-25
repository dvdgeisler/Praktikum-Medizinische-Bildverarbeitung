package de.uni_tuebingen.gris.pmb.module;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Map.Entry;

public class ModuleManager implements IModuleManager {
	
	/**
	 * 
	 */
	private final IModuleManagerConfiguration configuration;
	
	/**
	 * 
	 */
	private final URLClassLoader classLoader;
	
	/**
	 * 
	 */
	private final ModuleManagerObserver observer;
	
	/**
	 * 
	 */
	private final HashMap<String, IModule> modules;
	
	{
		this.observer = new ModuleManagerObserver();
		this.modules = new HashMap<String, IModule>();
	}

	public ModuleManager(IModuleManagerConfiguration configuration) {
		this.configuration = configuration;
		this.classLoader = createClassLoader(configuration.getLoadPaths());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IModule getModule(String identifier) {
		return this.modules.get(identifier);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IModule addModule(String identifier, IModule module) {
		return this.modules.put(identifier, module);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IModule removeModule(String identifer) {
		return this.modules.remove(identifer);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IModule removeModule(IModule module) {
		return this.removeModule(this.getModuleIdentifier(module));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Collection<IModule> getModules() {
		return this.modules.values();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Collection<IModule> getModules(Class<?> clazz) {
		List<IModule> modules;
		
		modules = new ArrayList<IModule>();
		for(IModule module : this.getModules())
			if(clazz.isInstance(module))
				modules.add(module);
		
		return modules;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getModuleIdentifier(IModule module) {
		for(Entry<String, IModule> kvp : this.modules.entrySet())
			if(kvp.getValue() == module)
				return kvp.getKey();
		
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ModuleManagerObserver getObserver() {
		return this.observer;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IModuleManagerConfiguration getConfiguration() {
		return this.configuration;
	}

	private URLClassLoader getClassLoader() {
		return this.classLoader;
	}

	@Override
	public void loadModules() {
		for(IModuleConfiguration moduleConfiguration : this.getConfiguration().getModuleConfigurations())
			try {
				Class<? extends IModule> moduleClass;
				IModule module;
				
				moduleClass = (Class<? extends IModule>) this.getClassLoader().loadClass(moduleConfiguration.getModuleName());
				module = moduleClass.getConstructor(IModuleConfiguration.class).newInstance(moduleConfiguration);
				this.addModule(moduleConfiguration.getModuleId(), module);
			} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
				e.printStackTrace();
			}
	}

	private static URLClassLoader createClassLoader(List<String> loadPaths) {
		List<URL> urls;
		
		urls = new ArrayList<URL>(loadPaths.size());
		for(String path : loadPaths)
			try {
				urls.add(new File(path).toURI().toURL());
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		
		return new URLClassLoader(urls.toArray(new URL[0]),ModuleManager.class.getClassLoader());
	}

}
