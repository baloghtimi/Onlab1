/*
 * generated by Xtext 2.13.0
 */
package org.mondo.collaboration.policy.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.mondo.collaboration.policy.ui.internal.PolicyActivator;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class RulesExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(PolicyActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		PolicyActivator activator = PolicyActivator.getInstance();
		return activator != null ? activator.getInjector(PolicyActivator.ORG_MONDO_COLLABORATION_POLICY_RULES) : null;
	}

}