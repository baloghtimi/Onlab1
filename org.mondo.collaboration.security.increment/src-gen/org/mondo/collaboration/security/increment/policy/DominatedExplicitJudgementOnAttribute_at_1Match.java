/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy_domination_same_priority.vql
 */
package org.mondo.collaboration.security.increment.policy;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.mondo.collaboration.policy.rules.AccessibilityLevel;
import org.mondo.collaboration.policy.rules.OperationType;
import org.mondo.collaboration.security.increment.policy.util.DominatedExplicitJudgementOnAttribute_at_1QuerySpecification;

/**
 * Pattern-specific match representation of the org.mondo.collaboration.security.increment.policy.dominatedExplicitJudgementOnAttribute_at_1 pattern,
 * to be used in conjunction with {@link DominatedExplicitJudgementOnAttribute_at_1Matcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see DominatedExplicitJudgementOnAttribute_at_1Matcher
 *  @see DominatedExplicitJudgementOnAttribute_at_1Processor
 * 
 */
@SuppressWarnings("all")
public abstract class DominatedExplicitJudgementOnAttribute_at_1Match extends BasePatternMatch {
  private String fUser;
  
  private EObject fSource;
  
  private Object fValue;
  
  private EAttribute fAttribute;
  
  private OperationType fOperation;
  
  private AccessibilityLevel fPrevailingAccess;
  
  private static List<String> parameterNames = makeImmutableList("user", "source", "value", "attribute", "operation", "prevailingAccess");
  
  private DominatedExplicitJudgementOnAttribute_at_1Match(final String pUser, final EObject pSource, final Object pValue, final EAttribute pAttribute, final OperationType pOperation, final AccessibilityLevel pPrevailingAccess) {
    this.fUser = pUser;
    this.fSource = pSource;
    this.fValue = pValue;
    this.fAttribute = pAttribute;
    this.fOperation = pOperation;
    this.fPrevailingAccess = pPrevailingAccess;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("user".equals(parameterName)) return this.fUser;
    if ("source".equals(parameterName)) return this.fSource;
    if ("value".equals(parameterName)) return this.fValue;
    if ("attribute".equals(parameterName)) return this.fAttribute;
    if ("operation".equals(parameterName)) return this.fOperation;
    if ("prevailingAccess".equals(parameterName)) return this.fPrevailingAccess;
    return null;
  }
  
  public String getUser() {
    return this.fUser;
  }
  
  public EObject getSource() {
    return this.fSource;
  }
  
  public Object getValue() {
    return this.fValue;
  }
  
  public EAttribute getAttribute() {
    return this.fAttribute;
  }
  
  public OperationType getOperation() {
    return this.fOperation;
  }
  
  public AccessibilityLevel getPrevailingAccess() {
    return this.fPrevailingAccess;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("user".equals(parameterName) ) {
        this.fUser = (String) newValue;
        return true;
    }
    if ("source".equals(parameterName) ) {
        this.fSource = (EObject) newValue;
        return true;
    }
    if ("value".equals(parameterName) && newValue instanceof Object) {
        this.fValue = (Object) newValue;
        return true;
    }
    if ("attribute".equals(parameterName) ) {
        this.fAttribute = (EAttribute) newValue;
        return true;
    }
    if ("operation".equals(parameterName) ) {
        this.fOperation = (OperationType) newValue;
        return true;
    }
    if ("prevailingAccess".equals(parameterName) ) {
        this.fPrevailingAccess = (AccessibilityLevel) newValue;
        return true;
    }
    return false;
  }
  
  public void setUser(final String pUser) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fUser = pUser;
  }
  
  public void setSource(final EObject pSource) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSource = pSource;
  }
  
  public void setValue(final Object pValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fValue = pValue;
  }
  
  public void setAttribute(final EAttribute pAttribute) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fAttribute = pAttribute;
  }
  
  public void setOperation(final OperationType pOperation) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fOperation = pOperation;
  }
  
  public void setPrevailingAccess(final AccessibilityLevel pPrevailingAccess) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fPrevailingAccess = pPrevailingAccess;
  }
  
  @Override
  public String patternName() {
    return "org.mondo.collaboration.security.increment.policy.dominatedExplicitJudgementOnAttribute_at_1";
  }
  
  @Override
  public List<String> parameterNames() {
    return DominatedExplicitJudgementOnAttribute_at_1Match.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fUser, fSource, fValue, fAttribute, fOperation, fPrevailingAccess};
  }
  
  @Override
  public DominatedExplicitJudgementOnAttribute_at_1Match toImmutable() {
    return isMutable() ? newMatch(fUser, fSource, fValue, fAttribute, fOperation, fPrevailingAccess) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"user\"=" + prettyPrintValue(fUser) + ", ");
    result.append("\"source\"=" + prettyPrintValue(fSource) + ", ");
    result.append("\"value\"=" + prettyPrintValue(fValue) + ", ");
    result.append("\"attribute\"=" + prettyPrintValue(fAttribute) + ", ");
    result.append("\"operation\"=" + prettyPrintValue(fOperation) + ", ");
    result.append("\"prevailingAccess\"=" + prettyPrintValue(fPrevailingAccess));
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    return Objects.hash (fUser, fSource, fValue, fAttribute, fOperation, fPrevailingAccess);
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
        return true;
    if (obj == null) {
        return false;
    }
    if ((obj instanceof DominatedExplicitJudgementOnAttribute_at_1Match)) {
        DominatedExplicitJudgementOnAttribute_at_1Match other = (DominatedExplicitJudgementOnAttribute_at_1Match) obj;
        return Objects.equals(fUser, other.fUser) && Objects.equals(fSource, other.fSource) && Objects.equals(fValue, other.fValue) && Objects.equals(fAttribute, other.fAttribute) && Objects.equals(fOperation, other.fOperation) && Objects.equals(fPrevailingAccess, other.fPrevailingAccess);
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
  public DominatedExplicitJudgementOnAttribute_at_1QuerySpecification specification() {
    try {
        return DominatedExplicitJudgementOnAttribute_at_1QuerySpecification.instance();
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
  public static DominatedExplicitJudgementOnAttribute_at_1Match newEmptyMatch() {
    return new Mutable(null, null, null, null, null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pSource the fixed value of pattern parameter source, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pPrevailingAccess the fixed value of pattern parameter prevailingAccess, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static DominatedExplicitJudgementOnAttribute_at_1Match newMutableMatch(final String pUser, final EObject pSource, final Object pValue, final EAttribute pAttribute, final OperationType pOperation, final AccessibilityLevel pPrevailingAccess) {
    return new Mutable(pUser, pSource, pValue, pAttribute, pOperation, pPrevailingAccess);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pSource the fixed value of pattern parameter source, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pPrevailingAccess the fixed value of pattern parameter prevailingAccess, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static DominatedExplicitJudgementOnAttribute_at_1Match newMatch(final String pUser, final EObject pSource, final Object pValue, final EAttribute pAttribute, final OperationType pOperation, final AccessibilityLevel pPrevailingAccess) {
    return new Immutable(pUser, pSource, pValue, pAttribute, pOperation, pPrevailingAccess);
  }
  
  private static final class Mutable extends DominatedExplicitJudgementOnAttribute_at_1Match {
    Mutable(final String pUser, final EObject pSource, final Object pValue, final EAttribute pAttribute, final OperationType pOperation, final AccessibilityLevel pPrevailingAccess) {
      super(pUser, pSource, pValue, pAttribute, pOperation, pPrevailingAccess);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends DominatedExplicitJudgementOnAttribute_at_1Match {
    Immutable(final String pUser, final EObject pSource, final Object pValue, final EAttribute pAttribute, final OperationType pOperation, final AccessibilityLevel pPrevailingAccess) {
      super(pUser, pSource, pValue, pAttribute, pOperation, pPrevailingAccess);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
