/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/windturbineS_gen.vql
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
import org.mondo.collaboration.security.increment.policy.util.AttributeAssetQuerySpecification;

/**
 * Pattern-specific match representation of the org.mondo.collaboration.security.increment.policy.attributeAsset pattern,
 * to be used in conjunction with {@link AttributeAssetMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see AttributeAssetMatcher
 *  @see AttributeAssetProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class AttributeAssetMatch extends BasePatternMatch {
  private EObject fSource;
  
  private Object fValue;
  
  private EAttribute fAttribute;
  
  private static List<String> parameterNames = makeImmutableList("source", "value", "attribute");
  
  private AttributeAssetMatch(final EObject pSource, final Object pValue, final EAttribute pAttribute) {
    this.fSource = pSource;
    this.fValue = pValue;
    this.fAttribute = pAttribute;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("source".equals(parameterName)) return this.fSource;
    if ("value".equals(parameterName)) return this.fValue;
    if ("attribute".equals(parameterName)) return this.fAttribute;
    return null;
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
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
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
    return false;
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
  
  @Override
  public String patternName() {
    return "org.mondo.collaboration.security.increment.policy.attributeAsset";
  }
  
  @Override
  public List<String> parameterNames() {
    return AttributeAssetMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fSource, fValue, fAttribute};
  }
  
  @Override
  public AttributeAssetMatch toImmutable() {
    return isMutable() ? newMatch(fSource, fValue, fAttribute) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"source\"=" + prettyPrintValue(fSource) + ", ");
    result.append("\"value\"=" + prettyPrintValue(fValue) + ", ");
    result.append("\"attribute\"=" + prettyPrintValue(fAttribute));
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    return Objects.hash (fSource, fValue, fAttribute);
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
        return true;
    if (obj == null) {
        return false;
    }
    if ((obj instanceof AttributeAssetMatch)) {
        AttributeAssetMatch other = (AttributeAssetMatch) obj;
        return Objects.equals(fSource, other.fSource) && Objects.equals(fValue, other.fValue) && Objects.equals(fAttribute, other.fAttribute);
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
  public AttributeAssetQuerySpecification specification() {
    try {
        return AttributeAssetQuerySpecification.instance();
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
  public static AttributeAssetMatch newEmptyMatch() {
    return new Mutable(null, null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pSource the fixed value of pattern parameter source, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static AttributeAssetMatch newMutableMatch(final EObject pSource, final Object pValue, final EAttribute pAttribute) {
    return new Mutable(pSource, pValue, pAttribute);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pSource the fixed value of pattern parameter source, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static AttributeAssetMatch newMatch(final EObject pSource, final Object pValue, final EAttribute pAttribute) {
    return new Immutable(pSource, pValue, pAttribute);
  }
  
  private static final class Mutable extends AttributeAssetMatch {
    Mutable(final EObject pSource, final Object pValue, final EAttribute pAttribute) {
      super(pSource, pValue, pAttribute);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends AttributeAssetMatch {
    Immutable(final EObject pSource, final Object pValue, final EAttribute pAttribute) {
      super(pSource, pValue, pAttribute);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
