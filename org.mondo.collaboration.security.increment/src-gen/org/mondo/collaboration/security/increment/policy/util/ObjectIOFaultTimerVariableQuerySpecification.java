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
import org.eclipse.viatra.query.runtime.matchers.context.IInputKey;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.mondo.collaboration.security.increment.policy.ObjectIOFaultTimerVariableMatch;
import org.mondo.collaboration.security.increment.policy.ObjectIOFaultTimerVariableMatcher;

/**
 * A pattern-specific query specification that can instantiate ObjectIOFaultTimerVariableMatcher in a type-safe way.
 * 
 * @see ObjectIOFaultTimerVariableMatcher
 * @see ObjectIOFaultTimerVariableMatch
 * 
 */
@SuppressWarnings("all")
public final class ObjectIOFaultTimerVariableQuerySpecification extends BaseGeneratedEMFQuerySpecification<ObjectIOFaultTimerVariableMatcher> {
  private ObjectIOFaultTimerVariableQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static ObjectIOFaultTimerVariableQuerySpecification instance() throws ViatraQueryException {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected ObjectIOFaultTimerVariableMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return ObjectIOFaultTimerVariableMatcher.on(engine);
  }
  
  @Override
  public ObjectIOFaultTimerVariableMatcher instantiate() throws ViatraQueryException {
    return ObjectIOFaultTimerVariableMatcher.create();
  }
  
  @Override
  public ObjectIOFaultTimerVariableMatch newEmptyMatch() {
    return ObjectIOFaultTimerVariableMatch.newEmptyMatch();
  }
  
  @Override
  public ObjectIOFaultTimerVariableMatch newMatch(final Object... parameters) {
    return ObjectIOFaultTimerVariableMatch.newMatch((org.eclipse.emf.ecore.EObject) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: org.mondo.collaboration.security.increment.policy.util.ObjectIOFaultTimerVariableQuerySpecification (visibility: PUBLIC, simpleName: ObjectIOFaultTimerVariableQuerySpecification, identifier: org.mondo.collaboration.security.increment.policy.util.ObjectIOFaultTimerVariableQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: org.mondo.collaboration.security.increment.policy.util) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: org.mondo.collaboration.security.increment.policy.util.ObjectIOFaultTimerVariableQuerySpecification (visibility: PUBLIC, simpleName: ObjectIOFaultTimerVariableQuerySpecification, identifier: org.mondo.collaboration.security.increment.policy.util.ObjectIOFaultTimerVariableQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: org.mondo.collaboration.security.increment.policy.util) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static ObjectIOFaultTimerVariableQuerySpecification INSTANCE = new ObjectIOFaultTimerVariableQuerySpecification();
    
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
    private final static ObjectIOFaultTimerVariableQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pObject = new PParameter("object", "org.eclipse.emf.ecore.EObject", (IInputKey)null, PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pObject);
    
    @Override
    public String getFullyQualifiedName() {
      return "org.mondo.collaboration.security.increment.policy.objectIOFaultTimerVariable";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("object");
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
          PVariable var_object = body.getOrCreateVariableByName("object");
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_object, parameter_pObject)
          ));
          // 	SystemInput(object)
          new TypeConstraint(body, Tuples.flatTupleOf(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "SystemInput")));
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_object = body.getOrCreateVariableByName("object");
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_object, parameter_pObject)
          ));
          // 	SystemOutput(object)
          new TypeConstraint(body, Tuples.flatTupleOf(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "SystemOutput")));
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_object = body.getOrCreateVariableByName("object");
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_object, parameter_pObject)
          ));
          // 	SystemFault(object)
          new TypeConstraint(body, Tuples.flatTupleOf(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "SystemFault")));
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_object = body.getOrCreateVariableByName("object");
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_object, parameter_pObject)
          ));
          // 	SystemParam(object)
          new TypeConstraint(body, Tuples.flatTupleOf(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "SystemParam")));
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_object = body.getOrCreateVariableByName("object");
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_object, parameter_pObject)
          ));
          // 	SystemTimer(object)
          new TypeConstraint(body, Tuples.flatTupleOf(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "SystemTimer")));
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_object = body.getOrCreateVariableByName("object");
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_object, parameter_pObject)
          ));
          // 	SystemVariable(object)
          new TypeConstraint(body, Tuples.flatTupleOf(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "SystemVariable")));
          bodies.add(body);
      }
      return bodies;
    }
  }
}
