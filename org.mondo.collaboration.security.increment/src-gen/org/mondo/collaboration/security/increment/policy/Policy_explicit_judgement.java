/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy_explicit_judgement.vql
 */
package org.mondo.collaboration.security.increment.policy;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.mondo.collaboration.security.increment.policy.ExplicitJudgementOnAttributeMatcher;
import org.mondo.collaboration.security.increment.policy.ExplicitJudgementOnObjectMatcher;
import org.mondo.collaboration.security.increment.policy.ExplicitJudgementOnReferenceMatcher;
import org.mondo.collaboration.security.increment.policy.util.ExplicitJudgementOnAttributeQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.ExplicitJudgementOnObjectQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.ExplicitJudgementOnReferenceQuerySpecification;

/**
 * A pattern group formed of all public patterns defined in policy_explicit_judgement.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file policy_explicit_judgement.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package org.mondo.collaboration.security.increment.policy, the group contains the definition of the following patterns: <ul>
 * <li>explicitJudgementOnObject</li>
 * <li>explicitJudgementOnAttribute</li>
 * <li>explicitJudgementOnReference</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class Policy_explicit_judgement extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Policy_explicit_judgement instance() throws ViatraQueryException {
    if (INSTANCE == null) {
        INSTANCE = new Policy_explicit_judgement();
    }
    return INSTANCE;
  }
  
  private static Policy_explicit_judgement INSTANCE;
  
  private Policy_explicit_judgement() throws ViatraQueryException {
    querySpecifications.add(ExplicitJudgementOnObjectQuerySpecification.instance());
    querySpecifications.add(ExplicitJudgementOnAttributeQuerySpecification.instance());
    querySpecifications.add(ExplicitJudgementOnReferenceQuerySpecification.instance());
  }
  
  public ExplicitJudgementOnObjectQuerySpecification getExplicitJudgementOnObject() throws ViatraQueryException {
    return ExplicitJudgementOnObjectQuerySpecification.instance();
  }
  
  public ExplicitJudgementOnObjectMatcher getExplicitJudgementOnObject(final ViatraQueryEngine engine) throws ViatraQueryException {
    return ExplicitJudgementOnObjectMatcher.on(engine);
  }
  
  public ExplicitJudgementOnAttributeQuerySpecification getExplicitJudgementOnAttribute() throws ViatraQueryException {
    return ExplicitJudgementOnAttributeQuerySpecification.instance();
  }
  
  public ExplicitJudgementOnAttributeMatcher getExplicitJudgementOnAttribute(final ViatraQueryEngine engine) throws ViatraQueryException {
    return ExplicitJudgementOnAttributeMatcher.on(engine);
  }
  
  public ExplicitJudgementOnReferenceQuerySpecification getExplicitJudgementOnReference() throws ViatraQueryException {
    return ExplicitJudgementOnReferenceQuerySpecification.instance();
  }
  
  public ExplicitJudgementOnReferenceMatcher getExplicitJudgementOnReference(final ViatraQueryEngine engine) throws ViatraQueryException {
    return ExplicitJudgementOnReferenceMatcher.on(engine);
  }
}
