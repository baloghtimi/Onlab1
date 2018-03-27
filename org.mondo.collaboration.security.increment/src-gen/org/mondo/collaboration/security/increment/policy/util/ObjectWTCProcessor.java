/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy.vql
 */
package org.mondo.collaboration.security.increment.policy.util;

import WTSpec4M.wtc;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.mondo.collaboration.security.increment.policy.ObjectWTCMatch;

/**
 * A match processor tailored for the org.mondo.collaboration.security.increment.policy.objectWTC pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class ObjectWTCProcessor implements IMatchProcessor<ObjectWTCMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pCtrl the value of pattern parameter ctrl in the currently processed match
   * 
   */
  public abstract void process(final wtc pCtrl);
  
  @Override
  public void process(final ObjectWTCMatch match) {
    process(match.getCtrl());
  }
}
