/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy_judgement.vql
 */
package org.mondo.collaboration.security.increment.policy.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.mondo.collaboration.policy.rules.AccessibilityLevel;
import org.mondo.collaboration.policy.rules.OperationType;
import org.mondo.collaboration.security.increment.policy.JudgementOnObject_at_1Match;

/**
 * A match processor tailored for the org.mondo.collaboration.security.increment.policy.judgementOnObject_at_1 pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class JudgementOnObject_at_1Processor implements IMatchProcessor<JudgementOnObject_at_1Match> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pUser the value of pattern parameter user in the currently processed match
   * @param pObject the value of pattern parameter object in the currently processed match
   * @param pOperation the value of pattern parameter operation in the currently processed match
   * @param pAccess the value of pattern parameter access in the currently processed match
   * 
   */
  public abstract void process(final String pUser, final EObject pObject, final OperationType pOperation, final AccessibilityLevel pAccess);
  
  @Override
  public void process(final JudgementOnObject_at_1Match match) {
    process(match.getUser(), match.getObject(), match.getOperation(), match.getAccess());
  }
}
