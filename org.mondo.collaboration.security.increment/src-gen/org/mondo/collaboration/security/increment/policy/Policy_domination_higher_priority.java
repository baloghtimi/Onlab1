/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy_domination_higher_priority.vql
 */
package org.mondo.collaboration.security.increment.policy;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.mondo.collaboration.security.increment.policy.DominationOnAttribute_of_defaultMatcher;
import org.mondo.collaboration.security.increment.policy.DominationOnAttribute_of_weakMatcher;
import org.mondo.collaboration.security.increment.policy.DominationOnObject_of_defaultMatcher;
import org.mondo.collaboration.security.increment.policy.DominationOnReference_of_defaultMatcher;
import org.mondo.collaboration.security.increment.policy.DominationOnReference_of_weakMatcher;
import org.mondo.collaboration.security.increment.policy.util.DominationOnAttribute_of_defaultQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.DominationOnAttribute_of_weakQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.DominationOnObject_of_defaultQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.DominationOnReference_of_defaultQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.DominationOnReference_of_weakQuerySpecification;

/**
 * A pattern group formed of all public patterns defined in policy_domination_higher_priority.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file policy_domination_higher_priority.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package org.mondo.collaboration.security.increment.policy, the group contains the definition of the following patterns: <ul>
 * <li>dominationOnObject_of_default</li>
 * <li>dominationOnAttribute_of_default</li>
 * <li>dominationOnAttribute_of_weak</li>
 * <li>dominationOnReference_of_default</li>
 * <li>dominationOnReference_of_weak</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class Policy_domination_higher_priority extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Policy_domination_higher_priority instance() throws ViatraQueryException {
    if (INSTANCE == null) {
        INSTANCE = new Policy_domination_higher_priority();
    }
    return INSTANCE;
  }
  
  private static Policy_domination_higher_priority INSTANCE;
  
  private Policy_domination_higher_priority() throws ViatraQueryException {
    querySpecifications.add(DominationOnObject_of_defaultQuerySpecification.instance());
    querySpecifications.add(DominationOnAttribute_of_defaultQuerySpecification.instance());
    querySpecifications.add(DominationOnAttribute_of_weakQuerySpecification.instance());
    querySpecifications.add(DominationOnReference_of_defaultQuerySpecification.instance());
    querySpecifications.add(DominationOnReference_of_weakQuerySpecification.instance());
  }
  
  public DominationOnObject_of_defaultQuerySpecification getDominationOnObject_of_default() throws ViatraQueryException {
    return DominationOnObject_of_defaultQuerySpecification.instance();
  }
  
  public DominationOnObject_of_defaultMatcher getDominationOnObject_of_default(final ViatraQueryEngine engine) throws ViatraQueryException {
    return DominationOnObject_of_defaultMatcher.on(engine);
  }
  
  public DominationOnAttribute_of_defaultQuerySpecification getDominationOnAttribute_of_default() throws ViatraQueryException {
    return DominationOnAttribute_of_defaultQuerySpecification.instance();
  }
  
  public DominationOnAttribute_of_defaultMatcher getDominationOnAttribute_of_default(final ViatraQueryEngine engine) throws ViatraQueryException {
    return DominationOnAttribute_of_defaultMatcher.on(engine);
  }
  
  public DominationOnAttribute_of_weakQuerySpecification getDominationOnAttribute_of_weak() throws ViatraQueryException {
    return DominationOnAttribute_of_weakQuerySpecification.instance();
  }
  
  public DominationOnAttribute_of_weakMatcher getDominationOnAttribute_of_weak(final ViatraQueryEngine engine) throws ViatraQueryException {
    return DominationOnAttribute_of_weakMatcher.on(engine);
  }
  
  public DominationOnReference_of_defaultQuerySpecification getDominationOnReference_of_default() throws ViatraQueryException {
    return DominationOnReference_of_defaultQuerySpecification.instance();
  }
  
  public DominationOnReference_of_defaultMatcher getDominationOnReference_of_default(final ViatraQueryEngine engine) throws ViatraQueryException {
    return DominationOnReference_of_defaultMatcher.on(engine);
  }
  
  public DominationOnReference_of_weakQuerySpecification getDominationOnReference_of_weak() throws ViatraQueryException {
    return DominationOnReference_of_weakQuerySpecification.instance();
  }
  
  public DominationOnReference_of_weakMatcher getDominationOnReference_of_weak(final ViatraQueryEngine engine) throws ViatraQueryException {
    return DominationOnReference_of_weakMatcher.on(engine);
  }
}
