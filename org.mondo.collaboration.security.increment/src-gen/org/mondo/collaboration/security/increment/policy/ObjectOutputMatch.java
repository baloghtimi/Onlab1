/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy.vql
 */
package org.mondo.collaboration.security.increment.policy;

import WTSpec4M.SystemOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.mondo.collaboration.security.increment.policy.util.ObjectOutputQuerySpecification;

/**
 * Pattern-specific match representation of the org.mondo.collaboration.security.increment.policy.objectOutput pattern,
 * to be used in conjunction with {@link ObjectOutputMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see ObjectOutputMatcher
 *  @see ObjectOutputProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class ObjectOutputMatch extends BasePatternMatch {
  private SystemOutput fOutput;
  
  private static List<String> parameterNames = makeImmutableList("output");
  
  private ObjectOutputMatch(final SystemOutput pOutput) {
    this.fOutput = pOutput;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("output".equals(parameterName)) return this.fOutput;
    return null;
  }
  
  public SystemOutput getOutput() {
    return this.fOutput;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("output".equals(parameterName) ) {
        this.fOutput = (SystemOutput) newValue;
        return true;
    }
    return false;
  }
  
  public void setOutput(final SystemOutput pOutput) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fOutput = pOutput;
  }
  
  @Override
  public String patternName() {
    return "org.mondo.collaboration.security.increment.policy.objectOutput";
  }
  
  @Override
  public List<String> parameterNames() {
    return ObjectOutputMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fOutput};
  }
  
  @Override
  public ObjectOutputMatch toImmutable() {
    return isMutable() ? newMatch(fOutput) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"output\"=" + prettyPrintValue(fOutput));
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    return Objects.hash (fOutput);
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
        return true;
    if (obj == null) {
        return false;
    }
    if ((obj instanceof ObjectOutputMatch)) {
        ObjectOutputMatch other = (ObjectOutputMatch) obj;
        return Objects.equals(fOutput, other.fOutput);
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
  public ObjectOutputQuerySpecification specification() {
    try {
        return ObjectOutputQuerySpecification.instance();
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
  public static ObjectOutputMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pOutput the fixed value of pattern parameter output, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static ObjectOutputMatch newMutableMatch(final SystemOutput pOutput) {
    return new Mutable(pOutput);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pOutput the fixed value of pattern parameter output, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static ObjectOutputMatch newMatch(final SystemOutput pOutput) {
    return new Immutable(pOutput);
  }
  
  private static final class Mutable extends ObjectOutputMatch {
    Mutable(final SystemOutput pOutput) {
      super(pOutput);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends ObjectOutputMatch {
    Immutable(final SystemOutput pOutput) {
      super(pOutput);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
