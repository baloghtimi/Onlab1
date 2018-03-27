/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy.vql
 */
package org.mondo.collaboration.security.increment.policy.util;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EDataTypeInSlotsKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.context.IInputKey;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.mondo.collaboration.security.increment.policy.AttributeenabledMatch;
import org.mondo.collaboration.security.increment.policy.AttributeenabledMatcher;

/**
 * A pattern-specific query specification that can instantiate AttributeenabledMatcher in a type-safe way.
 * 
 * @see AttributeenabledMatcher
 * @see AttributeenabledMatch
 * 
 */
@SuppressWarnings("all")
public final class AttributeenabledQuerySpecification extends BaseGeneratedEMFQuerySpecification<AttributeenabledMatcher> {
  private AttributeenabledQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static AttributeenabledQuerySpecification instance() throws ViatraQueryException {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected AttributeenabledMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return AttributeenabledMatcher.on(engine);
  }
  
  @Override
  public AttributeenabledMatcher instantiate() throws ViatraQueryException {
    return AttributeenabledMatcher.create();
  }
  
  @Override
  public AttributeenabledMatch newEmptyMatch() {
    return AttributeenabledMatch.newEmptyMatch();
  }
  
  @Override
  public AttributeenabledMatch newMatch(final Object... parameters) {
    return AttributeenabledMatch.newMatch((WTSpec4M.wtc) parameters[0], (java.lang.Boolean) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: org.mondo.collaboration.security.increment.policy.util.AttributeenabledQuerySpecification (visibility: PUBLIC, simpleName: AttributeenabledQuerySpecification, identifier: org.mondo.collaboration.security.increment.policy.util.AttributeenabledQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: org.mondo.collaboration.security.increment.policy.util) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: org.mondo.collaboration.security.increment.policy.util.AttributeenabledQuerySpecification (visibility: PUBLIC, simpleName: AttributeenabledQuerySpecification, identifier: org.mondo.collaboration.security.increment.policy.util.AttributeenabledQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: org.mondo.collaboration.security.increment.policy.util) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static AttributeenabledQuerySpecification INSTANCE = new AttributeenabledQuerySpecification();
    
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
    private final static AttributeenabledQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pWtc = new PParameter("wtc", "WTSpec4M.wtc", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://WTSpec4M/5.0M", "wtc")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pValue = new PParameter("value", "java.lang.Boolean", (IInputKey)null, PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pWtc, parameter_pValue);
    
    @Override
    public String getFullyQualifiedName() {
      return "org.mondo.collaboration.security.increment.policy.attributeenabled";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("wtc","value");
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
          PVariable var_wtc = body.getOrCreateVariableByName("wtc");
          PVariable var_value = body.getOrCreateVariableByName("value");
          new TypeConstraint(body, Tuples.flatTupleOf(var_wtc), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "wtc")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_wtc, parameter_pWtc),
             new ExportedParameter(body, var_value, parameter_pValue)
          ));
          // 	wtc.enabled(wtc, value)
          new TypeConstraint(body, Tuples.flatTupleOf(var_wtc), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "wtc")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_wtc, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://WTSpec4M/5.0M", "wtc", "enabled")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EBoolean")));
          new Equality(body, var__virtual_0_, var_value);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
