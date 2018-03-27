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
import org.eclipse.viatra.query.runtime.matchers.context.common.JavaTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.TypeFilterConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;
import org.mondo.collaboration.security.increment.policy.RestrictNotIOUserMatch;
import org.mondo.collaboration.security.increment.policy.RestrictNotIOUserMatcher;

/**
 * A pattern-specific query specification that can instantiate RestrictNotIOUserMatcher in a type-safe way.
 * 
 * @see RestrictNotIOUserMatcher
 * @see RestrictNotIOUserMatch
 * 
 */
@SuppressWarnings("all")
public final class RestrictNotIOUserQuerySpecification extends BaseGeneratedEMFQuerySpecification<RestrictNotIOUserMatcher> {
  private RestrictNotIOUserQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static RestrictNotIOUserQuerySpecification instance() throws ViatraQueryException {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected RestrictNotIOUserMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return RestrictNotIOUserMatcher.on(engine);
  }
  
  @Override
  public RestrictNotIOUserMatcher instantiate() throws ViatraQueryException {
    return RestrictNotIOUserMatcher.create();
  }
  
  @Override
  public RestrictNotIOUserMatch newEmptyMatch() {
    return RestrictNotIOUserMatch.newEmptyMatch();
  }
  
  @Override
  public RestrictNotIOUserMatch newMatch(final Object... parameters) {
    return RestrictNotIOUserMatch.newMatch((java.lang.String) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: org.mondo.collaboration.security.increment.policy.util.RestrictNotIOUserQuerySpecification (visibility: PUBLIC, simpleName: RestrictNotIOUserQuerySpecification, identifier: org.mondo.collaboration.security.increment.policy.util.RestrictNotIOUserQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: org.mondo.collaboration.security.increment.policy.util) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: org.mondo.collaboration.security.increment.policy.util.RestrictNotIOUserQuerySpecification (visibility: PUBLIC, simpleName: RestrictNotIOUserQuerySpecification, identifier: org.mondo.collaboration.security.increment.policy.util.RestrictNotIOUserQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: org.mondo.collaboration.security.increment.policy.util) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static RestrictNotIOUserQuerySpecification INSTANCE = new RestrictNotIOUserQuerySpecification();
    
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
    private final static RestrictNotIOUserQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pUser = new PParameter("user", "java.lang.String", new JavaTransitiveInstancesKey(java.lang.String.class), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pUser);
    
    @Override
    public String getFullyQualifiedName() {
      return "org.mondo.collaboration.security.increment.policy.restrictNotIOUser";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("user");
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
          PVariable var_user = body.getOrCreateVariableByName("user");
          new TypeFilterConstraint(body, new FlatTuple(var_user), new JavaTransitiveInstancesKey(java.lang.String.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_user, parameter_pUser)
          ));
          // 	user == "IOManager"
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new ConstantValue(body, var__virtual_0_, "IOManager");
          new Equality(body, var_user, var__virtual_0_);
          bodies.add(body);
      }
      return bodies;
    }
  }
}