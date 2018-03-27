/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy_gen.vql
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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
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
import org.mondo.collaboration.security.increment.policy.StrongConsequence_at_0Match;
import org.mondo.collaboration.security.increment.policy.StrongConsequence_at_0Matcher;
import org.mondo.collaboration.security.increment.policy.util.ContainsQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.EffectiveJudgement_at_0QuerySpecification;

/**
 * A pattern-specific query specification that can instantiate StrongConsequence_at_0Matcher in a type-safe way.
 * 
 * @see StrongConsequence_at_0Matcher
 * @see StrongConsequence_at_0Match
 * 
 */
@SuppressWarnings("all")
public final class StrongConsequence_at_0QuerySpecification extends BaseGeneratedEMFQuerySpecification<StrongConsequence_at_0Matcher> {
  private StrongConsequence_at_0QuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static StrongConsequence_at_0QuerySpecification instance() throws ViatraQueryException {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected StrongConsequence_at_0Matcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return StrongConsequence_at_0Matcher.on(engine);
  }
  
  @Override
  public StrongConsequence_at_0Matcher instantiate() throws ViatraQueryException {
    return StrongConsequence_at_0Matcher.create();
  }
  
  @Override
  public StrongConsequence_at_0Match newEmptyMatch() {
    return StrongConsequence_at_0Match.newEmptyMatch();
  }
  
  @Override
  public StrongConsequence_at_0Match newMatch(final Object... parameters) {
    return StrongConsequence_at_0Match.newMatch((java.lang.String) parameters[0], (org.eclipse.emf.ecore.EObject) parameters[1], (org.mondo.collaboration.security.increment.vocabulary.OperationType) parameters[2], (org.mondo.collaboration.security.increment.vocabulary.AccessibilityLevel) parameters[3], (org.eclipse.emf.ecore.EObject) parameters[4], (org.mondo.collaboration.security.increment.vocabulary.OperationType) parameters[5], (org.mondo.collaboration.security.increment.vocabulary.AccessibilityLevel) parameters[6]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: org.mondo.collaboration.security.increment.policy.util.StrongConsequence_at_0QuerySpecification (visibility: PUBLIC, simpleName: StrongConsequence_at_0QuerySpecification, identifier: org.mondo.collaboration.security.increment.policy.util.StrongConsequence_at_0QuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: org.mondo.collaboration.security.increment.policy.util) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: org.mondo.collaboration.security.increment.policy.util.StrongConsequence_at_0QuerySpecification (visibility: PUBLIC, simpleName: StrongConsequence_at_0QuerySpecification, identifier: org.mondo.collaboration.security.increment.policy.util.StrongConsequence_at_0QuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: org.mondo.collaboration.security.increment.policy.util) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static StrongConsequence_at_0QuerySpecification INSTANCE = new StrongConsequence_at_0QuerySpecification();
    
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
    private final static StrongConsequence_at_0QuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pUser = new PParameter("user", "java.lang.String", new JavaTransitiveInstancesKey(java.lang.String.class), PParameterDirection.INOUT);
    
    private final PParameter parameter_pDepAsset = new PParameter("depAsset", "org.eclipse.emf.ecore.EObject", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eclipse.org/emf/2002/Ecore", "EObject")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pDepOp = new PParameter("depOp", "org.mondo.collaboration.security.increment.vocabulary.OperationType", (IInputKey)null, PParameterDirection.INOUT);
    
    private final PParameter parameter_pDepAccess = new PParameter("depAccess", "org.mondo.collaboration.security.increment.vocabulary.AccessibilityLevel", (IInputKey)null, PParameterDirection.INOUT);
    
    private final PParameter parameter_pDomAsset = new PParameter("domAsset", "org.eclipse.emf.ecore.EObject", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eclipse.org/emf/2002/Ecore", "EObject")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pDomOp = new PParameter("domOp", "org.mondo.collaboration.security.increment.vocabulary.OperationType", (IInputKey)null, PParameterDirection.INOUT);
    
    private final PParameter parameter_pDomAccess = new PParameter("domAccess", "org.mondo.collaboration.security.increment.vocabulary.AccessibilityLevel", (IInputKey)null, PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pUser, parameter_pDepAsset, parameter_pDepOp, parameter_pDepAccess, parameter_pDomAsset, parameter_pDomOp, parameter_pDomAccess);
    
    @Override
    public String getFullyQualifiedName() {
      return "org.mondo.collaboration.security.increment.policy.strongConsequence_at_0";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("user","depAsset","depOp","depAccess","domAsset","domOp","domAccess");
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
              PVariable var_depAsset = body.getOrCreateVariableByName("depAsset");
              PVariable var_depOp = body.getOrCreateVariableByName("depOp");
              PVariable var_depAccess = body.getOrCreateVariableByName("depAccess");
              PVariable var_domAsset = body.getOrCreateVariableByName("domAsset");
              PVariable var_domOp = body.getOrCreateVariableByName("domOp");
              PVariable var_domAccess = body.getOrCreateVariableByName("domAccess");
              new TypeFilterConstraint(body, new FlatTuple(var_user), new JavaTransitiveInstancesKey(java.lang.String.class));
              new TypeConstraint(body, Tuples.flatTupleOf(var_depAsset), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
              new TypeConstraint(body, Tuples.flatTupleOf(var_domAsset), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
              body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
                 new ExportedParameter(body, var_user, parameter_pUser),
                 new ExportedParameter(body, var_depAsset, parameter_pDepAsset),
                 new ExportedParameter(body, var_depOp, parameter_pDepOp),
                 new ExportedParameter(body, var_depAccess, parameter_pDepAccess),
                 new ExportedParameter(body, var_domAsset, parameter_pDomAsset),
                 new ExportedParameter(body, var_domOp, parameter_pDomOp),
                 new ExportedParameter(body, var_domAccess, parameter_pDomAccess)
              ));
              // 	// type II, read vs write	find effectiveJudgement_at_0(user, domAsset, domOp, domAccess)
              new PositivePatternCall(body, new FlatTuple(var_user, var_domAsset, var_domOp, var_domAccess), EffectiveJudgement_at_0QuerySpecification.instance().getInternalQueryRepresentation());
              // 	depAsset == domAsset
              new Equality(body, var_depAsset, var_domAsset);
              // 	domOp == OperationType::WRITE
              PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
              new ConstantValue(body, var__virtual_0_, org.mondo.collaboration.security.increment.vocabulary.OperationType.get("WRITE"));
              new Equality(body, var_domOp, var__virtual_0_);
              //  depOp == OperationType::READ
              PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
              new ConstantValue(body, var__virtual_1_, org.mondo.collaboration.security.increment.vocabulary.OperationType.get("READ"));
              new Equality(body, var_depOp, var__virtual_1_);
              // 	domAccess == AccessibilityLevel::ALLOW
              PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
              new ConstantValue(body, var__virtual_2_, org.mondo.collaboration.security.increment.vocabulary.AccessibilityLevel.get("ALLOW"));
              new Equality(body, var_domAccess, var__virtual_2_);
              //  depAccess == AccessibilityLevel::ALLOW
              PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
              new ConstantValue(body, var__virtual_3_, org.mondo.collaboration.security.increment.vocabulary.AccessibilityLevel.get("ALLOW"));
              new Equality(body, var_depAccess, var__virtual_3_);
              bodies.add(body);
          }
          {
              PBody body = new PBody(this);
              PVariable var_user = body.getOrCreateVariableByName("user");
              PVariable var_depAsset = body.getOrCreateVariableByName("depAsset");
              PVariable var_depOp = body.getOrCreateVariableByName("depOp");
              PVariable var_depAccess = body.getOrCreateVariableByName("depAccess");
              PVariable var_domAsset = body.getOrCreateVariableByName("domAsset");
              PVariable var_domOp = body.getOrCreateVariableByName("domOp");
              PVariable var_domAccess = body.getOrCreateVariableByName("domAccess");
              new TypeFilterConstraint(body, new FlatTuple(var_user), new JavaTransitiveInstancesKey(java.lang.String.class));
              new TypeConstraint(body, Tuples.flatTupleOf(var_depAsset), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
              new TypeConstraint(body, Tuples.flatTupleOf(var_domAsset), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
              body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
                 new ExportedParameter(body, var_user, parameter_pUser),
                 new ExportedParameter(body, var_depAsset, parameter_pDepAsset),
                 new ExportedParameter(body, var_depOp, parameter_pDepOp),
                 new ExportedParameter(body, var_depAccess, parameter_pDepAccess),
                 new ExportedParameter(body, var_domAsset, parameter_pDomAsset),
                 new ExportedParameter(body, var_domOp, parameter_pDomOp),
                 new ExportedParameter(body, var_domAccess, parameter_pDomAccess)
              ));
              // 	// type II, read vs write	find effectiveJudgement_at_0(user, domAsset, domOp, domAccess)
              new PositivePatternCall(body, new FlatTuple(var_user, var_domAsset, var_domOp, var_domAccess), EffectiveJudgement_at_0QuerySpecification.instance().getInternalQueryRepresentation());
              // 	depAsset == domAsset
              new Equality(body, var_depAsset, var_domAsset);
              // 	domOp == OperationType::READ
              PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
              new ConstantValue(body, var__virtual_0_, org.mondo.collaboration.security.increment.vocabulary.OperationType.get("READ"));
              new Equality(body, var_domOp, var__virtual_0_);
              //  depOp == OperationType::WRITE
              PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
              new ConstantValue(body, var__virtual_1_, org.mondo.collaboration.security.increment.vocabulary.OperationType.get("WRITE"));
              new Equality(body, var_depOp, var__virtual_1_);
              // 	domAccess == AccessibilityLevel::DENY
              PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
              new ConstantValue(body, var__virtual_2_, org.mondo.collaboration.security.increment.vocabulary.AccessibilityLevel.get("DENY"));
              new Equality(body, var_domAccess, var__virtual_2_);
              //  depAccess == AccessibilityLevel::DENY
              PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
              new ConstantValue(body, var__virtual_3_, org.mondo.collaboration.security.increment.vocabulary.AccessibilityLevel.get("DENY"));
              new Equality(body, var_depAccess, var__virtual_3_);
              bodies.add(body);
          }
          {
              PBody body = new PBody(this);
              PVariable var_user = body.getOrCreateVariableByName("user");
              PVariable var_depAsset = body.getOrCreateVariableByName("depAsset");
              PVariable var_depOp = body.getOrCreateVariableByName("depOp");
              PVariable var_depAccess = body.getOrCreateVariableByName("depAccess");
              PVariable var_domAsset = body.getOrCreateVariableByName("domAsset");
              PVariable var_domOp = body.getOrCreateVariableByName("domOp");
              PVariable var_domAccess = body.getOrCreateVariableByName("domAccess");
              new TypeFilterConstraint(body, new FlatTuple(var_user), new JavaTransitiveInstancesKey(java.lang.String.class));
              new TypeConstraint(body, Tuples.flatTupleOf(var_depAsset), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
              new TypeConstraint(body, Tuples.flatTupleOf(var_domAsset), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
              body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
                 new ExportedParameter(body, var_user, parameter_pUser),
                 new ExportedParameter(body, var_depAsset, parameter_pDepAsset),
                 new ExportedParameter(body, var_depOp, parameter_pDepOp),
                 new ExportedParameter(body, var_depAccess, parameter_pDepAccess),
                 new ExportedParameter(body, var_domAsset, parameter_pDomAsset),
                 new ExportedParameter(body, var_domOp, parameter_pDomOp),
                 new ExportedParameter(body, var_domAccess, parameter_pDomAccess)
              ));
              // 	// type III, read vs containment	find effectiveJudgement_at_0(user, domAsset, domOp, domAccess)
              new PositivePatternCall(body, new FlatTuple(var_user, var_domAsset, var_domOp, var_domAccess), EffectiveJudgement_at_0QuerySpecification.instance().getInternalQueryRepresentation());
              // 	find contains(depAsset, domAsset)
              new PositivePatternCall(body, new FlatTuple(var_depAsset, var_domAsset), ContainsQuerySpecification.instance().getInternalQueryRepresentation());
              // 	domOp == OperationType::READ
              PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
              new ConstantValue(body, var__virtual_0_, org.mondo.collaboration.security.increment.vocabulary.OperationType.get("READ"));
              new Equality(body, var_domOp, var__virtual_0_);
              //  depOp == OperationType::READ
              PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
              new ConstantValue(body, var__virtual_1_, org.mondo.collaboration.security.increment.vocabulary.OperationType.get("READ"));
              new Equality(body, var_depOp, var__virtual_1_);
              // 	domAccess == AccessibilityLevel::ALLOW
              PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
              new ConstantValue(body, var__virtual_2_, org.mondo.collaboration.security.increment.vocabulary.AccessibilityLevel.get("ALLOW"));
              new Equality(body, var_domAccess, var__virtual_2_);
              //  depAccess == AccessibilityLevel::ALLOW
              PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
              new ConstantValue(body, var__virtual_3_, org.mondo.collaboration.security.increment.vocabulary.AccessibilityLevel.get("ALLOW"));
              new Equality(body, var_depAccess, var__virtual_3_);
              bodies.add(body);
          }
          {
              PBody body = new PBody(this);
              PVariable var_user = body.getOrCreateVariableByName("user");
              PVariable var_depAsset = body.getOrCreateVariableByName("depAsset");
              PVariable var_depOp = body.getOrCreateVariableByName("depOp");
              PVariable var_depAccess = body.getOrCreateVariableByName("depAccess");
              PVariable var_domAsset = body.getOrCreateVariableByName("domAsset");
              PVariable var_domOp = body.getOrCreateVariableByName("domOp");
              PVariable var_domAccess = body.getOrCreateVariableByName("domAccess");
              new TypeFilterConstraint(body, new FlatTuple(var_user), new JavaTransitiveInstancesKey(java.lang.String.class));
              new TypeConstraint(body, Tuples.flatTupleOf(var_depAsset), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
              new TypeConstraint(body, Tuples.flatTupleOf(var_domAsset), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
              body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
                 new ExportedParameter(body, var_user, parameter_pUser),
                 new ExportedParameter(body, var_depAsset, parameter_pDepAsset),
                 new ExportedParameter(body, var_depOp, parameter_pDepOp),
                 new ExportedParameter(body, var_depAccess, parameter_pDepAccess),
                 new ExportedParameter(body, var_domAsset, parameter_pDomAsset),
                 new ExportedParameter(body, var_domOp, parameter_pDomOp),
                 new ExportedParameter(body, var_domAccess, parameter_pDomAccess)
              ));
              // 	// type III, read vs containment	find effectiveJudgement_at_0(user, domAsset, domOp, domAccess)
              new PositivePatternCall(body, new FlatTuple(var_user, var_domAsset, var_domOp, var_domAccess), EffectiveJudgement_at_0QuerySpecification.instance().getInternalQueryRepresentation());
              // 	find contains(domAsset, depAsset)
              new PositivePatternCall(body, new FlatTuple(var_domAsset, var_depAsset), ContainsQuerySpecification.instance().getInternalQueryRepresentation());
              // 	domOp == OperationType::READ
              PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
              new ConstantValue(body, var__virtual_0_, org.mondo.collaboration.security.increment.vocabulary.OperationType.get("READ"));
              new Equality(body, var_domOp, var__virtual_0_);
              //  depOp == OperationType::READ
              PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
              new ConstantValue(body, var__virtual_1_, org.mondo.collaboration.security.increment.vocabulary.OperationType.get("READ"));
              new Equality(body, var_depOp, var__virtual_1_);
              // 	domAccess == AccessibilityLevel::DENY
              PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
              new ConstantValue(body, var__virtual_2_, org.mondo.collaboration.security.increment.vocabulary.AccessibilityLevel.get("DENY"));
              new Equality(body, var_domAccess, var__virtual_2_);
              //  depAccess == AccessibilityLevel::DENY
              PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
              new ConstantValue(body, var__virtual_3_, org.mondo.collaboration.security.increment.vocabulary.AccessibilityLevel.get("DENY"));
              new Equality(body, var_depAccess, var__virtual_3_);
              bodies.add(body);
          }
      } catch (ViatraQueryException ex) {
          throw processDependencyException(ex);
      }
      return bodies;
    }
  }
}
