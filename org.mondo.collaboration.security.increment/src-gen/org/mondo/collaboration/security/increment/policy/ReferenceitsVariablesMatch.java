/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy.vql
 */
package org.mondo.collaboration.security.increment.policy;

import WTSpec4M.SystemVariable;
import WTSpec4M.WT;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.mondo.collaboration.security.increment.policy.util.ReferenceitsVariablesQuerySpecification;

/**
 * Pattern-specific match representation of the org.mondo.collaboration.security.increment.policy.referenceitsVariables pattern,
 * to be used in conjunction with {@link ReferenceitsVariablesMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see ReferenceitsVariablesMatcher
 *  @see ReferenceitsVariablesProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class ReferenceitsVariablesMatch extends BasePatternMatch {
  private WT fRoot;
  
  private SystemVariable fVariable;
  
  private static List<String> parameterNames = makeImmutableList("root", "variable");
  
  private ReferenceitsVariablesMatch(final WT pRoot, final SystemVariable pVariable) {
    this.fRoot = pRoot;
    this.fVariable = pVariable;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("root".equals(parameterName)) return this.fRoot;
    if ("variable".equals(parameterName)) return this.fVariable;
    return null;
  }
  
  public WT getRoot() {
    return this.fRoot;
  }
  
  public SystemVariable getVariable() {
    return this.fVariable;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("root".equals(parameterName) ) {
        this.fRoot = (WT) newValue;
        return true;
    }
    if ("variable".equals(parameterName) ) {
        this.fVariable = (SystemVariable) newValue;
        return true;
    }
    return false;
  }
  
  public void setRoot(final WT pRoot) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fRoot = pRoot;
  }
  
  public void setVariable(final SystemVariable pVariable) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fVariable = pVariable;
  }
  
  @Override
  public String patternName() {
    return "org.mondo.collaboration.security.increment.policy.referenceitsVariables";
  }
  
  @Override
  public List<String> parameterNames() {
    return ReferenceitsVariablesMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fRoot, fVariable};
  }
  
  @Override
  public ReferenceitsVariablesMatch toImmutable() {
    return isMutable() ? newMatch(fRoot, fVariable) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"root\"=" + prettyPrintValue(fRoot) + ", ");
    result.append("\"variable\"=" + prettyPrintValue(fVariable));
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    return Objects.hash (fRoot, fVariable);
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
        return true;
    if (obj == null) {
        return false;
    }
    if ((obj instanceof ReferenceitsVariablesMatch)) {
        ReferenceitsVariablesMatch other = (ReferenceitsVariablesMatch) obj;
        return Objects.equals(fRoot, other.fRoot) && Objects.equals(fVariable, other.fVariable);
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
  public ReferenceitsVariablesQuerySpecification specification() {
    try {
        return ReferenceitsVariablesQuerySpecification.instance();
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
  public static ReferenceitsVariablesMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pRoot the fixed value of pattern parameter root, or null if not bound.
   * @param pVariable the fixed value of pattern parameter variable, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static ReferenceitsVariablesMatch newMutableMatch(final WT pRoot, final SystemVariable pVariable) {
    return new Mutable(pRoot, pVariable);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pRoot the fixed value of pattern parameter root, or null if not bound.
   * @param pVariable the fixed value of pattern parameter variable, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static ReferenceitsVariablesMatch newMatch(final WT pRoot, final SystemVariable pVariable) {
    return new Immutable(pRoot, pVariable);
  }
  
  private static final class Mutable extends ReferenceitsVariablesMatch {
    Mutable(final WT pRoot, final SystemVariable pVariable) {
      super(pRoot, pVariable);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends ReferenceitsVariablesMatch {
    Immutable(final WT pRoot, final SystemVariable pVariable) {
      super(pRoot, pVariable);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
