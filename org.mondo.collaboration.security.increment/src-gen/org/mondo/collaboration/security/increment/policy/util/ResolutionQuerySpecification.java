/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy_gen.vql
 */
package org.mondo.collaboration.security.increment.policy.util;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.context.IInputKey;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.mondo.collaboration.security.increment.policy.ResolutionMatch;
import org.mondo.collaboration.security.increment.policy.ResolutionMatcher;

/**
 * A pattern-specific query specification that can instantiate ResolutionMatcher in a type-safe way.
 * 
 * @see ResolutionMatcher
 * @see ResolutionMatch
 * 
 */
@SuppressWarnings("all")
public final class ResolutionQuerySpecification extends BaseGeneratedEMFQuerySpecification<ResolutionMatcher> {
  private ResolutionQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static ResolutionQuerySpecification instance() throws ViatraQueryException {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected ResolutionMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return ResolutionMatcher.on(engine);
  }
  
  @Override
  public ResolutionMatcher instantiate() throws ViatraQueryException {
    return ResolutionMatcher.create();
  }
  
  @Override
  public ResolutionMatch newEmptyMatch() {
    return ResolutionMatch.newEmptyMatch();
  }
  
  @Override
  public ResolutionMatch newMatch(final Object... parameters) {
    return ResolutionMatch.newMatch((org.mondo.collaboration.security.increment.vocabulary.AccessibilityLevel) parameters[0], (org.mondo.collaboration.security.increment.vocabulary.AccessibilityLevel) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: org.mondo.collaboration.security.increment.policy.util.ResolutionQuerySpecification (visibility: PUBLIC, simpleName: ResolutionQuerySpecification, identifier: org.mondo.collaboration.security.increment.policy.util.ResolutionQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: org.mondo.collaboration.security.increment.policy.util) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: org.mondo.collaboration.security.increment.policy.util.ResolutionQuerySpecification (visibility: PUBLIC, simpleName: ResolutionQuerySpecification, identifier: org.mondo.collaboration.security.increment.policy.util.ResolutionQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: org.mondo.collaboration.security.increment.policy.util) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static ResolutionQuerySpecification INSTANCE = new ResolutionQuerySpecification();
    
    /**
     * Statically initializes the query specification <b>after</b> the field {@link #INSTANCE} is assigned.
     * This initialization order is required to support indirect recursion.
     * 
     * <p> The static initializer is defined using a helper field to work around limitations of the code generator.
     * 
     */
    private final static Object STATIC_INITIALIZER = ensureInitialized();
    
    public static Object ensureInitialized() {
      INSTANCE.ensureInitializedInternalSneaky();
      return null;
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static ResolutionQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pDominatedAccess = new PParameter("dominatedAccess", "org.mondo.collaboration.security.increment.vocabulary.AccessibilityLevel", (IInputKey)null, PParameterDirection.INOUT);
    
    private final PParameter parameter_pPrevailingAccess = new PParameter("prevailingAccess", "org.mondo.collaboration.security.increment.vocabulary.AccessibilityLevel", (IInputKey)null, PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pDominatedAccess, parameter_pPrevailingAccess);
    
    @Override
    public String getFullyQualifiedName() {
      return "org.mondo.collaboration.security.increment.policy.resolution";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("dominatedAccess","prevailingAccess");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return parameters;
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      {
          PBody body = new PBody(this);
          PVariable var_dominatedAccess = body.getOrCreateVariableByName("dominatedAccess");
          PVariable var_prevailingAccess = body.getOrCreateVariableByName("prevailingAccess");
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_dominatedAccess, parameter_pDominatedAccess),
             new ExportedParameter(body, var_prevailingAccess, parameter_pPrevailingAccess)
          ));
          // 	dominatedAccess == AccessibilityLevel::ALLOW
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new ConstantValue(body, var__virtual_0_, org.mondo.collaboration.security.increment.vocabulary.AccessibilityLevel.get("ALLOW"));
          new Equality(body, var_dominatedAccess, var__virtual_0_);
          // 	prevailingAccess == AccessibilityLevel::DENY
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new ConstantValue(body, var__virtual_1_, org.mondo.collaboration.security.increment.vocabulary.AccessibilityLevel.get("DENY"));
          new Equality(body, var_prevailingAccess, var__virtual_1_);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
