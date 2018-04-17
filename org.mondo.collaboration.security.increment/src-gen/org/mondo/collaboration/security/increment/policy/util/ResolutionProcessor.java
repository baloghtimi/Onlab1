/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy_domination_same_priority.vql
 */
package org.mondo.collaboration.security.increment.policy.util;

import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.mondo.collaboration.policy.rules.AccessibilityLevel;
import org.mondo.collaboration.security.increment.policy.ResolutionMatch;

/**
 * A match processor tailored for the org.mondo.collaboration.security.increment.policy.resolution pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class ResolutionProcessor implements IMatchProcessor<ResolutionMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pDominatedAccess the value of pattern parameter dominatedAccess in the currently processed match
   * @param pPrevailingAccess the value of pattern parameter prevailingAccess in the currently processed match
   * 
   */
  public abstract void process(final AccessibilityLevel pDominatedAccess, final AccessibilityLevel pPrevailingAccess);
  
  @Override
  public void process(final ResolutionMatch match) {
    process(match.getDominatedAccess(), match.getPrevailingAccess());
  }
}
