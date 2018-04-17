/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy_judgement.vql
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
import org.mondo.collaboration.security.increment.policy.util.JudgementOnAttribute_at_weakQuerySpecification;

/**
 * Pattern-specific match representation of the org.mondo.collaboration.security.increment.policy.judgementOnAttribute_at_weak pattern,
 * to be used in conjunction with {@link JudgementOnAttribute_at_weakMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see JudgementOnAttribute_at_weakMatcher
 *  @see JudgementOnAttribute_at_weakProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class JudgementOnAttribute_at_weakMatch extends BasePatternMatch {
  private String fUser;
  
  private EObject fSource;
  
  private Object fValue;
  
  private EAttribute fAttribute;
  
  private Object fOperation;
  
  private Object fAccess;
  
  private static List<String> parameterNames = makeImmutableList("user", "source", "value", "attribute", "operation", "access");
  
  private JudgementOnAttribute_at_weakMatch(final String pUser, final EObject pSource, final Object pValue, final EAttribute pAttribute, final Object pOperation, final Object pAccess) {
    this.fUser = pUser;
    this.fSource = pSource;
    this.fValue = pValue;
    this.fAttribute = pAttribute;
    this.fOperation = pOperation;
    this.fAccess = pAccess;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("user".equals(parameterName)) return this.fUser;
    if ("source".equals(parameterName)) return this.fSource;
    if ("value".equals(parameterName)) return this.fValue;
    if ("attribute".equals(parameterName)) return this.fAttribute;
    if ("operation".equals(parameterName)) return this.fOperation;
    if ("access".equals(parameterName)) return this.fAccess;
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
    if ("operation".equals(parameterName) && newValue instanceof Object) {
        this.fOperation = (Object) newValue;
        return true;
    }
    if ("access".equals(parameterName) && newValue instanceof Object) {
        this.fAccess = (Object) newValue;
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
    return "org.mondo.collaboration.security.increment.policy.judgementOnAttribute_at_weak";
  }
  
  @Override
  public List<String> parameterNames() {
    return JudgementOnAttribute_at_weakMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fUser, fSource, fValue, fAttribute, fOperation, fAccess};
  }
  
  @Override
  public JudgementOnAttribute_at_weakMatch toImmutable() {
    return isMutable() ? newMatch(fUser, fSource, fValue, fAttribute, fOperation, fAccess) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"user\"=" + prettyPrintValue(fUser) + ", ");
    result.append("\"source\"=" + prettyPrintValue(fSource) + ", ");
    result.append("\"value\"=" + prettyPrintValue(fValue) + ", ");
    result.append("\"attribute\"=" + prettyPrintValue(fAttribute) + ", ");
    result.append("\"operation\"=" + prettyPrintValue(fOperation) + ", ");
    result.append("\"access\"=" + prettyPrintValue(fAccess));
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    return Objects.hash (fUser, fSource, fValue, fAttribute, fOperation, fAccess);
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
        return true;
    if (obj == null) {
        return false;
    }
    if ((obj instanceof JudgementOnAttribute_at_weakMatch)) {
        JudgementOnAttribute_at_weakMatch other = (JudgementOnAttribute_at_weakMatch) obj;
        return Objects.equals(fUser, other.fUser) && Objects.equals(fSource, other.fSource) && Objects.equals(fValue, other.fValue) && Objects.equals(fAttribute, other.fAttribute) && Objects.equals(fOperation, other.fOperation) && Objects.equals(fAccess, other.fAccess);
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
  public JudgementOnAttribute_at_weakQuerySpecification specification() {
    try {
        return JudgementOnAttribute_at_weakQuerySpecification.instance();
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
  public static JudgementOnAttribute_at_weakMatch newEmptyMatch() {
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
   * @param pAccess the fixed value of pattern parameter access, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static JudgementOnAttribute_at_weakMatch newMutableMatch(final String pUser, final EObject pSource, final Object pValue, final EAttribute pAttribute, final Object pOperation, final Object pAccess) {
    return new Mutable(pUser, pSource, pValue, pAttribute, pOperation, pAccess);
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
   * @param pAccess the fixed value of pattern parameter access, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static JudgementOnAttribute_at_weakMatch newMatch(final String pUser, final EObject pSource, final Object pValue, final EAttribute pAttribute, final Object pOperation, final Object pAccess) {
    return new Immutable(pUser, pSource, pValue, pAttribute, pOperation, pAccess);
  }
  
  private static final class Mutable extends JudgementOnAttribute_at_weakMatch {
    Mutable(final String pUser, final EObject pSource, final Object pValue, final EAttribute pAttribute, final Object pOperation, final Object pAccess) {
      super(pUser, pSource, pValue, pAttribute, pOperation, pAccess);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends JudgementOnAttribute_at_weakMatch {
    Immutable(final String pUser, final EObject pSource, final Object pValue, final EAttribute pAttribute, final Object pOperation, final Object pAccess) {
      super(pUser, pSource, pValue, pAttribute, pOperation, pAccess);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
