/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy_helper_pattern.vql
 */
package org.mondo.collaboration.security.increment.policy;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.mondo.collaboration.security.increment.policy.util.RestrictNotIOAssetQuerySpecification;

/**
 * Pattern-specific match representation of the org.mondo.collaboration.security.increment.policy.restrictNotIOAsset pattern,
 * to be used in conjunction with {@link RestrictNotIOAssetMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see RestrictNotIOAssetMatcher
 *  @see RestrictNotIOAssetProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class RestrictNotIOAssetMatch extends BasePatternMatch {
  private EObject fObject;
  
  private static List<String> parameterNames = makeImmutableList("object");
  
  private RestrictNotIOAssetMatch(final EObject pObject) {
    this.fObject = pObject;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("object".equals(parameterName)) return this.fObject;
    return null;
  }
  
  public EObject getObject() {
    return this.fObject;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("object".equals(parameterName) ) {
        this.fObject = (EObject) newValue;
        return true;
    }
    return false;
  }
  
  public void setObject(final EObject pObject) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fObject = pObject;
  }
  
  @Override
  public String patternName() {
    return "org.mondo.collaboration.security.increment.policy.restrictNotIOAsset";
  }
  
  @Override
  public List<String> parameterNames() {
    return RestrictNotIOAssetMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fObject};
  }
  
  @Override
  public RestrictNotIOAssetMatch toImmutable() {
    return isMutable() ? newMatch(fObject) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"object\"=" + prettyPrintValue(fObject));
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    return Objects.hash (fObject);
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
        return true;
    if (obj == null) {
        return false;
    }
    if ((obj instanceof RestrictNotIOAssetMatch)) {
        RestrictNotIOAssetMatch other = (RestrictNotIOAssetMatch) obj;
        return Objects.equals(fObject, other.fObject);
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
  public RestrictNotIOAssetQuerySpecification specification() {
    try {
        return RestrictNotIOAssetQuerySpecification.instance();
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
  public static RestrictNotIOAssetMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pObject the fixed value of pattern parameter object, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static RestrictNotIOAssetMatch newMutableMatch(final EObject pObject) {
    return new Mutable(pObject);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pObject the fixed value of pattern parameter object, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static RestrictNotIOAssetMatch newMatch(final EObject pObject) {
    return new Immutable(pObject);
  }
  
  private static final class Mutable extends RestrictNotIOAssetMatch {
    Mutable(final EObject pObject) {
      super(pObject);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends RestrictNotIOAssetMatch {
    Immutable(final EObject pObject) {
      super(pObject);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
