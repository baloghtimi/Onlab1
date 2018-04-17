/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy_helper_pattern.vql
 */
package org.mondo.collaboration.security.increment.policy;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.mondo.collaboration.policy.rules.OperationType;
import org.mondo.collaboration.security.increment.policy.util.ReadWriteOperationQuerySpecification;

/**
 * Pattern-specific match representation of the org.mondo.collaboration.security.increment.policy.readWriteOperation pattern,
 * to be used in conjunction with {@link ReadWriteOperationMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see ReadWriteOperationMatcher
 *  @see ReadWriteOperationProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class ReadWriteOperationMatch extends BasePatternMatch {
  private OperationType fOperation;
  
  private static List<String> parameterNames = makeImmutableList("operation");
  
  private ReadWriteOperationMatch(final OperationType pOperation) {
    this.fOperation = pOperation;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("operation".equals(parameterName)) return this.fOperation;
    return null;
  }
  
  public OperationType getOperation() {
    return this.fOperation;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("operation".equals(parameterName) ) {
        this.fOperation = (OperationType) newValue;
        return true;
    }
    return false;
  }
  
  public void setOperation(final OperationType pOperation) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fOperation = pOperation;
  }
  
  @Override
  public String patternName() {
    return "org.mondo.collaboration.security.increment.policy.readWriteOperation";
  }
  
  @Override
  public List<String> parameterNames() {
    return ReadWriteOperationMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fOperation};
  }
  
  @Override
  public ReadWriteOperationMatch toImmutable() {
    return isMutable() ? newMatch(fOperation) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"operation\"=" + prettyPrintValue(fOperation));
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    return Objects.hash (fOperation);
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
        return true;
    if (obj == null) {
        return false;
    }
    if ((obj instanceof ReadWriteOperationMatch)) {
        ReadWriteOperationMatch other = (ReadWriteOperationMatch) obj;
        return Objects.equals(fOperation, other.fOperation);
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
  public ReadWriteOperationQuerySpecification specification() {
    try {
        return ReadWriteOperationQuerySpecification.instance();
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
  public static ReadWriteOperationMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static ReadWriteOperationMatch newMutableMatch(final OperationType pOperation) {
    return new Mutable(pOperation);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static ReadWriteOperationMatch newMatch(final OperationType pOperation) {
    return new Immutable(pOperation);
  }
  
  private static final class Mutable extends ReadWriteOperationMatch {
    Mutable(final OperationType pOperation) {
      super(pOperation);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends ReadWriteOperationMatch {
    Immutable(final OperationType pOperation) {
      super(pOperation);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
