/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy.vql
 */
package org.mondo.collaboration.security.increment.policy.util;

import WTSpec4M.wtc;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.mondo.collaboration.security.increment.policy.AttributeenabledMatch;

/**
 * A match processor tailored for the org.mondo.collaboration.security.increment.policy.attributeenabled pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class AttributeenabledProcessor implements IMatchProcessor<AttributeenabledMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pWtc the value of pattern parameter wtc in the currently processed match
   * @param pValue the value of pattern parameter value in the currently processed match
   * 
   */
  public abstract void process(final wtc pWtc, final Boolean pValue);
  
  @Override
  public void process(final AttributeenabledMatch match) {
    process(match.getWtc(), match.getValue());
  }
}
