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
import org.mondo.collaboration.security.increment.policy.util.ObjectParamQuerySpecification;

/**
 * Pattern-specific match representation of the org.mondo.collaboration.security.increment.policy.objectParam pattern,
 * to be used in conjunction with {@link ObjectParamMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see ObjectParamMatcher
 *  @see ObjectParamProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class ObjectParamMatch extends BasePatternMatch {
  private SystemParam fParam;
  
  private static List<String> parameterNames = makeImmutableList("param");
  
  private ObjectParamMatch(final SystemParam pParam) {
    this.fParam = pParam;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("param".equals(parameterName)) return this.fParam;
    return null;
  }
  
  public SystemParam getParam() {
    return this.fParam;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("param".equals(parameterName) ) {
        this.fParam = (SystemParam) newValue;
        return true;
    }
    return false;
  }
  
  public void setParam(final SystemParam pParam) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fParam = pParam;
  }
  
  @Override
  public String patternName() {
    return "org.mondo.collaboration.security.increment.policy.objectParam";
  }
  
  @Override
  public List<String> parameterNames() {
    return ObjectParamMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fParam};
  }
  
  @Override
  public ObjectParamMatch toImmutable() {
    return isMutable() ? newMatch(fParam) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"param\"=" + prettyPrintValue(fParam));
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    return Objects.hash (fParam);
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
        return true;
    if (obj == null) {
        return false;
    }
    if ((obj instanceof ObjectParamMatch)) {
        ObjectParamMatch other = (ObjectParamMatch) obj;
        return Objects.equals(fParam, other.fParam);
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
  public ObjectParamQuerySpecification specification() {
    try {
        return ObjectParamQuerySpecification.instance();
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
  public static ObjectParamMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pParam the fixed value of pattern parameter param, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static ObjectParamMatch newMutableMatch(final SystemParam pParam) {
    return new Mutable(pParam);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pParam the fixed value of pattern parameter param, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static ObjectParamMatch newMatch(final SystemParam pParam) {
    return new Immutable(pParam);
  }
  
  private static final class Mutable extends ObjectParamMatch {
    Mutable(final SystemParam pParam) {
      super(pParam);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends ObjectParamMatch {
    Immutable(final SystemParam pParam) {
      super(pParam);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
