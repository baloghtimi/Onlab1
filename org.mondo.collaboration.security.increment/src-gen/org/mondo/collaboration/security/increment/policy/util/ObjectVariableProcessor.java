/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy.vql
 */
package org.mondo.collaboration.security.increment.policy.util;

import WTSpec4M.SystemVariable;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.mondo.collaboration.security.increment.policy.ObjectVariableMatch;

/**
 * A match processor tailored for the org.mondo.collaboration.security.increment.policy.objectVariable pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class ObjectVariableProcessor implements IMatchProcessor<ObjectVariableMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pVariable the value of pattern parameter variable in the currently processed match
   * 
   */
  public abstract void process(final SystemVariable pVariable);
  
  @Override
  public void process(final ObjectVariableMatch match) {
    process(match.getVariable());
  }
}
