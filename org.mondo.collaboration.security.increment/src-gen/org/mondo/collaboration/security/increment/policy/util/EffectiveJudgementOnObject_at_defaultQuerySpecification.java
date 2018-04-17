/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy_effective_judgement.vql
 */
package org.mondo.collaboration.security.increment.policy.util;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.context.IInputKey;
import org.eclipse.viatra.query.runtime.matchers.context.common.JavaTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.TypeFilterConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.mondo.collaboration.security.increment.policy.EffectiveJudgementOnObject_at_defaultMatch;
import org.mondo.collaboration.security.increment.policy.EffectiveJudgementOnObject_at_defaultMatcher;
import org.mondo.collaboration.security.increment.policy.util.DominationOnObject_of_defaultQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.JudgementOnObject_at_defaultQuerySpecification;

/**
 * A pattern-specific query specification that can instantiate EffectiveJudgementOnObject_at_defaultMatcher in a type-safe way.
 * 
 * @see EffectiveJudgementOnObject_at_defaultMatcher
 * @see EffectiveJudgementOnObject_at_defaultMatch
 * 
 */
@SuppressWarnings("all")
public final class EffectiveJudgementOnObject_at_defaultQuerySpecification extends BaseGeneratedEMFQuerySpecification<EffectiveJudgementOnObject_at_defaultMatcher> {
  private EffectiveJudgementOnObject_at_defaultQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static EffectiveJudgementOnObject_at_defaultQuerySpecification instance() throws ViatraQueryException {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected EffectiveJudgementOnObject_at_defaultMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return EffectiveJudgementOnObject_at_defaultMatcher.on(engine);
  }
  
  @Override
  public EffectiveJudgementOnObject_at_defaultMatcher instantiate() throws ViatraQueryException {
    return EffectiveJudgementOnObject_at_defaultMatcher.create();
  }
  
  @Override
  public EffectiveJudgementOnObject_at_defaultMatch newEmptyMatch() {
    return EffectiveJudgementOnObject_at_defaultMatch.newEmptyMatch();
  }
  
  @Override
  public EffectiveJudgementOnObject_at_defaultMatch newMatch(final Object... parameters) {
    return EffectiveJudgementOnObject_at_defaultMatch.newMatch((java.lang.String) parameters[0], (org.eclipse.emf.ecore.EObject) parameters[1], (org.mondo.collaboration.policy.rules.OperationType) parameters[2], (org.mondo.collaboration.policy.rules.AccessibilityLevel) parameters[3]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: org.mondo.collaboration.security.increment.policy.util.EffectiveJudgementOnObject_at_defaultQuerySpecification (visibility: PUBLIC, simpleName: EffectiveJudgementOnObject_at_defaultQuerySpecification, identifier: org.mondo.collaboration.security.increment.policy.util.EffectiveJudgementOnObject_at_defaultQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: org.mondo.collaboration.security.increment.policy.util) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: org.mondo.collaboration.security.increment.policy.util.EffectiveJudgementOnObject_at_defaultQuerySpecification (visibility: PUBLIC, simpleName: EffectiveJudgementOnObject_at_defaultQuerySpecification, identifier: org.mondo.collaboration.security.increment.policy.util.EffectiveJudgementOnObject_at_defaultQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: org.mondo.collaboration.security.increment.policy.util) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static EffectiveJudgementOnObject_at_defaultQuerySpecification INSTANCE = new EffectiveJudgementOnObject_at_defaultQuerySpecification();
    
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
    private final static EffectiveJudgementOnObject_at_defaultQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pUser = new PParameter("user", "java.lang.String", new JavaTransitiveInstancesKey(java.lang.String.class), PParameterDirection.INOUT);
    
    private final PParameter parameter_pObject = new PParameter("object", "org.eclipse.emf.ecore.EObject", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eclipse.org/emf/2002/Ecore", "EObject")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pOperation = new PParameter("operation", "org.mondo.collaboration.policy.rules.OperationType", (IInputKey)null, PParameterDirection.INOUT);
    
    private final PParameter parameter_pAccess = new PParameter("access", "org.mondo.collaboration.policy.rules.AccessibilityLevel", (IInputKey)null, PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pUser, parameter_pObject, parameter_pOperation, parameter_pAccess);
    
    @Override
    public String getFullyQualifiedName() {
      return "org.mondo.collaboration.security.increment.policy.effectiveJudgementOnObject_at_default";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("user","object","operation","access");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return parameters;
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
          {
              PBody body = new PBody(this);
              PVariable var_user = body.getOrCreateVariableByName("user");
              PVariable var_object = body.getOrCreateVariableByName("object");
              PVariable var_operation = body.getOrCreateVariableByName("operation");
              PVariable var_access = body.getOrCreateVariableByName("access");
              new TypeFilterConstraint(body, new FlatTuple(var_user), new JavaTransitiveInstancesKey(java.lang.String.class));
              new TypeConstraint(body, Tuples.flatTupleOf(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
              body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
                 new ExportedParameter(body, var_user, parameter_pUser),
                 new ExportedParameter(body, var_object, parameter_pObject),
                 new ExportedParameter(body, var_operation, parameter_pOperation),
                 new ExportedParameter(body, var_access, parameter_pAccess)
              ));
              // 	find judgementOnObject_at_default(user, object, operation, access)
              new PositivePatternCall(body, new FlatTuple(var_user, var_object, var_operation, var_access), JudgementOnObject_at_defaultQuerySpecification.instance().getInternalQueryRepresentation());
              // 	neg find dominationOnObject_of_default(user, object, operation)
              new NegativePatternCall(body, new FlatTuple(var_user, var_object, var_operation), DominationOnObject_of_defaultQuerySpecification.instance().getInternalQueryRepresentation());
              bodies.add(body);
          }
      } catch (ViatraQueryException ex) {
          throw processDependencyException(ex);
      }
      return bodies;
    }
  }
}
