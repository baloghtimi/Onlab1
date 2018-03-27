/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy.vql
 */
package org.mondo.collaboration.security.increment.policy.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.mondo.collaboration.security.increment.policy.ObjectAllMatch;

/**
 * A match processor tailored for the org.mondo.collaboration.security.increment.policy.objectAll pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class ObjectAllProcessor implements IMatchProcessor<ObjectAllMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pObj the value of pattern parameter obj in the currently processed match
   * 
   */
  public abstract void process(final EObject pObj);
  
  @Override
  public void process(final ObjectAllMatch match) {
    process(match.getObj());
  }
}
