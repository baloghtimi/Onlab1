/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy.vql
 */
package org.mondo.collaboration.security.increment.policy;

import WTSpec4M.wtc;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.mondo.collaboration.security.increment.policy.util.AttributeenabledQuerySpecification;

/**
 * Pattern-specific match representation of the org.mondo.collaboration.security.increment.policy.attributeenabled pattern,
 * to be used in conjunction with {@link AttributeenabledMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see AttributeenabledMatcher
 *  @see AttributeenabledProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class AttributeenabledMatch extends BasePatternMatch {
  private wtc fWtc;
  
  private Boolean fValue;
  
  private static List<String> parameterNames = makeImmutableList("wtc", "value");
  
  private AttributeenabledMatch(final wtc pWtc, final Boolean pValue) {
    this.fWtc = pWtc;
    this.fValue = pValue;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("wtc".equals(parameterName)) return this.fWtc;
    if ("value".equals(parameterName)) return this.fValue;
    return null;
  }
  
  public wtc getWtc() {
    return this.fWtc;
  }
  
  public Boolean getValue() {
    return this.fValue;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("wtc".equals(parameterName) ) {
        this.fWtc = (wtc) newValue;
        return true;
    }
    if ("value".equals(parameterName) ) {
        this.fValue = (Boolean) newValue;
        return true;
    }
    return false;
  }
  
  public void setWtc(final wtc pWtc) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fWtc = pWtc;
  }
  
  public void setValue(final Boolean pValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fValue = pValue;
  }
  
  @Override
  public String patternName() {
    return "org.mondo.collaboration.security.increment.policy.attributeenabled";
  }
  
  @Override
  public List<String> parameterNames() {
    return AttributeenabledMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fWtc, fValue};
  }
  
  @Override
  public AttributeenabledMatch toImmutable() {
    return isMutable() ? newMatch(fWtc, fValue) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"wtc\"=" + prettyPrintValue(fWtc) + ", ");
    result.append("\"value\"=" + prettyPrintValue(fValue));
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    return Objects.hash (fWtc, fValue);
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
        return true;
    if (obj == null) {
        return false;
    }
    if ((obj instanceof AttributeenabledMatch)) {
        AttributeenabledMatch other = (AttributeenabledMatch) obj;
        return Objects.equals(fWtc, other.fWtc) && Objects.equals(fValue, other.fValue);
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
  public AttributeenabledQuerySpecification specification() {
    try {
        return AttributeenabledQuerySpecification.instance();
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
  public static AttributeenabledMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pWtc the fixed value of pattern parameter wtc, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static AttributeenabledMatch newMutableMatch(final wtc pWtc, final Boolean pValue) {
    return new Mutable(pWtc, pValue);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pWtc the fixed value of pattern parameter wtc, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static AttributeenabledMatch newMatch(final wtc pWtc, final Boolean pValue) {
    return new Immutable(pWtc, pValue);
  }
  
  private static final class Mutable extends AttributeenabledMatch {
    Mutable(final wtc pWtc, final Boolean pValue) {
      super(pWtc, pValue);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends AttributeenabledMatch {
    Immutable(final wtc pWtc, final Boolean pValue) {
      super(pWtc, pValue);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
