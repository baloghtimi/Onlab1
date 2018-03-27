/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy_gen.vql
 */
package org.mondo.collaboration.security.increment.policy;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.mondo.collaboration.security.increment.policy.util.EffectiveJudgement_at_1QuerySpecification;
import org.mondo.collaboration.security.increment.vocabulary.AccessibilityLevel;
import org.mondo.collaboration.security.increment.vocabulary.OperationType;

/**
 * Pattern-specific match representation of the org.mondo.collaboration.security.increment.policy.effectiveJudgement_at_1 pattern,
 * to be used in conjunction with {@link EffectiveJudgement_at_1Matcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see EffectiveJudgement_at_1Matcher
 *  @see EffectiveJudgement_at_1Processor
 * 
 */
@SuppressWarnings("all")
public abstract class EffectiveJudgement_at_1Match extends BasePatternMatch {
  private String fUser;
  
  private EObject fAsset;
  
  private Object fOperation;
  
  private Object fAccess;
  
  private static List<String> parameterNames = makeImmutableList("user", "asset", "operation", "access");
  
  private EffectiveJudgement_at_1Match(final String pUser, final EObject pAsset, final Object pOperation, final Object pAccess) {
    this.fUser = pUser;
    this.fAsset = pAsset;
    this.fOperation = pOperation;
    this.fAccess = pAccess;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("user".equals(parameterName)) return this.fUser;
    if ("asset".equals(parameterName)) return this.fAsset;
    if ("operation".equals(parameterName)) return this.fOperation;
    if ("access".equals(parameterName)) return this.fAccess;
    return null;
  }
  
  public String getUser() {
    return this.fUser;
  }
  
  public EObject getAsset() {
    return this.fAsset;
  }
  
  public Object getOperation() {
    return this.fOperation;
  }
  
  public Object getAccess() {
    return this.fAccess;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("user".equals(parameterName) ) {
        this.fUser = (String) newValue;
        return true;
    }
    if ("asset".equals(parameterName) ) {
        this.fAsset = (EObject) newValue;
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
    return false;
  }
  
  public void setUser(final String pUser) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fUser = pUser;
  }
  
  public void setAsset(final EObject pAsset) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fAsset = pAsset;
  }
  
  public void setOperation(final Object pOperation) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fOperation = pOperation;
  }
  
  public void setAccess(final Object pAccess) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fAccess = pAccess;
  }
  
  @Override
  public String patternName() {
    return "org.mondo.collaboration.security.increment.policy.effectiveJudgement_at_1";
  }
  
  @Override
  public List<String> parameterNames() {
    return EffectiveJudgement_at_1Match.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fUser, fAsset, fOperation, fAccess};
  }
  
  @Override
  public EffectiveJudgement_at_1Match toImmutable() {
    return isMutable() ? newMatch(fUser, fAsset, fOperation, fAccess) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"user\"=" + prettyPrintValue(fUser) + ", ");
    result.append("\"asset\"=" + prettyPrintValue(fAsset) + ", ");
    result.append("\"operation\"=" + prettyPrintValue(fOperation) + ", ");
    result.append("\"access\"=" + prettyPrintValue(fAccess));
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    return Objects.hash (fUser, fAsset, fOperation, fAccess);
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
        return true;
    if (obj == null) {
        return false;
    }
    if ((obj instanceof EffectiveJudgement_at_1Match)) {
        EffectiveJudgement_at_1Match other = (EffectiveJudgement_at_1Match) obj;
        return Objects.equals(fUser, other.fUser) && Objects.equals(fAsset, other.fAsset) && Objects.equals(fOperation, other.fOperation) && Objects.equals(fAccess, other.fAccess);
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
  public EffectiveJudgement_at_1QuerySpecification specification() {
    try {
        return EffectiveJudgement_at_1QuerySpecification.instance();
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
  public static EffectiveJudgement_at_1Match newEmptyMatch() {
    return new Mutable(null, null, null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pAsset the fixed value of pattern parameter asset, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pAccess the fixed value of pattern parameter access, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static EffectiveJudgement_at_1Match newMutableMatch(final String pUser, final EObject pAsset, final Object pOperation, final Object pAccess) {
    return new Mutable(pUser, pAsset, pOperation, pAccess);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pAsset the fixed value of pattern parameter asset, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pAccess the fixed value of pattern parameter access, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static EffectiveJudgement_at_1Match newMatch(final String pUser, final EObject pAsset, final Object pOperation, final Object pAccess) {
    return new Immutable(pUser, pAsset, pOperation, pAccess);
  }
  
  private static final class Mutable extends EffectiveJudgement_at_1Match {
    Mutable(final String pUser, final EObject pAsset, final Object pOperation, final Object pAccess) {
      super(pUser, pAsset, pOperation, pAccess);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends EffectiveJudgement_at_1Match {
    Immutable(final String pUser, final EObject pAsset, final Object pOperation, final Object pAccess) {
      super(pUser, pAsset, pOperation, pAccess);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
