/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy.vql
 */
package org.mondo.collaboration.security.increment.policy.util;

import WTSpec4M.SystemFault;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.mondo.collaboration.security.increment.policy.ObjectFaultMatch;

/**
 * A match processor tailored for the org.mondo.collaboration.security.increment.policy.objectFault pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class ObjectFaultProcessor implements IMatchProcessor<ObjectFaultMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pFault the value of pattern parameter fault in the currently processed match
   * 
   */
  public abstract void process(final SystemFault pFault);
  
  @Override
  public void process(final ObjectFaultMatch match) {
    process(match.getFault());
  }
}
