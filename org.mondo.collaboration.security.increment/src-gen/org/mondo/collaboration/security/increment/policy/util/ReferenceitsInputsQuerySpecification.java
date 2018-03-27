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
import org.mondo.collaboration.security.increment.policy.ReferenceitsInputsMatch;
import org.mondo.collaboration.security.increment.policy.ReferenceitsInputsMatcher;

/**
 * A pattern-specific query specification that can instantiate ReferenceitsInputsMatcher in a type-safe way.
 * 
 * @see ReferenceitsInputsMatcher
 * @see ReferenceitsInputsMatch
 * 
 */
@SuppressWarnings("all")
public final class ReferenceitsInputsQuerySpecification extends BaseGeneratedEMFQuerySpecification<ReferenceitsInputsMatcher> {
  private ReferenceitsInputsQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static ReferenceitsInputsQuerySpecification instance() throws ViatraQueryException {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected ReferenceitsInputsMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return ReferenceitsInputsMatcher.on(engine);
  }
  
  @Override
  public ReferenceitsInputsMatcher instantiate() throws ViatraQueryException {
    return ReferenceitsInputsMatcher.create();
  }
  
  @Override
  public ReferenceitsInputsMatch newEmptyMatch() {
    return ReferenceitsInputsMatch.newEmptyMatch();
  }
  
  @Override
  public ReferenceitsInputsMatch newMatch(final Object... parameters) {
    return ReferenceitsInputsMatch.newMatch((WTSpec4M.WT) parameters[0], (WTSpec4M.SystemInput) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: org.mondo.collaboration.security.increment.policy.util.ReferenceitsInputsQuerySpecification (visibility: PUBLIC, simpleName: ReferenceitsInputsQuerySpecification, identifier: org.mondo.collaboration.security.increment.policy.util.ReferenceitsInputsQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: org.mondo.collaboration.security.increment.policy.util) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: org.mondo.collaboration.security.increment.policy.util.ReferenceitsInputsQuerySpecification (visibility: PUBLIC, simpleName: ReferenceitsInputsQuerySpecification, identifier: org.mondo.collaboration.security.increment.policy.util.ReferenceitsInputsQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: org.mondo.collaboration.security.increment.policy.util) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static ReferenceitsInputsQuerySpecification INSTANCE = new ReferenceitsInputsQuerySpecification();
    
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
    private final static ReferenceitsInputsQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pRoot = new PParameter("root", "WTSpec4M.WT", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://WTSpec4M/5.0M", "WT")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pInput = new PParameter("input", "WTSpec4M.SystemInput", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://WTSpec4M/5.0M", "SystemInput")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pRoot, parameter_pInput);
    
    @Override
    public String getFullyQualifiedName() {
      return "org.mondo.collaboration.security.increment.policy.referenceitsInputs";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("root","input");
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
          PVariable var_input = body.getOrCreateVariableByName("input");
          new TypeConstraint(body, Tuples.flatTupleOf(var_root), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "WT")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_input), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "SystemInput")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_root, parameter_pRoot),
             new ExportedParameter(body, var_input, parameter_pInput)
          ));
          // 	WT.itsInputs(root, input)
          new TypeConstraint(body, Tuples.flatTupleOf(var_root), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "WT")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_root, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://WTSpec4M/5.0M", "WT", "itsInputs")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "SystemInput")));
          new Equality(body, var__virtual_0_, var_input);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
