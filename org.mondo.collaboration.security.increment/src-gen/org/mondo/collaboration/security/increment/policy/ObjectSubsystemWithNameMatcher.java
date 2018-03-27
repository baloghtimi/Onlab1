/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy.vql
 */
package org.mondo.collaboration.security.increment.policy;

import WTSpec4M.MainSubsystem;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import org.mondo.collaboration.security.increment.policy.ObjectSubsystemWithNameMatch;
import org.mondo.collaboration.security.increment.policy.util.ObjectSubsystemWithNameQuerySpecification;

/**
 * Generated pattern matcher API of the org.mondo.collaboration.security.increment.policy.objectSubsystemWithName pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link ObjectSubsystemWithNameMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern objectSubsystemWithName(subSystem : MainSubsystem, name : java String) {
 * 	MainSubsystem.sysId(subSystem, name);
 * }
 * </pre></code>
 * 
 * @see ObjectSubsystemWithNameMatch
 *  @see ObjectSubsystemWithNameProcessor
 * @see ObjectSubsystemWithNameQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class ObjectSubsystemWithNameMatcher extends BaseMatcher<ObjectSubsystemWithNameMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static ObjectSubsystemWithNameMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    ObjectSubsystemWithNameMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
        matcher = (ObjectSubsystemWithNameMatcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static ObjectSubsystemWithNameMatcher create() throws ViatraQueryException {
    return new ObjectSubsystemWithNameMatcher();
  }
  
  private final static int POSITION_SUBSYSTEM = 0;
  
  private final static int POSITION_NAME = 1;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ObjectSubsystemWithNameMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private ObjectSubsystemWithNameMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSubSystem the fixed value of pattern parameter subSystem, or null if not bound.
   * @param pName the fixed value of pattern parameter name, or null if not bound.
   * @return matches represented as a ObjectSubsystemWithNameMatch object.
   * 
   */
  public Collection<ObjectSubsystemWithNameMatch> getAllMatches(final MainSubsystem pSubSystem, final String pName) {
    return rawGetAllMatches(new Object[]{pSubSystem, pName});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSubSystem the fixed value of pattern parameter subSystem, or null if not bound.
   * @param pName the fixed value of pattern parameter name, or null if not bound.
   * @return a match represented as a ObjectSubsystemWithNameMatch object, or null if no match is found.
   * 
   */
  public ObjectSubsystemWithNameMatch getOneArbitraryMatch(final MainSubsystem pSubSystem, final String pName) {
    return rawGetOneArbitraryMatch(new Object[]{pSubSystem, pName});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pSubSystem the fixed value of pattern parameter subSystem, or null if not bound.
   * @param pName the fixed value of pattern parameter name, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final MainSubsystem pSubSystem, final String pName) {
    return rawHasMatch(new Object[]{pSubSystem, pName});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSubSystem the fixed value of pattern parameter subSystem, or null if not bound.
   * @param pName the fixed value of pattern parameter name, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final MainSubsystem pSubSystem, final String pName) {
    return rawCountMatches(new Object[]{pSubSystem, pName});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pSubSystem the fixed value of pattern parameter subSystem, or null if not bound.
   * @param pName the fixed value of pattern parameter name, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final MainSubsystem pSubSystem, final String pName, final IMatchProcessor<? super ObjectSubsystemWithNameMatch> processor) {
    rawForEachMatch(new Object[]{pSubSystem, pName}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSubSystem the fixed value of pattern parameter subSystem, or null if not bound.
   * @param pName the fixed value of pattern parameter name, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final MainSubsystem pSubSystem, final String pName, final IMatchProcessor<? super ObjectSubsystemWithNameMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pSubSystem, pName}, processor);
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
  public ObjectSubsystemWithNameMatch newMatch(final MainSubsystem pSubSystem, final String pName) {
    return ObjectSubsystemWithNameMatch.newMatch(pSubSystem, pName);
  }
  
  /**
   * Retrieve the set of values that occur in matches for subSystem.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<MainSubsystem> rawAccumulateAllValuesOfsubSystem(final Object[] parameters) {
    Set<MainSubsystem> results = new HashSet<MainSubsystem>();
    rawAccumulateAllValues(POSITION_SUBSYSTEM, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for subSystem.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<MainSubsystem> getAllValuesOfsubSystem() {
    return rawAccumulateAllValuesOfsubSystem(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for subSystem.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<MainSubsystem> getAllValuesOfsubSystem(final ObjectSubsystemWithNameMatch partialMatch) {
    return rawAccumulateAllValuesOfsubSystem(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for subSystem.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<MainSubsystem> getAllValuesOfsubSystem(final String pName) {
    return rawAccumulateAllValuesOfsubSystem(new Object[]{
    null, 
    pName
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for name.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<String> rawAccumulateAllValuesOfname(final Object[] parameters) {
    Set<String> results = new HashSet<String>();
    rawAccumulateAllValues(POSITION_NAME, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for name.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfname() {
    return rawAccumulateAllValuesOfname(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for name.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfname(final ObjectSubsystemWithNameMatch partialMatch) {
    return rawAccumulateAllValuesOfname(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for name.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfname(final MainSubsystem pSubSystem) {
    return rawAccumulateAllValuesOfname(new Object[]{
    pSubSystem, 
    null
    });
  }
  
  @Override
  protected ObjectSubsystemWithNameMatch tupleToMatch(final Tuple t) {
    try {
        return ObjectSubsystemWithNameMatch.newMatch((MainSubsystem) t.get(POSITION_SUBSYSTEM), (String) t.get(POSITION_NAME));
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in tuple not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected ObjectSubsystemWithNameMatch arrayToMatch(final Object[] match) {
    try {
        return ObjectSubsystemWithNameMatch.newMatch((MainSubsystem) match[POSITION_SUBSYSTEM], (String) match[POSITION_NAME]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected ObjectSubsystemWithNameMatch arrayToMatchMutable(final Object[] match) {
    try {
        return ObjectSubsystemWithNameMatch.newMutableMatch((MainSubsystem) match[POSITION_SUBSYSTEM], (String) match[POSITION_NAME]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<ObjectSubsystemWithNameMatcher> querySpecification() throws ViatraQueryException {
    return ObjectSubsystemWithNameQuerySpecification.instance();
  }
}
