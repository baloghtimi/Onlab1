/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy_gen.vql
 */
package org.mondo.collaboration.security.increment.policy;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.mondo.collaboration.security.increment.policy.util.EnableRootAssetQuerySpecification;

/**
 * Pattern-specific match representation of the org.mondo.collaboration.security.increment.policy.enableRootAsset pattern,
 * to be used in conjunction with {@link EnableRootAssetMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see EnableRootAssetMatcher
 *  @see EnableRootAssetProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class EnableRootAssetMatch extends BasePatternMatch {
  private EObject fRoot;
  
  private static List<String> parameterNames = makeImmutableList("root");
  
  private EnableRootAssetMatch(final EObject pRoot) {
    this.fRoot = pRoot;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("root".equals(parameterName)) return this.fRoot;
    return null;
  }
  
  public EObject getRoot() {
    return this.fRoot;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("root".equals(parameterName) ) {
        this.fRoot = (EObject) newValue;
        return true;
    }
    return false;
  }
  
  public void setRoot(final EObject pRoot) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fRoot = pRoot;
  }
  
  @Override
  public String patternName() {
    return "org.mondo.collaboration.security.increment.policy.enableRootAsset";
  }
  
  @Override
  public List<String> parameterNames() {
    return EnableRootAssetMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fRoot};
  }
  
  @Override
  public EnableRootAssetMatch toImmutable() {
    return isMutable() ? newMatch(fRoot) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"root\"=" + prettyPrintValue(fRoot));
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    return Objects.hash (fRoot);
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
        return true;
    if (obj == null) {
        return false;
    }
    if ((obj instanceof EnableRootAssetMatch)) {
        EnableRootAssetMatch other = (EnableRootAssetMatch) obj;
        return Objects.equals(fRoot, other.fRoot);
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
  public EnableRootAssetQuerySpecification specification() {
    try {
        return EnableRootAssetQuerySpecification.instance();
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
  public static EnableRootAssetMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pRoot the fixed value of pattern parameter root, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static EnableRootAssetMatch newMutableMatch(final EObject pRoot) {
    return new Mutable(pRoot);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pRoot the fixed value of pattern parameter root, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static EnableRootAssetMatch newMatch(final EObject pRoot) {
    return new Immutable(pRoot);
  }
  
  private static final class Mutable extends EnableRootAssetMatch {
    Mutable(final EObject pRoot) {
      super(pRoot);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends EnableRootAssetMatch {
    Immutable(final EObject pRoot) {
      super(pRoot);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
