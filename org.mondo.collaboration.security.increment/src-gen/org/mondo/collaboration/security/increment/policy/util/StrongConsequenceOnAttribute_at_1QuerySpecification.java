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
import org.mondo.collaboration.security.increment.policy.StrongConsequenceOnAttribute_at_1Match;
import org.mondo.collaboration.security.increment.policy.StrongConsequenceOnAttribute_at_1Matcher;
import org.mondo.collaboration.security.increment.policy.util.AttributeAssetQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.ContainmentReferenceQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.EffectiveJudgementOnAttribute_at_1QuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.EffectiveJudgementOnObject_at_1QuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.EffectiveJudgementOnReference_at_1QuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.IdAttributeQuerySpecification;

/**
 * A pattern-specific query specification that can instantiate StrongConsequenceOnAttribute_at_1Matcher in a type-safe way.
 * 
 * @see StrongConsequenceOnAttribute_at_1Matcher
 * @see StrongConsequenceOnAttribute_at_1Match
 * 
 */
@SuppressWarnings("all")
public final class StrongConsequenceOnAttribute_at_1QuerySpecification extends BaseGeneratedEMFQuerySpecification<StrongConsequenceOnAttribute_at_1Matcher> {
  private StrongConsequenceOnAttribute_at_1QuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static StrongConsequenceOnAttribute_at_1QuerySpecification instance() throws ViatraQueryException {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected StrongConsequenceOnAttribute_at_1Matcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return StrongConsequenceOnAttribute_at_1Matcher.on(engine);
  }
  
  @Override
  public StrongConsequenceOnAttribute_at_1Matcher instantiate() throws ViatraQueryException {
    return StrongConsequenceOnAttribute_at_1Matcher.create();
  }
  
  @Override
  public StrongConsequenceOnAttribute_at_1Match newEmptyMatch() {
    return StrongConsequenceOnAttribute_at_1Match.newEmptyMatch();
  }
  
  @Override
  public StrongConsequenceOnAttribute_at_1Match newMatch(final Object... parameters) {
    return StrongConsequenceOnAttribute_at_1Match.newMatch((java.lang.String) parameters[0], (org.eclipse.emf.ecore.EObject) parameters[1], (java.lang.Object) parameters[2], (org.eclipse.emf.ecore.EAttribute) parameters[3], (org.mondo.collaboration.policy.rules.OperationType) parameters[4], (org.mondo.collaboration.policy.rules.AccessibilityLevel) parameters[5]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: org.mondo.collaboration.security.increment.policy.util.StrongConsequenceOnAttribute_at_1QuerySpecification (visibility: PUBLIC, simpleName: StrongConsequenceOnAttribute_at_1QuerySpecification, identifier: org.mondo.collaboration.security.increment.policy.util.StrongConsequenceOnAttribute_at_1QuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: org.mondo.collaboration.security.increment.policy.util) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: org.mondo.collaboration.security.increment.policy.util.StrongConsequenceOnAttribute_at_1QuerySpecification (visibility: PUBLIC, simpleName: StrongConsequenceOnAttribute_at_1QuerySpecification, identifier: org.mondo.collaboration.security.increment.policy.util.StrongConsequenceOnAttribute_at_1QuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: org.mondo.collaboration.security.increment.policy.util) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static StrongConsequenceOnAttribute_at_1QuerySpecification INSTANCE = new StrongConsequenceOnAttribute_at_1QuerySpecification();
    
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
    private final static StrongConsequenceOnAttribute_at_1QuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pUser = new PParameter("user", "java.lang.String", new JavaTransitiveInstancesKey(java.lang.String.class), PParameterDirection.INOUT);
    
    private final PParameter parameter_pSource = new PParameter("source", "org.eclipse.emf.ecore.EObject", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eclipse.org/emf/2002/Ecore", "EObject")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pValue = new PParameter("value", "java.lang.Object", new JavaTransitiveInstancesKey(java.lang.Object.class), PParameterDirection.INOUT);
    
    private final PParameter parameter_pAttribute = new PParameter("attribute", "org.eclipse.emf.ecore.EAttribute", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eclipse.org/emf/2002/Ecore", "EAttribute")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pOperation = new PParameter("operation", "org.mondo.collaboration.policy.rules.OperationType", (IInputKey)null, PParameterDirection.INOUT);
    
    private final PParameter parameter_pAccess = new PParameter("access", "org.mondo.collaboration.policy.rules.AccessibilityLevel", (IInputKey)null, PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pUser, parameter_pSource, parameter_pValue, parameter_pAttribute, parameter_pOperation, parameter_pAccess);
    
    @Override
    public String getFullyQualifiedName() {
      return "org.mondo.collaboration.security.increment.policy.strongConsequenceOnAttribute_at_1";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("user","source","value","attribute","operation","access");
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
              PVariable var_access = body.getOrCreateVariableByName("access");
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
                 new ExportedParameter(body, var_access, parameter_pAccess)
              ));
              // 	// allow W -> allow R, attribute -> attribute	find effectiveJudgementOnAttribute_at_1(user, source, value, attribute, OperationType::WRITE, AccessibilityLevel::ALLOW)
              PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
              new ConstantValue(body, var__virtual_0_, org.mondo.collaboration.policy.rules.OperationType.get("W"));
              PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
              new ConstantValue(body, var__virtual_1_, org.mondo.collaboration.policy.rules.AccessibilityLevel.get("allow"));
              new PositivePatternCall(body, new FlatTuple(var_user, var_source, var_value, var_attribute, var__virtual_0_, var__virtual_1_), EffectiveJudgementOnAttribute_at_1QuerySpecification.instance().getInternalQueryRepresentation());
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
              PVariable var_value = body.getOrCreateVariableByName("value");
              PVariable var_attribute = body.getOrCreateVariableByName("attribute");
              PVariable var_operation = body.getOrCreateVariableByName("operation");
              PVariable var_access = body.getOrCreateVariableByName("access");
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
                 new ExportedParameter(body, var_access, parameter_pAccess)
              ));
              // 	// deny R -> deny W, attribute -> attribute	find effectiveJudgementOnAttribute_at_1(user, source, value, attribute, OperationType::READ, AccessibilityLevel::DENY)
              PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
              new ConstantValue(body, var__virtual_0_, org.mondo.collaboration.policy.rules.OperationType.get("R"));
              PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
              new ConstantValue(body, var__virtual_1_, org.mondo.collaboration.policy.rules.AccessibilityLevel.get("deny"));
              new PositivePatternCall(body, new FlatTuple(var_user, var_source, var_value, var_attribute, var__virtual_0_, var__virtual_1_), EffectiveJudgementOnAttribute_at_1QuerySpecification.instance().getInternalQueryRepresentation());
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
              PVariable var_value = body.getOrCreateVariableByName("value");
              PVariable var_attribute = body.getOrCreateVariableByName("attribute");
              PVariable var_operation = body.getOrCreateVariableByName("operation");
              PVariable var_access = body.getOrCreateVariableByName("access");
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
                 new ExportedParameter(body, var_access, parameter_pAccess)
              ));
              //     // allow R, object -> ID attribute    find effectiveJudgementOnObject_at_1(user, source, OperationType::READ, AccessibilityLevel::ALLOW)
              PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
              new ConstantValue(body, var__virtual_0_, org.mondo.collaboration.policy.rules.OperationType.get("R"));
              PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
              new ConstantValue(body, var__virtual_1_, org.mondo.collaboration.policy.rules.AccessibilityLevel.get("allow"));
              new PositivePatternCall(body, new FlatTuple(var_user, var_source, var__virtual_0_, var__virtual_1_), EffectiveJudgementOnObject_at_1QuerySpecification.instance().getInternalQueryRepresentation());
              //     find idAttribute(source, value, attribute)
              new PositivePatternCall(body, new FlatTuple(var_source, var_value, var_attribute), IdAttributeQuerySpecification.instance().getInternalQueryRepresentation());
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
              PVariable var_value = body.getOrCreateVariableByName("value");
              PVariable var_attribute = body.getOrCreateVariableByName("attribute");
              PVariable var_operation = body.getOrCreateVariableByName("operation");
              PVariable var_access = body.getOrCreateVariableByName("access");
              PVariable var_anySource = body.getOrCreateVariableByName("anySource");
              PVariable var_anyReference = body.getOrCreateVariableByName("anyReference");
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
                 new ExportedParameter(body, var_access, parameter_pAccess)
              ));
              //     // deny W, containment reference -> attribute    find effectiveJudgementOnReference_at_1(user, anySource, source, anyReference, OperationType::WRITE, AccessibilityLevel::ALLOW)
              PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
              new ConstantValue(body, var__virtual_0_, org.mondo.collaboration.policy.rules.OperationType.get("W"));
              PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
              new ConstantValue(body, var__virtual_1_, org.mondo.collaboration.policy.rules.AccessibilityLevel.get("allow"));
              new PositivePatternCall(body, new FlatTuple(var_user, var_anySource, var_source, var_anyReference, var__virtual_0_, var__virtual_1_), EffectiveJudgementOnReference_at_1QuerySpecification.instance().getInternalQueryRepresentation());
              //     find containmentReference(anySource, source, anyReference)
              new PositivePatternCall(body, new FlatTuple(var_anySource, var_source, var_anyReference), ContainmentReferenceQuerySpecification.instance().getInternalQueryRepresentation());
              //     find attributeAsset(source, value, attribute)
              new PositivePatternCall(body, new FlatTuple(var_source, var_value, var_attribute), AttributeAssetQuerySpecification.instance().getInternalQueryRepresentation());
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
              PVariable var_value = body.getOrCreateVariableByName("value");
              PVariable var_attribute = body.getOrCreateVariableByName("attribute");
              PVariable var_operation = body.getOrCreateVariableByName("operation");
              PVariable var_access = body.getOrCreateVariableByName("access");
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
                 new ExportedParameter(body, var_access, parameter_pAccess)
              ));
              // 	// obfuscate R, object -> ID attribute	find effectiveJudgementOnObject_at_1(user, source, OperationType::READ, AccessibilityLevel::OBFUSCATE)
              PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
              new ConstantValue(body, var__virtual_0_, org.mondo.collaboration.policy.rules.OperationType.get("R"));
              PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
              new ConstantValue(body, var__virtual_1_, org.mondo.collaboration.policy.rules.AccessibilityLevel.get("obfuscate"));
              new PositivePatternCall(body, new FlatTuple(var_user, var_source, var__virtual_0_, var__virtual_1_), EffectiveJudgementOnObject_at_1QuerySpecification.instance().getInternalQueryRepresentation());
              // 	find idAttribute(source, value, attribute)
              new PositivePatternCall(body, new FlatTuple(var_source, var_value, var_attribute), IdAttributeQuerySpecification.instance().getInternalQueryRepresentation());
              // 	operation == OperationType::READ
              PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
              new ConstantValue(body, var__virtual_2_, org.mondo.collaboration.policy.rules.OperationType.get("R"));
              new Equality(body, var_operation, var__virtual_2_);
              // 	access == AccessibilityLevel::OBFUSCATE
              PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
              new ConstantValue(body, var__virtual_3_, org.mondo.collaboration.policy.rules.AccessibilityLevel.get("obfuscate"));
              new Equality(body, var_access, var__virtual_3_);
              bodies.add(body);
          }
          {
              PBody body = new PBody(this);
              PVariable var_user = body.getOrCreateVariableByName("user");
              PVariable var_source = body.getOrCreateVariableByName("source");
              PVariable var_value = body.getOrCreateVariableByName("value");
              PVariable var_attribute = body.getOrCreateVariableByName("attribute");
              PVariable var_operation = body.getOrCreateVariableByName("operation");
              PVariable var_access = body.getOrCreateVariableByName("access");
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
                 new ExportedParameter(body, var_access, parameter_pAccess)
              ));
              //     // obfuscate R -> deny R, object -> nonID attribute    find effectiveJudgementOnObject_at_1(user, source, OperationType::READ, AccessibilityLevel::OBFUSCATE)
              PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
              new ConstantValue(body, var__virtual_0_, org.mondo.collaboration.policy.rules.OperationType.get("R"));
              PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
              new ConstantValue(body, var__virtual_1_, org.mondo.collaboration.policy.rules.AccessibilityLevel.get("obfuscate"));
              new PositivePatternCall(body, new FlatTuple(var_user, var_source, var__virtual_0_, var__virtual_1_), EffectiveJudgementOnObject_at_1QuerySpecification.instance().getInternalQueryRepresentation());
              //     find attributeAsset(source, value, attribute)
              new PositivePatternCall(body, new FlatTuple(var_source, var_value, var_attribute), AttributeAssetQuerySpecification.instance().getInternalQueryRepresentation());
              //     neg find idAttribute(source, value, attribute)
              new NegativePatternCall(body, new FlatTuple(var_source, var_value, var_attribute), IdAttributeQuerySpecification.instance().getInternalQueryRepresentation());
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
      } catch (ViatraQueryException ex) {
          throw processDependencyException(ex);
      }
      return bodies;
    }
  }
}
