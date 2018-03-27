/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy.vql
 */
package org.mondo.collaboration.security.increment.policy;

import WTSpec4M.MainSubsystem;
import WTSpec4M.WT;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.mondo.collaboration.security.increment.policy.util.ReferenceitsMainSubsystemsQuerySpecification;

/**
 * Pattern-specific match representation of the org.mondo.collaboration.security.increment.policy.referenceitsMainSubsystems pattern,
 * to be used in conjunction with {@link ReferenceitsMainSubsystemsMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see ReferenceitsMainSubsystemsMatcher
 *  @see ReferenceitsMainSubsystemsProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class ReferenceitsMainSubsystemsMatch extends BasePatternMatch {
  private WT fRoot;
  
  private MainSubsystem fSubsystem;
  
  private static List<String> parameterNames = makeImmutableList("root", "subsystem");
  
  private ReferenceitsMainSubsystemsMatch(final WT pRoot, final MainSubsystem pSubsystem) {
    this.fRoot = pRoot;
    this.fSubsystem = pSubsystem;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("root".equals(parameterName)) return this.fRoot;
    if ("subsystem".equals(parameterName)) return this.fSubsystem;
    return null;
  }
  
  public WT getRoot() {
    return this.fRoot;
  }
  
  public MainSubsystem getSubsystem() {
    return this.fSubsystem;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("root".equals(parameterName) ) {
        this.fRoot = (WT) newValue;
        return true;
    }
    if ("subsystem".equals(parameterName) ) {
        this.fSubsystem = (MainSubsystem) newValue;
        return true;
    }
    return false;
  }
  
  public void setRoot(final WT pRoot) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fRoot = pRoot;
  }
  
  public void setSubsystem(final MainSubsystem pSubsystem) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSubsystem = pSubsystem;
  }
  
  @Override
  public String patternName() {
    return "org.mondo.collaboration.security.increment.policy.referenceitsMainSubsystems";
  }
  
  @Override
  public List<String> parameterNames() {
    return ReferenceitsMainSubsystemsMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fRoot, fSubsystem};
  }
  
  @Override
  public ReferenceitsMainSubsystemsMatch toImmutable() {
    return isMutable() ? newMatch(fRoot, fSubsystem) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"root\"=" + prettyPrintValue(fRoot) + ", ");
    result.append("\"subsystem\"=" + prettyPrintValue(fSubsystem));
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    return Objects.hash (fRoot, fSubsystem);
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
        return true;
    if (obj == null) {
        return false;
    }
    if ((obj instanceof ReferenceitsMainSubsystemsMatch)) {
        ReferenceitsMainSubsystemsMatch other = (ReferenceitsMainSubsystemsMatch) obj;
        return Objects.equals(fRoot, other.fRoot) && Objects.equals(fSubsystem, other.fSubsystem);
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
  public ReferenceitsMainSubsystemsQuerySpecification specification() {
    try {
        return ReferenceitsMainSubsystemsQuerySpecification.instance();
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
  public static ReferenceitsMainSubsystemsMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pRoot the fixed value of pattern parameter root, or null if not bound.
   * @param pSubsystem the fixed value of pattern parameter subsystem, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static ReferenceitsMainSubsystemsMatch newMutableMatch(final WT pRoot, final MainSubsystem pSubsystem) {
    return new Mutable(pRoot, pSubsystem);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pRoot the fixed value of pattern parameter root, or null if not bound.
   * @param pSubsystem the fixed value of pattern parameter subsystem, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static ReferenceitsMainSubsystemsMatch newMatch(final WT pRoot, final MainSubsystem pSubsystem) {
    return new Immutable(pRoot, pSubsystem);
  }
  
  private static final class Mutable extends ReferenceitsMainSubsystemsMatch {
    Mutable(final WT pRoot, final MainSubsystem pSubsystem) {
      super(pRoot, pSubsystem);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends ReferenceitsMainSubsystemsMatch {
    Immutable(final WT pRoot, final MainSubsystem pSubsystem) {
      super(pRoot, pSubsystem);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
