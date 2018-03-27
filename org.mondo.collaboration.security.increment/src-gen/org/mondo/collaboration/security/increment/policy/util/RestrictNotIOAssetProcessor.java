/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy_gen.vql
 */
package org.mondo.collaboration.security.increment.policy.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.mondo.collaboration.security.increment.policy.RestrictNotIOAssetMatch;

/**
 * A match processor tailored for the org.mondo.collaboration.security.increment.policy.restrictNotIOAsset pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class RestrictNotIOAssetProcessor implements IMatchProcessor<RestrictNotIOAssetMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pObject the value of pattern parameter object in the currently processed match
   * 
   */
  public abstract void process(final EObject pObject);
  
  @Override
  public void process(final RestrictNotIOAssetMatch match) {
    process(match.getObject());
  }
}
