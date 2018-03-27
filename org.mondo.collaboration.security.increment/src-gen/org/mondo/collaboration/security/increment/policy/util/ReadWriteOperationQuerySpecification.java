/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy_gen.vql
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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.mondo.collaboration.security.increment.policy.ReadWriteOperationMatch;
import org.mondo.collaboration.security.increment.policy.ReadWriteOperationMatcher;

/**
 * A pattern-specific query specification that can instantiate ReadWriteOperationMatcher in a type-safe way.
 * 
 * @see ReadWriteOperationMatcher
 * @see ReadWriteOperationMatch
 * 
 */
@SuppressWarnings("all")
public final class ReadWriteOperationQuerySpecification extends BaseGeneratedEMFQuerySpecification<ReadWriteOperationMatcher> {
  private ReadWriteOperationQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static ReadWriteOperationQuerySpecification instance() throws ViatraQueryException {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected ReadWriteOperationMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return ReadWriteOperationMatcher.on(engine);
  }
  
  @Override
  public ReadWriteOperationMatcher instantiate() throws ViatraQueryException {
    return ReadWriteOperationMatcher.create();
  }
  
  @Override
  public ReadWriteOperationMatch newEmptyMatch() {
    return ReadWriteOperationMatch.newEmptyMatch();
  }
  
  @Override
  public ReadWriteOperationMatch newMatch(final Object... parameters) {
    return ReadWriteOperationMatch.newMatch((org.mondo.collaboration.security.increment.vocabulary.OperationType) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: org.mondo.collaboration.security.increment.policy.util.ReadWriteOperationQuerySpecification (visibility: PUBLIC, simpleName: ReadWriteOperationQuerySpecification, identifier: org.mondo.collaboration.security.increment.policy.util.ReadWriteOperationQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: org.mondo.collaboration.security.increment.policy.util) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: org.mondo.collaboration.security.increment.policy.util.ReadWriteOperationQuerySpecification (visibility: PUBLIC, simpleName: ReadWriteOperationQuerySpecification, identifier: org.mondo.collaboration.security.increment.policy.util.ReadWriteOperationQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: org.mondo.collaboration.security.increment.policy.util) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static ReadWriteOperationQuerySpecification INSTANCE = new ReadWriteOperationQuerySpecification();
    
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
    private final static ReadWriteOperationQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pOperation = new PParameter("operation", "org.mondo.collaboration.security.increment.vocabulary.OperationType", (IInputKey)null, PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pOperation);
    
    @Override
    public String getFullyQualifiedName() {
      return "org.mondo.collaboration.security.increment.policy.readWriteOperation";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("operation");
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
          PVariable var_operation = body.getOrCreateVariableByName("operation");
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_operation, parameter_pOperation)
          ));
          // 	operation == OperationType::READ
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new ConstantValue(body, var__virtual_0_, org.mondo.collaboration.security.increment.vocabulary.OperationType.get("READ"));
          new Equality(body, var_operation, var__virtual_0_);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_operation = body.getOrCreateVariableByName("operation");
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_operation, parameter_pOperation)
          ));
          // 	operation == OperationType::WRITE
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new ConstantValue(body, var__virtual_0_, org.mondo.collaboration.security.increment.vocabulary.OperationType.get("WRITE"));
          new Equality(body, var_operation, var__virtual_0_);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
