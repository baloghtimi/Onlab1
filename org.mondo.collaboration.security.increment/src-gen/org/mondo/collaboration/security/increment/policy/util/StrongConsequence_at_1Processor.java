/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy_gen.vql
 */
package org.mondo.collaboration.security.increment.policy.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.mondo.collaboration.security.increment.policy.StrongConsequence_at_1Match;
import org.mondo.collaboration.security.increment.vocabulary.AccessibilityLevel;
import org.mondo.collaboration.security.increment.vocabulary.OperationType;

/**
 * A match processor tailored for the org.mondo.collaboration.security.increment.policy.strongConsequence_at_1 pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class StrongConsequence_at_1Processor implements IMatchProcessor<StrongConsequence_at_1Match> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pUser the value of pattern parameter user in the currently processed match
   * @param pDepAsset the value of pattern parameter depAsset in the currently processed match
   * @param pDepOp the value of pattern parameter depOp in the currently processed match
   * @param pDepAccess the value of pattern parameter depAccess in the currently processed match
   * @param pDomAsset the value of pattern parameter domAsset in the currently processed match
   * @param pDomOp the value of pattern parameter domOp in the currently processed match
   * @param pDomAccess the value of pattern parameter domAccess in the currently processed match
   * 
   */
  public abstract void process(final String pUser, final EObject pDepAsset, final OperationType pDepOp, final AccessibilityLevel pDepAccess, final EObject pDomAsset, final OperationType pDomOp, final AccessibilityLevel pDomAccess);
  
  @Override
  public void process(final StrongConsequence_at_1Match match) {
    process(match.getUser(), match.getDepAsset(), match.getDepOp(), match.getDepAccess(), match.getDomAsset(), match.getDomOp(), match.getDomAccess());
  }
}
