/*
 * generated by Xtext 2.26.0
 */
package kcl.uk.dzh.zpl.ui;

import com.google.inject.Injector;
import kcl.uk.dzh.zpl.RaceGame.ui.internal.RaceGameActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class RaceGameExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(RaceGameActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		RaceGameActivator activator = RaceGameActivator.getInstance();
		return activator != null ? activator.getInjector(RaceGameActivator.KCL_UK_DZH_ZPL_RACEGAME) : null;
	}

}