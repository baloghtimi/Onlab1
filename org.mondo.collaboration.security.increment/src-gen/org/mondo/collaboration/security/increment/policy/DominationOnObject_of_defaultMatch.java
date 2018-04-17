/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy_domination_higher_priority.vql
 */
package org.mondo.collaboration.security.increment.policy;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.mondo.collaboration.security.increment.policy.util.DominationOnObject_of_defaultQuerySpecification;

/**
 * Pattern-specific match representation of the org.mondo.collaboration.security.increment.policy.dominationOnObject_of_default pattern,
 * to be used in conjunction with {@link DominationOnObject_of_defaultMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see DominationOnObject_of_defaultMatcher
 *  @see DominationOnObject_of_defaultProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class DominationOnObject_of_defaultMatch extends BasePatternMatch {
  private String fUser;
  
  private EObject fObject;
  
  private Object fOperation;
  
  private static List<String> parameterNames = makeImmutableList("user", "object", "operation");
  
  private DominationOnObject_of_defaultMatch(final String pUser, final EObject pObject, final Object pOperation) {
    this.fUser = pUser;
    this.fObject = pObject;
    this.fOperation = pOperation;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("user".equals(parameterName)) return this.fUser;
    if ("object".equals(parameterName)) return this.fObject;
    if ("operation".equals(parameterName)) return this.fOperation;
    return null;
  }
  
  public String getUser() {
    return this.fUser;
  }
  
  public EObject getObject() {
    return this.fObject;
  }
  
  public Object getOperation() {
    return this.fOperation;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("user".equals(parameterName) ) {
        this.fUser = (String) newValue;
        return true;
    }
    if ("object".equals(parameterName) ) {
        this.fObject = (EObject) newValue;
        return true;
    }
    if ("operation".equals(parameterName) && newValue instanceof Object) {
        this.fOperation = (Object) newValue;
        return true;
    }
    return false;
  }
  
  public void setUser(final String pUser) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fUser = pUser;
  }
  
  public void setObject(final EObject pObject) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fObject = pObject;
  }
  
  public void setOperation(final Object pOperation) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fOperation = pOperation;
  }
  
  @Override
  public String patternName() {
    return "org.mondo.collaboration.security.increment.policy.dominationOnObject_of_default";
  }
  
  @Override
  public List<String> parameterNames() {
    return DominationOnObject_of_defaultMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fUser, fObject, fOperation};
  }
  
  @Override
  public DominationOnObject_of_defaultMatch toImmutable() {
    return isMutable() ? newMatch(fUser, fObject, fOperation) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"user\"=" + prettyPrintValue(fUser) + ", ");
    result.append("\"object\"=" + prettyPrintValue(fObject) + ", ");
    result.append("\"operation\"=" + prettyPrintValue(fOperation));
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    return Objects.hash (fUser, fObject, fOperation);
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
        return true;
    if (obj == null) {
        return false;
    }
    if ((obj instanceof DominationOnObject_of_defaultMatch)) {
        DominationOnObject_of_defaultMatch other = (DominationOnObject_of_defaultMatch) obj;
        return Objects.equals(fUser, other.fUser) && Objects.equals(fObject, other.fObject) && Objects.equals(fOperation, other.fOperation);
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
  public DominationOnObject_of_defaultQuerySpecification specification() {
    try {
        return DominationOnObject_of_defaultQuerySpecification.instance();
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
  public static DominationOnObject_of_defaultMatch newEmptyMatch() {
    return new Mutable(null, null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pObject the fixed value of pattern parameter object, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static DominationOnObject_of_defaultMatch newMutableMatch(final String pUser, final EObject pObject, final Object pOperation) {
    return new Mutable(pUser, pObject, pOperation);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pObject the fixed value of pattern parameter object, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static DominationOnObject_of_defaultMatch newMatch(final String pUser, final EObject pObject, final Object pOperation) {
    return new Immutable(pUser, pObject, pOperation);
  }
  
  private static final class Mutable extends DominationOnObject_of_defaultMatch {
    Mutable(final String pUser, final EObject pObject, final Object pOperation) {
      super(pUser, pObject, pOperation);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends DominationOnObject_of_defaultMatch {
    Immutable(final String pUser, final EObject pObject, final Object pOperation) {
      super(pUser, pObject, pOperation);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
