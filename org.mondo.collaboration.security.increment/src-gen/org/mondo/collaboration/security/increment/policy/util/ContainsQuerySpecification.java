/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/WTSpec4M_gen.vql
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
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.mondo.collaboration.security.increment.policy.ContainsMatch;
import org.mondo.collaboration.security.increment.policy.ContainsMatcher;

/**
 * A pattern-specific query specification that can instantiate ContainsMatcher in a type-safe way.
 * 
 * @see ContainsMatcher
 * @see ContainsMatch
 * 
 */
@SuppressWarnings("all")
public final class ContainsQuerySpecification extends BaseGeneratedEMFQuerySpecification<ContainsMatcher> {
  private ContainsQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static ContainsQuerySpecification instance() throws ViatraQueryException {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected ContainsMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return ContainsMatcher.on(engine);
  }
  
  @Override
  public ContainsMatcher instantiate() throws ViatraQueryException {
    return ContainsMatcher.create();
  }
  
  @Override
  public ContainsMatch newEmptyMatch() {
    return ContainsMatch.newEmptyMatch();
  }
  
  @Override
  public ContainsMatch newMatch(final Object... parameters) {
    return ContainsMatch.newMatch((org.eclipse.emf.ecore.EObject) parameters[0], (org.eclipse.emf.ecore.EObject) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: org.mondo.collaboration.security.increment.policy.util.ContainsQuerySpecification (visibility: PUBLIC, simpleName: ContainsQuerySpecification, identifier: org.mondo.collaboration.security.increment.policy.util.ContainsQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: org.mondo.collaboration.security.increment.policy.util) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: org.mondo.collaboration.security.increment.policy.util.ContainsQuerySpecification (visibility: PUBLIC, simpleName: ContainsQuerySpecification, identifier: org.mondo.collaboration.security.increment.policy.util.ContainsQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: org.mondo.collaboration.security.increment.policy.util) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static ContainsQuerySpecification INSTANCE = new ContainsQuerySpecification();
    
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
    private final static ContainsQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pContainer = new PParameter("container", "org.eclipse.emf.ecore.EObject", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eclipse.org/emf/2002/Ecore", "EObject")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pContained = new PParameter("contained", "org.eclipse.emf.ecore.EObject", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eclipse.org/emf/2002/Ecore", "EObject")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pContainer, parameter_pContained);
    
    @Override
    public String getFullyQualifiedName() {
      return "org.mondo.collaboration.security.increment.policy.contains";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("container","contained");
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
          PVariable var_container = body.getOrCreateVariableByName("container");
          PVariable var_contained = body.getOrCreateVariableByName("contained");
          new TypeConstraint(body, Tuples.flatTupleOf(var_container), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_contained), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_container, parameter_pContainer),
             new ExportedParameter(body, var_contained, parameter_pContained)
          ));
          // 	WT.itsSubsystems(container, contained)
          new TypeConstraint(body, Tuples.flatTupleOf(var_container), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "WT")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_container, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://WTSpec4M/5.0M", "WT", "itsSubsystems")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "MainSubsystem")));
          new Equality(body, var__virtual_0_, var_contained);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_container = body.getOrCreateVariableByName("container");
          PVariable var_contained = body.getOrCreateVariableByName("contained");
          new TypeConstraint(body, Tuples.flatTupleOf(var_container), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_contained), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_container, parameter_pContainer),
             new ExportedParameter(body, var_contained, parameter_pContained)
          ));
          // 	WT.itsInputs(container, contained)
          new TypeConstraint(body, Tuples.flatTupleOf(var_container), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "WT")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_container, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://WTSpec4M/5.0M", "WT", "itsInputs")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "SystemInput")));
          new Equality(body, var__virtual_0_, var_contained);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_container = body.getOrCreateVariableByName("container");
          PVariable var_contained = body.getOrCreateVariableByName("contained");
          new TypeConstraint(body, Tuples.flatTupleOf(var_container), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_contained), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_container, parameter_pContainer),
             new ExportedParameter(body, var_contained, parameter_pContained)
          ));
          // 	WT.itsOutputs(container, contained)
          new TypeConstraint(body, Tuples.flatTupleOf(var_container), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "WT")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_container, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://WTSpec4M/5.0M", "WT", "itsOutputs")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "SystemOutput")));
          new Equality(body, var__virtual_0_, var_contained);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_container = body.getOrCreateVariableByName("container");
          PVariable var_contained = body.getOrCreateVariableByName("contained");
          new TypeConstraint(body, Tuples.flatTupleOf(var_container), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_contained), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_container, parameter_pContainer),
             new ExportedParameter(body, var_contained, parameter_pContained)
          ));
          // 	WT.itsParams(container, contained)
          new TypeConstraint(body, Tuples.flatTupleOf(var_container), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "WT")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_container, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://WTSpec4M/5.0M", "WT", "itsParams")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "SystemParam")));
          new Equality(body, var__virtual_0_, var_contained);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_container = body.getOrCreateVariableByName("container");
          PVariable var_contained = body.getOrCreateVariableByName("contained");
          new TypeConstraint(body, Tuples.flatTupleOf(var_container), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_contained), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_container, parameter_pContainer),
             new ExportedParameter(body, var_contained, parameter_pContained)
          ));
          // 	WT.itsTimers(container, contained)
          new TypeConstraint(body, Tuples.flatTupleOf(var_container), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "WT")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_container, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://WTSpec4M/5.0M", "WT", "itsTimers")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "SystemTimer")));
          new Equality(body, var__virtual_0_, var_contained);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_container = body.getOrCreateVariableByName("container");
          PVariable var_contained = body.getOrCreateVariableByName("contained");
          new TypeConstraint(body, Tuples.flatTupleOf(var_container), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_contained), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_container, parameter_pContainer),
             new ExportedParameter(body, var_contained, parameter_pContained)
          ));
          // 	WT.itsFaults(container, contained)
          new TypeConstraint(body, Tuples.flatTupleOf(var_container), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "WT")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_container, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://WTSpec4M/5.0M", "WT", "itsFaults")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "SystemFault")));
          new Equality(body, var__virtual_0_, var_contained);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_container = body.getOrCreateVariableByName("container");
          PVariable var_contained = body.getOrCreateVariableByName("contained");
          new TypeConstraint(body, Tuples.flatTupleOf(var_container), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_contained), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_container, parameter_pContainer),
             new ExportedParameter(body, var_contained, parameter_pContained)
          ));
          // 	WT.itsVariables(container, contained)
          new TypeConstraint(body, Tuples.flatTupleOf(var_container), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "WT")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_container, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://WTSpec4M/5.0M", "WT", "itsVariables")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "SystemVariable")));
          new Equality(body, var__virtual_0_, var_contained);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_container = body.getOrCreateVariableByName("container");
          PVariable var_contained = body.getOrCreateVariableByName("contained");
          new TypeConstraint(body, Tuples.flatTupleOf(var_container), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_contained), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_container, parameter_pContainer),
             new ExportedParameter(body, var_contained, parameter_pContained)
          ));
          // 	Subsystem.itsWTCs(container, contained)
          new TypeConstraint(body, Tuples.flatTupleOf(var_container), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "Subsystem")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_container, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://WTSpec4M/5.0M", "Subsystem", "itsWTCs")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "wtc")));
          new Equality(body, var__virtual_0_, var_contained);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_container = body.getOrCreateVariableByName("container");
          PVariable var_contained = body.getOrCreateVariableByName("contained");
          new TypeConstraint(body, Tuples.flatTupleOf(var_container), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_contained), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_container, parameter_pContainer),
             new ExportedParameter(body, var_contained, parameter_pContained)
          ));
          // 	Subsystem.itsSubsystems(container, contained)
          new TypeConstraint(body, Tuples.flatTupleOf(var_container), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "Subsystem")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_container, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://WTSpec4M/5.0M", "Subsystem", "itsSubsystems")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "Subsystem")));
          new Equality(body, var__virtual_0_, var_contained);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
