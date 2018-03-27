/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy.vql
 */
package org.mondo.collaboration.security.increment.policy.util;

import WTSpec4M.SystemTimer;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.mondo.collaboration.security.increment.policy.ObjectTimerMatch;

/**
 * A match processor tailored for the org.mondo.collaboration.security.increment.policy.objectTimer pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class ObjectTimerProcessor implements IMatchProcessor<ObjectTimerMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pTimer the value of pattern parameter timer in the currently processed match
   * 
   */
  public abstract void process(final SystemTimer pTimer);
  
  @Override
  public void process(final ObjectTimerMatch match) {
    process(match.getTimer());
  }
}
