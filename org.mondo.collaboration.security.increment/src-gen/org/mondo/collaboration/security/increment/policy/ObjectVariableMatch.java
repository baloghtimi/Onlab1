/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy.vql
 */
package org.mondo.collaboration.security.increment.policy;

import WTSpec4M.SystemVariable;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.mondo.collaboration.security.increment.policy.util.ObjectVariableQuerySpecification;

/**
 * Pattern-specific match representation of the org.mondo.collaboration.security.increment.policy.objectVariable pattern,
 * to be used in conjunction with {@link ObjectVariableMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see ObjectVariableMatcher
 *  @see ObjectVariableProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class ObjectVariableMatch extends BasePatternMatch {
  private SystemVariable fVariable;
  
  private static List<String> parameterNames = makeImmutableList("variable");
  
  private ObjectVariableMatch(final SystemVariable pVariable) {
    this.fVariable = pVariable;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("variable".equals(parameterName)) return this.fVariable;
    return null;
  }
  
  public SystemVariable getVariable() {
    return this.fVariable;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("variable".equals(parameterName) ) {
        this.fVariable = (SystemVariable) newValue;
        return true;
    }
    return false;
  }
  
  public void setVariable(final SystemVariable pVariable) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fVariable = pVariable;
  }
  
  @Override
  public String patternName() {
    return "org.mondo.collaboration.security.increment.policy.objectVariable";
  }
  
  @Override
  public List<String> parameterNames() {
    return ObjectVariableMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fVariable};
  }
  
  @Override
  public ObjectVariableMatch toImmutable() {
    return isMutable() ? newMatch(fVariable) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"variable\"=" + prettyPrintValue(fVariable));
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    return Objects.hash (fVariable);
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
        return true;
    if (obj == null) {
        return false;
    }
    if ((obj instanceof ObjectVariableMatch)) {
        ObjectVariableMatch other = (ObjectVariableMatch) obj;
        return Objects.equals(fVariable, other.fVariable);
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
  public ObjectVariableQuerySpecification specification() {
    try {
        return ObjectVariableQuerySpecification.instance();
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
  public static ObjectVariableMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pVariable the fixed value of pattern parameter variable, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static ObjectVariableMatch newMutableMatch(final SystemVariable pVariable) {
    return new Mutable(pVariable);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pVariable the fixed value of pattern parameter variable, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static ObjectVariableMatch newMatch(final SystemVariable pVariable) {
    return new Immutable(pVariable);
  }
  
  private static final class Mutable extends ObjectVariableMatch {
    Mutable(final SystemVariable pVariable) {
      super(pVariable);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends ObjectVariableMatch {
    Immutable(final SystemVariable pVariable) {
      super(pVariable);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
