/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/windturbineS_gen.vql
 */
package org.mondo.collaboration.security.increment.policy;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.mondo.collaboration.security.increment.policy.AttributeAssetMatcher;
import org.mondo.collaboration.security.increment.policy.ContainmentReferenceMatcher;
import org.mondo.collaboration.security.increment.policy.ContainsMatcher;
import org.mondo.collaboration.security.increment.policy.IdAttributeMatcher;
import org.mondo.collaboration.security.increment.policy.ReferenceAssetMatcher;
import org.mondo.collaboration.security.increment.policy.util.AttributeAssetQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.ContainmentReferenceQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.ContainsQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.IdAttributeQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.ReferenceAssetQuerySpecification;

/**
 * A pattern group formed of all public patterns defined in windturbineS_gen.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file windturbineS_gen.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package org.mondo.collaboration.security.increment.policy, the group contains the definition of the following patterns: <ul>
 * <li>attributeAsset</li>
 * <li>referenceAsset</li>
 * <li>containmentReference</li>
 * <li>idAttribute</li>
 * <li>contains</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class WindturbineS_gen extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static WindturbineS_gen instance() throws ViatraQueryException {
    if (INSTANCE == null) {
        INSTANCE = new WindturbineS_gen();
    }
    return INSTANCE;
  }
  
  private static WindturbineS_gen INSTANCE;
  
  private WindturbineS_gen() throws ViatraQueryException {
    querySpecifications.add(AttributeAssetQuerySpecification.instance());
    querySpecifications.add(ReferenceAssetQuerySpecification.instance());
    querySpecifications.add(ContainmentReferenceQuerySpecification.instance());
    querySpecifications.add(IdAttributeQuerySpecification.instance());
    querySpecifications.add(ContainsQuerySpecification.instance());
  }
  
  public AttributeAssetQuerySpecification getAttributeAsset() throws ViatraQueryException {
    return AttributeAssetQuerySpecification.instance();
  }
  
  public AttributeAssetMatcher getAttributeAsset(final ViatraQueryEngine engine) throws ViatraQueryException {
    return AttributeAssetMatcher.on(engine);
  }
  
  public ReferenceAssetQuerySpecification getReferenceAsset() throws ViatraQueryException {
    return ReferenceAssetQuerySpecification.instance();
  }
  
  public ReferenceAssetMatcher getReferenceAsset(final ViatraQueryEngine engine) throws ViatraQueryException {
    return ReferenceAssetMatcher.on(engine);
  }
  
  public ContainmentReferenceQuerySpecification getContainmentReference() throws ViatraQueryException {
    return ContainmentReferenceQuerySpecification.instance();
  }
  
  public ContainmentReferenceMatcher getContainmentReference(final ViatraQueryEngine engine) throws ViatraQueryException {
    return ContainmentReferenceMatcher.on(engine);
  }
  
  public IdAttributeQuerySpecification getIdAttribute() throws ViatraQueryException {
    return IdAttributeQuerySpecification.instance();
  }
  
  public IdAttributeMatcher getIdAttribute(final ViatraQueryEngine engine) throws ViatraQueryException {
    return IdAttributeMatcher.on(engine);
  }
  
  public ContainsQuerySpecification getContains() throws ViatraQueryException {
    return ContainsQuerySpecification.instance();
  }
  
  public ContainsMatcher getContains(final ViatraQueryEngine engine) throws ViatraQueryException {
    return ContainsMatcher.on(engine);
  }
}
