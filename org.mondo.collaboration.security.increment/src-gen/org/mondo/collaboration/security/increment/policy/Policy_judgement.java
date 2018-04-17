/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy_judgement.vql
 */
package org.mondo.collaboration.security.increment.policy;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.mondo.collaboration.security.increment.policy.JudgementOnAttribute_at_1Matcher;
import org.mondo.collaboration.security.increment.policy.JudgementOnAttribute_at_defaultMatcher;
import org.mondo.collaboration.security.increment.policy.JudgementOnAttribute_at_weakMatcher;
import org.mondo.collaboration.security.increment.policy.JudgementOnObject_at_1Matcher;
import org.mondo.collaboration.security.increment.policy.JudgementOnObject_at_defaultMatcher;
import org.mondo.collaboration.security.increment.policy.JudgementOnReference_at_1Matcher;
import org.mondo.collaboration.security.increment.policy.JudgementOnReference_at_defaultMatcher;
import org.mondo.collaboration.security.increment.policy.JudgementOnReference_at_weakMatcher;
import org.mondo.collaboration.security.increment.policy.util.JudgementOnAttribute_at_1QuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.JudgementOnAttribute_at_defaultQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.JudgementOnAttribute_at_weakQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.JudgementOnObject_at_1QuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.JudgementOnObject_at_defaultQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.JudgementOnReference_at_1QuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.JudgementOnReference_at_defaultQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.JudgementOnReference_at_weakQuerySpecification;

/**
 * A pattern group formed of all public patterns defined in policy_judgement.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file policy_judgement.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package org.mondo.collaboration.security.increment.policy, the group contains the definition of the following patterns: <ul>
 * <li>judgementOnObject_at_default</li>
 * <li>judgementOnAttribute_at_default</li>
 * <li>judgementOnReference_at_default</li>
 * <li>judgementOnAttribute_at_weak</li>
 * <li>judgementOnReference_at_weak</li>
 * <li>judgementOnObject_at_1</li>
 * <li>judgementOnAttribute_at_1</li>
 * <li>judgementOnReference_at_1</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class Policy_judgement extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Policy_judgement instance() throws ViatraQueryException {
    if (INSTANCE == null) {
        INSTANCE = new Policy_judgement();
    }
    return INSTANCE;
  }
  
  private static Policy_judgement INSTANCE;
  
  private Policy_judgement() throws ViatraQueryException {
    querySpecifications.add(JudgementOnObject_at_defaultQuerySpecification.instance());
    querySpecifications.add(JudgementOnAttribute_at_defaultQuerySpecification.instance());
    querySpecifications.add(JudgementOnReference_at_defaultQuerySpecification.instance());
    querySpecifications.add(JudgementOnAttribute_at_weakQuerySpecification.instance());
    querySpecifications.add(JudgementOnReference_at_weakQuerySpecification.instance());
    querySpecifications.add(JudgementOnObject_at_1QuerySpecification.instance());
    querySpecifications.add(JudgementOnAttribute_at_1QuerySpecification.instance());
    querySpecifications.add(JudgementOnReference_at_1QuerySpecification.instance());
  }
  
  public JudgementOnObject_at_defaultQuerySpecification getJudgementOnObject_at_default() throws ViatraQueryException {
    return JudgementOnObject_at_defaultQuerySpecification.instance();
  }
  
  public JudgementOnObject_at_defaultMatcher getJudgementOnObject_at_default(final ViatraQueryEngine engine) throws ViatraQueryException {
    return JudgementOnObject_at_defaultMatcher.on(engine);
  }
  
  public JudgementOnAttribute_at_defaultQuerySpecification getJudgementOnAttribute_at_default() throws ViatraQueryException {
    return JudgementOnAttribute_at_defaultQuerySpecification.instance();
  }
  
  public JudgementOnAttribute_at_defaultMatcher getJudgementOnAttribute_at_default(final ViatraQueryEngine engine) throws ViatraQueryException {
    return JudgementOnAttribute_at_defaultMatcher.on(engine);
  }
  
  public JudgementOnReference_at_defaultQuerySpecification getJudgementOnReference_at_default() throws ViatraQueryException {
    return JudgementOnReference_at_defaultQuerySpecification.instance();
  }
  
  public JudgementOnReference_at_defaultMatcher getJudgementOnReference_at_default(final ViatraQueryEngine engine) throws ViatraQueryException {
    return JudgementOnReference_at_defaultMatcher.on(engine);
  }
  
  public JudgementOnAttribute_at_weakQuerySpecification getJudgementOnAttribute_at_weak() throws ViatraQueryException {
    return JudgementOnAttribute_at_weakQuerySpecification.instance();
  }
  
  public JudgementOnAttribute_at_weakMatcher getJudgementOnAttribute_at_weak(final ViatraQueryEngine engine) throws ViatraQueryException {
    return JudgementOnAttribute_at_weakMatcher.on(engine);
  }
  
  public JudgementOnReference_at_weakQuerySpecification getJudgementOnReference_at_weak() throws ViatraQueryException {
    return JudgementOnReference_at_weakQuerySpecification.instance();
  }
  
  public JudgementOnReference_at_weakMatcher getJudgementOnReference_at_weak(final ViatraQueryEngine engine) throws ViatraQueryException {
    return JudgementOnReference_at_weakMatcher.on(engine);
  }
  
  public JudgementOnObject_at_1QuerySpecification getJudgementOnObject_at_1() throws ViatraQueryException {
    return JudgementOnObject_at_1QuerySpecification.instance();
  }
  
  public JudgementOnObject_at_1Matcher getJudgementOnObject_at_1(final ViatraQueryEngine engine) throws ViatraQueryException {
    return JudgementOnObject_at_1Matcher.on(engine);
  }
  
  public JudgementOnAttribute_at_1QuerySpecification getJudgementOnAttribute_at_1() throws ViatraQueryException {
    return JudgementOnAttribute_at_1QuerySpecification.instance();
  }
  
  public JudgementOnAttribute_at_1Matcher getJudgementOnAttribute_at_1(final ViatraQueryEngine engine) throws ViatraQueryException {
    return JudgementOnAttribute_at_1Matcher.on(engine);
  }
  
  public JudgementOnReference_at_1QuerySpecification getJudgementOnReference_at_1() throws ViatraQueryException {
    return JudgementOnReference_at_1QuerySpecification.instance();
  }
  
  public JudgementOnReference_at_1Matcher getJudgementOnReference_at_1(final ViatraQueryEngine engine) throws ViatraQueryException {
    return JudgementOnReference_at_1Matcher.on(engine);
  }
}
