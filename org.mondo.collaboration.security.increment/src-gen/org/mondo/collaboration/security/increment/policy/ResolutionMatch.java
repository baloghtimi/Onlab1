/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy_gen.vql
 */
package org.mondo.collaboration.security.increment.policy;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.mondo.collaboration.security.increment.policy.util.ResolutionQuerySpecification;
import org.mondo.collaboration.security.increment.vocabulary.AccessibilityLevel;

/**
 * Pattern-specific match representation of the org.mondo.collaboration.security.increment.policy.resolution pattern,
 * to be used in conjunction with {@link ResolutionMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see ResolutionMatcher
 *  @see ResolutionProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class ResolutionMatch extends BasePatternMatch {
  private AccessibilityLevel fDominatedAccess;
  
  private AccessibilityLevel fPrevailingAccess;
  
  private static List<String> parameterNames = makeImmutableList("dominatedAccess", "prevailingAccess");
  
  private ResolutionMatch(final AccessibilityLevel pDominatedAccess, final AccessibilityLevel pPrevailingAccess) {
    this.fDominatedAccess = pDominatedAccess;
    this.fPrevailingAccess = pPrevailingAccess;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("dominatedAccess".equals(parameterName)) return this.fDominatedAccess;
    if ("prevailingAccess".equals(parameterName)) return this.fPrevailingAccess;
    return null;
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
    return "org.mondo.collaboration.security.increment.policy.resolution";
  }
  
  @Override
  public List<String> parameterNames() {
    return ResolutionMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fDominatedAccess, fPrevailingAccess};
  }
  
  @Override
  public ResolutionMatch toImmutable() {
    return isMutable() ? newMatch(fDominatedAccess, fPrevailingAccess) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"dominatedAccess\"=" + prettyPrintValue(fDominatedAccess) + ", ");
    result.append("\"prevailingAccess\"=" + prettyPrintValue(fPrevailingAccess));
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    return Objects.hash (fDominatedAccess, fPrevailingAccess);
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
        return true;
    if (obj == null) {
        return false;
    }
    if ((obj instanceof ResolutionMatch)) {
        ResolutionMatch other = (ResolutionMatch) obj;
        return Objects.equals(fDominatedAccess, other.fDominatedAccess) && Objects.equals(fPrevailingAccess, other.fPrevailingAccess);
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
  public ResolutionQuerySpecification specification() {
    try {
        return ResolutionQuerySpecification.instance();
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
  public static ResolutionMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pDominatedAccess the fixed value of pattern parameter dominatedAccess, or null if not bound.
   * @param pPrevailingAccess the fixed value of pattern parameter prevailingAccess, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static ResolutionMatch newMutableMatch(final AccessibilityLevel pDominatedAccess, final AccessibilityLevel pPrevailingAccess) {
    return new Mutable(pDominatedAccess, pPrevailingAccess);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pDominatedAccess the fixed value of pattern parameter dominatedAccess, or null if not bound.
   * @param pPrevailingAccess the fixed value of pattern parameter prevailingAccess, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static ResolutionMatch newMatch(final AccessibilityLevel pDominatedAccess, final AccessibilityLevel pPrevailingAccess) {
    return new Immutable(pDominatedAccess, pPrevailingAccess);
  }
  
  private static final class Mutable extends ResolutionMatch {
    Mutable(final AccessibilityLevel pDominatedAccess, final AccessibilityLevel pPrevailingAccess) {
      super(pDominatedAccess, pPrevailingAccess);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends ResolutionMatch {
    Immutable(final AccessibilityLevel pDominatedAccess, final AccessibilityLevel pPrevailingAccess) {
      super(pDominatedAccess, pPrevailingAccess);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
