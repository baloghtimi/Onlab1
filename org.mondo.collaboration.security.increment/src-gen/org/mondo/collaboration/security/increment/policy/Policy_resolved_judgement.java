/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy_resolved_judgement.vql
 */
package org.mondo.collaboration.security.increment.policy;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.mondo.collaboration.security.increment.policy.DominatedExplicitJudgementOnAttribute_at_0Matcher;
import org.mondo.collaboration.security.increment.policy.DominatedExplicitJudgementOnAttribute_at_1Matcher;
import org.mondo.collaboration.security.increment.policy.DominatedExplicitJudgementOnObject_at_0Matcher;
import org.mondo.collaboration.security.increment.policy.DominatedExplicitJudgementOnObject_at_1Matcher;
import org.mondo.collaboration.security.increment.policy.DominatedExplicitJudgementOnReference_at_0Matcher;
import org.mondo.collaboration.security.increment.policy.DominatedExplicitJudgementOnReference_at_1Matcher;
import org.mondo.collaboration.security.increment.policy.ResolutionMatcher;
import org.mondo.collaboration.security.increment.policy.util.DominatedExplicitJudgementOnAttribute_at_0QuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.DominatedExplicitJudgementOnAttribute_at_1QuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.DominatedExplicitJudgementOnObject_at_0QuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.DominatedExplicitJudgementOnObject_at_1QuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.DominatedExplicitJudgementOnReference_at_0QuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.DominatedExplicitJudgementOnReference_at_1QuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.ResolutionQuerySpecification;

/**
 * A pattern group formed of all public patterns defined in policy_resolved_judgement.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file policy_resolved_judgement.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package org.mondo.collaboration.security.increment.policy, the group contains the definition of the following patterns: <ul>
 * <li>resolution</li>
 * <li>dominatedExplicitJudgementOnObject_at_0</li>
 * <li>dominatedExplicitJudgementOnObject_at_1</li>
 * <li>dominatedExplicitJudgementOnAttribute_at_0</li>
 * <li>dominatedExplicitJudgementOnAttribute_at_1</li>
 * <li>dominatedExplicitJudgementOnReference_at_0</li>
 * <li>dominatedExplicitJudgementOnReference_at_1</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class Policy_resolved_judgement extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Policy_resolved_judgement instance() throws ViatraQueryException {
    if (INSTANCE == null) {
        INSTANCE = new Policy_resolved_judgement();
    }
    return INSTANCE;
  }
  
  private static Policy_resolved_judgement INSTANCE;
  
  private Policy_resolved_judgement() throws ViatraQueryException {
    querySpecifications.add(ResolutionQuerySpecification.instance());
    querySpecifications.add(DominatedExplicitJudgementOnObject_at_0QuerySpecification.instance());
    querySpecifications.add(DominatedExplicitJudgementOnObject_at_1QuerySpecification.instance());
    querySpecifications.add(DominatedExplicitJudgementOnAttribute_at_0QuerySpecification.instance());
    querySpecifications.add(DominatedExplicitJudgementOnAttribute_at_1QuerySpecification.instance());
    querySpecifications.add(DominatedExplicitJudgementOnReference_at_0QuerySpecification.instance());
    querySpecifications.add(DominatedExplicitJudgementOnReference_at_1QuerySpecification.instance());
  }
  
  public ResolutionQuerySpecification getResolution() throws ViatraQueryException {
    return ResolutionQuerySpecification.instance();
  }
  
  public ResolutionMatcher getResolution(final ViatraQueryEngine engine) throws ViatraQueryException {
    return ResolutionMatcher.on(engine);
  }
  
  public DominatedExplicitJudgementOnObject_at_0QuerySpecification getDominatedExplicitJudgementOnObject_at_0() throws ViatraQueryException {
    return DominatedExplicitJudgementOnObject_at_0QuerySpecification.instance();
  }
  
  public DominatedExplicitJudgementOnObject_at_0Matcher getDominatedExplicitJudgementOnObject_at_0(final ViatraQueryEngine engine) throws ViatraQueryException {
    return DominatedExplicitJudgementOnObject_at_0Matcher.on(engine);
  }
  
  public DominatedExplicitJudgementOnObject_at_1QuerySpecification getDominatedExplicitJudgementOnObject_at_1() throws ViatraQueryException {
    return DominatedExplicitJudgementOnObject_at_1QuerySpecification.instance();
  }
  
  public DominatedExplicitJudgementOnObject_at_1Matcher getDominatedExplicitJudgementOnObject_at_1(final ViatraQueryEngine engine) throws ViatraQueryException {
    return DominatedExplicitJudgementOnObject_at_1Matcher.on(engine);
  }
  
  public DominatedExplicitJudgementOnAttribute_at_0QuerySpecification getDominatedExplicitJudgementOnAttribute_at_0() throws ViatraQueryException {
    return DominatedExplicitJudgementOnAttribute_at_0QuerySpecification.instance();
  }
  
  public DominatedExplicitJudgementOnAttribute_at_0Matcher getDominatedExplicitJudgementOnAttribute_at_0(final ViatraQueryEngine engine) throws ViatraQueryException {
    return DominatedExplicitJudgementOnAttribute_at_0Matcher.on(engine);
  }
  
  public DominatedExplicitJudgementOnAttribute_at_1QuerySpecification getDominatedExplicitJudgementOnAttribute_at_1() throws ViatraQueryException {
    return DominatedExplicitJudgementOnAttribute_at_1QuerySpecification.instance();
  }
  
  public DominatedExplicitJudgementOnAttribute_at_1Matcher getDominatedExplicitJudgementOnAttribute_at_1(final ViatraQueryEngine engine) throws ViatraQueryException {
    return DominatedExplicitJudgementOnAttribute_at_1Matcher.on(engine);
  }
  
  public DominatedExplicitJudgementOnReference_at_0QuerySpecification getDominatedExplicitJudgementOnReference_at_0() throws ViatraQueryException {
    return DominatedExplicitJudgementOnReference_at_0QuerySpecification.instance();
  }
  
  public DominatedExplicitJudgementOnReference_at_0Matcher getDominatedExplicitJudgementOnReference_at_0(final ViatraQueryEngine engine) throws ViatraQueryException {
    return DominatedExplicitJudgementOnReference_at_0Matcher.on(engine);
  }
  
  public DominatedExplicitJudgementOnReference_at_1QuerySpecification getDominatedExplicitJudgementOnReference_at_1() throws ViatraQueryException {
    return DominatedExplicitJudgementOnReference_at_1QuerySpecification.instance();
  }
  
  public DominatedExplicitJudgementOnReference_at_1Matcher getDominatedExplicitJudgementOnReference_at_1(final ViatraQueryEngine engine) throws ViatraQueryException {
    return DominatedExplicitJudgementOnReference_at_1Matcher.on(engine);
  }
}
