/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy_gen.vql
 */
package org.mondo.collaboration.security.increment.policy;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.mondo.collaboration.security.increment.policy.util.ExplicitJudgementQuerySpecification;
import org.mondo.collaboration.security.increment.vocabulary.AccessibilityLevel;
import org.mondo.collaboration.security.increment.vocabulary.OperationType;

/**
 * Pattern-specific match representation of the org.mondo.collaboration.security.increment.policy.explicitJudgement pattern,
 * to be used in conjunction with {@link ExplicitJudgementMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see ExplicitJudgementMatcher
 *  @see ExplicitJudgementProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class ExplicitJudgementMatch extends BasePatternMatch {
  private String fUser;
  
  private EObject fAsset;
  
  private OperationType fOperation;
  
  private AccessibilityLevel fAccess;
  
  private Integer fPriority;
  
  private static List<String> parameterNames = makeImmutableList("user", "asset", "operation", "access", "priority");
  
  private ExplicitJudgementMatch(final String pUser, final EObject pAsset, final OperationType pOperation, final AccessibilityLevel pAccess, final Integer pPriority) {
    this.fUser = pUser;
    this.fAsset = pAsset;
    this.fOperation = pOperation;
    this.fAccess = pAccess;
    this.fPriority = pPriority;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("user".equals(parameterName)) return this.fUser;
    if ("asset".equals(parameterName)) return this.fAsset;
    if ("operation".equals(parameterName)) return this.fOperation;
    if ("access".equals(parameterName)) return this.fAccess;
    if ("priority".equals(parameterName)) return this.fPriority;
    return null;
  }
  
  public String getUser() {
    return this.fUser;
  }
  
  public EObject getAsset() {
    return this.fAsset;
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
    if ("asset".equals(parameterName) ) {
        this.fAsset = (EObject) newValue;
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
  
  public void setAsset(final EObject pAsset) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fAsset = pAsset;
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
    return "org.mondo.collaboration.security.increment.policy.explicitJudgement";
  }
  
  @Override
  public List<String> parameterNames() {
    return ExplicitJudgementMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fUser, fAsset, fOperation, fAccess, fPriority};
  }
  
  @Override
  public ExplicitJudgementMatch toImmutable() {
    return isMutable() ? newMatch(fUser, fAsset, fOperation, fAccess, fPriority) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"user\"=" + prettyPrintValue(fUser) + ", ");
    result.append("\"asset\"=" + prettyPrintValue(fAsset) + ", ");
    result.append("\"operation\"=" + prettyPrintValue(fOperation) + ", ");
    result.append("\"access\"=" + prettyPrintValue(fAccess) + ", ");
    result.append("\"priority\"=" + prettyPrintValue(fPriority));
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    return Objects.hash (fUser, fAsset, fOperation, fAccess, fPriority);
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
        return true;
    if (obj == null) {
        return false;
    }
    if ((obj instanceof ExplicitJudgementMatch)) {
        ExplicitJudgementMatch other = (ExplicitJudgementMatch) obj;
        return Objects.equals(fUser, other.fUser) && Objects.equals(fAsset, other.fAsset) && Objects.equals(fOperation, other.fOperation) && Objects.equals(fAccess, other.fAccess) && Objects.equals(fPriority, other.fPriority);
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
  public ExplicitJudgementQuerySpecification specification() {
    try {
        return ExplicitJudgementQuerySpecification.instance();
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
  public static ExplicitJudgementMatch newEmptyMatch() {
    return new Mutable(null, null, null, null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pAsset the fixed value of pattern parameter asset, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pAccess the fixed value of pattern parameter access, or null if not bound.
   * @param pPriority the fixed value of pattern parameter priority, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static ExplicitJudgementMatch newMutableMatch(final String pUser, final EObject pAsset, final OperationType pOperation, final AccessibilityLevel pAccess, final Integer pPriority) {
    return new Mutable(pUser, pAsset, pOperation, pAccess, pPriority);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pAsset the fixed value of pattern parameter asset, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pAccess the fixed value of pattern parameter access, or null if not bound.
   * @param pPriority the fixed value of pattern parameter priority, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static ExplicitJudgementMatch newMatch(final String pUser, final EObject pAsset, final OperationType pOperation, final AccessibilityLevel pAccess, final Integer pPriority) {
    return new Immutable(pUser, pAsset, pOperation, pAccess, pPriority);
  }
  
  private static final class Mutable extends ExplicitJudgementMatch {
    Mutable(final String pUser, final EObject pAsset, final OperationType pOperation, final AccessibilityLevel pAccess, final Integer pPriority) {
      super(pUser, pAsset, pOperation, pAccess, pPriority);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends ExplicitJudgementMatch {
    Immutable(final String pUser, final EObject pAsset, final OperationType pOperation, final AccessibilityLevel pAccess, final Integer pPriority) {
      super(pUser, pAsset, pOperation, pAccess, pPriority);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
