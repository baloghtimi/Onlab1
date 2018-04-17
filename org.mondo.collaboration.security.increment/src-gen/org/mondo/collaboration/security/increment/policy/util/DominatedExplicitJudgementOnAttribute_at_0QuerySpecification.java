/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy_domination_same_priority.vql
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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.mondo.collaboration.security.increment.policy.DominatedExplicitJudgementOnAttribute_at_0Match;
import org.mondo.collaboration.security.increment.policy.DominatedExplicitJudgementOnAttribute_at_0Matcher;
import org.mondo.collaboration.security.increment.policy.util.ExplicitJudgementOnAttributeQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.ResolutionQuerySpecification;

/**
 * A pattern-specific query specification that can instantiate DominatedExplicitJudgementOnAttribute_at_0Matcher in a type-safe way.
 * 
 * @see DominatedExplicitJudgementOnAttribute_at_0Matcher
 * @see DominatedExplicitJudgementOnAttribute_at_0Match
 * 
 */
@SuppressWarnings("all")
public final class DominatedExplicitJudgementOnAttribute_at_0QuerySpecification extends BaseGeneratedEMFQuerySpecification<DominatedExplicitJudgementOnAttribute_at_0Matcher> {
  private DominatedExplicitJudgementOnAttribute_at_0QuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static DominatedExplicitJudgementOnAttribute_at_0QuerySpecification instance() throws ViatraQueryException {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected DominatedExplicitJudgementOnAttribute_at_0Matcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return DominatedExplicitJudgementOnAttribute_at_0Matcher.on(engine);
  }
  
  @Override
  public DominatedExplicitJudgementOnAttribute_at_0Matcher instantiate() throws ViatraQueryException {
    return DominatedExplicitJudgementOnAttribute_at_0Matcher.create();
  }
  
  @Override
  public DominatedExplicitJudgementOnAttribute_at_0Match newEmptyMatch() {
    return DominatedExplicitJudgementOnAttribute_at_0Match.newEmptyMatch();
  }
  
  @Override
  public DominatedExplicitJudgementOnAttribute_at_0Match newMatch(final Object... parameters) {
    return DominatedExplicitJudgementOnAttribute_at_0Match.newMatch((java.lang.String) parameters[0], (org.eclipse.emf.ecore.EObject) parameters[1], (java.lang.Object) parameters[2], (org.eclipse.emf.ecore.EAttribute) parameters[3], (org.mondo.collaboration.policy.rules.OperationType) parameters[4], (org.mondo.collaboration.policy.rules.AccessibilityLevel) parameters[5]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: org.mondo.collaboration.security.increment.policy.util.DominatedExplicitJudgementOnAttribute_at_0QuerySpecification (visibility: PUBLIC, simpleName: DominatedExplicitJudgementOnAttribute_at_0QuerySpecification, identifier: org.mondo.collaboration.security.increment.policy.util.DominatedExplicitJudgementOnAttribute_at_0QuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: org.mondo.collaboration.security.increment.policy.util) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: org.mondo.collaboration.security.increment.policy.util.DominatedExplicitJudgementOnAttribute_at_0QuerySpecification (visibility: PUBLIC, simpleName: DominatedExplicitJudgementOnAttribute_at_0QuerySpecification, identifier: org.mondo.collaboration.security.increment.policy.util.DominatedExplicitJudgementOnAttribute_at_0QuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: org.mondo.collaboration.security.increment.policy.util) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static DominatedExplicitJudgementOnAttribute_at_0QuerySpecification INSTANCE = new DominatedExplicitJudgementOnAttribute_at_0QuerySpecification();
    
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
    private final static DominatedExplicitJudgementOnAttribute_at_0QuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pUser = new PParameter("user", "java.lang.String", new JavaTransitiveInstancesKey(java.lang.String.class), PParameterDirection.INOUT);
    
    private final PParameter parameter_pSource = new PParameter("source", "org.eclipse.emf.ecore.EObject", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eclipse.org/emf/2002/Ecore", "EObject")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pValue = new PParameter("value", "java.lang.Object", new JavaTransitiveInstancesKey(java.lang.Object.class), PParameterDirection.INOUT);
    
    private final PParameter parameter_pAttribute = new PParameter("attribute", "org.eclipse.emf.ecore.EAttribute", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eclipse.org/emf/2002/Ecore", "EAttribute")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pOperation = new PParameter("operation", "org.mondo.collaboration.policy.rules.OperationType", (IInputKey)null, PParameterDirection.INOUT);
    
    private final PParameter parameter_pPrevailingAccess = new PParameter("prevailingAccess", "org.mondo.collaboration.policy.rules.AccessibilityLevel", (IInputKey)null, PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pUser, parameter_pSource, parameter_pValue, parameter_pAttribute, parameter_pOperation, parameter_pPrevailingAccess);
    
    @Override
    public String getFullyQualifiedName() {
      return "org.mondo.collaboration.security.increment.policy.dominatedExplicitJudgementOnAttribute_at_0";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("user","source","value","attribute","operation","prevailingAccess");
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
              PVariable var_prevailingAccess = body.getOrCreateVariableByName("prevailingAccess");
              PVariable var_dominatedAccess = body.getOrCreateVariableByName("dominatedAccess");
              new TypeFilterConstraint(body, new FlatTuple(var_user), new JavaTransitiveInstancesKey(java.lang.String.class));
              new TypeConstraint(body, Tuples.flatTupleOf(var_source), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
              new TypeFilterConstraint(body, new FlatTuple(var_value), new JavaTransitiveInstancesKey(java.lang.Object.class));
              new TypeConstraint(body, Tuples.flatTupleOf(var_attribute), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EAttribute")));
              body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
                 new ExportedParameter(body, var_user, parameter_pUser),
                 new ExportedParameter(body, var_source, parameter_pSource),
                 new ExportedParameter(body, var_value, parameter_pValue),
                 new ExportedParameter(body, var_attribute, parameter_pAttribute),
                 new ExportedParameter(body, var_operation, parameter_pOperation),
                 new ExportedParameter(body, var_prevailingAccess, parameter_pPrevailingAccess)
              ));
              //     find explicitJudgementOnAttribute(user, source, value, attribute, operation, dominatedAccess, 0)
              PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
              new ConstantValue(body, var__virtual_0_, 0);
              new PositivePatternCall(body, new FlatTuple(var_user, var_source, var_value, var_attribute, var_operation, var_dominatedAccess, var__virtual_0_), ExplicitJudgementOnAttributeQuerySpecification.instance().getInternalQueryRepresentation());
              //     find explicitJudgementOnAttribute(user, source, value, attribute, operation, prevailingAccess, 0)
              PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
              new ConstantValue(body, var__virtual_1_, 0);
              new PositivePatternCall(body, new FlatTuple(var_user, var_source, var_value, var_attribute, var_operation, var_prevailingAccess, var__virtual_1_), ExplicitJudgementOnAttributeQuerySpecification.instance().getInternalQueryRepresentation());
              //     find resolution(dominatedAccess, prevailingAccess)
              new PositivePatternCall(body, new FlatTuple(var_dominatedAccess, var_prevailingAccess), ResolutionQuerySpecification.instance().getInternalQueryRepresentation());
              bodies.add(body);
          }
      } catch (ViatraQueryException ex) {
          throw processDependencyException(ex);
      }
      return bodies;
    }
  }
  
  private static int evaluateExpression_1_1() {
    return 0;
  }
  
  private static int evaluateExpression_1_2() {
    return 0;
  }
}
