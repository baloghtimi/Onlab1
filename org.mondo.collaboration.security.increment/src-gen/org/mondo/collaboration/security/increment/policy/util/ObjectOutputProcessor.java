/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy.vql
 */
package org.mondo.collaboration.security.increment.policy.util;

import WTSpec4M.SystemOutput;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.mondo.collaboration.security.increment.policy.ObjectOutputMatch;

/**
 * A match processor tailored for the org.mondo.collaboration.security.increment.policy.objectOutput pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class ObjectOutputProcessor implements IMatchProcessor<ObjectOutputMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pOutput the value of pattern parameter output in the currently processed match
   * 
   */
  public abstract void process(final SystemOutput pOutput);
  
  @Override
  public void process(final ObjectOutputMatch match) {
    process(match.getOutput());
  }
}
