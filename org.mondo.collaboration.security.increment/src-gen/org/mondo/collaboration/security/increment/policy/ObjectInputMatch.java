/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy.vql
 */
package org.mondo.collaboration.security.increment.policy;

import WTSpec4M.SystemInput;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.mondo.collaboration.security.increment.policy.util.ObjectInputQuerySpecification;

/**
 * Pattern-specific match representation of the org.mondo.collaboration.security.increment.policy.objectInput pattern,
 * to be used in conjunction with {@link ObjectInputMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see ObjectInputMatcher
 *  @see ObjectInputProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class ObjectInputMatch extends BasePatternMatch {
  private SystemInput fInput;
  
  private static List<String> parameterNames = makeImmutableList("input");
  
  private ObjectInputMatch(final SystemInput pInput) {
    this.fInput = pInput;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("input".equals(parameterName)) return this.fInput;
    return null;
  }
  
  public SystemInput getInput() {
    return this.fInput;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("input".equals(parameterName) ) {
        this.fInput = (SystemInput) newValue;
        return true;
    }
    return false;
  }
  
  public void setInput(final SystemInput pInput) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fInput = pInput;
  }
  
  @Override
  public String patternName() {
    return "org.mondo.collaboration.security.increment.policy.objectInput";
  }
  
  @Override
  public List<String> parameterNames() {
    return ObjectInputMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fInput};
  }
  
  @Override
  public ObjectInputMatch toImmutable() {
    return isMutable() ? newMatch(fInput) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"input\"=" + prettyPrintValue(fInput));
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    return Objects.hash (fInput);
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
        return true;
    if (obj == null) {
        return false;
    }
    if ((obj instanceof ObjectInputMatch)) {
        ObjectInputMatch other = (ObjectInputMatch) obj;
        return Objects.equals(fInput, other.fInput);
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
  public ObjectInputQuerySpecification specification() {
    try {
        return ObjectInputQuerySpecification.instance();
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
  public static ObjectInputMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pInput the fixed value of pattern parameter input, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static ObjectInputMatch newMutableMatch(final SystemInput pInput) {
    return new Mutable(pInput);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pInput the fixed value of pattern parameter input, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static ObjectInputMatch newMatch(final SystemInput pInput) {
    return new Immutable(pInput);
  }
  
  private static final class Mutable extends ObjectInputMatch {
    Mutable(final SystemInput pInput) {
      super(pInput);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends ObjectInputMatch {
    Immutable(final SystemInput pInput) {
      super(pInput);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
