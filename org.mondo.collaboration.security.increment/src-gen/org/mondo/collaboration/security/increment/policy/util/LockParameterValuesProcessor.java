/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy.vql
 */
package org.mondo.collaboration.security.increment.policy.util;

import WTSpec4M.SystemParam;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.mondo.collaboration.security.increment.policy.LockParameterValuesMatch;

/**
 * A match processor tailored for the org.mondo.collaboration.security.increment.policy.lockParameterValues pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class LockParameterValuesProcessor implements IMatchProcessor<LockParameterValuesMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pParam the value of pattern parameter param in the currently processed match
   * @param pValue the value of pattern parameter value in the currently processed match
   * 
   */
  public abstract void process(final SystemParam pParam, final Integer pValue);
  
  @Override
  public void process(final LockParameterValuesMatch match) {
    process(match.getParam(), match.getValue());
  }
}
