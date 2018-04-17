/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy_domination_higher_priority.vql
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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.TypeFilterConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.mondo.collaboration.security.increment.policy.DominationOnAttribute_of_defaultMatch;
import org.mondo.collaboration.security.increment.policy.DominationOnAttribute_of_defaultMatcher;
import org.mondo.collaboration.security.increment.policy.util.EffectiveJudgementOnAttribute_at_1QuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.EffectiveJudgementOnAttribute_at_weakQuerySpecification;

/**
 * A pattern-specific query specification that can instantiate DominationOnAttribute_of_defaultMatcher in a type-safe way.
 * 
 * @see DominationOnAttribute_of_defaultMatcher
 * @see DominationOnAttribute_of_defaultMatch
 * 
 */
@SuppressWarnings("all")
public final class DominationOnAttribute_of_defaultQuerySpecification extends BaseGeneratedEMFQuerySpecification<DominationOnAttribute_of_defaultMatcher> {
  private DominationOnAttribute_of_defaultQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static DominationOnAttribute_of_defaultQuerySpecification instance() throws ViatraQueryException {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected DominationOnAttribute_of_defaultMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return DominationOnAttribute_of_defaultMatcher.on(engine);
  }
  
  @Override
  public DominationOnAttribute_of_defaultMatcher instantiate() throws ViatraQueryException {
    return DominationOnAttribute_of_defaultMatcher.create();
  }
  
  @Override
  public DominationOnAttribute_of_defaultMatch newEmptyMatch() {
    return DominationOnAttribute_of_defaultMatch.newEmptyMatch();
  }
  
  @Override
  public DominationOnAttribute_of_defaultMatch newMatch(final Object... parameters) {
    return DominationOnAttribute_of_defaultMatch.newMatch((java.lang.String) parameters[0], (org.eclipse.emf.ecore.EObject) parameters[1], (java.lang.Object) parameters[2], (org.eclipse.emf.ecore.EAttribute) parameters[3], (java.lang.Object) parameters[4]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: org.mondo.collaboration.security.increment.policy.util.DominationOnAttribute_of_defaultQuerySpecification (visibility: PUBLIC, simpleName: DominationOnAttribute_of_defaultQuerySpecification, identifier: org.mondo.collaboration.security.increment.policy.util.DominationOnAttribute_of_defaultQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: org.mondo.collaboration.security.increment.policy.util) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: org.mondo.collaboration.security.increment.policy.util.DominationOnAttribute_of_defaultQuerySpecification (visibility: PUBLIC, simpleName: DominationOnAttribute_of_defaultQuerySpecification, identifier: org.mondo.collaboration.security.increment.policy.util.DominationOnAttribute_of_defaultQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: org.mondo.collaboration.security.increment.policy.util) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static DominationOnAttribute_of_defaultQuerySpecification INSTANCE = new DominationOnAttribute_of_defaultQuerySpecification();
    
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
    private final static DominationOnAttribute_of_defaultQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pUser = new PParameter("user", "java.lang.String", new JavaTransitiveInstancesKey(java.lang.String.class), PParameterDirection.INOUT);
    
    private final PParameter parameter_pSource = new PParameter("source", "org.eclipse.emf.ecore.EObject", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eclipse.org/emf/2002/Ecore", "EObject")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pValue = new PParameter("value", "java.lang.Object", new JavaTransitiveInstancesKey(java.lang.Object.class), PParameterDirection.INOUT);
    
    private final PParameter parameter_pAttribute = new PParameter("attribute", "org.eclipse.emf.ecore.EAttribute", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eclipse.org/emf/2002/Ecore", "EAttribute")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pOperation = new PParameter("operation", "java.lang.Object", (IInputKey)null, PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pUser, parameter_pSource, parameter_pValue, parameter_pAttribute, parameter_pOperation);
    
    @Override
    public String getFullyQualifiedName() {
      return "org.mondo.collaboration.security.increment.policy.dominationOnAttribute_of_default";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("user","source","value","attribute","operation");
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
              PVariable var_source = body.getOrCreateVariableByName("source");
              PVariable var_value = body.getOrCreateVariableByName("value");
              PVariable var_attribute = body.getOrCreateVariableByName("attribute");
              PVariable var_operation = body.getOrCreateVariableByName("operation");
              PVariable var__access = body.getOrCreateVariableByName("_access");
              new TypeFilterConstraint(body, new FlatTuple(var_user), new JavaTransitiveInstancesKey(java.lang.String.class));
              new TypeConstraint(body, Tuples.flatTupleOf(var_source), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
              new TypeFilterConstraint(body, new FlatTuple(var_value), new JavaTransitiveInstancesKey(java.lang.Object.class));
              new TypeConstraint(body, Tuples.flatTupleOf(var_attribute), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EAttribute")));
              body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
                 new ExportedParameter(body, var_user, parameter_pUser),
                 new ExportedParameter(body, var_source, parameter_pSource),
                 new ExportedParameter(body, var_value, parameter_pValue),
                 new ExportedParameter(body, var_attribute, parameter_pAttribute),
                 new ExportedParameter(body, var_operation, parameter_pOperation)
              ));
              // 	find effectiveJudgementOnAttribute_at_weak(user, source, value, attribute, operation, _access)
              new PositivePatternCall(body, new FlatTuple(var_user, var_source, var_value, var_attribute, var_operation, var__access), EffectiveJudgementOnAttribute_at_weakQuerySpecification.instance().getInternalQueryRepresentation());
              bodies.add(body);
          }
          {
              PBody body = new PBody(this);
              PVariable var_user = body.getOrCreateVariableByName("user");
              PVariable var_source = body.getOrCreateVariableByName("source");
              PVariable var_value = body.getOrCreateVariableByName("value");
              PVariable var_attribute = body.getOrCreateVariableByName("attribute");
              PVariable var_operation = body.getOrCreateVariableByName("operation");
              PVariable var__access = body.getOrCreateVariableByName("_access");
              new TypeFilterConstraint(body, new FlatTuple(var_user), new JavaTransitiveInstancesKey(java.lang.String.class));
              new TypeConstraint(body, Tuples.flatTupleOf(var_source), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
              new TypeFilterConstraint(body, new FlatTuple(var_value), new JavaTransitiveInstancesKey(java.lang.Object.class));
              new TypeConstraint(body, Tuples.flatTupleOf(var_attribute), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EAttribute")));
              body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
                 new ExportedParameter(body, var_user, parameter_pUser),
                 new ExportedParameter(body, var_source, parameter_pSource),
                 new ExportedParameter(body, var_value, parameter_pValue),
                 new ExportedParameter(body, var_attribute, parameter_pAttribute),
                 new ExportedParameter(body, var_operation, parameter_pOperation)
              ));
              //     find effectiveJudgementOnAttribute_at_1(user, source, value, attribute, operation, _access)
              new PositivePatternCall(body, new FlatTuple(var_user, var_source, var_value, var_attribute, var_operation, var__access), EffectiveJudgementOnAttribute_at_1QuerySpecification.instance().getInternalQueryRepresentation());
              bodies.add(body);
          }
      } catch (ViatraQueryException ex) {
          throw processDependencyException(ex);
      }
      return bodies;
    }
  }
}
