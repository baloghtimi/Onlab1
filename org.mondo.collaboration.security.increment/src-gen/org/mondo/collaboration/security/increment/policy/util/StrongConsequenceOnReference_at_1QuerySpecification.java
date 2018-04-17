/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy_consequence.vql
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
import org.mondo.collaboration.security.increment.policy.StrongConsequenceOnReference_at_1Match;
import org.mondo.collaboration.security.increment.policy.StrongConsequenceOnReference_at_1Matcher;
import org.mondo.collaboration.security.increment.policy.util.ContainmentReferenceQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.EffectiveJudgementOnAttribute_at_1QuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.EffectiveJudgementOnObject_at_1QuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.EffectiveJudgementOnReference_at_1QuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.IdAttributeQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.ReferenceAssetQuerySpecification;

/**
 * A pattern-specific query specification that can instantiate StrongConsequenceOnReference_at_1Matcher in a type-safe way.
 * 
 * @see StrongConsequenceOnReference_at_1Matcher
 * @see StrongConsequenceOnReference_at_1Match
 * 
 */
@SuppressWarnings("all")
public final class StrongConsequenceOnReference_at_1QuerySpecification extends BaseGeneratedEMFQuerySpecification<StrongConsequenceOnReference_at_1Matcher> {
  private StrongConsequenceOnReference_at_1QuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static StrongConsequenceOnReference_at_1QuerySpecification instance() throws ViatraQueryException {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected StrongConsequenceOnReference_at_1Matcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return StrongConsequenceOnReference_at_1Matcher.on(engine);
  }
  
  @Override
  public StrongConsequenceOnReference_at_1Matcher instantiate() throws ViatraQueryException {
    return StrongConsequenceOnReference_at_1Matcher.create();
  }
  
  @Override
  public StrongConsequenceOnReference_at_1Match newEmptyMatch() {
    return StrongConsequenceOnReference_at_1Match.newEmptyMatch();
  }
  
  @Override
  public StrongConsequenceOnReference_at_1Match newMatch(final Object... parameters) {
    return StrongConsequenceOnReference_at_1Match.newMatch((java.lang.String) parameters[0], (org.eclipse.emf.ecore.EObject) parameters[1], (org.eclipse.emf.ecore.EObject) parameters[2], (org.eclipse.emf.ecore.EReference) parameters[3], (org.mondo.collaboration.policy.rules.OperationType) parameters[4], (org.mondo.collaboration.policy.rules.AccessibilityLevel) parameters[5]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: org.mondo.collaboration.security.increment.policy.util.StrongConsequenceOnReference_at_1QuerySpecification (visibility: PUBLIC, simpleName: StrongConsequenceOnReference_at_1QuerySpecification, identifier: org.mondo.collaboration.security.increment.policy.util.StrongConsequenceOnReference_at_1QuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: org.mondo.collaboration.security.increment.policy.util) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: org.mondo.collaboration.security.increment.policy.util.StrongConsequenceOnReference_at_1QuerySpecification (visibility: PUBLIC, simpleName: StrongConsequenceOnReference_at_1QuerySpecification, identifier: org.mondo.collaboration.security.increment.policy.util.StrongConsequenceOnReference_at_1QuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: org.mondo.collaboration.security.increment.policy.util) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static StrongConsequenceOnReference_at_1QuerySpecification INSTANCE = new StrongConsequenceOnReference_at_1QuerySpecification();
    
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
    private final static StrongConsequenceOnReference_at_1QuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pUser = new PParameter("user", "java.lang.String", new JavaTransitiveInstancesKey(java.lang.String.class), PParameterDirection.INOUT);
    
    private final PParameter parameter_pSource = new PParameter("source", "org.eclipse.emf.ecore.EObject", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eclipse.org/emf/2002/Ecore", "EObject")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pTarget = new PParameter("target", "org.eclipse.emf.ecore.EObject", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eclipse.org/emf/2002/Ecore", "EObject")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pReference = new PParameter("reference", "org.eclipse.emf.ecore.EReference", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eclipse.org/emf/2002/Ecore", "EReference")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pOperation = new PParameter("operation", "org.mondo.collaboration.policy.rules.OperationType", (IInputKey)null, PParameterDirection.INOUT);
    
    private final PParameter parameter_pAccess = new PParameter("access", "org.mondo.collaboration.policy.rules.AccessibilityLevel", (IInputKey)null, PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pUser, parameter_pSource, parameter_pTarget, parameter_pReference, parameter_pOperation, parameter_pAccess);
    
    @Override
    public String getFullyQualifiedName() {
      return "org.mondo.collaboration.security.increment.policy.strongConsequenceOnReference_at_1";
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
              // 	// allow W -> allow R, reference -> reference	find effectiveJudgementOnReference_at_1(user, source, target, reference, OperationType::WRITE, AccessibilityLevel::ALLOW)
              PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
              new ConstantValue(body, var__virtual_0_, org.mondo.collaboration.policy.rules.OperationType.get("W"));
              PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
              new ConstantValue(body, var__virtual_1_, org.mondo.collaboration.policy.rules.AccessibilityLevel.get("allow"));
              new PositivePatternCall(body, new FlatTuple(var_user, var_source, var_target, var_reference, var__virtual_0_, var__virtual_1_), EffectiveJudgementOnReference_at_1QuerySpecification.instance().getInternalQueryRepresentation());
              // 	operation == OperationType::READ
              PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
              new ConstantValue(body, var__virtual_2_, org.mondo.collaboration.policy.rules.OperationType.get("R"));
              new Equality(body, var_operation, var__virtual_2_);
              // 	access == AccessibilityLevel::ALLOW
              PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
              new ConstantValue(body, var__virtual_3_, org.mondo.collaboration.policy.rules.AccessibilityLevel.get("allow"));
              new Equality(body, var_access, var__virtual_3_);
              bodies.add(body);
          }
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
              // 	// deny R -> deny W, reference -> reference	find effectiveJudgementOnReference_at_1(user, source, target, reference, OperationType::READ, AccessibilityLevel::DENY)
              PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
              new ConstantValue(body, var__virtual_0_, org.mondo.collaboration.policy.rules.OperationType.get("R"));
              PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
              new ConstantValue(body, var__virtual_1_, org.mondo.collaboration.policy.rules.AccessibilityLevel.get("deny"));
              new PositivePatternCall(body, new FlatTuple(var_user, var_source, var_target, var_reference, var__virtual_0_, var__virtual_1_), EffectiveJudgementOnReference_at_1QuerySpecification.instance().getInternalQueryRepresentation());
              // 	operation == OperationType::WRITE
              PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
              new ConstantValue(body, var__virtual_2_, org.mondo.collaboration.policy.rules.OperationType.get("W"));
              new Equality(body, var_operation, var__virtual_2_);
              // 	access == AccessibilityLevel::DENY
              PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
              new ConstantValue(body, var__virtual_3_, org.mondo.collaboration.policy.rules.AccessibilityLevel.get("deny"));
              new Equality(body, var_access, var__virtual_3_);
              bodies.add(body);
          }
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
              //     // allow R, object -> container reference    find effectiveJudgementOnObject_at_1(user, target, OperationType::READ, AccessibilityLevel::ALLOW)
              PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
              new ConstantValue(body, var__virtual_0_, org.mondo.collaboration.policy.rules.OperationType.get("R"));
              PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
              new ConstantValue(body, var__virtual_1_, org.mondo.collaboration.policy.rules.AccessibilityLevel.get("allow"));
              new PositivePatternCall(body, new FlatTuple(var_user, var_target, var__virtual_0_, var__virtual_1_), EffectiveJudgementOnObject_at_1QuerySpecification.instance().getInternalQueryRepresentation());
              //     find containmentReference(source, target, reference)
              new PositivePatternCall(body, new FlatTuple(var_source, var_target, var_reference), ContainmentReferenceQuerySpecification.instance().getInternalQueryRepresentation());
              //     operation == OperationType::READ
              PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
              new ConstantValue(body, var__virtual_2_, org.mondo.collaboration.policy.rules.OperationType.get("R"));
              new Equality(body, var_operation, var__virtual_2_);
              //     access == AccessibilityLevel::ALLOW
              PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
              new ConstantValue(body, var__virtual_3_, org.mondo.collaboration.policy.rules.AccessibilityLevel.get("allow"));
              new Equality(body, var_access, var__virtual_3_);
              bodies.add(body);
          }
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
              //     // deny R, object -> incoming reference    find effectiveJudgementOnObject_at_1(user, target, OperationType::READ, AccessibilityLevel::DENY)
              PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
              new ConstantValue(body, var__virtual_0_, org.mondo.collaboration.policy.rules.OperationType.get("R"));
              PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
              new ConstantValue(body, var__virtual_1_, org.mondo.collaboration.policy.rules.AccessibilityLevel.get("deny"));
              new PositivePatternCall(body, new FlatTuple(var_user, var_target, var__virtual_0_, var__virtual_1_), EffectiveJudgementOnObject_at_1QuerySpecification.instance().getInternalQueryRepresentation());
              //     find referenceAsset(source, target, reference)
              new PositivePatternCall(body, new FlatTuple(var_source, var_target, var_reference), ReferenceAssetQuerySpecification.instance().getInternalQueryRepresentation());
              //     operation == OperationType::READ
              PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
              new ConstantValue(body, var__virtual_2_, org.mondo.collaboration.policy.rules.OperationType.get("R"));
              new Equality(body, var_operation, var__virtual_2_);
              //     access == AccessibilityLevel::DENY
              PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
              new ConstantValue(body, var__virtual_3_, org.mondo.collaboration.policy.rules.AccessibilityLevel.get("deny"));
              new Equality(body, var_access, var__virtual_3_);
              bodies.add(body);
          }
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
              //     // deny R, object -> outgoing reference    find effectiveJudgementOnObject_at_1(user, source, OperationType::READ, AccessibilityLevel::DENY)
              PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
              new ConstantValue(body, var__virtual_0_, org.mondo.collaboration.policy.rules.OperationType.get("R"));
              PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
              new ConstantValue(body, var__virtual_1_, org.mondo.collaboration.policy.rules.AccessibilityLevel.get("deny"));
              new PositivePatternCall(body, new FlatTuple(var_user, var_source, var__virtual_0_, var__virtual_1_), EffectiveJudgementOnObject_at_1QuerySpecification.instance().getInternalQueryRepresentation());
              //     find referenceAsset(source, target, reference)
              new PositivePatternCall(body, new FlatTuple(var_source, var_target, var_reference), ReferenceAssetQuerySpecification.instance().getInternalQueryRepresentation());
              //     operation == OperationType::READ
              PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
              new ConstantValue(body, var__virtual_2_, org.mondo.collaboration.policy.rules.OperationType.get("R"));
              new Equality(body, var_operation, var__virtual_2_);
              //     access == AccessibilityLevel::DENY
              PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
              new ConstantValue(body, var__virtual_3_, org.mondo.collaboration.policy.rules.AccessibilityLevel.get("deny"));
              new Equality(body, var_access, var__virtual_3_);
              bodies.add(body);
          }
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
              //     // allow W, object -> container reference    find effectiveJudgementOnObject_at_1(user, target, OperationType::WRITE, AccessibilityLevel::ALLOW)
              PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
              new ConstantValue(body, var__virtual_0_, org.mondo.collaboration.policy.rules.OperationType.get("W"));
              PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
              new ConstantValue(body, var__virtual_1_, org.mondo.collaboration.policy.rules.AccessibilityLevel.get("allow"));
              new PositivePatternCall(body, new FlatTuple(var_user, var_target, var__virtual_0_, var__virtual_1_), EffectiveJudgementOnObject_at_1QuerySpecification.instance().getInternalQueryRepresentation());
              //     find containmentReference(source, target, reference)
              new PositivePatternCall(body, new FlatTuple(var_source, var_target, var_reference), ContainmentReferenceQuerySpecification.instance().getInternalQueryRepresentation());
              //     operation == OperationType::WRITE
              PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
              new ConstantValue(body, var__virtual_2_, org.mondo.collaboration.policy.rules.OperationType.get("W"));
              new Equality(body, var_operation, var__virtual_2_);
              //     access == AccessibilityLevel::ALLOW
              PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
              new ConstantValue(body, var__virtual_3_, org.mondo.collaboration.policy.rules.AccessibilityLevel.get("allow"));
              new Equality(body, var_access, var__virtual_3_);
              bodies.add(body);
          }
          {
              PBody body = new PBody(this);
              PVariable var_user = body.getOrCreateVariableByName("user");
              PVariable var_source = body.getOrCreateVariableByName("source");
              PVariable var_target = body.getOrCreateVariableByName("target");
              PVariable var_reference = body.getOrCreateVariableByName("reference");
              PVariable var_operation = body.getOrCreateVariableByName("operation");
              PVariable var_access = body.getOrCreateVariableByName("access");
              PVariable var_anyValue = body.getOrCreateVariableByName("anyValue");
              PVariable var_anyAttribute = body.getOrCreateVariableByName("anyAttribute");
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
              //     // deny R, ID attribute -> source    find effectiveJudgementOnAttribute_at_1(user, target, anyValue, anyAttribute, OperationType::WRITE, AccessibilityLevel::ALLOW)
              PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
              new ConstantValue(body, var__virtual_0_, org.mondo.collaboration.policy.rules.OperationType.get("W"));
              PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
              new ConstantValue(body, var__virtual_1_, org.mondo.collaboration.policy.rules.AccessibilityLevel.get("allow"));
              new PositivePatternCall(body, new FlatTuple(var_user, var_target, var_anyValue, var_anyAttribute, var__virtual_0_, var__virtual_1_), EffectiveJudgementOnAttribute_at_1QuerySpecification.instance().getInternalQueryRepresentation());
              //     find idAttribute(target, anyValue, anyAttribute)
              new PositivePatternCall(body, new FlatTuple(var_target, var_anyValue, var_anyAttribute), IdAttributeQuerySpecification.instance().getInternalQueryRepresentation());
              //     find referenceAsset(source, target, reference)
              new PositivePatternCall(body, new FlatTuple(var_source, var_target, var_reference), ReferenceAssetQuerySpecification.instance().getInternalQueryRepresentation());
              //     operation == OperationType::WRITE
              PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
              new ConstantValue(body, var__virtual_2_, org.mondo.collaboration.policy.rules.OperationType.get("W"));
              new Equality(body, var_operation, var__virtual_2_);
              //     access == AccessibilityLevel::ALLOW
              PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
              new ConstantValue(body, var__virtual_3_, org.mondo.collaboration.policy.rules.AccessibilityLevel.get("allow"));
              new Equality(body, var_access, var__virtual_3_);
              bodies.add(body);
          }
      } catch (ViatraQueryException ex) {
          throw processDependencyException(ex);
      }
      return bodies;
    }
  }
}
