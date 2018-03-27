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
import org.mondo.collaboration.security.increment.policy.util.Domination_by_1QuerySpecification;
import org.mondo.collaboration.security.increment.vocabulary.AccessibilityLevel;
import org.mondo.collaboration.security.increment.vocabulary.OperationType;

/**
 * Pattern-specific match representation of the org.mondo.collaboration.security.increment.policy.domination_by_1 pattern,
 * to be used in conjunction with {@link Domination_by_1Matcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see Domination_by_1Matcher
 *  @see Domination_by_1Processor
 * 
 */
@SuppressWarnings("all")
public abstract class Domination_by_1Match extends BasePatternMatch {
  private String fUser;
  
  private EObject fAsset;
  
  private Object fOperation;
  
  private AccessibilityLevel fDominatedAccess;
  
  private AccessibilityLevel fPrevailingAccess;
  
  private static List<String> parameterNames = makeImmutableList("user", "asset", "operation", "dominatedAccess", "prevailingAccess");
  
  private Domination_by_1Match(final String pUser, final EObject pAsset, final Object pOperation, final AccessibilityLevel pDominatedAccess, final AccessibilityLevel pPrevailingAccess) {
    this.fUser = pUser;
    this.fAsset = pAsset;
    this.fOperation = pOperation;
    this.fDominatedAccess = pDominatedAccess;
    this.fPrevailingAccess = pPrevailingAccess;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("user".equals(parameterName)) return this.fUser;
    if ("asset".equals(parameterName)) return this.fAsset;
    if ("operation".equals(parameterName)) return this.fOperation;
    if ("dominatedAccess".equals(parameterName)) return this.fDominatedAccess;
    if ("prevailingAccess".equals(parameterName)) return this.fPrevailingAccess;
    return null;
  }
  
  public String getUser() {
    return this.fUser;
  }
  
  public EObject getAsset() {
    return this.fAsset;
  }
  
  public Object getOperation() {
    return this.fOperation;
  }
  
  public AccessibilityLevel getDominatedAccess() {
    return this.fDominatedAccess;
  }
  
  public AccessibilityLevel getPrevailingAccess() {
    return this.fPrevailingAccess;
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
    if ("dominatedAccess".equals(parameterName) ) {
        this.fDominatedAccess = (AccessibilityLevel) newValue;
        return true;
    }
    if ("prevailingAccess".equals(parameterName) ) {
        this.fPrevailingAccess = (AccessibilityLevel) newValue;
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
  
  public void setOperation(final Object pOperation) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fOperation = pOperation;
  }
  
  public void setDominatedAccess(final AccessibilityLevel pDominatedAccess) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fDominatedAccess = pDominatedAccess;
  }
  
  public void setPrevailingAccess(final AccessibilityLevel pPrevailingAccess) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fPrevailingAccess = pPrevailingAccess;
  }
  
  @Override
  public String patternName() {
    return "org.mondo.collaboration.security.increment.policy.domination_by_1";
  }
  
  @Override
  public List<String> parameterNames() {
    return Domination_by_1Match.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fUser, fAsset, fOperation, fDominatedAccess, fPrevailingAccess};
  }
  
  @Override
  public Domination_by_1Match toImmutable() {
    return isMutable() ? newMatch(fUser, fAsset, fOperation, fDominatedAccess, fPrevailingAccess) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"user\"=" + prettyPrintValue(fUser) + ", ");
    result.append("\"asset\"=" + prettyPrintValue(fAsset) + ", ");
    result.append("\"operation\"=" + prettyPrintValue(fOperation) + ", ");
    result.append("\"dominatedAccess\"=" + prettyPrintValue(fDominatedAccess) + ", ");
    result.append("\"prevailingAccess\"=" + prettyPrintValue(fPrevailingAccess));
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    return Objects.hash (fUser, fAsset, fOperation, fDominatedAccess, fPrevailingAccess);
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
        return true;
    if (obj == null) {
        return false;
    }
    if ((obj instanceof Domination_by_1Match)) {
        Domination_by_1Match other = (Domination_by_1Match) obj;
        return Objects.equals(fUser, other.fUser) && Objects.equals(fAsset, other.fAsset) && Objects.equals(fOperation, other.fOperation) && Objects.equals(fDominatedAccess, other.fDominatedAccess) && Objects.equals(fPrevailingAccess, other.fPrevailingAccess);
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
  public Domination_by_1QuerySpecification specification() {
    try {
        return Domination_by_1QuerySpecification.instance();
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
  public static Domination_by_1Match newEmptyMatch() {
    return new Mutable(null, null, null, null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pAsset the fixed value of pattern parameter asset, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pDominatedAccess the fixed value of pattern parameter dominatedAccess, or null if not bound.
   * @param pPrevailingAccess the fixed value of pattern parameter prevailingAccess, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static Domination_by_1Match newMutableMatch(final String pUser, final EObject pAsset, final Object pOperation, final AccessibilityLevel pDominatedAccess, final AccessibilityLevel pPrevailingAccess) {
    return new Mutable(pUser, pAsset, pOperation, pDominatedAccess, pPrevailingAccess);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pAsset the fixed value of pattern parameter asset, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pDominatedAccess the fixed value of pattern parameter dominatedAccess, or null if not bound.
   * @param pPrevailingAccess the fixed value of pattern parameter prevailingAccess, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static Domination_by_1Match newMatch(final String pUser, final EObject pAsset, final Object pOperation, final AccessibilityLevel pDominatedAccess, final AccessibilityLevel pPrevailingAccess) {
    return new Immutable(pUser, pAsset, pOperation, pDominatedAccess, pPrevailingAccess);
  }
  
  private static final class Mutable extends Domination_by_1Match {
    Mutable(final String pUser, final EObject pAsset, final Object pOperation, final AccessibilityLevel pDominatedAccess, final AccessibilityLevel pPrevailingAccess) {
      super(pUser, pAsset, pOperation, pDominatedAccess, pPrevailingAccess);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends Domination_by_1Match {
    Immutable(final String pUser, final EObject pAsset, final Object pOperation, final AccessibilityLevel pDominatedAccess, final AccessibilityLevel pPrevailingAccess) {
      super(pUser, pAsset, pOperation, pDominatedAccess, pPrevailingAccess);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
