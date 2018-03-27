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
import org.mondo.collaboration.security.increment.policy.ObjectFaultMatch;
import org.mondo.collaboration.security.increment.policy.ObjectFaultMatcher;

/**
 * A pattern-specific query specification that can instantiate ObjectFaultMatcher in a type-safe way.
 * 
 * @see ObjectFaultMatcher
 * @see ObjectFaultMatch
 * 
 */
@SuppressWarnings("all")
public final class ObjectFaultQuerySpecification extends BaseGeneratedEMFQuerySpecification<ObjectFaultMatcher> {
  private ObjectFaultQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static ObjectFaultQuerySpecification instance() throws ViatraQueryException {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected ObjectFaultMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return ObjectFaultMatcher.on(engine);
  }
  
  @Override
  public ObjectFaultMatcher instantiate() throws ViatraQueryException {
    return ObjectFaultMatcher.create();
  }
  
  @Override
  public ObjectFaultMatch newEmptyMatch() {
    return ObjectFaultMatch.newEmptyMatch();
  }
  
  @Override
  public ObjectFaultMatch newMatch(final Object... parameters) {
    return ObjectFaultMatch.newMatch((WTSpec4M.SystemFault) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: org.mondo.collaboration.security.increment.policy.util.ObjectFaultQuerySpecification (visibility: PUBLIC, simpleName: ObjectFaultQuerySpecification, identifier: org.mondo.collaboration.security.increment.policy.util.ObjectFaultQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: org.mondo.collaboration.security.increment.policy.util) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: org.mondo.collaboration.security.increment.policy.util.ObjectFaultQuerySpecification (visibility: PUBLIC, simpleName: ObjectFaultQuerySpecification, identifier: org.mondo.collaboration.security.increment.policy.util.ObjectFaultQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: org.mondo.collaboration.security.increment.policy.util) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static ObjectFaultQuerySpecification INSTANCE = new ObjectFaultQuerySpecification();
    
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
    private final static ObjectFaultQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pFault = new PParameter("fault", "WTSpec4M.SystemFault", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://WTSpec4M/5.0M", "SystemFault")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pFault);
    
    @Override
    public String getFullyQualifiedName() {
      return "org.mondo.collaboration.security.increment.policy.objectFault";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("fault");
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
          PVariable var_fault = body.getOrCreateVariableByName("fault");
          new TypeConstraint(body, Tuples.flatTupleOf(var_fault), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "SystemFault")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_fault, parameter_pFault)
          ));
          // 	SystemFault(fault)
          new TypeConstraint(body, Tuples.flatTupleOf(var_fault), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "SystemFault")));
          bodies.add(body);
      }
      return bodies;
    }
  }
}
