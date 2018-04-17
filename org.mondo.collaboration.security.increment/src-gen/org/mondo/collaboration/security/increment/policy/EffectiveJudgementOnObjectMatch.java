/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy_effective_judgement.vql
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
import org.mondo.collaboration.security.increment.policy.util.EffectiveJudgementOnObjectQuerySpecification;

/**
 * Pattern-specific match representation of the org.mondo.collaboration.security.increment.policy.effectiveJudgementOnObject pattern,
 * to be used in conjunction with {@link EffectiveJudgementOnObjectMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see EffectiveJudgementOnObjectMatcher
 *  @see EffectiveJudgementOnObjectProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class EffectiveJudgementOnObjectMatch extends BasePatternMatch {
  private String fUser;
  
  private EObject fObject;
  
  private OperationType fOperation;
  
  private AccessibilityLevel fAccess;
  
  private static List<String> parameterNames = makeImmutableList("user", "object", "operation", "access");
  
  private EffectiveJudgementOnObjectMatch(final String pUser, final EObject pObject, final OperationType pOperation, final AccessibilityLevel pAccess) {
    this.fUser = pUser;
    this.fObject = pObject;
    this.fOperation = pOperation;
    this.fAccess = pAccess;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("user".equals(parameterName)) return this.fUser;
    if ("object".equals(parameterName)) return this.fObject;
    if ("operation".equals(parameterName)) return this.fOperation;
    if ("access".equals(parameterName)) return this.fAccess;
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
  
  @Override
  public String patternName() {
    return "org.mondo.collaboration.security.increment.policy.effectiveJudgementOnObject";
  }
  
  @Override
  public List<String> parameterNames() {
    return EffectiveJudgementOnObjectMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fUser, fObject, fOperation, fAccess};
  }
  
  @Override
  public EffectiveJudgementOnObjectMatch toImmutable() {
    return isMutable() ? newMatch(fUser, fObject, fOperation, fAccess) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"user\"=" + prettyPrintValue(fUser) + ", ");
    result.append("\"object\"=" + prettyPrintValue(fObject) + ", ");
    result.append("\"operation\"=" + prettyPrintValue(fOperation) + ", ");
    result.append("\"access\"=" + prettyPrintValue(fAccess));
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    return Objects.hash (fUser, fObject, fOperation, fAccess);
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
        return true;
    if (obj == null) {
        return false;
    }
    if ((obj instanceof EffectiveJudgementOnObjectMatch)) {
        EffectiveJudgementOnObjectMatch other = (EffectiveJudgementOnObjectMatch) obj;
        return Objects.equals(fUser, other.fUser) && Objects.equals(fObject, other.fObject) && Objects.equals(fOperation, other.fOperation) && Objects.equals(fAccess, other.fAccess);
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
  public EffectiveJudgementOnObjectQuerySpecification specification() {
    try {
        return EffectiveJudgementOnObjectQuerySpecification.instance();
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
  public static EffectiveJudgementOnObjectMatch newEmptyMatch() {
    return new Mutable(null, null, null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pObject the fixed value of pattern parameter object, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pAccess the fixed value of pattern parameter access, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static EffectiveJudgementOnObjectMatch newMutableMatch(final String pUser, final EObject pObject, final OperationType pOperation, final AccessibilityLevel pAccess) {
    return new Mutable(pUser, pObject, pOperation, pAccess);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pObject the fixed value of pattern parameter object, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pAccess the fixed value of pattern parameter access, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static EffectiveJudgementOnObjectMatch newMatch(final String pUser, final EObject pObject, final OperationType pOperation, final AccessibilityLevel pAccess) {
    return new Immutable(pUser, pObject, pOperation, pAccess);
  }
  
  private static final class Mutable extends EffectiveJudgementOnObjectMatch {
    Mutable(final String pUser, final EObject pObject, final OperationType pOperation, final AccessibilityLevel pAccess) {
      super(pUser, pObject, pOperation, pAccess);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends EffectiveJudgementOnObjectMatch {
    Immutable(final String pUser, final EObject pObject, final OperationType pOperation, final AccessibilityLevel pAccess) {
      super(pUser, pObject, pOperation, pAccess);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
