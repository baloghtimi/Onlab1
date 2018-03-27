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
import org.mondo.collaboration.security.increment.policy.LockParameterValuesMatch;
import org.mondo.collaboration.security.increment.policy.LockParameterValuesMatcher;

/**
 * A pattern-specific query specification that can instantiate LockParameterValuesMatcher in a type-safe way.
 * 
 * @see LockParameterValuesMatcher
 * @see LockParameterValuesMatch
 * 
 */
@SuppressWarnings("all")
public final class LockParameterValuesQuerySpecification extends BaseGeneratedEMFQuerySpecification<LockParameterValuesMatcher> {
  private LockParameterValuesQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static LockParameterValuesQuerySpecification instance() throws ViatraQueryException {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected LockParameterValuesMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return LockParameterValuesMatcher.on(engine);
  }
  
  @Override
  public LockParameterValuesMatcher instantiate() throws ViatraQueryException {
    return LockParameterValuesMatcher.create();
  }
  
  @Override
  public LockParameterValuesMatch newEmptyMatch() {
    return LockParameterValuesMatch.newEmptyMatch();
  }
  
  @Override
  public LockParameterValuesMatch newMatch(final Object... parameters) {
    return LockParameterValuesMatch.newMatch((WTSpec4M.SystemParam) parameters[0], (java.lang.Integer) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: org.mondo.collaboration.security.increment.policy.util.LockParameterValuesQuerySpecification (visibility: PUBLIC, simpleName: LockParameterValuesQuerySpecification, identifier: org.mondo.collaboration.security.increment.policy.util.LockParameterValuesQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: org.mondo.collaboration.security.increment.policy.util) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: org.mondo.collaboration.security.increment.policy.util.LockParameterValuesQuerySpecification (visibility: PUBLIC, simpleName: LockParameterValuesQuerySpecification, identifier: org.mondo.collaboration.security.increment.policy.util.LockParameterValuesQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: org.mondo.collaboration.security.increment.policy.util) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static LockParameterValuesQuerySpecification INSTANCE = new LockParameterValuesQuerySpecification();
    
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
    private final static LockParameterValuesQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pParam = new PParameter("param", "WTSpec4M.SystemParam", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://WTSpec4M/5.0M", "SystemParam")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pValue = new PParameter("value", "java.lang.Integer", (IInputKey)null, PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pParam, parameter_pValue);
    
    @Override
    public String getFullyQualifiedName() {
      return "org.mondo.collaboration.security.increment.policy.lockParameterValues";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("param","value");
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
          PVariable var_param = body.getOrCreateVariableByName("param");
          PVariable var_value = body.getOrCreateVariableByName("value");
          new TypeConstraint(body, Tuples.flatTupleOf(var_param), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "SystemParam")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_param, parameter_pParam),
             new ExportedParameter(body, var_value, parameter_pValue)
          ));
          // 	SystemParam.value(param,value)
          new TypeConstraint(body, Tuples.flatTupleOf(var_param), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "SystemParam")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_param, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://WTSpec4M/5.0M", "SystemParam", "value")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EInt")));
          new Equality(body, var__virtual_0_, var_value);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
