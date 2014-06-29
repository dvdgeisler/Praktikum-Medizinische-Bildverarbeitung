package de.uni_tuebingen.gris.pmb.module;

import de.uni_tuebingen.gris.pmb.data.IImage;
import de.uni_tuebingen.gris.pmb.utils.listener.DefaultEvent;

/**
 * TODO no doc
 * @author david
 *
 */
public class ModulePerformedEvent extends DefaultEvent<IModuleListener> implements IModulePerformedEvent {

	/**
	 * TODO no doc
	 */
	private final IImage image;
	
	/**
	 * TODO no doc
	 * @param event
	 */
	protected ModulePerformedEvent(IModulePerformedEvent event) {
		super(event.getSource(),event.getObserver());
		this.image = event.getImage();
	}
	
	/**
	 * TODO no doc
	 * @param source
	 * @param observer
	 * @param image
	 */
	public ModulePerformedEvent(IModule source, IModuleObserver observer, IImage image) {
		super(source, observer);
		this.image = image;
	}
	
	/**
	 * TODO no doc
	 * @param source
	 * @param image
	 */
	public ModulePerformedEvent(IModule source, IImage image) {
		this(source,source.getObserver(),image);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public IImage getImage() {
		return this.image;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public IModulePerformedEvent clone() {
		return new ModulePerformedEvent(this);
	}

}
