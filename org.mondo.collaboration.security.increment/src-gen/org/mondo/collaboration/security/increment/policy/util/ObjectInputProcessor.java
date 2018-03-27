/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy.vql
 */
package org.mondo.collaboration.security.increment.policy.util;

import WTSpec4M.SystemInput;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.mondo.collaboration.security.increment.policy.ObjectInputMatch;

/**
 * A match processor tailored for the org.mondo.collaboration.security.increment.policy.objectInput pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class ObjectInputProcessor implements IMatchProcessor<ObjectInputMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pInput the value of pattern parameter input in the currently processed match
   * 
   */
  public abstract void process(final SystemInput pInput);
  
  @Override
  public void process(final ObjectInputMatch match) {
    process(match.getInput());
  }
}
