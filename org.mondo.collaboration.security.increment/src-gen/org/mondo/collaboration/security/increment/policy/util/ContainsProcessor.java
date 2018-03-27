/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy.vql
 */
package org.mondo.collaboration.security.increment.policy.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.mondo.collaboration.security.increment.policy.ContainsMatch;

/**
 * A match processor tailored for the org.mondo.collaboration.security.increment.policy.contains pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class ContainsProcessor implements IMatchProcessor<ContainsMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pContainer the value of pattern parameter container in the currently processed match
   * @param pContained the value of pattern parameter contained in the currently processed match
   * 
   */
  public abstract void process(final EObject pContainer, final EObject pContained);
  
  @Override
  public void process(final ContainsMatch match) {
    process(match.getContainer(), match.getContained());
  }
}
