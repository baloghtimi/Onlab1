/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy_judgement.vql
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
import org.mondo.collaboration.security.increment.policy.JudgementOnReference_at_weakMatch;
import org.mondo.collaboration.security.increment.policy.JudgementOnReference_at_weakMatcher;
import org.mondo.collaboration.security.increment.policy.util.WeakConsequenceOnReferenceQuerySpecification;

/**
 * A pattern-specific query specification that can instantiate JudgementOnReference_at_weakMatcher in a type-safe way.
 * 
 * @see JudgementOnReference_at_weakMatcher
 * @see JudgementOnReference_at_weakMatch
 * 
 */
@SuppressWarnings("all")
public final class JudgementOnReference_at_weakQuerySpecification extends BaseGeneratedEMFQuerySpecification<JudgementOnReference_at_weakMatcher> {
  private JudgementOnReference_at_weakQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static JudgementOnReference_at_weakQuerySpecification instance() throws ViatraQueryException {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected JudgementOnReference_at_weakMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return JudgementOnReference_at_weakMatcher.on(engine);
  }
  
  @Override
  public JudgementOnReference_at_weakMatcher instantiate() throws ViatraQueryException {
    return JudgementOnReference_at_weakMatcher.create();
  }
  
  @Override
  public JudgementOnReference_at_weakMatch newEmptyMatch() {
    return JudgementOnReference_at_weakMatch.newEmptyMatch();
  }
  
  @Override
  public JudgementOnReference_at_weakMatch newMatch(final Object... parameters) {
    return JudgementOnReference_at_weakMatch.newMatch((java.lang.String) parameters[0], (org.eclipse.emf.ecore.EObject) parameters[1], (org.eclipse.emf.ecore.EObject) parameters[2], (org.eclipse.emf.ecore.EReference) parameters[3], (java.lang.Object) parameters[4], (java.lang.Object) parameters[5]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: org.mondo.collaboration.security.increment.policy.util.JudgementOnReference_at_weakQuerySpecification (visibility: PUBLIC, simpleName: JudgementOnReference_at_weakQuerySpecification, identifier: org.mondo.collaboration.security.increment.policy.util.JudgementOnReference_at_weakQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: org.mondo.collaboration.security.increment.policy.util) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: org.mondo.collaboration.security.increment.policy.util.JudgementOnReference_at_weakQuerySpecification (visibility: PUBLIC, simpleName: JudgementOnReference_at_weakQuerySpecification, identifier: org.mondo.collaboration.security.increment.policy.util.JudgementOnReference_at_weakQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: org.mondo.collaboration.security.increment.policy.util) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static JudgementOnReference_at_weakQuerySpecification INSTANCE = new JudgementOnReference_at_weakQuerySpecification();
    
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
    private final static JudgementOnReference_at_weakQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pUser = new PParameter("user", "java.lang.String", new JavaTransitiveInstancesKey(java.lang.String.class), PParameterDirection.INOUT);
    
    private final PParameter parameter_pSource = new PParameter("source", "org.eclipse.emf.ecore.EObject", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eclipse.org/emf/2002/Ecore", "EObject")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pTarget = new PParameter("target", "org.eclipse.emf.ecore.EObject", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eclipse.org/emf/2002/Ecore", "EObject")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pReference = new PParameter("reference", "org.eclipse.emf.ecore.EReference", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eclipse.org/emf/2002/Ecore", "EReference")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pOperation = new PParameter("operation", "java.lang.Object", (IInputKey)null, PParameterDirection.INOUT);
    
    private final PParameter parameter_pAccess = new PParameter("access", "java.lang.Object", (IInputKey)null, PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pUser, parameter_pSource, parameter_pTarget, parameter_pReference, parameter_pOperation, parameter_pAccess);
    
    @Override
    public String getFullyQualifiedName() {
      return "org.mondo.collaboration.security.increment.policy.judgementOnReference_at_weak";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("user","source","target","reference","operation","access");
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
              PVariable var_target = body.getOrCreateVariableByName("target");
              PVariable var_reference = body.getOrCreateVariableByName("reference");
              PVariable var_operation = body.getOrCreateVariableByName("operation");
              PVariable var_access = body.getOrCreateVariableByName("access");
              new TypeFilterConstraint(body, new FlatTuple(var_user), new JavaTransitiveInstancesKey(java.lang.String.class));
              new TypeConstraint(body, Tuples.flatTupleOf(var_source), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
              new TypeConstraint(body, Tuples.flatTupleOf(var_target), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
              new TypeConstraint(body, Tuples.flatTupleOf(var_reference), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EReference")));
              body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
                 new ExportedParameter(body, var_user, parameter_pUser),
                 new ExportedParameter(body, var_source, parameter_pSource),
                 new ExportedParameter(body, var_target, parameter_pTarget),
                 new ExportedParameter(body, var_reference, parameter_pReference),
                 new ExportedParameter(body, var_operation, parameter_pOperation),
                 new ExportedParameter(body, var_access, parameter_pAccess)
              ));
              //     find weakConsequenceOnReference(user, source, target, reference, operation, access)
              new PositivePatternCall(body, new FlatTuple(var_user, var_source, var_target, var_reference, var_operation, var_access), WeakConsequenceOnReferenceQuerySpecification.instance().getInternalQueryRepresentation());
              bodies.add(body);
          }
      } catch (ViatraQueryException ex) {
          throw processDependencyException(ex);
      }
      return bodies;
    }
  }
}