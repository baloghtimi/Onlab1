/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy.vql
 */
package org.mondo.collaboration.security.increment.policy;

import WTSpec4M.MainSubsystem;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.mondo.collaboration.security.increment.policy.util.ObjectSubsystemWithNameQuerySpecification;

/**
 * Pattern-specific match representation of the org.mondo.collaboration.security.increment.policy.objectSubsystemWithName pattern,
 * to be used in conjunction with {@link ObjectSubsystemWithNameMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see ObjectSubsystemWithNameMatcher
 *  @see ObjectSubsystemWithNameProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class ObjectSubsystemWithNameMatch extends BasePatternMatch {
  private MainSubsystem fSubSystem;
  
  private String fName;
  
  private static List<String> parameterNames = makeImmutableList("subSystem", "name");
  
  private ObjectSubsystemWithNameMatch(final MainSubsystem pSubSystem, final String pName) {
    this.fSubSystem = pSubSystem;
    this.fName = pName;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("subSystem".equals(parameterName)) return this.fSubSystem;
    if ("name".equals(parameterName)) return this.fName;
    return null;
  }
  
  public MainSubsystem getSubSystem() {
    return this.fSubSystem;
  }
  
  public String getName() {
    return this.fName;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("subSystem".equals(parameterName) ) {
        this.fSubSystem = (MainSubsystem) newValue;
        return true;
    }
    if ("name".equals(parameterName) ) {
        this.fName = (String) newValue;
        return true;
    }
    return false;
  }
  
  public void setSubSystem(final MainSubsystem pSubSystem) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSubSystem = pSubSystem;
  }
  
  public void setName(final String pName) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fName = pName;
  }
  
  @Override
  public String patternName() {
    return "org.mondo.collaboration.security.increment.policy.objectSubsystemWithName";
  }
  
  @Override
  public List<String> parameterNames() {
    return ObjectSubsystemWithNameMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fSubSystem, fName};
  }
  
  @Override
  public ObjectSubsystemWithNameMatch toImmutable() {
    return isMutable() ? newMatch(fSubSystem, fName) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"subSystem\"=" + prettyPrintValue(fSubSystem) + ", ");
    result.append("\"name\"=" + prettyPrintValue(fName));
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    return Objects.hash (fSubSystem, fName);
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
        return true;
    if (obj == null) {
        return false;
    }
    if ((obj instanceof ObjectSubsystemWithNameMatch)) {
        ObjectSubsystemWithNameMatch other = (ObjectSubsystemWithNameMatch) obj;
        return Objects.equals(fSubSystem, other.fSubSystem) && Objects.equals(fName, other.fName);
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
  public ObjectSubsystemWithNameQuerySpecification specification() {
    try {
        return ObjectSubsystemWithNameQuerySpecification.instance();
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
  public static ObjectSubsystemWithNameMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pSubSystem the fixed value of pattern parameter subSystem, or null if not bound.
   * @param pName the fixed value of pattern parameter name, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static ObjectSubsystemWithNameMatch newMutableMatch(final MainSubsystem pSubSystem, final String pName) {
    return new Mutable(pSubSystem, pName);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pSubSystem the fixed value of pattern parameter subSystem, or null if not bound.
   * @param pName the fixed value of pattern parameter name, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static ObjectSubsystemWithNameMatch newMatch(final MainSubsystem pSubSystem, final String pName) {
    return new Immutable(pSubSystem, pName);
  }
  
  private static final class Mutable extends ObjectSubsystemWithNameMatch {
    Mutable(final MainSubsystem pSubSystem, final String pName) {
      super(pSubSystem, pName);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends ObjectSubsystemWithNameMatch {
    Immutable(final MainSubsystem pSubSystem, final String pName) {
      super(pSubSystem, pName);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
