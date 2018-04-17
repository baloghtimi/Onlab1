/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy_domination_same_priority.vql
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
import org.mondo.collaboration.security.increment.policy.util.DominatedExplicitJudgementOnObject_at_1QuerySpecification;

/**
 * Pattern-specific match representation of the org.mondo.collaboration.security.increment.policy.dominatedExplicitJudgementOnObject_at_1 pattern,
 * to be used in conjunction with {@link DominatedExplicitJudgementOnObject_at_1Matcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see DominatedExplicitJudgementOnObject_at_1Matcher
 *  @see DominatedExplicitJudgementOnObject_at_1Processor
 * 
 */
@SuppressWarnings("all")
public abstract class DominatedExplicitJudgementOnObject_at_1Match extends BasePatternMatch {
  private String fUser;
  
  private EObject fObject;
  
  private OperationType fOperation;
  
  private AccessibilityLevel fDominatedAccess;
  
  private static List<String> parameterNames = makeImmutableList("user", "object", "operation", "dominatedAccess");
  
  private DominatedExplicitJudgementOnObject_at_1Match(final String pUser, final EObject pObject, final OperationType pOperation, final AccessibilityLevel pDominatedAccess) {
    this.fUser = pUser;
    this.fObject = pObject;
    this.fOperation = pOperation;
    this.fDominatedAccess = pDominatedAccess;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("user".equals(parameterName)) return this.fUser;
    if ("object".equals(parameterName)) return this.fObject;
    if ("operation".equals(parameterName)) return this.fOperation;
    if ("dominatedAccess".equals(parameterName)) return this.fDominatedAccess;
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
  
  public AccessibilityLevel getDominatedAccess() {
    return this.fDominatedAccess;
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
    if ("dominatedAccess".equals(parameterName) ) {
        this.fDominatedAccess = (AccessibilityLevel) newValue;
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
  
  public void setDominatedAccess(final AccessibilityLevel pDominatedAccess) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fDominatedAccess = pDominatedAccess;
  }
  
  @Override
  public String patternName() {
    return "org.mondo.collaboration.security.increment.policy.dominatedExplicitJudgementOnObject_at_1";
  }
  
  @Override
  public List<String> parameterNames() {
    return DominatedExplicitJudgementOnObject_at_1Match.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fUser, fObject, fOperation, fDominatedAccess};
  }
  
  @Override
  public DominatedExplicitJudgementOnObject_at_1Match toImmutable() {
    return isMutable() ? newMatch(fUser, fObject, fOperation, fDominatedAccess) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"user\"=" + prettyPrintValue(fUser) + ", ");
    result.append("\"object\"=" + prettyPrintValue(fObject) + ", ");
    result.append("\"operation\"=" + prettyPrintValue(fOperation) + ", ");
    result.append("\"dominatedAccess\"=" + prettyPrintValue(fDominatedAccess));
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    return Objects.hash (fUser, fObject, fOperation, fDominatedAccess);
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
        return true;
    if (obj == null) {
        return false;
    }
    if ((obj instanceof DominatedExplicitJudgementOnObject_at_1Match)) {
        DominatedExplicitJudgementOnObject_at_1Match other = (DominatedExplicitJudgementOnObject_at_1Match) obj;
        return Objects.equals(fUser, other.fUser) && Objects.equals(fObject, other.fObject) && Objects.equals(fOperation, other.fOperation) && Objects.equals(fDominatedAccess, other.fDominatedAccess);
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
  public DominatedExplicitJudgementOnObject_at_1QuerySpecification specification() {
    try {
        return DominatedExplicitJudgementOnObject_at_1QuerySpecification.instance();
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
  public static DominatedExplicitJudgementOnObject_at_1Match newEmptyMatch() {
    return new Mutable(null, null, null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pObject the fixed value of pattern parameter object, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pDominatedAccess the fixed value of pattern parameter dominatedAccess, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static DominatedExplicitJudgementOnObject_at_1Match newMutableMatch(final String pUser, final EObject pObject, final OperationType pOperation, final AccessibilityLevel pDominatedAccess) {
    return new Mutable(pUser, pObject, pOperation, pDominatedAccess);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pObject the fixed value of pattern parameter object, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pDominatedAccess the fixed value of pattern parameter dominatedAccess, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static DominatedExplicitJudgementOnObject_at_1Match newMatch(final String pUser, final EObject pObject, final OperationType pOperation, final AccessibilityLevel pDominatedAccess) {
    return new Immutable(pUser, pObject, pOperation, pDominatedAccess);
  }
  
  private static final class Mutable extends DominatedExplicitJudgementOnObject_at_1Match {
    Mutable(final String pUser, final EObject pObject, final OperationType pOperation, final AccessibilityLevel pDominatedAccess) {
      super(pUser, pObject, pOperation, pDominatedAccess);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends DominatedExplicitJudgementOnObject_at_1Match {
    Immutable(final String pUser, final EObject pObject, final OperationType pOperation, final AccessibilityLevel pDominatedAccess) {
      super(pUser, pObject, pOperation, pDominatedAccess);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
