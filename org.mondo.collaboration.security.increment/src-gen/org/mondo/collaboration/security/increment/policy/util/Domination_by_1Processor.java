/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy_gen.vql
 */
package org.mondo.collaboration.security.increment.policy.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.mondo.collaboration.security.increment.policy.Domination_by_1Match;
import org.mondo.collaboration.security.increment.vocabulary.AccessibilityLevel;

/**
 * A match processor tailored for the org.mondo.collaboration.security.increment.policy.domination_by_1 pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class Domination_by_1Processor implements IMatchProcessor<Domination_by_1Match> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pUser the value of pattern parameter user in the currently processed match
   * @param pAsset the value of pattern parameter asset in the currently processed match
   * @param pOperation the value of pattern parameter operation in the currently processed match
   * @param pDominatedAccess the value of pattern parameter dominatedAccess in the currently processed match
   * @param pPrevailingAccess the value of pattern parameter prevailingAccess in the currently processed match
   * 
   */
  public abstract void process(final String pUser, final EObject pAsset, final Object pOperation, final AccessibilityLevel pDominatedAccess, final AccessibilityLevel pPrevailingAccess);
  
  @Override
  public void process(final Domination_by_1Match match) {
    process(match.getUser(), match.getAsset(), match.getOperation(), match.getDominatedAccess(), match.getPrevailingAccess());
  }
}
