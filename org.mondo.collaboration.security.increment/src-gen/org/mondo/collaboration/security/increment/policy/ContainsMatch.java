/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/WTSpec4M_gen.vql
 */
package org.mondo.collaboration.security.increment.policy;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.mondo.collaboration.security.increment.policy.util.ContainsQuerySpecification;

/**
 * Pattern-specific match representation of the org.mondo.collaboration.security.increment.policy.contains pattern,
 * to be used in conjunction with {@link ContainsMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see ContainsMatcher
 *  @see ContainsProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class ContainsMatch extends BasePatternMatch {
  private EObject fContainer;
  
  private EObject fContained;
  
  private static List<String> parameterNames = makeImmutableList("container", "contained");
  
  private ContainsMatch(final EObject pContainer, final EObject pContained) {
    this.fContainer = pContainer;
    this.fContained = pContained;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("container".equals(parameterName)) return this.fContainer;
    if ("contained".equals(parameterName)) return this.fContained;
    return null;
  }
  
  public EObject getContainer() {
    return this.fContainer;
  }
  
  public EObject getContained() {
    return this.fContained;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("container".equals(parameterName) ) {
        this.fContainer = (EObject) newValue;
        return true;
    }
    if ("contained".equals(parameterName) ) {
        this.fContained = (EObject) newValue;
        return true;
    }
    return false;
  }
  
  public void setContainer(final EObject pContainer) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fContainer = pContainer;
  }
  
  public void setContained(final EObject pContained) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fContained = pContained;
  }
  
  @Override
  public String patternName() {
    return "org.mondo.collaboration.security.increment.policy.contains";
  }
  
  @Override
  public List<String> parameterNames() {
    return ContainsMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fContainer, fContained};
  }
  
  @Override
  public ContainsMatch toImmutable() {
    return isMutable() ? newMatch(fContainer, fContained) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"container\"=" + prettyPrintValue(fContainer) + ", ");
    result.append("\"contained\"=" + prettyPrintValue(fContained));
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    return Objects.hash (fContainer, fContained);
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
        return true;
    if (obj == null) {
        return false;
    }
    if ((obj instanceof ContainsMatch)) {
        ContainsMatch other = (ContainsMatch) obj;
        return Objects.equals(fContainer, other.fContainer) && Objects.equals(fContained, other.fContained);
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
  public ContainsQuerySpecification specification() {
    try {
        return ContainsQuerySpecification.instance();
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
  public static ContainsMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pContainer the fixed value of pattern parameter container, or null if not bound.
   * @param pContained the fixed value of pattern parameter contained, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static ContainsMatch newMutableMatch(final EObject pContainer, final EObject pContained) {
    return new Mutable(pContainer, pContained);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pContainer the fixed value of pattern parameter container, or null if not bound.
   * @param pContained the fixed value of pattern parameter contained, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static ContainsMatch newMatch(final EObject pContainer, final EObject pContained) {
    return new Immutable(pContainer, pContained);
  }
  
  private static final class Mutable extends ContainsMatch {
    Mutable(final EObject pContainer, final EObject pContained) {
      super(pContainer, pContained);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends ContainsMatch {
    Immutable(final EObject pContainer, final EObject pContained) {
      super(pContainer, pContained);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
