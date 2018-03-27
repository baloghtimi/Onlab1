/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy.vql
 */
package org.mondo.collaboration.security.increment.policy;

import WTSpec4M.WT;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.mondo.collaboration.security.increment.policy.util.ObjectRootWithIdQuerySpecification;

/**
 * Pattern-specific match representation of the org.mondo.collaboration.security.increment.policy.objectRootWithId pattern,
 * to be used in conjunction with {@link ObjectRootWithIdMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see ObjectRootWithIdMatcher
 *  @see ObjectRootWithIdProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class ObjectRootWithIdMatch extends BasePatternMatch {
  private WT fRoot;
  
  private String fId;
  
  private static List<String> parameterNames = makeImmutableList("root", "id");
  
  private ObjectRootWithIdMatch(final WT pRoot, final String pId) {
    this.fRoot = pRoot;
    this.fId = pId;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("root".equals(parameterName)) return this.fRoot;
    if ("id".equals(parameterName)) return this.fId;
    return null;
  }
  
  public WT getRoot() {
    return this.fRoot;
  }
  
  public String getId() {
    return this.fId;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("root".equals(parameterName) ) {
        this.fRoot = (WT) newValue;
        return true;
    }
    if ("id".equals(parameterName) ) {
        this.fId = (String) newValue;
        return true;
    }
    return false;
  }
  
  public void setRoot(final WT pRoot) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fRoot = pRoot;
  }
  
  public void setId(final String pId) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fId = pId;
  }
  
  @Override
  public String patternName() {
    return "org.mondo.collaboration.security.increment.policy.objectRootWithId";
  }
  
  @Override
  public List<String> parameterNames() {
    return ObjectRootWithIdMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fRoot, fId};
  }
  
  @Override
  public ObjectRootWithIdMatch toImmutable() {
    return isMutable() ? newMatch(fRoot, fId) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"root\"=" + prettyPrintValue(fRoot) + ", ");
    result.append("\"id\"=" + prettyPrintValue(fId));
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    return Objects.hash (fRoot, fId);
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
        return true;
    if (obj == null) {
        return false;
    }
    if ((obj instanceof ObjectRootWithIdMatch)) {
        ObjectRootWithIdMatch other = (ObjectRootWithIdMatch) obj;
        return Objects.equals(fRoot, other.fRoot) && Objects.equals(fId, other.fId);
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
  public ObjectRootWithIdQuerySpecification specification() {
    try {
        return ObjectRootWithIdQuerySpecification.instance();
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
  public static ObjectRootWithIdMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pRoot the fixed value of pattern parameter root, or null if not bound.
   * @param pId the fixed value of pattern parameter id, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static ObjectRootWithIdMatch newMutableMatch(final WT pRoot, final String pId) {
    return new Mutable(pRoot, pId);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pRoot the fixed value of pattern parameter root, or null if not bound.
   * @param pId the fixed value of pattern parameter id, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static ObjectRootWithIdMatch newMatch(final WT pRoot, final String pId) {
    return new Immutable(pRoot, pId);
  }
  
  private static final class Mutable extends ObjectRootWithIdMatch {
    Mutable(final WT pRoot, final String pId) {
      super(pRoot, pId);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends ObjectRootWithIdMatch {
    Immutable(final WT pRoot, final String pId) {
      super(pRoot, pId);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
