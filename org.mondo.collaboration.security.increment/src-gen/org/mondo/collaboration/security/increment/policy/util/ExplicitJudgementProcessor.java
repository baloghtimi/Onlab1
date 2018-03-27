/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy_gen.vql
 */
package org.mondo.collaboration.security.increment.policy.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.mondo.collaboration.security.increment.policy.ExplicitJudgementMatch;
import org.mondo.collaboration.security.increment.vocabulary.AccessibilityLevel;
import org.mondo.collaboration.security.increment.vocabulary.OperationType;

/**
 * A match processor tailored for the org.mondo.collaboration.security.increment.policy.explicitJudgement pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class ExplicitJudgementProcessor implements IMatchProcessor<ExplicitJudgementMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pUser the value of pattern parameter user in the currently processed match
   * @param pAsset the value of pattern parameter asset in the currently processed match
   * @param pOperation the value of pattern parameter operation in the currently processed match
   * @param pAccess the value of pattern parameter access in the currently processed match
   * @param pPriority the value of pattern parameter priority in the currently processed match
   * 
   */
  public abstract void process(final String pUser, final EObject pAsset, final OperationType pOperation, final AccessibilityLevel pAccess, final Integer pPriority);
  
  @Override
  public void process(final ExplicitJudgementMatch match) {
    process(match.getUser(), match.getAsset(), match.getOperation(), match.getAccess(), match.getPriority());
  }
}
