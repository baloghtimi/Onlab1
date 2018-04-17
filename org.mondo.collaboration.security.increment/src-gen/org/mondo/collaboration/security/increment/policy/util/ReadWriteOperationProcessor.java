/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy_helper_pattern.vql
 */
package org.mondo.collaboration.security.increment.policy.util;

import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.mondo.collaboration.policy.rules.OperationType;
import org.mondo.collaboration.security.increment.policy.ReadWriteOperationMatch;

/**
 * A match processor tailored for the org.mondo.collaboration.security.increment.policy.readWriteOperation pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class ReadWriteOperationProcessor implements IMatchProcessor<ReadWriteOperationMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pOperation the value of pattern parameter operation in the currently processed match
   * 
   */
  public abstract void process(final OperationType pOperation);
  
  @Override
  public void process(final ReadWriteOperationMatch match) {
    process(match.getOperation());
  }
}
