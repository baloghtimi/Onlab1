/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy_helper_pattern.vql
 */
package org.mondo.collaboration.security.increment.policy.util;

import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.mondo.collaboration.security.increment.policy.AllUsersMatch;

/**
 * A match processor tailored for the org.mondo.collaboration.security.increment.policy.allUsers pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class AllUsersProcessor implements IMatchProcessor<AllUsersMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pUser the value of pattern parameter user in the currently processed match
   * 
   */
  public abstract void process(final String pUser);
  
  @Override
  public void process(final AllUsersMatch match) {
    process(match.getUser());
  }
}
