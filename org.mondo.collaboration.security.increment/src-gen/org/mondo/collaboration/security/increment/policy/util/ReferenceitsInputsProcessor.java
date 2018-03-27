/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy.vql
 */
package org.mondo.collaboration.security.increment.policy.util;

import WTSpec4M.SystemInput;
import WTSpec4M.WT;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.mondo.collaboration.security.increment.policy.ReferenceitsInputsMatch;

/**
 * A match processor tailored for the org.mondo.collaboration.security.increment.policy.referenceitsInputs pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class ReferenceitsInputsProcessor implements IMatchProcessor<ReferenceitsInputsMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pRoot the value of pattern parameter root in the currently processed match
   * @param pInput the value of pattern parameter input in the currently processed match
   * 
   */
  public abstract void process(final WT pRoot, final SystemInput pInput);
  
  @Override
  public void process(final ReferenceitsInputsMatch match) {
    process(match.getRoot(), match.getInput());
  }
}
