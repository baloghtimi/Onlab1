/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy_explicit_judgement.vql
 */
package org.mondo.collaboration.security.increment.policy;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.mondo.collaboration.policy.rules.AccessibilityLevel;
import org.mondo.collaboration.policy.rules.OperationType;
import org.mondo.collaboration.security.increment.policy.util.ExplicitJudgementOnObjectQuerySpecification;

/**
 * Pattern-specific match representation of the org.mondo.collaboration.security.increment.policy.explicitJudgementOnObject pattern,
 * to be used in conjunction with {@link ExplicitJudgementOnObjectMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see ExplicitJudgementOnObjectMatcher
 *  @see ExplicitJudgementOnObjectProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class ExplicitJudgementOnObjectMatch extends BasePatternMatch {
  private String fUser;
  
  private EObject fObject;
  
  private OperationType fOperation;
  
  private AccessibilityLevel fAccess;
  
  private Integer fPriority;
  
  private static List<String> parameterNames = makeImmutableList("user", "object", "operation", "access", "priority");
  
  private ExplicitJudgementOnObjectMatch(final String pUser, final EObject pObject, final OperationType pOperation, final AccessibilityLevel pAccess, final Integer pPriority) {
    this.fUser = pUser;
    this.fObject = pObject;
    this.fOperation = pOperation;
    this.fAccess = pAccess;
    this.fPriority = pPriority;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("user".equals(parameterName)) return this.fUser;
    if ("object".equals(parameterName)) return this.fObject;
    if ("operation".equals(parameterName)) return this.fOperation;
    if ("access".equals(parameterName)) return this.fAccess;
    if ("priority".equals(parameterName)) return this.fPriority;
    return null;
  }
  
  public String getUser() {
    return this.fUser;
  }
  
  public EObject getObject() {
    return this.fObject;
  }
  
  public OperationType getOperation() {
    return this.fOperation;
  }
  
  public AccessibilityLevel getAccess() {
    return this.fAccess;
  }
  
  public Integer getPriority() {
    return this.fPriority;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("user".equals(parameterName) ) {
        this.fUser = (String) newValue;
        return true;
    }
    if ("object".equals(parameterName) ) {
        this.fObject = (EObject) newValue;
        return true;
    }
    if ("operation".equals(parameterName) ) {
        this.fOperation = (OperationType) newValue;
        return true;
    }
    if ("access".equals(parameterName) ) {
        this.fAccess = (AccessibilityLevel) newValue;
        return true;
    }
    if ("priority".equals(parameterName) ) {
        this.fPriority = (Integer) newValue;
        return true;
    }
    return false;
  }
  
  public void setUser(final String pUser) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fUser = pUser;
  }
  
  public void setObject(final EObject pObject) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fObject = pObject;
  }
  
  public void setOperation(final OperationType pOperation) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fOperation = pOperation;
  }
  
  public void setAccess(final AccessibilityLevel pAccess) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fAccess = pAccess;
  }
  
  public void setPriority(final Integer pPriority) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fPriority = pPriority;
  }
  
  @Override
  public String patternName() {
    return "org.mondo.collaboration.security.increment.policy.explicitJudgementOnObject";
  }
  
  @Override
  public List<String> parameterNames() {
    return ExplicitJudgementOnObjectMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fUser, fObject, fOperation, fAccess, fPriority};
  }
  
  @Override
  public ExplicitJudgementOnObjectMatch toImmutable() {
    return isMutable() ? newMatch(fUser, fObject, fOperation, fAccess, fPriority) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"user\"=" + prettyPrintValue(fUser) + ", ");
    result.append("\"object\"=" + prettyPrintValue(fObject) + ", ");
    result.append("\"operation\"=" + prettyPrintValue(fOperation) + ", ");
    result.append("\"access\"=" + prettyPrintValue(fAccess) + ", ");
    result.append("\"priority\"=" + prettyPrintValue(fPriority));
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    return Objects.hash (fUser, fObject, fOperation, fAccess, fPriority);
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
        return true;
    if (obj == null) {
        return false;
    }
    if ((obj instanceof ExplicitJudgementOnObjectMatch)) {
        ExplicitJudgementOnObjectMatch other = (ExplicitJudgementOnObjectMatch) obj;
        return Objects.equals(fUser, other.fUser) && Objects.equals(fObject, other.fObject) && Objects.equals(fOperation, other.fOperation) && Objects.equals(fAccess, other.fAccess) && Objects.equals(fPriority, other.fPriority);
    } else {
        // this should be infrequent
        if (!(obj instanceof IPatternMatch)) {
            return false;
        }
        IPatternMatch otherSig  = (IPatternMatch) obj;
        return Objects.equals(specification(), otherSig.specification()) && Arrays.deepEquals(toArray(), otherSig.toArray());
    }
  }
  
  @Override
  public ExplicitJudgementOnObjectQuerySpecification specification() {
    try {
        return ExplicitJudgementOnObjectQuerySpecification.instance();
    } catch (ViatraQueryException ex) {
         // This cannot happen, as the match object can only be instantiated if the query specification exists
         throw new IllegalStateException (ex);
    }
  }
  
  /**
   * Returns an empty, mutable match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @return the empty match.
   * 
   */
  public static ExplicitJudgementOnObjectMatch newEmptyMatch() {
    return new Mutable(null, null, null, null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pObject the fixed value of pattern parameter object, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pAccess the fixed value of pattern parameter access, or null if not bound.
   * @param pPriority the fixed value of pattern parameter priority, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static ExplicitJudgementOnObjectMatch newMutableMatch(final String pUser, final EObject pObject, final OperationType pOperation, final AccessibilityLevel pAccess, final Integer pPriority) {
    return new Mutable(pUser, pObject, pOperation, pAccess, pPriority);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pObject the fixed value of pattern parameter object, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pAccess the fixed value of pattern parameter access, or null if not bound.
   * @param pPriority the fixed value of pattern parameter priority, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static ExplicitJudgementOnObjectMatch newMatch(final String pUser, final EObject pObject, final OperationType pOperation, final AccessibilityLevel pAccess, final Integer pPriority) {
    return new Immutable(pUser, pObject, pOperation, pAccess, pPriority);
  }
  
  private static final class Mutable extends ExplicitJudgementOnObjectMatch {
    Mutable(final String pUser, final EObject pObject, final OperationType pOperation, final AccessibilityLevel pAccess, final Integer pPriority) {
      super(pUser, pObject, pOperation, pAccess, pPriority);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends ExplicitJudgementOnObjectMatch {
    Immutable(final String pUser, final EObject pObject, final OperationType pOperation, final AccessibilityLevel pAccess, final Integer pPriority) {
      super(pUser, pObject, pOperation, pAccess, pPriority);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
