/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy_domination_higher_priority.vql
 */
package org.mondo.collaboration.security.increment.policy.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.mondo.collaboration.security.increment.policy.DominationOnObject_of_defaultMatch;

/**
 * A match processor tailored for the org.mondo.collaboration.security.increment.policy.dominationOnObject_of_default pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class DominationOnObject_of_defaultProcessor implements IMatchProcessor<DominationOnObject_of_defaultMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pUser the value of pattern parameter user in the currently processed match
   * @param pObject the value of pattern parameter object in the currently processed match
   * @param pOperation the value of pattern parameter operation in the currently processed match
   * 
   */
  public abstract void process(final String pUser, final EObject pObject, final Object pOperation);
  
  @Override
  public void process(final DominationOnObject_of_defaultMatch match) {
    process(match.getUser(), match.getObject(), match.getOperation());
  }
}
