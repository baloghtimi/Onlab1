/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy.vql
 */
package org.mondo.collaboration.security.increment.policy;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.mondo.collaboration.security.increment.policy.FindObjectAssetWithoutRootMatcher;
import org.mondo.collaboration.security.increment.policy.FindRootMatcher;
import org.mondo.collaboration.security.increment.policy.InputOutputMatcher;
import org.mondo.collaboration.security.increment.policy.NonInputOutputMatcher;
import org.mondo.collaboration.security.increment.policy.util.FindObjectAssetWithoutRootQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.FindRootQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.InputOutputQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.NonInputOutputQuerySpecification;

/**
 * A pattern group formed of all public patterns defined in policy.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file policy.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package org.mondo.collaboration.security.increment.policy, the group contains the definition of the following patterns: <ul>
 * <li>findRoot</li>
 * <li>findObjectAssetWithoutRoot</li>
 * <li>inputOutput</li>
 * <li>nonInputOutput</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class Policy extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Policy instance() throws ViatraQueryException {
    if (INSTANCE == null) {
        INSTANCE = new Policy();
    }
    return INSTANCE;
  }
  
  private static Policy INSTANCE;
  
  private Policy() throws ViatraQueryException {
    querySpecifications.add(FindRootQuerySpecification.instance());
    querySpecifications.add(FindObjectAssetWithoutRootQuerySpecification.instance());
    querySpecifications.add(InputOutputQuerySpecification.instance());
    querySpecifications.add(NonInputOutputQuerySpecification.instance());
  }
  
  public FindRootQuerySpecification getFindRoot() throws ViatraQueryException {
    return FindRootQuerySpecification.instance();
  }
  
  public FindRootMatcher getFindRoot(final ViatraQueryEngine engine) throws ViatraQueryException {
    return FindRootMatcher.on(engine);
  }
  
  public FindObjectAssetWithoutRootQuerySpecification getFindObjectAssetWithoutRoot() throws ViatraQueryException {
    return FindObjectAssetWithoutRootQuerySpecification.instance();
  }
  
  public FindObjectAssetWithoutRootMatcher getFindObjectAssetWithoutRoot(final ViatraQueryEngine engine) throws ViatraQueryException {
    return FindObjectAssetWithoutRootMatcher.on(engine);
  }
  
  public InputOutputQuerySpecification getInputOutput() throws ViatraQueryException {
    return InputOutputQuerySpecification.instance();
  }
  
  public InputOutputMatcher getInputOutput(final ViatraQueryEngine engine) throws ViatraQueryException {
    return InputOutputMatcher.on(engine);
  }
  
  public NonInputOutputQuerySpecification getNonInputOutput() throws ViatraQueryException {
    return NonInputOutputQuerySpecification.instance();
  }
  
  public NonInputOutputMatcher getNonInputOutput(final ViatraQueryEngine engine) throws ViatraQueryException {
    return NonInputOutputMatcher.on(engine);
  }
}
