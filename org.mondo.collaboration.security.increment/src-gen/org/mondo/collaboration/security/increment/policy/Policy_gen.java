/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy_gen.vql
 */
package org.mondo.collaboration.security.increment.policy;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.mondo.collaboration.security.increment.policy.AllUsersMatcher;
import org.mondo.collaboration.security.increment.policy.Domination_by_1Matcher;
import org.mondo.collaboration.security.increment.policy.Domination_of_0Matcher;
import org.mondo.collaboration.security.increment.policy.EffectiveJudgementMatcher;
import org.mondo.collaboration.security.increment.policy.EffectiveJudgement_at_0Matcher;
import org.mondo.collaboration.security.increment.policy.EffectiveJudgement_at_1Matcher;
import org.mondo.collaboration.security.increment.policy.EnableIOAssetMatcher;
import org.mondo.collaboration.security.increment.policy.EnableIOUserMatcher;
import org.mondo.collaboration.security.increment.policy.EnableRootAssetMatcher;
import org.mondo.collaboration.security.increment.policy.EnableRootUserMatcher;
import org.mondo.collaboration.security.increment.policy.ExplicitJudgementMatcher;
import org.mondo.collaboration.security.increment.policy.Judgement_at_0Matcher;
import org.mondo.collaboration.security.increment.policy.Judgement_at_1Matcher;
import org.mondo.collaboration.security.increment.policy.ReadWriteOperationMatcher;
import org.mondo.collaboration.security.increment.policy.RelaxedJudgement_at_0Matcher;
import org.mondo.collaboration.security.increment.policy.ResolutionMatcher;
import org.mondo.collaboration.security.increment.policy.RestrictIOAssetMatcher;
import org.mondo.collaboration.security.increment.policy.RestrictIOUserMatcher;
import org.mondo.collaboration.security.increment.policy.RestrictNotIOAssetMatcher;
import org.mondo.collaboration.security.increment.policy.RestrictNotIOUserMatcher;
import org.mondo.collaboration.security.increment.policy.RestrictRootAssetMatcher;
import org.mondo.collaboration.security.increment.policy.RestrictRootUserMatcher;
import org.mondo.collaboration.security.increment.policy.StrongConsequence_at_0Matcher;
import org.mondo.collaboration.security.increment.policy.StrongConsequence_at_1Matcher;
import org.mondo.collaboration.security.increment.policy.util.AllUsersQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.Domination_by_1QuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.Domination_of_0QuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.EffectiveJudgementQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.EffectiveJudgement_at_0QuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.EffectiveJudgement_at_1QuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.EnableIOAssetQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.EnableIOUserQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.EnableRootAssetQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.EnableRootUserQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.ExplicitJudgementQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.Judgement_at_0QuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.Judgement_at_1QuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.ReadWriteOperationQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.RelaxedJudgement_at_0QuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.ResolutionQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.RestrictIOAssetQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.RestrictIOUserQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.RestrictNotIOAssetQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.RestrictNotIOUserQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.RestrictRootAssetQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.RestrictRootUserQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.StrongConsequence_at_0QuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.StrongConsequence_at_1QuerySpecification;

/**
 * A pattern group formed of all public patterns defined in policy_gen.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file policy_gen.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package org.mondo.collaboration.security.increment.policy, the group contains the definition of the following patterns: <ul>
 * <li>readWriteOperation</li>
 * <li>restrictRootAsset</li>
 * <li>restrictRootUser</li>
 * <li>enableRootAsset</li>
 * <li>enableRootUser</li>
 * <li>enableIOAsset</li>
 * <li>enableIOUser</li>
 * <li>restrictNotIOAsset</li>
 * <li>restrictNotIOUser</li>
 * <li>restrictIOAsset</li>
 * <li>restrictIOUser</li>
 * <li>allUsers</li>
 * <li>explicitJudgement</li>
 * <li>effectiveJudgement</li>
 * <li>judgement_at_0</li>
 * <li>judgement_at_1</li>
 * <li>relaxedJudgement_at_0</li>
 * <li>effectiveJudgement_at_0</li>
 * <li>effectiveJudgement_at_1</li>
 * <li>domination_of_0</li>
 * <li>domination_by_1</li>
 * <li>resolution</li>
 * <li>strongConsequence_at_0</li>
 * <li>strongConsequence_at_1</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class Policy_gen extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Policy_gen instance() throws ViatraQueryException {
    if (INSTANCE == null) {
        INSTANCE = new Policy_gen();
    }
    return INSTANCE;
  }
  
  private static Policy_gen INSTANCE;
  
  private Policy_gen() throws ViatraQueryException {
    querySpecifications.add(ReadWriteOperationQuerySpecification.instance());
    querySpecifications.add(RestrictRootAssetQuerySpecification.instance());
    querySpecifications.add(RestrictRootUserQuerySpecification.instance());
    querySpecifications.add(EnableRootAssetQuerySpecification.instance());
    querySpecifications.add(EnableRootUserQuerySpecification.instance());
    querySpecifications.add(EnableIOAssetQuerySpecification.instance());
    querySpecifications.add(EnableIOUserQuerySpecification.instance());
    querySpecifications.add(RestrictNotIOAssetQuerySpecification.instance());
    querySpecifications.add(RestrictNotIOUserQuerySpecification.instance());
    querySpecifications.add(RestrictIOAssetQuerySpecification.instance());
    querySpecifications.add(RestrictIOUserQuerySpecification.instance());
    querySpecifications.add(AllUsersQuerySpecification.instance());
    querySpecifications.add(ExplicitJudgementQuerySpecification.instance());
    querySpecifications.add(EffectiveJudgementQuerySpecification.instance());
    querySpecifications.add(Judgement_at_0QuerySpecification.instance());
    querySpecifications.add(Judgement_at_1QuerySpecification.instance());
    querySpecifications.add(RelaxedJudgement_at_0QuerySpecification.instance());
    querySpecifications.add(EffectiveJudgement_at_0QuerySpecification.instance());
    querySpecifications.add(EffectiveJudgement_at_1QuerySpecification.instance());
    querySpecifications.add(Domination_of_0QuerySpecification.instance());
    querySpecifications.add(Domination_by_1QuerySpecification.instance());
    querySpecifications.add(ResolutionQuerySpecification.instance());
    querySpecifications.add(StrongConsequence_at_0QuerySpecification.instance());
    querySpecifications.add(StrongConsequence_at_1QuerySpecification.instance());
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
  
  public EnableRootAssetQuerySpecification getEnableRootAsset() throws ViatraQueryException {
    return EnableRootAssetQuerySpecification.instance();
  }
  
  public EnableRootAssetMatcher getEnableRootAsset(final ViatraQueryEngine engine) throws ViatraQueryException {
    return EnableRootAssetMatcher.on(engine);
  }
  
  public EnableRootUserQuerySpecification getEnableRootUser() throws ViatraQueryException {
    return EnableRootUserQuerySpecification.instance();
  }
  
  public EnableRootUserMatcher getEnableRootUser(final ViatraQueryEngine engine) throws ViatraQueryException {
    return EnableRootUserMatcher.on(engine);
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
  
  public ExplicitJudgementQuerySpecification getExplicitJudgement() throws ViatraQueryException {
    return ExplicitJudgementQuerySpecification.instance();
  }
  
  public ExplicitJudgementMatcher getExplicitJudgement(final ViatraQueryEngine engine) throws ViatraQueryException {
    return ExplicitJudgementMatcher.on(engine);
  }
  
  public EffectiveJudgementQuerySpecification getEffectiveJudgement() throws ViatraQueryException {
    return EffectiveJudgementQuerySpecification.instance();
  }
  
  public EffectiveJudgementMatcher getEffectiveJudgement(final ViatraQueryEngine engine) throws ViatraQueryException {
    return EffectiveJudgementMatcher.on(engine);
  }
  
  public Judgement_at_0QuerySpecification getJudgement_at_0() throws ViatraQueryException {
    return Judgement_at_0QuerySpecification.instance();
  }
  
  public Judgement_at_0Matcher getJudgement_at_0(final ViatraQueryEngine engine) throws ViatraQueryException {
    return Judgement_at_0Matcher.on(engine);
  }
  
  public Judgement_at_1QuerySpecification getJudgement_at_1() throws ViatraQueryException {
    return Judgement_at_1QuerySpecification.instance();
  }
  
  public Judgement_at_1Matcher getJudgement_at_1(final ViatraQueryEngine engine) throws ViatraQueryException {
    return Judgement_at_1Matcher.on(engine);
  }
  
  public RelaxedJudgement_at_0QuerySpecification getRelaxedJudgement_at_0() throws ViatraQueryException {
    return RelaxedJudgement_at_0QuerySpecification.instance();
  }
  
  public RelaxedJudgement_at_0Matcher getRelaxedJudgement_at_0(final ViatraQueryEngine engine) throws ViatraQueryException {
    return RelaxedJudgement_at_0Matcher.on(engine);
  }
  
  public EffectiveJudgement_at_0QuerySpecification getEffectiveJudgement_at_0() throws ViatraQueryException {
    return EffectiveJudgement_at_0QuerySpecification.instance();
  }
  
  public EffectiveJudgement_at_0Matcher getEffectiveJudgement_at_0(final ViatraQueryEngine engine) throws ViatraQueryException {
    return EffectiveJudgement_at_0Matcher.on(engine);
  }
  
  public EffectiveJudgement_at_1QuerySpecification getEffectiveJudgement_at_1() throws ViatraQueryException {
    return EffectiveJudgement_at_1QuerySpecification.instance();
  }
  
  public EffectiveJudgement_at_1Matcher getEffectiveJudgement_at_1(final ViatraQueryEngine engine) throws ViatraQueryException {
    return EffectiveJudgement_at_1Matcher.on(engine);
  }
  
  public Domination_of_0QuerySpecification getDomination_of_0() throws ViatraQueryException {
    return Domination_of_0QuerySpecification.instance();
  }
  
  public Domination_of_0Matcher getDomination_of_0(final ViatraQueryEngine engine) throws ViatraQueryException {
    return Domination_of_0Matcher.on(engine);
  }
  
  public Domination_by_1QuerySpecification getDomination_by_1() throws ViatraQueryException {
    return Domination_by_1QuerySpecification.instance();
  }
  
  public Domination_by_1Matcher getDomination_by_1(final ViatraQueryEngine engine) throws ViatraQueryException {
    return Domination_by_1Matcher.on(engine);
  }
  
  public ResolutionQuerySpecification getResolution() throws ViatraQueryException {
    return ResolutionQuerySpecification.instance();
  }
  
  public ResolutionMatcher getResolution(final ViatraQueryEngine engine) throws ViatraQueryException {
    return ResolutionMatcher.on(engine);
  }
  
  public StrongConsequence_at_0QuerySpecification getStrongConsequence_at_0() throws ViatraQueryException {
    return StrongConsequence_at_0QuerySpecification.instance();
  }
  
  public StrongConsequence_at_0Matcher getStrongConsequence_at_0(final ViatraQueryEngine engine) throws ViatraQueryException {
    return StrongConsequence_at_0Matcher.on(engine);
  }
  
  public StrongConsequence_at_1QuerySpecification getStrongConsequence_at_1() throws ViatraQueryException {
    return StrongConsequence_at_1QuerySpecification.instance();
  }
  
  public StrongConsequence_at_1Matcher getStrongConsequence_at_1(final ViatraQueryEngine engine) throws ViatraQueryException {
    return StrongConsequence_at_1Matcher.on(engine);
  }
}
