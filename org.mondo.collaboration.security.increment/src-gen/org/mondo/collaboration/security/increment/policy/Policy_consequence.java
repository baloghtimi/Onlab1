/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy_consequence.vql
 */
package org.mondo.collaboration.security.increment.policy;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.mondo.collaboration.security.increment.policy.StrongConsequenceOnAttribute_at_1Matcher;
import org.mondo.collaboration.security.increment.policy.StrongConsequenceOnObject_at_1Matcher;
import org.mondo.collaboration.security.increment.policy.StrongConsequenceOnReference_at_1Matcher;
import org.mondo.collaboration.security.increment.policy.WeakConsequenceOnAttributeMatcher;
import org.mondo.collaboration.security.increment.policy.WeakConsequenceOnReferenceMatcher;
import org.mondo.collaboration.security.increment.policy.util.StrongConsequenceOnAttribute_at_1QuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.StrongConsequenceOnObject_at_1QuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.StrongConsequenceOnReference_at_1QuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.WeakConsequenceOnAttributeQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.WeakConsequenceOnReferenceQuerySpecification;

/**
 * A pattern group formed of all public patterns defined in policy_consequence.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file policy_consequence.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package org.mondo.collaboration.security.increment.policy, the group contains the definition of the following patterns: <ul>
 * <li>strongConsequenceOnObject_at_1</li>
 * <li>strongConsequenceOnAttribute_at_1</li>
 * <li>strongConsequenceOnReference_at_1</li>
 * <li>weakConsequenceOnAttribute</li>
 * <li>weakConsequenceOnReference</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class Policy_consequence extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Policy_consequence instance() throws ViatraQueryException {
    if (INSTANCE == null) {
        INSTANCE = new Policy_consequence();
    }
    return INSTANCE;
  }
  
  private static Policy_consequence INSTANCE;
  
  private Policy_consequence() throws ViatraQueryException {
    querySpecifications.add(StrongConsequenceOnObject_at_1QuerySpecification.instance());
    querySpecifications.add(StrongConsequenceOnAttribute_at_1QuerySpecification.instance());
    querySpecifications.add(StrongConsequenceOnReference_at_1QuerySpecification.instance());
    querySpecifications.add(WeakConsequenceOnAttributeQuerySpecification.instance());
    querySpecifications.add(WeakConsequenceOnReferenceQuerySpecification.instance());
  }
  
  public StrongConsequenceOnObject_at_1QuerySpecification getStrongConsequenceOnObject_at_1() throws ViatraQueryException {
    return StrongConsequenceOnObject_at_1QuerySpecification.instance();
  }
  
  public StrongConsequenceOnObject_at_1Matcher getStrongConsequenceOnObject_at_1(final ViatraQueryEngine engine) throws ViatraQueryException {
    return StrongConsequenceOnObject_at_1Matcher.on(engine);
  }
  
  public StrongConsequenceOnAttribute_at_1QuerySpecification getStrongConsequenceOnAttribute_at_1() throws ViatraQueryException {
    return StrongConsequenceOnAttribute_at_1QuerySpecification.instance();
  }
  
  public StrongConsequenceOnAttribute_at_1Matcher getStrongConsequenceOnAttribute_at_1(final ViatraQueryEngine engine) throws ViatraQueryException {
    return StrongConsequenceOnAttribute_at_1Matcher.on(engine);
  }
  
  public StrongConsequenceOnReference_at_1QuerySpecification getStrongConsequenceOnReference_at_1() throws ViatraQueryException {
    return StrongConsequenceOnReference_at_1QuerySpecification.instance();
  }
  
  public StrongConsequenceOnReference_at_1Matcher getStrongConsequenceOnReference_at_1(final ViatraQueryEngine engine) throws ViatraQueryException {
    return StrongConsequenceOnReference_at_1Matcher.on(engine);
  }
  
  public WeakConsequenceOnAttributeQuerySpecification getWeakConsequenceOnAttribute() throws ViatraQueryException {
    return WeakConsequenceOnAttributeQuerySpecification.instance();
  }
  
  public WeakConsequenceOnAttributeMatcher getWeakConsequenceOnAttribute(final ViatraQueryEngine engine) throws ViatraQueryException {
    return WeakConsequenceOnAttributeMatcher.on(engine);
  }
  
  public WeakConsequenceOnReferenceQuerySpecification getWeakConsequenceOnReference() throws ViatraQueryException {
    return WeakConsequenceOnReferenceQuerySpecification.instance();
  }
  
  public WeakConsequenceOnReferenceMatcher getWeakConsequenceOnReference(final ViatraQueryEngine engine) throws ViatraQueryException {
    return WeakConsequenceOnReferenceMatcher.on(engine);
  }
}
