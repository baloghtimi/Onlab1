/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/WTSpec4M_gen.vql
 */
package org.mondo.collaboration.security.increment.policy.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.mondo.collaboration.security.increment.policy.ContainmentReferenceMatch;

/**
 * A match processor tailored for the org.mondo.collaboration.security.increment.policy.containmentReference pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class ContainmentReferenceProcessor implements IMatchProcessor<ContainmentReferenceMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pSource the value of pattern parameter source in the currently processed match
   * @param pTarget the value of pattern parameter target in the currently processed match
   * @param pReference the value of pattern parameter reference in the currently processed match
   * 
   */
  public abstract void process(final EObject pSource, final EObject pTarget, final EReference pReference);
  
  @Override
  public void process(final ContainmentReferenceMatch match) {
    process(match.getSource(), match.getTarget(), match.getReference());
  }
}
