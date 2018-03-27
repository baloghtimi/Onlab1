/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy.vql
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
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.mondo.collaboration.security.increment.policy.ObjectVariableMatch;
import org.mondo.collaboration.security.increment.policy.ObjectVariableMatcher;

/**
 * A pattern-specific query specification that can instantiate ObjectVariableMatcher in a type-safe way.
 * 
 * @see ObjectVariableMatcher
 * @see ObjectVariableMatch
 * 
 */
@SuppressWarnings("all")
public final class ObjectVariableQuerySpecification extends BaseGeneratedEMFQuerySpecification<ObjectVariableMatcher> {
  private ObjectVariableQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static ObjectVariableQuerySpecification instance() throws ViatraQueryException {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected ObjectVariableMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return ObjectVariableMatcher.on(engine);
  }
  
  @Override
  public ObjectVariableMatcher instantiate() throws ViatraQueryException {
    return ObjectVariableMatcher.create();
  }
  
  @Override
  public ObjectVariableMatch newEmptyMatch() {
    return ObjectVariableMatch.newEmptyMatch();
  }
  
  @Override
  public ObjectVariableMatch newMatch(final Object... parameters) {
    return ObjectVariableMatch.newMatch((WTSpec4M.SystemVariable) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: org.mondo.collaboration.security.increment.policy.util.ObjectVariableQuerySpecification (visibility: PUBLIC, simpleName: ObjectVariableQuerySpecification, identifier: org.mondo.collaboration.security.increment.policy.util.ObjectVariableQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: org.mondo.collaboration.security.increment.policy.util) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: org.mondo.collaboration.security.increment.policy.util.ObjectVariableQuerySpecification (visibility: PUBLIC, simpleName: ObjectVariableQuerySpecification, identifier: org.mondo.collaboration.security.increment.policy.util.ObjectVariableQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: org.mondo.collaboration.security.increment.policy.util) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static ObjectVariableQuerySpecification INSTANCE = new ObjectVariableQuerySpecification();
    
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
    private final static ObjectVariableQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pVariable = new PParameter("variable", "WTSpec4M.SystemVariable", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://WTSpec4M/5.0M", "SystemVariable")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pVariable);
    
    @Override
    public String getFullyQualifiedName() {
      return "org.mondo.collaboration.security.increment.policy.objectVariable";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("variable");
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
          PVariable var_variable = body.getOrCreateVariableByName("variable");
          new TypeConstraint(body, Tuples.flatTupleOf(var_variable), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "SystemVariable")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_variable, parameter_pVariable)
          ));
          // 	SystemVariable(variable)
          new TypeConstraint(body, Tuples.flatTupleOf(var_variable), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "SystemVariable")));
          bodies.add(body);
      }
      return bodies;
    }
  }
}
