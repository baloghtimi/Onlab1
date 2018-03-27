/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy.vql
 */
package org.mondo.collaboration.security.increment.policy.util;

import WTSpec4M.MainSubsystem;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.mondo.collaboration.security.increment.policy.ObjectSubsystemWithNameMatch;

/**
 * A match processor tailored for the org.mondo.collaboration.security.increment.policy.objectSubsystemWithName pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class ObjectSubsystemWithNameProcessor implements IMatchProcessor<ObjectSubsystemWithNameMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pSubSystem the value of pattern parameter subSystem in the currently processed match
   * @param pName the value of pattern parameter name in the currently processed match
   * 
   */
  public abstract void process(final MainSubsystem pSubSystem, final String pName);
  
  @Override
  public void process(final ObjectSubsystemWithNameMatch match) {
    process(match.getSubSystem(), match.getName());
  }
}
