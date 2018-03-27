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
import org.mondo.collaboration.security.increment.policy.util.ObjectWTCQuerySpecification;

/**
 * Pattern-specific match representation of the org.mondo.collaboration.security.increment.policy.objectWTC pattern,
 * to be used in conjunction with {@link ObjectWTCMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see ObjectWTCMatcher
 *  @see ObjectWTCProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class ObjectWTCMatch extends BasePatternMatch {
  private wtc fCtrl;
  
  private static List<String> parameterNames = makeImmutableList("ctrl");
  
  private ObjectWTCMatch(final wtc pCtrl) {
    this.fCtrl = pCtrl;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("ctrl".equals(parameterName)) return this.fCtrl;
    return null;
  }
  
  public wtc getCtrl() {
    return this.fCtrl;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("ctrl".equals(parameterName) ) {
        this.fCtrl = (wtc) newValue;
        return true;
    }
    return false;
  }
  
  public void setCtrl(final wtc pCtrl) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fCtrl = pCtrl;
  }
  
  @Override
  public String patternName() {
    return "org.mondo.collaboration.security.increment.policy.objectWTC";
  }
  
  @Override
  public List<String> parameterNames() {
    return ObjectWTCMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fCtrl};
  }
  
  @Override
  public ObjectWTCMatch toImmutable() {
    return isMutable() ? newMatch(fCtrl) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"ctrl\"=" + prettyPrintValue(fCtrl));
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    return Objects.hash (fCtrl);
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
        return true;
    if (obj == null) {
        return false;
    }
    if ((obj instanceof ObjectWTCMatch)) {
        ObjectWTCMatch other = (ObjectWTCMatch) obj;
        return Objects.equals(fCtrl, other.fCtrl);
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
  public ObjectWTCQuerySpecification specification() {
    try {
        return ObjectWTCQuerySpecification.instance();
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
  public static ObjectWTCMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pCtrl the fixed value of pattern parameter ctrl, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static ObjectWTCMatch newMutableMatch(final wtc pCtrl) {
    return new Mutable(pCtrl);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pCtrl the fixed value of pattern parameter ctrl, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static ObjectWTCMatch newMatch(final wtc pCtrl) {
    return new Immutable(pCtrl);
  }
  
  private static final class Mutable extends ObjectWTCMatch {
    Mutable(final wtc pCtrl) {
      super(pCtrl);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends ObjectWTCMatch {
    Immutable(final wtc pCtrl) {
      super(pCtrl);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
