/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy.vql
 */
package org.mondo.collaboration.security.increment.policy.util;

import WTSpec4M.SystemOutput;
import WTSpec4M.WT;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.mondo.collaboration.security.increment.policy.ReferenceitsOutputsMatch;

/**
 * A match processor tailored for the org.mondo.collaboration.security.increment.policy.referenceitsOutputs pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class ReferenceitsOutputsProcessor implements IMatchProcessor<ReferenceitsOutputsMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pRoot the value of pattern parameter root in the currently processed match
   * @param pOutput the value of pattern parameter output in the currently processed match
   * 
   */
  public abstract void process(final WT pRoot, final SystemOutput pOutput);
  
  @Override
  public void process(final ReferenceitsOutputsMatch match) {
    process(match.getRoot(), match.getOutput());
  }
}
