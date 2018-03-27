/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy.vql
 */
package org.mondo.collaboration.security.increment.policy;

import WTSpec4M.SystemOutput;
import WTSpec4M.WT;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.mondo.collaboration.security.increment.policy.util.ReferenceitsOutputsQuerySpecification;

/**
 * Pattern-specific match representation of the org.mondo.collaboration.security.increment.policy.referenceitsOutputs pattern,
 * to be used in conjunction with {@link ReferenceitsOutputsMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see ReferenceitsOutputsMatcher
 *  @see ReferenceitsOutputsProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class ReferenceitsOutputsMatch extends BasePatternMatch {
  private WT fRoot;
  
  private SystemOutput fOutput;
  
  private static List<String> parameterNames = makeImmutableList("root", "output");
  
  private ReferenceitsOutputsMatch(final WT pRoot, final SystemOutput pOutput) {
    this.fRoot = pRoot;
    this.fOutput = pOutput;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("root".equals(parameterName)) return this.fRoot;
    if ("output".equals(parameterName)) return this.fOutput;
    return null;
  }
  
  public WT getRoot() {
    return this.fRoot;
  }
  
  public SystemOutput getOutput() {
    return this.fOutput;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("root".equals(parameterName) ) {
        this.fRoot = (WT) newValue;
        return true;
    }
    if ("output".equals(parameterName) ) {
        this.fOutput = (SystemOutput) newValue;
        return true;
    }
    return false;
  }
  
  public void setRoot(final WT pRoot) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fRoot = pRoot;
  }
  
  public void setOutput(final SystemOutput pOutput) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fOutput = pOutput;
  }
  
  @Override
  public String patternName() {
    return "org.mondo.collaboration.security.increment.policy.referenceitsOutputs";
  }
  
  @Override
  public List<String> parameterNames() {
    return ReferenceitsOutputsMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fRoot, fOutput};
  }
  
  @Override
  public ReferenceitsOutputsMatch toImmutable() {
    return isMutable() ? newMatch(fRoot, fOutput) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"root\"=" + prettyPrintValue(fRoot) + ", ");
    result.append("\"output\"=" + prettyPrintValue(fOutput));
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    return Objects.hash (fRoot, fOutput);
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
        return true;
    if (obj == null) {
        return false;
    }
    if ((obj instanceof ReferenceitsOutputsMatch)) {
        ReferenceitsOutputsMatch other = (ReferenceitsOutputsMatch) obj;
        return Objects.equals(fRoot, other.fRoot) && Objects.equals(fOutput, other.fOutput);
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
  public ReferenceitsOutputsQuerySpecification specification() {
    try {
        return ReferenceitsOutputsQuerySpecification.instance();
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
  public static ReferenceitsOutputsMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pRoot the fixed value of pattern parameter root, or null if not bound.
   * @param pOutput the fixed value of pattern parameter output, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static ReferenceitsOutputsMatch newMutableMatch(final WT pRoot, final SystemOutput pOutput) {
    return new Mutable(pRoot, pOutput);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pRoot the fixed value of pattern parameter root, or null if not bound.
   * @param pOutput the fixed value of pattern parameter output, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static ReferenceitsOutputsMatch newMatch(final WT pRoot, final SystemOutput pOutput) {
    return new Immutable(pRoot, pOutput);
  }
  
  private static final class Mutable extends ReferenceitsOutputsMatch {
    Mutable(final WT pRoot, final SystemOutput pOutput) {
      super(pRoot, pOutput);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends ReferenceitsOutputsMatch {
    Immutable(final WT pRoot, final SystemOutput pOutput) {
      super(pRoot, pOutput);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
