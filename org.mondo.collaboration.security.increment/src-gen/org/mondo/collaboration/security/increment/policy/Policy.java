/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy.vql
 */
package org.mondo.collaboration.security.increment.policy;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.mondo.collaboration.security.increment.policy.AttributeenabledMatcher;
import org.mondo.collaboration.security.increment.policy.ContainsMatcher;
import org.mondo.collaboration.security.increment.policy.LockParameterValuesMatcher;
import org.mondo.collaboration.security.increment.policy.ObjectAllMatcher;
import org.mondo.collaboration.security.increment.policy.ObjectAllObjectsMatcher;
import org.mondo.collaboration.security.increment.policy.ObjectAllObjectsWithoutRootMatcher;
import org.mondo.collaboration.security.increment.policy.ObjectFaultMatcher;
import org.mondo.collaboration.security.increment.policy.ObjectIOFaultTimerVariableMatcher;
import org.mondo.collaboration.security.increment.policy.ObjectIOMatcher;
import org.mondo.collaboration.security.increment.policy.ObjectInputMatcher;
import org.mondo.collaboration.security.increment.policy.ObjectNotIOMatcher;
import org.mondo.collaboration.security.increment.policy.ObjectOutputMatcher;
import org.mondo.collaboration.security.increment.policy.ObjectParamMatcher;
import org.mondo.collaboration.security.increment.policy.ObjectRootMatcher;
import org.mondo.collaboration.security.increment.policy.ObjectRootWithIdMatcher;
import org.mondo.collaboration.security.increment.policy.ObjectSubsystemWithNameMatcher;
import org.mondo.collaboration.security.increment.policy.ObjectTimerMatcher;
import org.mondo.collaboration.security.increment.policy.ObjectVariableMatcher;
import org.mondo.collaboration.security.increment.policy.ObjectWTCMatcher;
import org.mondo.collaboration.security.increment.policy.ReferenceitsFaultsMatcher;
import org.mondo.collaboration.security.increment.policy.ReferenceitsInputsMatcher;
import org.mondo.collaboration.security.increment.policy.ReferenceitsMainSubsystemsMatcher;
import org.mondo.collaboration.security.increment.policy.ReferenceitsOutputsMatcher;
import org.mondo.collaboration.security.increment.policy.ReferenceitsParamsMatcher;
import org.mondo.collaboration.security.increment.policy.ReferenceitsTimersMatcher;
import org.mondo.collaboration.security.increment.policy.ReferenceitsVariablesMatcher;
import org.mondo.collaboration.security.increment.policy.util.AttributeenabledQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.ContainsQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.LockParameterValuesQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.ObjectAllObjectsQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.ObjectAllObjectsWithoutRootQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.ObjectAllQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.ObjectFaultQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.ObjectIOFaultTimerVariableQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.ObjectIOQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.ObjectInputQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.ObjectNotIOQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.ObjectOutputQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.ObjectParamQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.ObjectRootQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.ObjectRootWithIdQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.ObjectSubsystemWithNameQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.ObjectTimerQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.ObjectVariableQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.ObjectWTCQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.ReferenceitsFaultsQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.ReferenceitsInputsQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.ReferenceitsMainSubsystemsQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.ReferenceitsOutputsQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.ReferenceitsParamsQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.ReferenceitsTimersQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.ReferenceitsVariablesQuerySpecification;

/**
 * A pattern group formed of all public patterns defined in policy.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file policy.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package org.mondo.collaboration.security.increment.policy, the group contains the definition of the following patterns: <ul>
 * <li>contains</li>
 * <li>objectAll</li>
 * <li>objectRoot</li>
 * <li>objectRootWithId</li>
 * <li>referenceitsInputs</li>
 * <li>referenceitsOutputs</li>
 * <li>referenceitsParams</li>
 * <li>referenceitsTimers</li>
 * <li>referenceitsFaults</li>
 * <li>referenceitsVariables</li>
 * <li>referenceitsMainSubsystems</li>
 * <li>objectWTC</li>
 * <li>objectIO</li>
 * <li>objectNotIO</li>
 * <li>objectInput</li>
 * <li>objectOutput</li>
 * <li>objectFault</li>
 * <li>objectParam</li>
 * <li>objectTimer</li>
 * <li>objectVariable</li>
 * <li>objectSubsystemWithName</li>
 * <li>objectIOFaultTimerVariable</li>
 * <li>attributeenabled</li>
 * <li>lockParameterValues</li>
 * <li>objectAllObjectsWithoutRoot</li>
 * <li>objectAllObjects</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class Policy extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Policy instance() throws ViatraQueryException {
    if (INSTANCE == null) {
        INSTANCE = new Policy();
    }
    return INSTANCE;
  }
  
  private static Policy INSTANCE;
  
  private Policy() throws ViatraQueryException {
    querySpecifications.add(ContainsQuerySpecification.instance());
    querySpecifications.add(ObjectAllQuerySpecification.instance());
    querySpecifications.add(ObjectRootQuerySpecification.instance());
    querySpecifications.add(ObjectRootWithIdQuerySpecification.instance());
    querySpecifications.add(ReferenceitsInputsQuerySpecification.instance());
    querySpecifications.add(ReferenceitsOutputsQuerySpecification.instance());
    querySpecifications.add(ReferenceitsParamsQuerySpecification.instance());
    querySpecifications.add(ReferenceitsTimersQuerySpecification.instance());
    querySpecifications.add(ReferenceitsFaultsQuerySpecification.instance());
    querySpecifications.add(ReferenceitsVariablesQuerySpecification.instance());
    querySpecifications.add(ReferenceitsMainSubsystemsQuerySpecification.instance());
    querySpecifications.add(ObjectWTCQuerySpecification.instance());
    querySpecifications.add(ObjectIOQuerySpecification.instance());
    querySpecifications.add(ObjectNotIOQuerySpecification.instance());
    querySpecifications.add(ObjectInputQuerySpecification.instance());
    querySpecifications.add(ObjectOutputQuerySpecification.instance());
    querySpecifications.add(ObjectFaultQuerySpecification.instance());
    querySpecifications.add(ObjectParamQuerySpecification.instance());
    querySpecifications.add(ObjectTimerQuerySpecification.instance());
    querySpecifications.add(ObjectVariableQuerySpecification.instance());
    querySpecifications.add(ObjectSubsystemWithNameQuerySpecification.instance());
    querySpecifications.add(ObjectIOFaultTimerVariableQuerySpecification.instance());
    querySpecifications.add(AttributeenabledQuerySpecification.instance());
    querySpecifications.add(LockParameterValuesQuerySpecification.instance());
    querySpecifications.add(ObjectAllObjectsWithoutRootQuerySpecification.instance());
    querySpecifications.add(ObjectAllObjectsQuerySpecification.instance());
  }
  
  public ContainsQuerySpecification getContains() throws ViatraQueryException {
    return ContainsQuerySpecification.instance();
  }
  
  public ContainsMatcher getContains(final ViatraQueryEngine engine) throws ViatraQueryException {
    return ContainsMatcher.on(engine);
  }
  
  public ObjectAllQuerySpecification getObjectAll() throws ViatraQueryException {
    return ObjectAllQuerySpecification.instance();
  }
  
  public ObjectAllMatcher getObjectAll(final ViatraQueryEngine engine) throws ViatraQueryException {
    return ObjectAllMatcher.on(engine);
  }
  
  public ObjectRootQuerySpecification getObjectRoot() throws ViatraQueryException {
    return ObjectRootQuerySpecification.instance();
  }
  
  public ObjectRootMatcher getObjectRoot(final ViatraQueryEngine engine) throws ViatraQueryException {
    return ObjectRootMatcher.on(engine);
  }
  
  public ObjectRootWithIdQuerySpecification getObjectRootWithId() throws ViatraQueryException {
    return ObjectRootWithIdQuerySpecification.instance();
  }
  
  public ObjectRootWithIdMatcher getObjectRootWithId(final ViatraQueryEngine engine) throws ViatraQueryException {
    return ObjectRootWithIdMatcher.on(engine);
  }
  
  public ReferenceitsInputsQuerySpecification getReferenceitsInputs() throws ViatraQueryException {
    return ReferenceitsInputsQuerySpecification.instance();
  }
  
  public ReferenceitsInputsMatcher getReferenceitsInputs(final ViatraQueryEngine engine) throws ViatraQueryException {
    return ReferenceitsInputsMatcher.on(engine);
  }
  
  public ReferenceitsOutputsQuerySpecification getReferenceitsOutputs() throws ViatraQueryException {
    return ReferenceitsOutputsQuerySpecification.instance();
  }
  
  public ReferenceitsOutputsMatcher getReferenceitsOutputs(final ViatraQueryEngine engine) throws ViatraQueryException {
    return ReferenceitsOutputsMatcher.on(engine);
  }
  
  public ReferenceitsParamsQuerySpecification getReferenceitsParams() throws ViatraQueryException {
    return ReferenceitsParamsQuerySpecification.instance();
  }
  
  public ReferenceitsParamsMatcher getReferenceitsParams(final ViatraQueryEngine engine) throws ViatraQueryException {
    return ReferenceitsParamsMatcher.on(engine);
  }
  
  public ReferenceitsTimersQuerySpecification getReferenceitsTimers() throws ViatraQueryException {
    return ReferenceitsTimersQuerySpecification.instance();
  }
  
  public ReferenceitsTimersMatcher getReferenceitsTimers(final ViatraQueryEngine engine) throws ViatraQueryException {
    return ReferenceitsTimersMatcher.on(engine);
  }
  
  public ReferenceitsFaultsQuerySpecification getReferenceitsFaults() throws ViatraQueryException {
    return ReferenceitsFaultsQuerySpecification.instance();
  }
  
  public ReferenceitsFaultsMatcher getReferenceitsFaults(final ViatraQueryEngine engine) throws ViatraQueryException {
    return ReferenceitsFaultsMatcher.on(engine);
  }
  
  public ReferenceitsVariablesQuerySpecification getReferenceitsVariables() throws ViatraQueryException {
    return ReferenceitsVariablesQuerySpecification.instance();
  }
  
  public ReferenceitsVariablesMatcher getReferenceitsVariables(final ViatraQueryEngine engine) throws ViatraQueryException {
    return ReferenceitsVariablesMatcher.on(engine);
  }
  
  public ReferenceitsMainSubsystemsQuerySpecification getReferenceitsMainSubsystems() throws ViatraQueryException {
    return ReferenceitsMainSubsystemsQuerySpecification.instance();
  }
  
  public ReferenceitsMainSubsystemsMatcher getReferenceitsMainSubsystems(final ViatraQueryEngine engine) throws ViatraQueryException {
    return ReferenceitsMainSubsystemsMatcher.on(engine);
  }
  
  public ObjectWTCQuerySpecification getObjectWTC() throws ViatraQueryException {
    return ObjectWTCQuerySpecification.instance();
  }
  
  public ObjectWTCMatcher getObjectWTC(final ViatraQueryEngine engine) throws ViatraQueryException {
    return ObjectWTCMatcher.on(engine);
  }
  
  public ObjectIOQuerySpecification getObjectIO() throws ViatraQueryException {
    return ObjectIOQuerySpecification.instance();
  }
  
  public ObjectIOMatcher getObjectIO(final ViatraQueryEngine engine) throws ViatraQueryException {
    return ObjectIOMatcher.on(engine);
  }
  
  public ObjectNotIOQuerySpecification getObjectNotIO() throws ViatraQueryException {
    return ObjectNotIOQuerySpecification.instance();
  }
  
  public ObjectNotIOMatcher getObjectNotIO(final ViatraQueryEngine engine) throws ViatraQueryException {
    return ObjectNotIOMatcher.on(engine);
  }
  
  public ObjectInputQuerySpecification getObjectInput() throws ViatraQueryException {
    return ObjectInputQuerySpecification.instance();
  }
  
  public ObjectInputMatcher getObjectInput(final ViatraQueryEngine engine) throws ViatraQueryException {
    return ObjectInputMatcher.on(engine);
  }
  
  public ObjectOutputQuerySpecification getObjectOutput() throws ViatraQueryException {
    return ObjectOutputQuerySpecification.instance();
  }
  
  public ObjectOutputMatcher getObjectOutput(final ViatraQueryEngine engine) throws ViatraQueryException {
    return ObjectOutputMatcher.on(engine);
  }
  
  public ObjectFaultQuerySpecification getObjectFault() throws ViatraQueryException {
    return ObjectFaultQuerySpecification.instance();
  }
  
  public ObjectFaultMatcher getObjectFault(final ViatraQueryEngine engine) throws ViatraQueryException {
    return ObjectFaultMatcher.on(engine);
  }
  
  public ObjectParamQuerySpecification getObjectParam() throws ViatraQueryException {
    return ObjectParamQuerySpecification.instance();
  }
  
  public ObjectParamMatcher getObjectParam(final ViatraQueryEngine engine) throws ViatraQueryException {
    return ObjectParamMatcher.on(engine);
  }
  
  public ObjectTimerQuerySpecification getObjectTimer() throws ViatraQueryException {
    return ObjectTimerQuerySpecification.instance();
  }
  
  public ObjectTimerMatcher getObjectTimer(final ViatraQueryEngine engine) throws ViatraQueryException {
    return ObjectTimerMatcher.on(engine);
  }
  
  public ObjectVariableQuerySpecification getObjectVariable() throws ViatraQueryException {
    return ObjectVariableQuerySpecification.instance();
  }
  
  public ObjectVariableMatcher getObjectVariable(final ViatraQueryEngine engine) throws ViatraQueryException {
    return ObjectVariableMatcher.on(engine);
  }
  
  public ObjectSubsystemWithNameQuerySpecification getObjectSubsystemWithName() throws ViatraQueryException {
    return ObjectSubsystemWithNameQuerySpecification.instance();
  }
  
  public ObjectSubsystemWithNameMatcher getObjectSubsystemWithName(final ViatraQueryEngine engine) throws ViatraQueryException {
    return ObjectSubsystemWithNameMatcher.on(engine);
  }
  
  public ObjectIOFaultTimerVariableQuerySpecification getObjectIOFaultTimerVariable() throws ViatraQueryException {
    return ObjectIOFaultTimerVariableQuerySpecification.instance();
  }
  
  public ObjectIOFaultTimerVariableMatcher getObjectIOFaultTimerVariable(final ViatraQueryEngine engine) throws ViatraQueryException {
    return ObjectIOFaultTimerVariableMatcher.on(engine);
  }
  
  public AttributeenabledQuerySpecification getAttributeenabled() throws ViatraQueryException {
    return AttributeenabledQuerySpecification.instance();
  }
  
  public AttributeenabledMatcher getAttributeenabled(final ViatraQueryEngine engine) throws ViatraQueryException {
    return AttributeenabledMatcher.on(engine);
  }
  
  public LockParameterValuesQuerySpecification getLockParameterValues() throws ViatraQueryException {
    return LockParameterValuesQuerySpecification.instance();
  }
  
  public LockParameterValuesMatcher getLockParameterValues(final ViatraQueryEngine engine) throws ViatraQueryException {
    return LockParameterValuesMatcher.on(engine);
  }
  
  public ObjectAllObjectsWithoutRootQuerySpecification getObjectAllObjectsWithoutRoot() throws ViatraQueryException {
    return ObjectAllObjectsWithoutRootQuerySpecification.instance();
  }
  
  public ObjectAllObjectsWithoutRootMatcher getObjectAllObjectsWithoutRoot(final ViatraQueryEngine engine) throws ViatraQueryException {
    return ObjectAllObjectsWithoutRootMatcher.on(engine);
  }
  
  public ObjectAllObjectsQuerySpecification getObjectAllObjects() throws ViatraQueryException {
    return ObjectAllObjectsQuerySpecification.instance();
  }
  
  public ObjectAllObjectsMatcher getObjectAllObjects(final ViatraQueryEngine engine) throws ViatraQueryException {
    return ObjectAllObjectsMatcher.on(engine);
  }
}
