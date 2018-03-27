/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy.vql
 */
package org.mondo.collaboration.security.increment.policy.util;

import WTSpec4M.SystemTimer;
import WTSpec4M.WT;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.mondo.collaboration.security.increment.policy.ReferenceitsTimersMatch;

/**
 * A match processor tailored for the org.mondo.collaboration.security.increment.policy.referenceitsTimers pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class ReferenceitsTimersProcessor implements IMatchProcessor<ReferenceitsTimersMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pRoot the value of pattern parameter root in the currently processed match
   * @param pTimer the value of pattern parameter timer in the currently processed match
   * 
   */
  public abstract void process(final WT pRoot, final SystemTimer pTimer);
  
  @Override
  public void process(final ReferenceitsTimersMatch match) {
    process(match.getRoot(), match.getTimer());
  }
}
