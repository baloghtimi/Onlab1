/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy.vql
 */
package org.mondo.collaboration.security.increment.policy;

import WTSpec4M.SystemTimer;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.mondo.collaboration.security.increment.policy.util.ObjectTimerQuerySpecification;

/**
 * Pattern-specific match representation of the org.mondo.collaboration.security.increment.policy.objectTimer pattern,
 * to be used in conjunction with {@link ObjectTimerMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see ObjectTimerMatcher
 *  @see ObjectTimerProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class ObjectTimerMatch extends BasePatternMatch {
  private SystemTimer fTimer;
  
  private static List<String> parameterNames = makeImmutableList("timer");
  
  private ObjectTimerMatch(final SystemTimer pTimer) {
    this.fTimer = pTimer;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("timer".equals(parameterName)) return this.fTimer;
    return null;
  }
  
  public SystemTimer getTimer() {
    return this.fTimer;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("timer".equals(parameterName) ) {
        this.fTimer = (SystemTimer) newValue;
        return true;
    }
    return false;
  }
  
  public void setTimer(final SystemTimer pTimer) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTimer = pTimer;
  }
  
  @Override
  public String patternName() {
    return "org.mondo.collaboration.security.increment.policy.objectTimer";
  }
  
  @Override
  public List<String> parameterNames() {
    return ObjectTimerMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fTimer};
  }
  
  @Override
  public ObjectTimerMatch toImmutable() {
    return isMutable() ? newMatch(fTimer) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"timer\"=" + prettyPrintValue(fTimer));
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    return Objects.hash (fTimer);
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
        return true;
    if (obj == null) {
        return false;
    }
    if ((obj instanceof ObjectTimerMatch)) {
        ObjectTimerMatch other = (ObjectTimerMatch) obj;
        return Objects.equals(fTimer, other.fTimer);
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
  public ObjectTimerQuerySpecification specification() {
    try {
        return ObjectTimerQuerySpecification.instance();
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
  public static ObjectTimerMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pTimer the fixed value of pattern parameter timer, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static ObjectTimerMatch newMutableMatch(final SystemTimer pTimer) {
    return new Mutable(pTimer);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pTimer the fixed value of pattern parameter timer, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static ObjectTimerMatch newMatch(final SystemTimer pTimer) {
    return new Immutable(pTimer);
  }
  
  private static final class Mutable extends ObjectTimerMatch {
    Mutable(final SystemTimer pTimer) {
      super(pTimer);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends ObjectTimerMatch {
    Immutable(final SystemTimer pTimer) {
      super(pTimer);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
