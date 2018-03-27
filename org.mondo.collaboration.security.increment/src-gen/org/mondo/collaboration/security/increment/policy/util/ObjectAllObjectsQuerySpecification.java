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
import org.mondo.collaboration.security.increment.policy.ObjectAllObjectsMatch;
import org.mondo.collaboration.security.increment.policy.ObjectAllObjectsMatcher;

/**
 * A pattern-specific query specification that can instantiate ObjectAllObjectsMatcher in a type-safe way.
 * 
 * @see ObjectAllObjectsMatcher
 * @see ObjectAllObjectsMatch
 * 
 */
@SuppressWarnings("all")
public final class ObjectAllObjectsQuerySpecification extends BaseGeneratedEMFQuerySpecification<ObjectAllObjectsMatcher> {
  private ObjectAllObjectsQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static ObjectAllObjectsQuerySpecification instance() throws ViatraQueryException {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected ObjectAllObjectsMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return ObjectAllObjectsMatcher.on(engine);
  }
  
  @Override
  public ObjectAllObjectsMatcher instantiate() throws ViatraQueryException {
    return ObjectAllObjectsMatcher.create();
  }
  
  @Override
  public ObjectAllObjectsMatch newEmptyMatch() {
    return ObjectAllObjectsMatch.newEmptyMatch();
  }
  
  @Override
  public ObjectAllObjectsMatch newMatch(final Object... parameters) {
    return ObjectAllObjectsMatch.newMatch((org.eclipse.emf.ecore.EObject) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: org.mondo.collaboration.security.increment.policy.util.ObjectAllObjectsQuerySpecification (visibility: PUBLIC, simpleName: ObjectAllObjectsQuerySpecification, identifier: org.mondo.collaboration.security.increment.policy.util.ObjectAllObjectsQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: org.mondo.collaboration.security.increment.policy.util) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: org.mondo.collaboration.security.increment.policy.util.ObjectAllObjectsQuerySpecification (visibility: PUBLIC, simpleName: ObjectAllObjectsQuerySpecification, identifier: org.mondo.collaboration.security.increment.policy.util.ObjectAllObjectsQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: org.mondo.collaboration.security.increment.policy.util) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static ObjectAllObjectsQuerySpecification INSTANCE = new ObjectAllObjectsQuerySpecification();
    
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
    private final static ObjectAllObjectsQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pObject = new PParameter("object", "org.eclipse.emf.ecore.EObject", (IInputKey)null, PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pObject);
    
    @Override
    public String getFullyQualifiedName() {
      return "org.mondo.collaboration.security.increment.policy.objectAllObjects";
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
          // 	WT(object)
          new TypeConstraint(body, Tuples.flatTupleOf(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "WT")));
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_object = body.getOrCreateVariableByName("object");
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_object, parameter_pObject)
          ));
          // 	MainSubsystem(object)
          new TypeConstraint(body, Tuples.flatTupleOf(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "MainSubsystem")));
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_object = body.getOrCreateVariableByName("object");
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_object, parameter_pObject)
          ));
          // 	Subsystem(object)
          new TypeConstraint(body, Tuples.flatTupleOf(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "Subsystem")));
          bodies.add(body);
      }
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
      {
          PBody body = new PBody(this);
          PVariable var_object = body.getOrCreateVariableByName("object");
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_object, parameter_pObject)
          ));
          // 	CtrlUnit5(object)
          new TypeConstraint(body, Tuples.flatTupleOf(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "CtrlUnit5")));
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_object = body.getOrCreateVariableByName("object");
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_object, parameter_pObject)
          ));
          // 	CtrlUnit9(object)
          new TypeConstraint(body, Tuples.flatTupleOf(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "CtrlUnit9")));
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_object = body.getOrCreateVariableByName("object");
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_object, parameter_pObject)
          ));
          // 	CtrlUnit10(object)
          new TypeConstraint(body, Tuples.flatTupleOf(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "CtrlUnit10")));
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_object = body.getOrCreateVariableByName("object");
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_object, parameter_pObject)
          ));
          // 	CtrlUnit11(object)
          new TypeConstraint(body, Tuples.flatTupleOf(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "CtrlUnit11")));
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_object = body.getOrCreateVariableByName("object");
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_object, parameter_pObject)
          ));
          // 	CtrlUnit13(object)
          new TypeConstraint(body, Tuples.flatTupleOf(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "CtrlUnit13")));
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_object = body.getOrCreateVariableByName("object");
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_object, parameter_pObject)
          ));
          // 	CtrlUnit15(object)
          new TypeConstraint(body, Tuples.flatTupleOf(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "CtrlUnit15")));
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_object = body.getOrCreateVariableByName("object");
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_object, parameter_pObject)
          ));
          // 	CtrlUnit18(object)
          new TypeConstraint(body, Tuples.flatTupleOf(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "CtrlUnit18")));
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_object = body.getOrCreateVariableByName("object");
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_object, parameter_pObject)
          ));
          // 	CtrlUnit27(object)
          new TypeConstraint(body, Tuples.flatTupleOf(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "CtrlUnit27")));
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_object = body.getOrCreateVariableByName("object");
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_object, parameter_pObject)
          ));
          // 	CtrlUnit29(object)
          new TypeConstraint(body, Tuples.flatTupleOf(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "CtrlUnit29")));
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_object = body.getOrCreateVariableByName("object");
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_object, parameter_pObject)
          ));
          // 	CtrlUnit31(object)
          new TypeConstraint(body, Tuples.flatTupleOf(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "CtrlUnit31")));
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_object = body.getOrCreateVariableByName("object");
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_object, parameter_pObject)
          ));
          // 	CtrlUnit34(object)
          new TypeConstraint(body, Tuples.flatTupleOf(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "CtrlUnit34")));
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_object = body.getOrCreateVariableByName("object");
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_object, parameter_pObject)
          ));
          // 	CtrlUnit36(object)
          new TypeConstraint(body, Tuples.flatTupleOf(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "CtrlUnit36")));
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_object = body.getOrCreateVariableByName("object");
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_object, parameter_pObject)
          ));
          // 	CtrlUnit37(object)
          new TypeConstraint(body, Tuples.flatTupleOf(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "CtrlUnit37")));
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_object = body.getOrCreateVariableByName("object");
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_object, parameter_pObject)
          ));
          // 	CtrlUnit39(object)
          new TypeConstraint(body, Tuples.flatTupleOf(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "CtrlUnit39")));
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_object = body.getOrCreateVariableByName("object");
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_object, parameter_pObject)
          ));
          // 	CtrlUnit40(object)
          new TypeConstraint(body, Tuples.flatTupleOf(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "CtrlUnit40")));
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_object = body.getOrCreateVariableByName("object");
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_object, parameter_pObject)
          ));
          // 	CtrlUnit44(object)
          new TypeConstraint(body, Tuples.flatTupleOf(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "CtrlUnit44")));
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_object = body.getOrCreateVariableByName("object");
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_object, parameter_pObject)
          ));
          // 	CtrlUnit46(object)
          new TypeConstraint(body, Tuples.flatTupleOf(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "CtrlUnit46")));
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_object = body.getOrCreateVariableByName("object");
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_object, parameter_pObject)
          ));
          // 	CtrlUnit47(object)
          new TypeConstraint(body, Tuples.flatTupleOf(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "CtrlUnit47")));
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_object = body.getOrCreateVariableByName("object");
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_object, parameter_pObject)
          ));
          // 	CtrlUnit49(object)
          new TypeConstraint(body, Tuples.flatTupleOf(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "CtrlUnit49")));
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_object = body.getOrCreateVariableByName("object");
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_object, parameter_pObject)
          ));
          // 	CtrlUnit50(object)
          new TypeConstraint(body, Tuples.flatTupleOf(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "CtrlUnit50")));
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_object = body.getOrCreateVariableByName("object");
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_object, parameter_pObject)
          ));
          // 	CtrlUnit58(object)
          new TypeConstraint(body, Tuples.flatTupleOf(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "CtrlUnit58")));
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_object = body.getOrCreateVariableByName("object");
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_object, parameter_pObject)
          ));
          // 	CtrlUnit59(object)
          new TypeConstraint(body, Tuples.flatTupleOf(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "CtrlUnit59")));
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_object = body.getOrCreateVariableByName("object");
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_object, parameter_pObject)
          ));
          // 	CtrlUnit65(object)
          new TypeConstraint(body, Tuples.flatTupleOf(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "CtrlUnit65")));
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_object = body.getOrCreateVariableByName("object");
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_object, parameter_pObject)
          ));
          // 	CtrlUnit68(object)
          new TypeConstraint(body, Tuples.flatTupleOf(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "CtrlUnit68")));
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_object = body.getOrCreateVariableByName("object");
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_object, parameter_pObject)
          ));
          // 	CtrlUnit71(object)
          new TypeConstraint(body, Tuples.flatTupleOf(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "CtrlUnit71")));
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_object = body.getOrCreateVariableByName("object");
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_object, parameter_pObject)
          ));
          // 	CtrlUnit73(object)
          new TypeConstraint(body, Tuples.flatTupleOf(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "CtrlUnit73")));
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_object = body.getOrCreateVariableByName("object");
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_object, parameter_pObject)
          ));
          // 	CtrlUnit78(object)
          new TypeConstraint(body, Tuples.flatTupleOf(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "CtrlUnit78")));
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_object = body.getOrCreateVariableByName("object");
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_object, parameter_pObject)
          ));
          // 	CtrlUnit80(object)
          new TypeConstraint(body, Tuples.flatTupleOf(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "CtrlUnit80")));
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_object = body.getOrCreateVariableByName("object");
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_object, parameter_pObject)
          ));
          // 	CtrlUnit92(object)
          new TypeConstraint(body, Tuples.flatTupleOf(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "CtrlUnit92")));
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_object = body.getOrCreateVariableByName("object");
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_object, parameter_pObject)
          ));
          // 	CtrlUnit94(object)
          new TypeConstraint(body, Tuples.flatTupleOf(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "CtrlUnit94")));
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_object = body.getOrCreateVariableByName("object");
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_object, parameter_pObject)
          ));
          // 	CtrlUnit102(object)
          new TypeConstraint(body, Tuples.flatTupleOf(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "CtrlUnit102")));
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_object = body.getOrCreateVariableByName("object");
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_object, parameter_pObject)
          ));
          // 	CtrlUnit124(object)
          new TypeConstraint(body, Tuples.flatTupleOf(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "CtrlUnit124")));
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_object = body.getOrCreateVariableByName("object");
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_object, parameter_pObject)
          ));
          // 	CtrlUnit125(object)
          new TypeConstraint(body, Tuples.flatTupleOf(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "CtrlUnit125")));
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_object = body.getOrCreateVariableByName("object");
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_object, parameter_pObject)
          ));
          // 	CtrlUnit126(object)
          new TypeConstraint(body, Tuples.flatTupleOf(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "CtrlUnit126")));
          bodies.add(body);
      }
      return bodies;
    }
  }
}
