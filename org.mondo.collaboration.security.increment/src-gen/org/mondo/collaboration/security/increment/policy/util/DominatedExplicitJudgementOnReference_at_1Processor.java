/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy_domination_same_priority.vql
 */
package org.mondo.collaboration.security.increment.policy.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.mondo.collaboration.policy.rules.AccessibilityLevel;
import org.mondo.collaboration.policy.rules.OperationType;
import org.mondo.collaboration.security.increment.policy.DominatedExplicitJudgementOnReference_at_1Match;

/**
 * A match processor tailored for the org.mondo.collaboration.security.increment.policy.dominatedExplicitJudgementOnReference_at_1 pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class DominatedExplicitJudgementOnReference_at_1Processor implements IMatchProcessor<DominatedExplicitJudgementOnReference_at_1Match> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pUser the value of pattern parameter user in the currently processed match
   * @param pSource the value of pattern parameter source in the currently processed match
   * @param pTarget the value of pattern parameter target in the currently processed match
   * @param pReference the value of pattern parameter reference in the currently processed match
   * @param pOperation the value of pattern parameter operation in the currently processed match
   * @param pPrevailingAccess the value of pattern parameter prevailingAccess in the currently processed match
   * 
   */
  public abstract void process(final String pUser, final EObject pSource, final EObject pTarget, final EReference pReference, final OperationType pOperation, final AccessibilityLevel pPrevailingAccess);
  
  @Override
  public void process(final DominatedExplicitJudgementOnReference_at_1Match match) {
    process(match.getUser(), match.getSource(), match.getTarget(), match.getReference(), match.getOperation(), match.getPrevailingAccess());
  }
}
