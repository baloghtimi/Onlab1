/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy_explicit_judgement.vql
 */
package org.mondo.collaboration.security.increment.policy;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.mondo.collaboration.policy.rules.AccessibilityLevel;
import org.mondo.collaboration.policy.rules.OperationType;
import org.mondo.collaboration.security.increment.policy.util.ExplicitJudgementOnReferenceQuerySpecification;

/**
 * Pattern-specific match representation of the org.mondo.collaboration.security.increment.policy.explicitJudgementOnReference pattern,
 * to be used in conjunction with {@link ExplicitJudgementOnReferenceMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see ExplicitJudgementOnReferenceMatcher
 *  @see ExplicitJudgementOnReferenceProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class ExplicitJudgementOnReferenceMatch extends BasePatternMatch {
  private String fUser;
  
  private EObject fSource;
  
  private EObject fTarget;
  
  private EReference fReference;
  
  private OperationType fOperation;
  
  private AccessibilityLevel fAccess;
  
  private Integer fPriority;
  
  private static List<String> parameterNames = makeImmutableList("user", "source", "target", "reference", "operation", "access", "priority");
  
  private ExplicitJudgementOnReferenceMatch(final String pUser, final EObject pSource, final EObject pTarget, final EReference pReference, final OperationType pOperation, final AccessibilityLevel pAccess, final Integer pPriority) {
    this.fUser = pUser;
    this.fSource = pSource;
    this.fTarget = pTarget;
    this.fReference = pReference;
    this.fOperation = pOperation;
    this.fAccess = pAccess;
    this.fPriority = pPriority;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("user".equals(parameterName)) return this.fUser;
    if ("source".equals(parameterName)) return this.fSource;
    if ("target".equals(parameterName)) return this.fTarget;
    if ("reference".equals(parameterName)) return this.fReference;
    if ("operation".equals(parameterName)) return this.fOperation;
    if ("access".equals(parameterName)) return this.fAccess;
    if ("priority".equals(parameterName)) return this.fPriority;
    return null;
  }
  
  public String getUser() {
    return this.fUser;
  }
  
  public EObject getSource() {
    return this.fSource;
  }
  
  public EObject getTarget() {
    return this.fTarget;
  }
  
  public EReference getReference() {
    return this.fReference;
  }
  
  public OperationType getOperation() {
    return this.fOperation;
  }
  
  public AccessibilityLevel getAccess() {
    return this.fAccess;
  }
  
  public Integer getPriority() {
    return this.fPriority;
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
    if ("target".equals(parameterName) ) {
        this.fTarget = (EObject) newValue;
        return true;
    }
    if ("reference".equals(parameterName) ) {
        this.fReference = (EReference) newValue;
        return true;
    }
    if ("operation".equals(parameterName) ) {
        this.fOperation = (OperationType) newValue;
        return true;
    }
    if ("access".equals(parameterName) ) {
        this.fAccess = (AccessibilityLevel) newValue;
        return true;
    }
    if ("priority".equals(parameterName) ) {
        this.fPriority = (Integer) newValue;
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
  
  public void setTarget(final EObject pTarget) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTarget = pTarget;
  }
  
  public void setReference(final EReference pReference) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fReference = pReference;
  }
  
  public void setOperation(final OperationType pOperation) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fOperation = pOperation;
  }
  
  public void setAccess(final AccessibilityLevel pAccess) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fAccess = pAccess;
  }
  
  public void setPriority(final Integer pPriority) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fPriority = pPriority;
  }
  
  @Override
  public String patternName() {
    return "org.mondo.collaboration.security.increment.policy.explicitJudgementOnReference";
  }
  
  @Override
  public List<String> parameterNames() {
    return ExplicitJudgementOnReferenceMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fUser, fSource, fTarget, fReference, fOperation, fAccess, fPriority};
  }
  
  @Override
  public ExplicitJudgementOnReferenceMatch toImmutable() {
    return isMutable() ? newMatch(fUser, fSource, fTarget, fReference, fOperation, fAccess, fPriority) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"user\"=" + prettyPrintValue(fUser) + ", ");
    result.append("\"source\"=" + prettyPrintValue(fSource) + ", ");
    result.append("\"target\"=" + prettyPrintValue(fTarget) + ", ");
    result.append("\"reference\"=" + prettyPrintValue(fReference) + ", ");
    result.append("\"operation\"=" + prettyPrintValue(fOperation) + ", ");
    result.append("\"access\"=" + prettyPrintValue(fAccess) + ", ");
    result.append("\"priority\"=" + prettyPrintValue(fPriority));
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    return Objects.hash (fUser, fSource, fTarget, fReference, fOperation, fAccess, fPriority);
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
        return true;
    if (obj == null) {
        return false;
    }
    if ((obj instanceof ExplicitJudgementOnReferenceMatch)) {
        ExplicitJudgementOnReferenceMatch other = (ExplicitJudgementOnReferenceMatch) obj;
        return Objects.equals(fUser, other.fUser) && Objects.equals(fSource, other.fSource) && Objects.equals(fTarget, other.fTarget) && Objects.equals(fReference, other.fReference) && Objects.equals(fOperation, other.fOperation) && Objects.equals(fAccess, other.fAccess) && Objects.equals(fPriority, other.fPriority);
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
  public ExplicitJudgementOnReferenceQuerySpecification specification() {
    try {
        return ExplicitJudgementOnReferenceQuerySpecification.instance();
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
  public static ExplicitJudgementOnReferenceMatch newEmptyMatch() {
    return new Mutable(null, null, null, null, null, null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pSource the fixed value of pattern parameter source, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pReference the fixed value of pattern parameter reference, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pAccess the fixed value of pattern parameter access, or null if not bound.
   * @param pPriority the fixed value of pattern parameter priority, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static ExplicitJudgementOnReferenceMatch newMutableMatch(final String pUser, final EObject pSource, final EObject pTarget, final EReference pReference, final OperationType pOperation, final AccessibilityLevel pAccess, final Integer pPriority) {
    return new Mutable(pUser, pSource, pTarget, pReference, pOperation, pAccess, pPriority);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pSource the fixed value of pattern parameter source, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pReference the fixed value of pattern parameter reference, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pAccess the fixed value of pattern parameter access, or null if not bound.
   * @param pPriority the fixed value of pattern parameter priority, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static ExplicitJudgementOnReferenceMatch newMatch(final String pUser, final EObject pSource, final EObject pTarget, final EReference pReference, final OperationType pOperation, final AccessibilityLevel pAccess, final Integer pPriority) {
    return new Immutable(pUser, pSource, pTarget, pReference, pOperation, pAccess, pPriority);
  }
  
  private static final class Mutable extends ExplicitJudgementOnReferenceMatch {
    Mutable(final String pUser, final EObject pSource, final EObject pTarget, final EReference pReference, final OperationType pOperation, final AccessibilityLevel pAccess, final Integer pPriority) {
      super(pUser, pSource, pTarget, pReference, pOperation, pAccess, pPriority);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends ExplicitJudgementOnReferenceMatch {
    Immutable(final String pUser, final EObject pSource, final EObject pTarget, final EReference pReference, final OperationType pOperation, final AccessibilityLevel pAccess, final Integer pPriority) {
      super(pUser, pSource, pTarget, pReference, pOperation, pAccess, pPriority);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
