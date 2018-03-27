/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy.vql
 */
package org.mondo.collaboration.security.increment.policy;

import WTSpec4M.SystemFault;
import WTSpec4M.WT;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.mondo.collaboration.security.increment.policy.util.ReferenceitsFaultsQuerySpecification;

/**
 * Pattern-specific match representation of the org.mondo.collaboration.security.increment.policy.referenceitsFaults pattern,
 * to be used in conjunction with {@link ReferenceitsFaultsMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see ReferenceitsFaultsMatcher
 *  @see ReferenceitsFaultsProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class ReferenceitsFaultsMatch extends BasePatternMatch {
  private WT fRoot;
  
  private SystemFault fFault;
  
  private static List<String> parameterNames = makeImmutableList("root", "fault");
  
  private ReferenceitsFaultsMatch(final WT pRoot, final SystemFault pFault) {
    this.fRoot = pRoot;
    this.fFault = pFault;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("root".equals(parameterName)) return this.fRoot;
    if ("fault".equals(parameterName)) return this.fFault;
    return null;
  }
  
  public WT getRoot() {
    return this.fRoot;
  }
  
  public SystemFault getFault() {
    return this.fFault;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("root".equals(parameterName) ) {
        this.fRoot = (WT) newValue;
        return true;
    }
    if ("fault".equals(parameterName) ) {
        this.fFault = (SystemFault) newValue;
        return true;
    }
    return false;
  }
  
  public void setRoot(final WT pRoot) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fRoot = pRoot;
  }
  
  public void setFault(final SystemFault pFault) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fFault = pFault;
  }
  
  @Override
  public String patternName() {
    return "org.mondo.collaboration.security.increment.policy.referenceitsFaults";
  }
  
  @Override
  public List<String> parameterNames() {
    return ReferenceitsFaultsMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fRoot, fFault};
  }
  
  @Override
  public ReferenceitsFaultsMatch toImmutable() {
    return isMutable() ? newMatch(fRoot, fFault) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"root\"=" + prettyPrintValue(fRoot) + ", ");
    result.append("\"fault\"=" + prettyPrintValue(fFault));
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    return Objects.hash (fRoot, fFault);
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
        return true;
    if (obj == null) {
        return false;
    }
    if ((obj instanceof ReferenceitsFaultsMatch)) {
        ReferenceitsFaultsMatch other = (ReferenceitsFaultsMatch) obj;
        return Objects.equals(fRoot, other.fRoot) && Objects.equals(fFault, other.fFault);
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
  public ReferenceitsFaultsQuerySpecification specification() {
    try {
        return ReferenceitsFaultsQuerySpecification.instance();
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
  public static ReferenceitsFaultsMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pRoot the fixed value of pattern parameter root, or null if not bound.
   * @param pFault the fixed value of pattern parameter fault, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static ReferenceitsFaultsMatch newMutableMatch(final WT pRoot, final SystemFault pFault) {
    return new Mutable(pRoot, pFault);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pRoot the fixed value of pattern parameter root, or null if not bound.
   * @param pFault the fixed value of pattern parameter fault, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static ReferenceitsFaultsMatch newMatch(final WT pRoot, final SystemFault pFault) {
    return new Immutable(pRoot, pFault);
  }
  
  private static final class Mutable extends ReferenceitsFaultsMatch {
    Mutable(final WT pRoot, final SystemFault pFault) {
      super(pRoot, pFault);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends ReferenceitsFaultsMatch {
    Immutable(final WT pRoot, final SystemFault pFault) {
      super(pRoot, pFault);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
