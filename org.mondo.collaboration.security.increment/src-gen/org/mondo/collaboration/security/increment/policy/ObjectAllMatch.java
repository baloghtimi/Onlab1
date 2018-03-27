/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy.vql
 */
package org.mondo.collaboration.security.increment.policy;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.mondo.collaboration.security.increment.policy.util.ObjectAllQuerySpecification;

/**
 * Pattern-specific match representation of the org.mondo.collaboration.security.increment.policy.objectAll pattern,
 * to be used in conjunction with {@link ObjectAllMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see ObjectAllMatcher
 *  @see ObjectAllProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class ObjectAllMatch extends BasePatternMatch {
  private EObject fObj;
  
  private static List<String> parameterNames = makeImmutableList("obj");
  
  private ObjectAllMatch(final EObject pObj) {
    this.fObj = pObj;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("obj".equals(parameterName)) return this.fObj;
    return null;
  }
  
  public EObject getObj() {
    return this.fObj;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("obj".equals(parameterName) ) {
        this.fObj = (EObject) newValue;
        return true;
    }
    return false;
  }
  
  public void setObj(final EObject pObj) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fObj = pObj;
  }
  
  @Override
  public String patternName() {
    return "org.mondo.collaboration.security.increment.policy.objectAll";
  }
  
  @Override
  public List<String> parameterNames() {
    return ObjectAllMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fObj};
  }
  
  @Override
  public ObjectAllMatch toImmutable() {
    return isMutable() ? newMatch(fObj) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"obj\"=" + prettyPrintValue(fObj));
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    return Objects.hash (fObj);
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
        return true;
    if (obj == null) {
        return false;
    }
    if ((obj instanceof ObjectAllMatch)) {
        ObjectAllMatch other = (ObjectAllMatch) obj;
        return Objects.equals(fObj, other.fObj);
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
  public ObjectAllQuerySpecification specification() {
    try {
        return ObjectAllQuerySpecification.instance();
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
  public static ObjectAllMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pObj the fixed value of pattern parameter obj, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static ObjectAllMatch newMutableMatch(final EObject pObj) {
    return new Mutable(pObj);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pObj the fixed value of pattern parameter obj, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static ObjectAllMatch newMatch(final EObject pObj) {
    return new Immutable(pObj);
  }
  
  private static final class Mutable extends ObjectAllMatch {
    Mutable(final EObject pObj) {
      super(pObj);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends ObjectAllMatch {
    Immutable(final EObject pObj) {
      super(pObj);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
