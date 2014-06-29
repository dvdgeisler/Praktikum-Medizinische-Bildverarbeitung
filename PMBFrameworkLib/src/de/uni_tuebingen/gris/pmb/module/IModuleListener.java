package de.uni_tuebingen.gris.pmb.module;

import de.uni_tuebingen.gris.pmb.utils.listener.IListener;

public interface IModuleListener extends IListener<IModuleListener> {
	  
		/**
		 * TODO no doc
		 * @param event
		 */
		void onModulePerformed(IModulePerformedEvent event);
		  
		/**
		 * TODO no doc
		 * @param event
		 */
		void onModuleInitialized(IModuleInitializedEvent event);
		  
		/**
		 * TODO no doc
		 * @param event
		 */
		void onModuleDeinitialized(IModuleDeinitializedEvent event);
}