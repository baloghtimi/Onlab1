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
import org.mondo.collaboration.security.increment.policy.util.StrongConsequence_at_0QuerySpecification;
import org.mondo.collaboration.security.increment.vocabulary.AccessibilityLevel;
import org.mondo.collaboration.security.increment.vocabulary.OperationType;

/**
 * Pattern-specific match representation of the org.mondo.collaboration.security.increment.policy.strongConsequence_at_0 pattern,
 * to be used in conjunction with {@link StrongConsequence_at_0Matcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see StrongConsequence_at_0Matcher
 *  @see StrongConsequence_at_0Processor
 * 
 */
@SuppressWarnings("all")
public abstract class StrongConsequence_at_0Match extends BasePatternMatch {
  private String fUser;
  
  private EObject fDepAsset;
  
  private OperationType fDepOp;
  
  private AccessibilityLevel fDepAccess;
  
  private EObject fDomAsset;
  
  private OperationType fDomOp;
  
  private AccessibilityLevel fDomAccess;
  
  private static List<String> parameterNames = makeImmutableList("user", "depAsset", "depOp", "depAccess", "domAsset", "domOp", "domAccess");
  
  private StrongConsequence_at_0Match(final String pUser, final EObject pDepAsset, final OperationType pDepOp, final AccessibilityLevel pDepAccess, final EObject pDomAsset, final OperationType pDomOp, final AccessibilityLevel pDomAccess) {
    this.fUser = pUser;
    this.fDepAsset = pDepAsset;
    this.fDepOp = pDepOp;
    this.fDepAccess = pDepAccess;
    this.fDomAsset = pDomAsset;
    this.fDomOp = pDomOp;
    this.fDomAccess = pDomAccess;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("user".equals(parameterName)) return this.fUser;
    if ("depAsset".equals(parameterName)) return this.fDepAsset;
    if ("depOp".equals(parameterName)) return this.fDepOp;
    if ("depAccess".equals(parameterName)) return this.fDepAccess;
    if ("domAsset".equals(parameterName)) return this.fDomAsset;
    if ("domOp".equals(parameterName)) return this.fDomOp;
    if ("domAccess".equals(parameterName)) return this.fDomAccess;
    return null;
  }
  
  public String getUser() {
    return this.fUser;
  }
  
  public EObject getDepAsset() {
    return this.fDepAsset;
  }
  
  public OperationType getDepOp() {
    return this.fDepOp;
  }
  
  public AccessibilityLevel getDepAccess() {
    return this.fDepAccess;
  }
  
  public EObject getDomAsset() {
    return this.fDomAsset;
  }
  
  public OperationType getDomOp() {
    return this.fDomOp;
  }
  
  public AccessibilityLevel getDomAccess() {
    return this.fDomAccess;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("user".equals(parameterName) ) {
        this.fUser = (String) newValue;
        return true;
    }
    if ("depAsset".equals(parameterName) ) {
        this.fDepAsset = (EObject) newValue;
        return true;
    }
    if ("depOp".equals(parameterName) ) {
        this.fDepOp = (OperationType) newValue;
        return true;
    }
    if ("depAccess".equals(parameterName) ) {
        this.fDepAccess = (AccessibilityLevel) newValue;
        return true;
    }
    if ("domAsset".equals(parameterName) ) {
        this.fDomAsset = (EObject) newValue;
        return true;
    }
    if ("domOp".equals(parameterName) ) {
        this.fDomOp = (OperationType) newValue;
        return true;
    }
    if ("domAccess".equals(parameterName) ) {
        this.fDomAccess = (AccessibilityLevel) newValue;
        return true;
    }
    return false;
  }
  
  public void setUser(final String pUser) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fUser = pUser;
  }
  
  public void setDepAsset(final EObject pDepAsset) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fDepAsset = pDepAsset;
  }
  
  public void setDepOp(final OperationType pDepOp) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fDepOp = pDepOp;
  }
  
  public void setDepAccess(final AccessibilityLevel pDepAccess) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fDepAccess = pDepAccess;
  }
  
  public void setDomAsset(final EObject pDomAsset) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fDomAsset = pDomAsset;
  }
  
  public void setDomOp(final OperationType pDomOp) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fDomOp = pDomOp;
  }
  
  public void setDomAccess(final AccessibilityLevel pDomAccess) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fDomAccess = pDomAccess;
  }
  
  @Override
  public String patternName() {
    return "org.mondo.collaboration.security.increment.policy.strongConsequence_at_0";
  }
  
  @Override
  public List<String> parameterNames() {
    return StrongConsequence_at_0Match.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fUser, fDepAsset, fDepOp, fDepAccess, fDomAsset, fDomOp, fDomAccess};
  }
  
  @Override
  public StrongConsequence_at_0Match toImmutable() {
    return isMutable() ? newMatch(fUser, fDepAsset, fDepOp, fDepAccess, fDomAsset, fDomOp, fDomAccess) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"user\"=" + prettyPrintValue(fUser) + ", ");
    result.append("\"depAsset\"=" + prettyPrintValue(fDepAsset) + ", ");
    result.append("\"depOp\"=" + prettyPrintValue(fDepOp) + ", ");
    result.append("\"depAccess\"=" + prettyPrintValue(fDepAccess) + ", ");
    result.append("\"domAsset\"=" + prettyPrintValue(fDomAsset) + ", ");
    result.append("\"domOp\"=" + prettyPrintValue(fDomOp) + ", ");
    result.append("\"domAccess\"=" + prettyPrintValue(fDomAccess));
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    return Objects.hash (fUser, fDepAsset, fDepOp, fDepAccess, fDomAsset, fDomOp, fDomAccess);
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
        return true;
    if (obj == null) {
        return false;
    }
    if ((obj instanceof StrongConsequence_at_0Match)) {
        StrongConsequence_at_0Match other = (StrongConsequence_at_0Match) obj;
        return Objects.equals(fUser, other.fUser) && Objects.equals(fDepAsset, other.fDepAsset) && Objects.equals(fDepOp, other.fDepOp) && Objects.equals(fDepAccess, other.fDepAccess) && Objects.equals(fDomAsset, other.fDomAsset) && Objects.equals(fDomOp, other.fDomOp) && Objects.equals(fDomAccess, other.fDomAccess);
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
  public StrongConsequence_at_0QuerySpecification specification() {
    try {
        return StrongConsequence_at_0QuerySpecification.instance();
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
  public static StrongConsequence_at_0Match newEmptyMatch() {
    return new Mutable(null, null, null, null, null, null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pDepAsset the fixed value of pattern parameter depAsset, or null if not bound.
   * @param pDepOp the fixed value of pattern parameter depOp, or null if not bound.
   * @param pDepAccess the fixed value of pattern parameter depAccess, or null if not bound.
   * @param pDomAsset the fixed value of pattern parameter domAsset, or null if not bound.
   * @param pDomOp the fixed value of pattern parameter domOp, or null if not bound.
   * @param pDomAccess the fixed value of pattern parameter domAccess, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static StrongConsequence_at_0Match newMutableMatch(final String pUser, final EObject pDepAsset, final OperationType pDepOp, final AccessibilityLevel pDepAccess, final EObject pDomAsset, final OperationType pDomOp, final AccessibilityLevel pDomAccess) {
    return new Mutable(pUser, pDepAsset, pDepOp, pDepAccess, pDomAsset, pDomOp, pDomAccess);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pDepAsset the fixed value of pattern parameter depAsset, or null if not bound.
   * @param pDepOp the fixed value of pattern parameter depOp, or null if not bound.
   * @param pDepAccess the fixed value of pattern parameter depAccess, or null if not bound.
   * @param pDomAsset the fixed value of pattern parameter domAsset, or null if not bound.
   * @param pDomOp the fixed value of pattern parameter domOp, or null if not bound.
   * @param pDomAccess the fixed value of pattern parameter domAccess, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static StrongConsequence_at_0Match newMatch(final String pUser, final EObject pDepAsset, final OperationType pDepOp, final AccessibilityLevel pDepAccess, final EObject pDomAsset, final OperationType pDomOp, final AccessibilityLevel pDomAccess) {
    return new Immutable(pUser, pDepAsset, pDepOp, pDepAccess, pDomAsset, pDomOp, pDomAccess);
  }
  
  private static final class Mutable extends StrongConsequence_at_0Match {
    Mutable(final String pUser, final EObject pDepAsset, final OperationType pDepOp, final AccessibilityLevel pDepAccess, final EObject pDomAsset, final OperationType pDomOp, final AccessibilityLevel pDomAccess) {
      super(pUser, pDepAsset, pDepOp, pDepAccess, pDomAsset, pDomOp, pDomAccess);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends StrongConsequence_at_0Match {
    Immutable(final String pUser, final EObject pDepAsset, final OperationType pDepOp, final AccessibilityLevel pDepAccess, final EObject pDomAsset, final OperationType pDomOp, final AccessibilityLevel pDomAccess) {
      super(pUser, pDepAsset, pDepOp, pDepAccess, pDomAsset, pDomOp, pDomAccess);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
