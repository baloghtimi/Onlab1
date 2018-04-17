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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.TypeFilterConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.mondo.collaboration.security.increment.policy.StrongConsequenceOnObject_at_1Match;
import org.mondo.collaboration.security.increment.policy.StrongConsequenceOnObject_at_1Matcher;
import org.mondo.collaboration.security.increment.policy.util.ContainmentReferenceQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.ContainsQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.EffectiveJudgementOnAttribute_at_1QuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.EffectiveJudgementOnObject_at_1QuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.EffectiveJudgementOnReference_at_1QuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.IdAttributeQuerySpecification;

/**
 * A pattern-specific query specification that can instantiate StrongConsequenceOnObject_at_1Matcher in a type-safe way.
 * 
 * @see StrongConsequenceOnObject_at_1Matcher
 * @see StrongConsequenceOnObject_at_1Match
 * 
 */
@SuppressWarnings("all")
public final class StrongConsequenceOnObject_at_1QuerySpecification extends BaseGeneratedEMFQuerySpecification<StrongConsequenceOnObject_at_1Matcher> {
  private StrongConsequenceOnObject_at_1QuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static StrongConsequenceOnObject_at_1QuerySpecification instance() throws ViatraQueryException {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected StrongConsequenceOnObject_at_1Matcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return StrongConsequenceOnObject_at_1Matcher.on(engine);
  }
  
  @Override
  public StrongConsequenceOnObject_at_1Matcher instantiate() throws ViatraQueryException {
    return StrongConsequenceOnObject_at_1Matcher.create();
  }
  
  @Override
  public StrongConsequenceOnObject_at_1Match newEmptyMatch() {
    return StrongConsequenceOnObject_at_1Match.newEmptyMatch();
  }
  
  @Override
  public StrongConsequenceOnObject_at_1Match newMatch(final Object... parameters) {
    return StrongConsequenceOnObject_at_1Match.newMatch((java.lang.String) parameters[0], (org.eclipse.emf.ecore.EObject) parameters[1], (org.mondo.collaboration.policy.rules.OperationType) parameters[2], (org.mondo.collaboration.policy.rules.AccessibilityLevel) parameters[3]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: org.mondo.collaboration.security.increment.policy.util.StrongConsequenceOnObject_at_1QuerySpecification (visibility: PUBLIC, simpleName: StrongConsequenceOnObject_at_1QuerySpecification, identifier: org.mondo.collaboration.security.increment.policy.util.StrongConsequenceOnObject_at_1QuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: org.mondo.collaboration.security.increment.policy.util) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: org.mondo.collaboration.security.increment.policy.util.StrongConsequenceOnObject_at_1QuerySpecification (visibility: PUBLIC, simpleName: StrongConsequenceOnObject_at_1QuerySpecification, identifier: org.mondo.collaboration.security.increment.policy.util.StrongConsequenceOnObject_at_1QuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: org.mondo.collaboration.security.increment.policy.util) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static StrongConsequenceOnObject_at_1QuerySpecification INSTANCE = new StrongConsequenceOnObject_at_1QuerySpecification();
    
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
    private final static StrongConsequenceOnObject_at_1QuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pUser = new PParameter("user", "java.lang.String", new JavaTransitiveInstancesKey(java.lang.String.class), PParameterDirection.INOUT);
    
    private final PParameter parameter_pObject = new PParameter("object", "org.eclipse.emf.ecore.EObject", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eclipse.org/emf/2002/Ecore", "EObject")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pOperation = new PParameter("operation", "org.mondo.collaboration.policy.rules.OperationType", (IInputKey)null, PParameterDirection.INOUT);
    
    private final PParameter parameter_pAccess = new PParameter("access", "org.mondo.collaboration.policy.rules.AccessibilityLevel", (IInputKey)null, PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pUser, parameter_pObject, parameter_pOperation, parameter_pAccess);
    
    @Override
    public String getFullyQualifiedName() {
      return "org.mondo.collaboration.security.increment.policy.strongConsequenceOnObject_at_1";
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
              // 	// allow W -> allow R, object -> object	find effectiveJudgementOnObject_at_1(user, object, OperationType::WRITE, AccessibilityLevel::ALLOW)
              PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
              new ConstantValue(body, var__virtual_0_, org.mondo.collaboration.policy.rules.OperationType.get("W"));
              PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
              new ConstantValue(body, var__virtual_1_, org.mondo.collaboration.policy.rules.AccessibilityLevel.get("allow"));
              new PositivePatternCall(body, new FlatTuple(var_user, var_object, var__virtual_0_, var__virtual_1_), EffectiveJudgementOnObject_at_1QuerySpecification.instance().getInternalQueryRepresentation());
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
              // 	// deny R -> deny W, object -> object	find effectiveJudgementOnObject_at_1(user, object, OperationType::READ, AccessibilityLevel::DENY)
              PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
              new ConstantValue(body, var__virtual_0_, org.mondo.collaboration.policy.rules.OperationType.get("R"));
              PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
              new ConstantValue(body, var__virtual_1_, org.mondo.collaboration.policy.rules.AccessibilityLevel.get("deny"));
              new PositivePatternCall(body, new FlatTuple(var_user, var_object, var__virtual_0_, var__virtual_1_), EffectiveJudgementOnObject_at_1QuerySpecification.instance().getInternalQueryRepresentation());
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
              PVariable var_object = body.getOrCreateVariableByName("object");
              PVariable var_operation = body.getOrCreateVariableByName("operation");
              PVariable var_access = body.getOrCreateVariableByName("access");
              PVariable var_child = body.getOrCreateVariableByName("child");
              new TypeFilterConstraint(body, new FlatTuple(var_user), new JavaTransitiveInstancesKey(java.lang.String.class));
              new TypeConstraint(body, Tuples.flatTupleOf(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
              body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
                 new ExportedParameter(body, var_user, parameter_pUser),
                 new ExportedParameter(body, var_object, parameter_pObject),
                 new ExportedParameter(body, var_operation, parameter_pOperation),
                 new ExportedParameter(body, var_access, parameter_pAccess)
              ));
              // 	// allow R -> obfuscate R, child -> parent	find effectiveJudgementOnObject_at_1(user, child, OperationType::READ, AccessibilityLevel::ALLOW)
              PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
              new ConstantValue(body, var__virtual_0_, org.mondo.collaboration.policy.rules.OperationType.get("R"));
              PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
              new ConstantValue(body, var__virtual_1_, org.mondo.collaboration.policy.rules.AccessibilityLevel.get("allow"));
              new PositivePatternCall(body, new FlatTuple(var_user, var_child, var__virtual_0_, var__virtual_1_), EffectiveJudgementOnObject_at_1QuerySpecification.instance().getInternalQueryRepresentation());
              // 	find contains(object, child)
              new PositivePatternCall(body, new FlatTuple(var_object, var_child), ContainsQuerySpecification.instance().getInternalQueryRepresentation());
              // 	neg find effectiveJudgementOnObject_at_1(user, object, OperationType::READ, AccessibilityLevel::ALLOW)
              PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
              new ConstantValue(body, var__virtual_2_, org.mondo.collaboration.policy.rules.OperationType.get("R"));
              PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
              new ConstantValue(body, var__virtual_3_, org.mondo.collaboration.policy.rules.AccessibilityLevel.get("allow"));
              new NegativePatternCall(body, new FlatTuple(var_user, var_object, var__virtual_2_, var__virtual_3_), EffectiveJudgementOnObject_at_1QuerySpecification.instance().getInternalQueryRepresentation());
              // 	operation == OperationType::READ
              PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
              new ConstantValue(body, var__virtual_4_, org.mondo.collaboration.policy.rules.OperationType.get("R"));
              new Equality(body, var_operation, var__virtual_4_);
              // 	access == AccessibilityLevel::OBFUSCATE
              PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
              new ConstantValue(body, var__virtual_5_, org.mondo.collaboration.policy.rules.AccessibilityLevel.get("obfuscate"));
              new Equality(body, var_access, var__virtual_5_);
              bodies.add(body);
          }
          {
              PBody body = new PBody(this);
              PVariable var_user = body.getOrCreateVariableByName("user");
              PVariable var_object = body.getOrCreateVariableByName("object");
              PVariable var_operation = body.getOrCreateVariableByName("operation");
              PVariable var_access = body.getOrCreateVariableByName("access");
              PVariable var__value = body.getOrCreateVariableByName("_value");
              PVariable var__attribute = body.getOrCreateVariableByName("_attribute");
              new TypeFilterConstraint(body, new FlatTuple(var_user), new JavaTransitiveInstancesKey(java.lang.String.class));
              new TypeConstraint(body, Tuples.flatTupleOf(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
              body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
                 new ExportedParameter(body, var_user, parameter_pUser),
                 new ExportedParameter(body, var_object, parameter_pObject),
                 new ExportedParameter(body, var_operation, parameter_pOperation),
                 new ExportedParameter(body, var_access, parameter_pAccess)
              ));
              // 	// allow R -> obfuscate R, attribute -> source	find effectiveJudgementOnAttribute_at_1(user, object, _value, _attribute, OperationType::READ, AccessibilityLevel::ALLOW)
              PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
              new ConstantValue(body, var__virtual_0_, org.mondo.collaboration.policy.rules.OperationType.get("R"));
              PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
              new ConstantValue(body, var__virtual_1_, org.mondo.collaboration.policy.rules.AccessibilityLevel.get("allow"));
              new PositivePatternCall(body, new FlatTuple(var_user, var_object, var__value, var__attribute, var__virtual_0_, var__virtual_1_), EffectiveJudgementOnAttribute_at_1QuerySpecification.instance().getInternalQueryRepresentation());
              // 	neg find effectiveJudgementOnObject_at_1(user, object, OperationType::READ, AccessibilityLevel::ALLOW)
              PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
              new ConstantValue(body, var__virtual_2_, org.mondo.collaboration.policy.rules.OperationType.get("R"));
              PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
              new ConstantValue(body, var__virtual_3_, org.mondo.collaboration.policy.rules.AccessibilityLevel.get("allow"));
              new NegativePatternCall(body, new FlatTuple(var_user, var_object, var__virtual_2_, var__virtual_3_), EffectiveJudgementOnObject_at_1QuerySpecification.instance().getInternalQueryRepresentation());
              // 	operation == OperationType::READ
              PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
              new ConstantValue(body, var__virtual_4_, org.mondo.collaboration.policy.rules.OperationType.get("R"));
              new Equality(body, var_operation, var__virtual_4_);
              // 	access == AccessibilityLevel::OBFUSCATE
              PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
              new ConstantValue(body, var__virtual_5_, org.mondo.collaboration.policy.rules.AccessibilityLevel.get("obfuscate"));
              new Equality(body, var_access, var__virtual_5_);
              bodies.add(body);
          }
          {
              PBody body = new PBody(this);
              PVariable var_user = body.getOrCreateVariableByName("user");
              PVariable var_object = body.getOrCreateVariableByName("object");
              PVariable var_operation = body.getOrCreateVariableByName("operation");
              PVariable var_access = body.getOrCreateVariableByName("access");
              PVariable var_anyValue = body.getOrCreateVariableByName("anyValue");
              PVariable var_anyAttribute = body.getOrCreateVariableByName("anyAttribute");
              new TypeFilterConstraint(body, new FlatTuple(var_user), new JavaTransitiveInstancesKey(java.lang.String.class));
              new TypeConstraint(body, Tuples.flatTupleOf(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
              body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
                 new ExportedParameter(body, var_user, parameter_pUser),
                 new ExportedParameter(body, var_object, parameter_pObject),
                 new ExportedParameter(body, var_operation, parameter_pOperation),
                 new ExportedParameter(body, var_access, parameter_pAccess)
              ));
              //     // deny R, ID attribute -> source    find effectiveJudgementOnAttribute_at_1(user, object, anyValue, anyAttribute, OperationType::READ, AccessibilityLevel::DENY)
              PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
              new ConstantValue(body, var__virtual_0_, org.mondo.collaboration.policy.rules.OperationType.get("R"));
              PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
              new ConstantValue(body, var__virtual_1_, org.mondo.collaboration.policy.rules.AccessibilityLevel.get("deny"));
              new PositivePatternCall(body, new FlatTuple(var_user, var_object, var_anyValue, var_anyAttribute, var__virtual_0_, var__virtual_1_), EffectiveJudgementOnAttribute_at_1QuerySpecification.instance().getInternalQueryRepresentation());
              //     find idAttribute(object, anyValue, anyAttribute)
              new PositivePatternCall(body, new FlatTuple(var_object, var_anyValue, var_anyAttribute), IdAttributeQuerySpecification.instance().getInternalQueryRepresentation());
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
              PVariable var_object = body.getOrCreateVariableByName("object");
              PVariable var_operation = body.getOrCreateVariableByName("operation");
              PVariable var_access = body.getOrCreateVariableByName("access");
              PVariable var__target = body.getOrCreateVariableByName("_target");
              PVariable var__reference = body.getOrCreateVariableByName("_reference");
              new TypeFilterConstraint(body, new FlatTuple(var_user), new JavaTransitiveInstancesKey(java.lang.String.class));
              new TypeConstraint(body, Tuples.flatTupleOf(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
              body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
                 new ExportedParameter(body, var_user, parameter_pUser),
                 new ExportedParameter(body, var_object, parameter_pObject),
                 new ExportedParameter(body, var_operation, parameter_pOperation),
                 new ExportedParameter(body, var_access, parameter_pAccess)
              ));
              //     // allow R -> obfuscate R, reference -> source    find effectiveJudgementOnReference_at_1(user, object, _target, _reference, OperationType::READ, AccessibilityLevel::ALLOW)
              PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
              new ConstantValue(body, var__virtual_0_, org.mondo.collaboration.policy.rules.OperationType.get("R"));
              PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
              new ConstantValue(body, var__virtual_1_, org.mondo.collaboration.policy.rules.AccessibilityLevel.get("allow"));
              new PositivePatternCall(body, new FlatTuple(var_user, var_object, var__target, var__reference, var__virtual_0_, var__virtual_1_), EffectiveJudgementOnReference_at_1QuerySpecification.instance().getInternalQueryRepresentation());
              //     neg find effectiveJudgementOnObject_at_1(user, object, OperationType::READ, AccessibilityLevel::ALLOW)
              PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
              new ConstantValue(body, var__virtual_2_, org.mondo.collaboration.policy.rules.OperationType.get("R"));
              PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
              new ConstantValue(body, var__virtual_3_, org.mondo.collaboration.policy.rules.AccessibilityLevel.get("allow"));
              new NegativePatternCall(body, new FlatTuple(var_user, var_object, var__virtual_2_, var__virtual_3_), EffectiveJudgementOnObject_at_1QuerySpecification.instance().getInternalQueryRepresentation());
              //     operation == OperationType::READ
              PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
              new ConstantValue(body, var__virtual_4_, org.mondo.collaboration.policy.rules.OperationType.get("R"));
              new Equality(body, var_operation, var__virtual_4_);
              //     access == AccessibilityLevel::OBFUSCATE
              PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
              new ConstantValue(body, var__virtual_5_, org.mondo.collaboration.policy.rules.AccessibilityLevel.get("obfuscate"));
              new Equality(body, var_access, var__virtual_5_);
              bodies.add(body);
          }
          {
              PBody body = new PBody(this);
              PVariable var_user = body.getOrCreateVariableByName("user");
              PVariable var_object = body.getOrCreateVariableByName("object");
              PVariable var_operation = body.getOrCreateVariableByName("operation");
              PVariable var_access = body.getOrCreateVariableByName("access");
              PVariable var__source = body.getOrCreateVariableByName("_source");
              PVariable var__reference = body.getOrCreateVariableByName("_reference");
              new TypeFilterConstraint(body, new FlatTuple(var_user), new JavaTransitiveInstancesKey(java.lang.String.class));
              new TypeConstraint(body, Tuples.flatTupleOf(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
              body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
                 new ExportedParameter(body, var_user, parameter_pUser),
                 new ExportedParameter(body, var_object, parameter_pObject),
                 new ExportedParameter(body, var_operation, parameter_pOperation),
                 new ExportedParameter(body, var_access, parameter_pAccess)
              ));
              //     // allow R -> obfuscate R, reference -> target    find effectiveJudgementOnReference_at_1(user, _source, object, _reference, OperationType::READ, AccessibilityLevel::ALLOW)
              PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
              new ConstantValue(body, var__virtual_0_, org.mondo.collaboration.policy.rules.OperationType.get("R"));
              PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
              new ConstantValue(body, var__virtual_1_, org.mondo.collaboration.policy.rules.AccessibilityLevel.get("allow"));
              new PositivePatternCall(body, new FlatTuple(var_user, var__source, var_object, var__reference, var__virtual_0_, var__virtual_1_), EffectiveJudgementOnReference_at_1QuerySpecification.instance().getInternalQueryRepresentation());
              //     neg find effectiveJudgementOnObject_at_1(user, object, OperationType::READ, AccessibilityLevel::ALLOW)
              PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
              new ConstantValue(body, var__virtual_2_, org.mondo.collaboration.policy.rules.OperationType.get("R"));
              PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
              new ConstantValue(body, var__virtual_3_, org.mondo.collaboration.policy.rules.AccessibilityLevel.get("allow"));
              new NegativePatternCall(body, new FlatTuple(var_user, var_object, var__virtual_2_, var__virtual_3_), EffectiveJudgementOnObject_at_1QuerySpecification.instance().getInternalQueryRepresentation());
              //     operation == OperationType::READ
              PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
              new ConstantValue(body, var__virtual_4_, org.mondo.collaboration.policy.rules.OperationType.get("R"));
              new Equality(body, var_operation, var__virtual_4_);
              //     access == AccessibilityLevel::OBFUSCATE
              PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
              new ConstantValue(body, var__virtual_5_, org.mondo.collaboration.policy.rules.AccessibilityLevel.get("obfuscate"));
              new Equality(body, var_access, var__virtual_5_);
              bodies.add(body);
          }
          {
              PBody body = new PBody(this);
              PVariable var_user = body.getOrCreateVariableByName("user");
              PVariable var_object = body.getOrCreateVariableByName("object");
              PVariable var_operation = body.getOrCreateVariableByName("operation");
              PVariable var_access = body.getOrCreateVariableByName("access");
              PVariable var_anySource = body.getOrCreateVariableByName("anySource");
              PVariable var_anyReference = body.getOrCreateVariableByName("anyReference");
              new TypeFilterConstraint(body, new FlatTuple(var_user), new JavaTransitiveInstancesKey(java.lang.String.class));
              new TypeConstraint(body, Tuples.flatTupleOf(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
              body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
                 new ExportedParameter(body, var_user, parameter_pUser),
                 new ExportedParameter(body, var_object, parameter_pObject),
                 new ExportedParameter(body, var_operation, parameter_pOperation),
                 new ExportedParameter(body, var_access, parameter_pAccess)
              ));
              //     // deny R, containment reference -> target    find effectiveJudgementOnReference_at_1(user, anySource, object, anyReference, OperationType::READ, AccessibilityLevel::DENY)
              PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
              new ConstantValue(body, var__virtual_0_, org.mondo.collaboration.policy.rules.OperationType.get("R"));
              PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
              new ConstantValue(body, var__virtual_1_, org.mondo.collaboration.policy.rules.AccessibilityLevel.get("deny"));
              new PositivePatternCall(body, new FlatTuple(var_user, var_anySource, var_object, var_anyReference, var__virtual_0_, var__virtual_1_), EffectiveJudgementOnReference_at_1QuerySpecification.instance().getInternalQueryRepresentation());
              //     find containmentReference(anySource, object, anyReference)
              new PositivePatternCall(body, new FlatTuple(var_anySource, var_object, var_anyReference), ContainmentReferenceQuerySpecification.instance().getInternalQueryRepresentation());
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
              PVariable var_object = body.getOrCreateVariableByName("object");
              PVariable var_operation = body.getOrCreateVariableByName("operation");
              PVariable var_access = body.getOrCreateVariableByName("access");
              PVariable var_anySource = body.getOrCreateVariableByName("anySource");
              PVariable var_anyReference = body.getOrCreateVariableByName("anyReference");
              new TypeFilterConstraint(body, new FlatTuple(var_user), new JavaTransitiveInstancesKey(java.lang.String.class));
              new TypeConstraint(body, Tuples.flatTupleOf(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
              body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
                 new ExportedParameter(body, var_user, parameter_pUser),
                 new ExportedParameter(body, var_object, parameter_pObject),
                 new ExportedParameter(body, var_operation, parameter_pOperation),
                 new ExportedParameter(body, var_access, parameter_pAccess)
              ));
              //     // allow W, containment reference -> target    find effectiveJudgementOnReference_at_1(user, anySource, object, anyReference, OperationType::WRITE, AccessibilityLevel::ALLOW)
              PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
              new ConstantValue(body, var__virtual_0_, org.mondo.collaboration.policy.rules.OperationType.get("W"));
              PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
              new ConstantValue(body, var__virtual_1_, org.mondo.collaboration.policy.rules.AccessibilityLevel.get("allow"));
              new PositivePatternCall(body, new FlatTuple(var_user, var_anySource, var_object, var_anyReference, var__virtual_0_, var__virtual_1_), EffectiveJudgementOnReference_at_1QuerySpecification.instance().getInternalQueryRepresentation());
              //     find containmentReference(anySource, object, anyReference)
              new PositivePatternCall(body, new FlatTuple(var_anySource, var_object, var_anyReference), ContainmentReferenceQuerySpecification.instance().getInternalQueryRepresentation());
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
