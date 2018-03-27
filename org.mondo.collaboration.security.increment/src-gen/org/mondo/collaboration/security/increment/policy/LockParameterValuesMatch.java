/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy.vql
 */
package org.mondo.collaboration.security.increment.policy;

import WTSpec4M.SystemParam;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.mondo.collaboration.security.increment.policy.util.LockParameterValuesQuerySpecification;

/**
 * Pattern-specific match representation of the org.mondo.collaboration.security.increment.policy.lockParameterValues pattern,
 * to be used in conjunction with {@link LockParameterValuesMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see LockParameterValuesMatcher
 *  @see LockParameterValuesProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class LockParameterValuesMatch extends BasePatternMatch {
  private SystemParam fParam;
  
  private Integer fValue;
  
  private static List<String> parameterNames = makeImmutableList("param", "value");
  
  private LockParameterValuesMatch(final SystemParam pParam, final Integer pValue) {
    this.fParam = pParam;
    this.fValue = pValue;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("param".equals(parameterName)) return this.fParam;
    if ("value".equals(parameterName)) return this.fValue;
    return null;
  }
  
  public SystemParam getParam() {
    return this.fParam;
  }
  
  public Integer getValue() {
    return this.fValue;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("param".equals(parameterName) ) {
        this.fParam = (SystemParam) newValue;
        return true;
    }
    if ("value".equals(parameterName) ) {
        this.fValue = (Integer) newValue;
        return true;
    }
    return false;
  }
  
  public void setParam(final SystemParam pParam) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fParam = pParam;
  }
  
  public void setValue(final Integer pValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fValue = pValue;
  }
  
  @Override
  public String patternName() {
    return "org.mondo.collaboration.security.increment.policy.lockParameterValues";
  }
  
  @Override
  public List<String> parameterNames() {
    return LockParameterValuesMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fParam, fValue};
  }
  
  @Override
  public LockParameterValuesMatch toImmutable() {
    return isMutable() ? newMatch(fParam, fValue) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"param\"=" + prettyPrintValue(fParam) + ", ");
    result.append("\"value\"=" + prettyPrintValue(fValue));
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    return Objects.hash (fParam, fValue);
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
        return true;
    if (obj == null) {
        return false;
    }
    if ((obj instanceof LockParameterValuesMatch)) {
        LockParameterValuesMatch other = (LockParameterValuesMatch) obj;
        return Objects.equals(fParam, other.fParam) && Objects.equals(fValue, other.fValue);
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
  public LockParameterValuesQuerySpecification specification() {
    try {
        return LockParameterValuesQuerySpecification.instance();
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
  public static LockParameterValuesMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pParam the fixed value of pattern parameter param, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static LockParameterValuesMatch newMutableMatch(final SystemParam pParam, final Integer pValue) {
    return new Mutable(pParam, pValue);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pParam the fixed value of pattern parameter param, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static LockParameterValuesMatch newMatch(final SystemParam pParam, final Integer pValue) {
    return new Immutable(pParam, pValue);
  }
  
  private static final class Mutable extends LockParameterValuesMatch {
    Mutable(final SystemParam pParam, final Integer pValue) {
      super(pParam, pValue);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends LockParameterValuesMatch {
    Immutable(final SystemParam pParam, final Integer pValue) {
      super(pParam, pValue);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
