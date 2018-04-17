/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/windturbineS_gen.vql
 */
package org.mondo.collaboration.security.increment.policy.util;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.mondo.collaboration.security.increment.policy.AttributeAssetMatch;

/**
 * A match processor tailored for the org.mondo.collaboration.security.increment.policy.attributeAsset pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class AttributeAssetProcessor implements IMatchProcessor<AttributeAssetMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pSource the value of pattern parameter source in the currently processed match
   * @param pValue the value of pattern parameter value in the currently processed match
   * @param pAttribute the value of pattern parameter attribute in the currently processed match
   * 
   */
  public abstract void process(final EObject pSource, final Object pValue, final EAttribute pAttribute);
  
  @Override
  public void process(final AttributeAssetMatch match) {
    process(match.getSource(), match.getValue(), match.getAttribute());
  }
}
