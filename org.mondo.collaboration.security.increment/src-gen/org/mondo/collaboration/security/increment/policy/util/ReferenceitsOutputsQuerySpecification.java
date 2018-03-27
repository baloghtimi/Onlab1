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
import org.mondo.collaboration.security.increment.policy.ReferenceitsOutputsMatch;
import org.mondo.collaboration.security.increment.policy.ReferenceitsOutputsMatcher;

/**
 * A pattern-specific query specification that can instantiate ReferenceitsOutputsMatcher in a type-safe way.
 * 
 * @see ReferenceitsOutputsMatcher
 * @see ReferenceitsOutputsMatch
 * 
 */
@SuppressWarnings("all")
public final class ReferenceitsOutputsQuerySpecification extends BaseGeneratedEMFQuerySpecification<ReferenceitsOutputsMatcher> {
  private ReferenceitsOutputsQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static ReferenceitsOutputsQuerySpecification instance() throws ViatraQueryException {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected ReferenceitsOutputsMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return ReferenceitsOutputsMatcher.on(engine);
  }
  
  @Override
  public ReferenceitsOutputsMatcher instantiate() throws ViatraQueryException {
    return ReferenceitsOutputsMatcher.create();
  }
  
  @Override
  public ReferenceitsOutputsMatch newEmptyMatch() {
    return ReferenceitsOutputsMatch.newEmptyMatch();
  }
  
  @Override
  public ReferenceitsOutputsMatch newMatch(final Object... parameters) {
    return ReferenceitsOutputsMatch.newMatch((WTSpec4M.WT) parameters[0], (WTSpec4M.SystemOutput) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: org.mondo.collaboration.security.increment.policy.util.ReferenceitsOutputsQuerySpecification (visibility: PUBLIC, simpleName: ReferenceitsOutputsQuerySpecification, identifier: org.mondo.collaboration.security.increment.policy.util.ReferenceitsOutputsQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: org.mondo.collaboration.security.increment.policy.util) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: org.mondo.collaboration.security.increment.policy.util.ReferenceitsOutputsQuerySpecification (visibility: PUBLIC, simpleName: ReferenceitsOutputsQuerySpecification, identifier: org.mondo.collaboration.security.increment.policy.util.ReferenceitsOutputsQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: org.mondo.collaboration.security.increment.policy.util) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static ReferenceitsOutputsQuerySpecification INSTANCE = new ReferenceitsOutputsQuerySpecification();
    
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
    private final static ReferenceitsOutputsQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pRoot = new PParameter("root", "WTSpec4M.WT", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://WTSpec4M/5.0M", "WT")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pOutput = new PParameter("output", "WTSpec4M.SystemOutput", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://WTSpec4M/5.0M", "SystemOutput")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pRoot, parameter_pOutput);
    
    @Override
    public String getFullyQualifiedName() {
      return "org.mondo.collaboration.security.increment.policy.referenceitsOutputs";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("root","output");
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
          PVariable var_root = body.getOrCreateVariableByName("root");
          PVariable var_output = body.getOrCreateVariableByName("output");
          new TypeConstraint(body, Tuples.flatTupleOf(var_root), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "WT")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_output), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "SystemOutput")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_root, parameter_pRoot),
             new ExportedParameter(body, var_output, parameter_pOutput)
          ));
          // 	WT.itsOutputs(root, output)
          new TypeConstraint(body, Tuples.flatTupleOf(var_root), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "WT")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_root, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://WTSpec4M/5.0M", "WT", "itsOutputs")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "SystemOutput")));
          new Equality(body, var__virtual_0_, var_output);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
