/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy_helper_pattern.vql
 */
package org.mondo.collaboration.security.increment.policy;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.mondo.collaboration.security.increment.policy.AllUsersMatcher;
import org.mondo.collaboration.security.increment.policy.EnableIOAssetMatcher;
import org.mondo.collaboration.security.increment.policy.EnableIOUserMatcher;
import org.mondo.collaboration.security.increment.policy.ReadWriteOperationMatcher;
import org.mondo.collaboration.security.increment.policy.RestrictIOAssetMatcher;
import org.mondo.collaboration.security.increment.policy.RestrictIOUserMatcher;
import org.mondo.collaboration.security.increment.policy.RestrictNotIOAssetMatcher;
import org.mondo.collaboration.security.increment.policy.RestrictNotIOUserMatcher;
import org.mondo.collaboration.security.increment.policy.RestrictRootAssetMatcher;
import org.mondo.collaboration.security.increment.policy.RestrictRootUserMatcher;
import org.mondo.collaboration.security.increment.policy.util.AllUsersQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.EnableIOAssetQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.EnableIOUserQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.ReadWriteOperationQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.RestrictIOAssetQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.RestrictIOUserQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.RestrictNotIOAssetQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.RestrictNotIOUserQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.RestrictRootAssetQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.RestrictRootUserQuerySpecification;

/**
 * A pattern group formed of all public patterns defined in policy_helper_pattern.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file policy_helper_pattern.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package org.mondo.collaboration.security.increment.policy, the group contains the definition of the following patterns: <ul>
 * <li>readWriteOperation</li>
 * <li>restrictRootAsset</li>
 * <li>restrictRootUser</li>
 * <li>enableIOAsset</li>
 * <li>enableIOUser</li>
 * <li>restrictNotIOAsset</li>
 * <li>restrictNotIOUser</li>
 * <li>restrictIOAsset</li>
 * <li>restrictIOUser</li>
 * <li>allUsers</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class Policy_helper_pattern extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Policy_helper_pattern instance() throws ViatraQueryException {
    if (INSTANCE == null) {
        INSTANCE = new Policy_helper_pattern();
    }
    return INSTANCE;
  }
  
  private static Policy_helper_pattern INSTANCE;
  
  private Policy_helper_pattern() throws ViatraQueryException {
    querySpecifications.add(ReadWriteOperationQuerySpecification.instance());
    querySpecifications.add(RestrictRootAssetQuerySpecification.instance());
    querySpecifications.add(RestrictRootUserQuerySpecification.instance());
    querySpecifications.add(EnableIOAssetQuerySpecification.instance());
    querySpecifications.add(EnableIOUserQuerySpecification.instance());
    querySpecifications.add(RestrictNotIOAssetQuerySpecification.instance());
    querySpecifications.add(RestrictNotIOUserQuerySpecification.instance());
    querySpecifications.add(RestrictIOAssetQuerySpecification.instance());
    querySpecifications.add(RestrictIOUserQuerySpecification.instance());
    querySpecifications.add(AllUsersQuerySpecification.instance());
  }
  
  public ReadWriteOperationQuerySpecification getReadWriteOperation() throws ViatraQueryException {
    return ReadWriteOperationQuerySpecification.instance();
  }
  
  public ReadWriteOperationMatcher getReadWriteOperation(final ViatraQueryEngine engine) throws ViatraQueryException {
    return ReadWriteOperationMatcher.on(engine);
  }
  
  public RestrictRootAssetQuerySpecification getRestrictRootAsset() throws ViatraQueryException {
    return RestrictRootAssetQuerySpecification.instance();
  }
  
  public RestrictRootAssetMatcher getRestrictRootAsset(final ViatraQueryEngine engine) throws ViatraQueryException {
    return RestrictRootAssetMatcher.on(engine);
  }
  
  public RestrictRootUserQuerySpecification getRestrictRootUser() throws ViatraQueryException {
    return RestrictRootUserQuerySpecification.instance();
  }
  
  public RestrictRootUserMatcher getRestrictRootUser(final ViatraQueryEngine engine) throws ViatraQueryException {
    return RestrictRootUserMatcher.on(engine);
  }
  
  public EnableIOAssetQuerySpecification getEnableIOAsset() throws ViatraQueryException {
    return EnableIOAssetQuerySpecification.instance();
  }
  
  public EnableIOAssetMatcher getEnableIOAsset(final ViatraQueryEngine engine) throws ViatraQueryException {
    return EnableIOAssetMatcher.on(engine);
  }
  
  public EnableIOUserQuerySpecification getEnableIOUser() throws ViatraQueryException {
    return EnableIOUserQuerySpecification.instance();
  }
  
  public EnableIOUserMatcher getEnableIOUser(final ViatraQueryEngine engine) throws ViatraQueryException {
    return EnableIOUserMatcher.on(engine);
  }
  
  public RestrictNotIOAssetQuerySpecification getRestrictNotIOAsset() throws ViatraQueryException {
    return RestrictNotIOAssetQuerySpecification.instance();
  }
  
  public RestrictNotIOAssetMatcher getRestrictNotIOAsset(final ViatraQueryEngine engine) throws ViatraQueryException {
    return RestrictNotIOAssetMatcher.on(engine);
  }
  
  public RestrictNotIOUserQuerySpecification getRestrictNotIOUser() throws ViatraQueryException {
    return RestrictNotIOUserQuerySpecification.instance();
  }
  
  public RestrictNotIOUserMatcher getRestrictNotIOUser(final ViatraQueryEngine engine) throws ViatraQueryException {
    return RestrictNotIOUserMatcher.on(engine);
  }
  
  public RestrictIOAssetQuerySpecification getRestrictIOAsset() throws ViatraQueryException {
    return RestrictIOAssetQuerySpecification.instance();
  }
  
  public RestrictIOAssetMatcher getRestrictIOAsset(final ViatraQueryEngine engine) throws ViatraQueryException {
    return RestrictIOAssetMatcher.on(engine);
  }
  
  public RestrictIOUserQuerySpecification getRestrictIOUser() throws ViatraQueryException {
    return RestrictIOUserQuerySpecification.instance();
  }
  
  public RestrictIOUserMatcher getRestrictIOUser(final ViatraQueryEngine engine) throws ViatraQueryException {
    return RestrictIOUserMatcher.on(engine);
  }
  
  public AllUsersQuerySpecification getAllUsers() throws ViatraQueryException {
    return AllUsersQuerySpecification.instance();
  }
  
  public AllUsersMatcher getAllUsers(final ViatraQueryEngine engine) throws ViatraQueryException {
    return AllUsersMatcher.on(engine);
  }
}
