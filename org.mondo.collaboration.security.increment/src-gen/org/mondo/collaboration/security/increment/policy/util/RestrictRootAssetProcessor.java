/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy_helper_pattern.vql
 */
package org.mondo.collaboration.security.increment.policy.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.mondo.collaboration.security.increment.policy.RestrictRootAssetMatch;

/**
 * A match processor tailored for the org.mondo.collaboration.security.increment.policy.restrictRootAsset pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class RestrictRootAssetProcessor implements IMatchProcessor<RestrictRootAssetMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pRoot the value of pattern parameter root in the currently processed match
   * 
   */
  public abstract void process(final EObject pRoot);
  
  @Override
  public void process(final RestrictRootAssetMatch match) {
    process(match.getRoot());
  }
}
