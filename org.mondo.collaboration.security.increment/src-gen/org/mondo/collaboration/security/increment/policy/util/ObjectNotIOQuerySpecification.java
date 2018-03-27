/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy.vql
 */
package org.mondo.collaboration.security.increment.policy.util;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.context.IInputKey;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;
import org.mondo.collaboration.security.increment.policy.ObjectNotIOMatch;
import org.mondo.collaboration.security.increment.policy.ObjectNotIOMatcher;
import org.mondo.collaboration.security.increment.policy.util.ObjectAllObjectsWithoutRootQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.ObjectIOQuerySpecification;

/**
 * A pattern-specific query specification that can instantiate ObjectNotIOMatcher in a type-safe way.
 * 
 * @see ObjectNotIOMatcher
 * @see ObjectNotIOMatch
 * 
 */
@SuppressWarnings("all")
public final class ObjectNotIOQuerySpecification extends BaseGeneratedEMFQuerySpecification<ObjectNotIOMatcher> {
  private ObjectNotIOQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static ObjectNotIOQuerySpecification instance() throws ViatraQueryException {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected ObjectNotIOMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return ObjectNotIOMatcher.on(engine);
  }
  
  @Override
  public ObjectNotIOMatcher instantiate() throws ViatraQueryException {
    return ObjectNotIOMatcher.create();
  }
  
  @Override
  public ObjectNotIOMatch newEmptyMatch() {
    return ObjectNotIOMatch.newEmptyMatch();
  }
  
  @Override
  public ObjectNotIOMatch newMatch(final Object... parameters) {
    return ObjectNotIOMatch.newMatch((org.eclipse.emf.ecore.EObject) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: org.mondo.collaboration.security.increment.policy.util.ObjectNotIOQuerySpecification (visibility: PUBLIC, simpleName: ObjectNotIOQuerySpecification, identifier: org.mondo.collaboration.security.increment.policy.util.ObjectNotIOQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: org.mondo.collaboration.security.increment.policy.util) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: org.mondo.collaboration.security.increment.policy.util.ObjectNotIOQuerySpecification (visibility: PUBLIC, simpleName: ObjectNotIOQuerySpecification, identifier: org.mondo.collaboration.security.increment.policy.util.ObjectNotIOQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: org.mondo.collaboration.security.increment.policy.util) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static ObjectNotIOQuerySpecification INSTANCE = new ObjectNotIOQuerySpecification();
    
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
    private final static ObjectNotIOQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pObject = new PParameter("object", "org.eclipse.emf.ecore.EObject", (IInputKey)null, PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pObject);
    
    @Override
    public String getFullyQualifiedName() {
      return "org.mondo.collaboration.security.increment.policy.objectNotIO";
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
      try {
          {
              PBody body = new PBody(this);
              PVariable var_object = body.getOrCreateVariableByName("object");
              body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
                 new ExportedParameter(body, var_object, parameter_pObject)
              ));
              // 	find objectAllObjectsWithoutRoot(object)
              new PositivePatternCall(body, new FlatTuple(var_object), ObjectAllObjectsWithoutRootQuerySpecification.instance().getInternalQueryRepresentation());
              // 	neg find objectIO(object)
              new NegativePatternCall(body, new FlatTuple(var_object), ObjectIOQuerySpecification.instance().getInternalQueryRepresentation());
              bodies.add(body);
          }
      } catch (ViatraQueryException ex) {
          throw processDependencyException(ex);
      }
      return bodies;
    }
  }
}
