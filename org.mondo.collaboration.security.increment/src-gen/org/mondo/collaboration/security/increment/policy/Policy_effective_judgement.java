/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy_effective_judgement.vql
 */
package org.mondo.collaboration.security.increment.policy;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.mondo.collaboration.security.increment.policy.EffectiveJudgementOnAttributeMatcher;
import org.mondo.collaboration.security.increment.policy.EffectiveJudgementOnAttribute_at_1Matcher;
import org.mondo.collaboration.security.increment.policy.EffectiveJudgementOnAttribute_at_defaultMatcher;
import org.mondo.collaboration.security.increment.policy.EffectiveJudgementOnAttribute_at_weakMatcher;
import org.mondo.collaboration.security.increment.policy.EffectiveJudgementOnObjectMatcher;
import org.mondo.collaboration.security.increment.policy.EffectiveJudgementOnObject_at_1Matcher;
import org.mondo.collaboration.security.increment.policy.EffectiveJudgementOnObject_at_defaultMatcher;
import org.mondo.collaboration.security.increment.policy.EffectiveJudgementOnReferenceMatcher;
import org.mondo.collaboration.security.increment.policy.EffectiveJudgementOnReference_at_1Matcher;
import org.mondo.collaboration.security.increment.policy.EffectiveJudgementOnReference_at_defaultMatcher;
import org.mondo.collaboration.security.increment.policy.EffectiveJudgementOnReference_at_weakMatcher;
import org.mondo.collaboration.security.increment.policy.util.EffectiveJudgementOnAttributeQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.EffectiveJudgementOnAttribute_at_1QuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.EffectiveJudgementOnAttribute_at_defaultQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.EffectiveJudgementOnAttribute_at_weakQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.EffectiveJudgementOnObjectQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.EffectiveJudgementOnObject_at_1QuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.EffectiveJudgementOnObject_at_defaultQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.EffectiveJudgementOnReferenceQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.EffectiveJudgementOnReference_at_1QuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.EffectiveJudgementOnReference_at_defaultQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.EffectiveJudgementOnReference_at_weakQuerySpecification;

/**
 * A pattern group formed of all public patterns defined in policy_effective_judgement.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file policy_effective_judgement.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package org.mondo.collaboration.security.increment.policy, the group contains the definition of the following patterns: <ul>
 * <li>effectiveJudgementOnObject</li>
 * <li>effectiveJudgementOnObject_at_default</li>
 * <li>effectiveJudgementOnObject_at_1</li>
 * <li>effectiveJudgementOnAttribute</li>
 * <li>effectiveJudgementOnAttribute_at_default</li>
 * <li>effectiveJudgementOnAttribute_at_weak</li>
 * <li>effectiveJudgementOnAttribute_at_1</li>
 * <li>effectiveJudgementOnReference</li>
 * <li>effectiveJudgementOnReference_at_default</li>
 * <li>effectiveJudgementOnReference_at_weak</li>
 * <li>effectiveJudgementOnReference_at_1</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class Policy_effective_judgement extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Policy_effective_judgement instance() throws ViatraQueryException {
    if (INSTANCE == null) {
        INSTANCE = new Policy_effective_judgement();
    }
    return INSTANCE;
  }
  
  private static Policy_effective_judgement INSTANCE;
  
  private Policy_effective_judgement() throws ViatraQueryException {
    querySpecifications.add(EffectiveJudgementOnObjectQuerySpecification.instance());
    querySpecifications.add(EffectiveJudgementOnObject_at_defaultQuerySpecification.instance());
    querySpecifications.add(EffectiveJudgementOnObject_at_1QuerySpecification.instance());
    querySpecifications.add(EffectiveJudgementOnAttributeQuerySpecification.instance());
    querySpecifications.add(EffectiveJudgementOnAttribute_at_defaultQuerySpecification.instance());
    querySpecifications.add(EffectiveJudgementOnAttribute_at_weakQuerySpecification.instance());
    querySpecifications.add(EffectiveJudgementOnAttribute_at_1QuerySpecification.instance());
    querySpecifications.add(EffectiveJudgementOnReferenceQuerySpecification.instance());
    querySpecifications.add(EffectiveJudgementOnReference_at_defaultQuerySpecification.instance());
    querySpecifications.add(EffectiveJudgementOnReference_at_weakQuerySpecification.instance());
    querySpecifications.add(EffectiveJudgementOnReference_at_1QuerySpecification.instance());
  }
  
  public EffectiveJudgementOnObjectQuerySpecification getEffectiveJudgementOnObject() throws ViatraQueryException {
    return EffectiveJudgementOnObjectQuerySpecification.instance();
  }
  
  public EffectiveJudgementOnObjectMatcher getEffectiveJudgementOnObject(final ViatraQueryEngine engine) throws ViatraQueryException {
    return EffectiveJudgementOnObjectMatcher.on(engine);
  }
  
  public EffectiveJudgementOnObject_at_defaultQuerySpecification getEffectiveJudgementOnObject_at_default() throws ViatraQueryException {
    return EffectiveJudgementOnObject_at_defaultQuerySpecification.instance();
  }
  
  public EffectiveJudgementOnObject_at_defaultMatcher getEffectiveJudgementOnObject_at_default(final ViatraQueryEngine engine) throws ViatraQueryException {
    return EffectiveJudgementOnObject_at_defaultMatcher.on(engine);
  }
  
  public EffectiveJudgementOnObject_at_1QuerySpecification getEffectiveJudgementOnObject_at_1() throws ViatraQueryException {
    return EffectiveJudgementOnObject_at_1QuerySpecification.instance();
  }
  
  public EffectiveJudgementOnObject_at_1Matcher getEffectiveJudgementOnObject_at_1(final ViatraQueryEngine engine) throws ViatraQueryException {
    return EffectiveJudgementOnObject_at_1Matcher.on(engine);
  }
  
  public EffectiveJudgementOnAttributeQuerySpecification getEffectiveJudgementOnAttribute() throws ViatraQueryException {
    return EffectiveJudgementOnAttributeQuerySpecification.instance();
  }
  
  public EffectiveJudgementOnAttributeMatcher getEffectiveJudgementOnAttribute(final ViatraQueryEngine engine) throws ViatraQueryException {
    return EffectiveJudgementOnAttributeMatcher.on(engine);
  }
  
  public EffectiveJudgementOnAttribute_at_defaultQuerySpecification getEffectiveJudgementOnAttribute_at_default() throws ViatraQueryException {
    return EffectiveJudgementOnAttribute_at_defaultQuerySpecification.instance();
  }
  
  public EffectiveJudgementOnAttribute_at_defaultMatcher getEffectiveJudgementOnAttribute_at_default(final ViatraQueryEngine engine) throws ViatraQueryException {
    return EffectiveJudgementOnAttribute_at_defaultMatcher.on(engine);
  }
  
  public EffectiveJudgementOnAttribute_at_weakQuerySpecification getEffectiveJudgementOnAttribute_at_weak() throws ViatraQueryException {
    return EffectiveJudgementOnAttribute_at_weakQuerySpecification.instance();
  }
  
  public EffectiveJudgementOnAttribute_at_weakMatcher getEffectiveJudgementOnAttribute_at_weak(final ViatraQueryEngine engine) throws ViatraQueryException {
    return EffectiveJudgementOnAttribute_at_weakMatcher.on(engine);
  }
  
  public EffectiveJudgementOnAttribute_at_1QuerySpecification getEffectiveJudgementOnAttribute_at_1() throws ViatraQueryException {
    return EffectiveJudgementOnAttribute_at_1QuerySpecification.instance();
  }
  
  public EffectiveJudgementOnAttribute_at_1Matcher getEffectiveJudgementOnAttribute_at_1(final ViatraQueryEngine engine) throws ViatraQueryException {
    return EffectiveJudgementOnAttribute_at_1Matcher.on(engine);
  }
  
  public EffectiveJudgementOnReferenceQuerySpecification getEffectiveJudgementOnReference() throws ViatraQueryException {
    return EffectiveJudgementOnReferenceQuerySpecification.instance();
  }
  
  public EffectiveJudgementOnReferenceMatcher getEffectiveJudgementOnReference(final ViatraQueryEngine engine) throws ViatraQueryException {
    return EffectiveJudgementOnReferenceMatcher.on(engine);
  }
  
  public EffectiveJudgementOnReference_at_defaultQuerySpecification getEffectiveJudgementOnReference_at_default() throws ViatraQueryException {
    return EffectiveJudgementOnReference_at_defaultQuerySpecification.instance();
  }
  
  public EffectiveJudgementOnReference_at_defaultMatcher getEffectiveJudgementOnReference_at_default(final ViatraQueryEngine engine) throws ViatraQueryException {
    return EffectiveJudgementOnReference_at_defaultMatcher.on(engine);
  }
  
  public EffectiveJudgementOnReference_at_weakQuerySpecification getEffectiveJudgementOnReference_at_weak() throws ViatraQueryException {
    return EffectiveJudgementOnReference_at_weakQuerySpecification.instance();
  }
  
  public EffectiveJudgementOnReference_at_weakMatcher getEffectiveJudgementOnReference_at_weak(final ViatraQueryEngine engine) throws ViatraQueryException {
    return EffectiveJudgementOnReference_at_weakMatcher.on(engine);
  }
  
  public EffectiveJudgementOnReference_at_1QuerySpecification getEffectiveJudgementOnReference_at_1() throws ViatraQueryException {
    return EffectiveJudgementOnReference_at_1QuerySpecification.instance();
  }
  
  public EffectiveJudgementOnReference_at_1Matcher getEffectiveJudgementOnReference_at_1(final ViatraQueryEngine engine) throws ViatraQueryException {
    return EffectiveJudgementOnReference_at_1Matcher.on(engine);
  }
}
