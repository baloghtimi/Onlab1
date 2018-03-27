/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy.vql
 */
package org.mondo.collaboration.security.increment.policy;

import WTSpec4M.SystemParam;
import WTSpec4M.WT;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.mondo.collaboration.security.increment.policy.util.ReferenceitsParamsQuerySpecification;

/**
 * Pattern-specific match representation of the org.mondo.collaboration.security.increment.policy.referenceitsParams pattern,
 * to be used in conjunction with {@link ReferenceitsParamsMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see ReferenceitsParamsMatcher
 *  @see ReferenceitsParamsProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class ReferenceitsParamsMatch extends BasePatternMatch {
  private WT fRoot;
  
  private SystemParam fParam;
  
  private static List<String> parameterNames = makeImmutableList("root", "param");
  
  private ReferenceitsParamsMatch(final WT pRoot, final SystemParam pParam) {
    this.fRoot = pRoot;
    this.fParam = pParam;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("root".equals(parameterName)) return this.fRoot;
    if ("param".equals(parameterName)) return this.fParam;
    return null;
  }
  
  public WT getRoot() {
    return this.fRoot;
  }
  
  public SystemParam getParam() {
    return this.fParam;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("root".equals(parameterName) ) {
        this.fRoot = (WT) newValue;
        return true;
    }
    if ("param".equals(parameterName) ) {
        this.fParam = (SystemParam) newValue;
        return true;
    }
    return false;
  }
  
  public void setRoot(final WT pRoot) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fRoot = pRoot;
  }
  
  public void setParam(final SystemParam pParam) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fParam = pParam;
  }
  
  @Override
  public String patternName() {
    return "org.mondo.collaboration.security.increment.policy.referenceitsParams";
  }
  
  @Override
  public List<String> parameterNames() {
    return ReferenceitsParamsMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fRoot, fParam};
  }
  
  @Override
  public ReferenceitsParamsMatch toImmutable() {
    return isMutable() ? newMatch(fRoot, fParam) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"root\"=" + prettyPrintValue(fRoot) + ", ");
    result.append("\"param\"=" + prettyPrintValue(fParam));
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    return Objects.hash (fRoot, fParam);
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
        return true;
    if (obj == null) {
        return false;
    }
    if ((obj instanceof ReferenceitsParamsMatch)) {
        ReferenceitsParamsMatch other = (ReferenceitsParamsMatch) obj;
        return Objects.equals(fRoot, other.fRoot) && Objects.equals(fParam, other.fParam);
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
  public ReferenceitsParamsQuerySpecification specification() {
    try {
        return ReferenceitsParamsQuerySpecification.instance();
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
  public static ReferenceitsParamsMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pRoot the fixed value of pattern parameter root, or null if not bound.
   * @param pParam the fixed value of pattern parameter param, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static ReferenceitsParamsMatch newMutableMatch(final WT pRoot, final SystemParam pParam) {
    return new Mutable(pRoot, pParam);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pRoot the fixed value of pattern parameter root, or null if not bound.
   * @param pParam the fixed value of pattern parameter param, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static ReferenceitsParamsMatch newMatch(final WT pRoot, final SystemParam pParam) {
    return new Immutable(pRoot, pParam);
  }
  
  private static final class Mutable extends ReferenceitsParamsMatch {
    Mutable(final WT pRoot, final SystemParam pParam) {
      super(pRoot, pParam);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends ReferenceitsParamsMatch {
    Immutable(final WT pRoot, final SystemParam pParam) {
      super(pRoot, pParam);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
