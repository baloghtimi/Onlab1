/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy_gen.vql
 */
package org.mondo.collaboration.security.increment.policy;

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
import org.mondo.collaboration.security.increment.policy.ResolutionMatch;
import org.mondo.collaboration.security.increment.policy.util.ResolutionQuerySpecification;
import org.mondo.collaboration.security.increment.vocabulary.AccessibilityLevel;

/**
 * Generated pattern matcher API of the org.mondo.collaboration.security.increment.policy.resolution pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link ResolutionMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern resolution(dominatedAccess, prevailingAccess)
 * {
 * 	dominatedAccess == AccessibilityLevel::ALLOW;
 * 	prevailingAccess == AccessibilityLevel::DENY;
 * }
 * </pre></code>
 * 
 * @see ResolutionMatch
 *  @see ResolutionProcessor
 * @see ResolutionQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class ResolutionMatcher extends BaseMatcher<ResolutionMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static ResolutionMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    ResolutionMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
        matcher = (ResolutionMatcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static ResolutionMatcher create() throws ViatraQueryException {
    return new ResolutionMatcher();
  }
  
  private final static int POSITION_DOMINATEDACCESS = 0;
  
  private final static int POSITION_PREVAILINGACCESS = 1;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ResolutionMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private ResolutionMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pDominatedAccess the fixed value of pattern parameter dominatedAccess, or null if not bound.
   * @param pPrevailingAccess the fixed value of pattern parameter prevailingAccess, or null if not bound.
   * @return matches represented as a ResolutionMatch object.
   * 
   */
  public Collection<ResolutionMatch> getAllMatches(final AccessibilityLevel pDominatedAccess, final AccessibilityLevel pPrevailingAccess) {
    return rawGetAllMatches(new Object[]{pDominatedAccess, pPrevailingAccess});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pDominatedAccess the fixed value of pattern parameter dominatedAccess, or null if not bound.
   * @param pPrevailingAccess the fixed value of pattern parameter prevailingAccess, or null if not bound.
   * @return a match represented as a ResolutionMatch object, or null if no match is found.
   * 
   */
  public ResolutionMatch getOneArbitraryMatch(final AccessibilityLevel pDominatedAccess, final AccessibilityLevel pPrevailingAccess) {
    return rawGetOneArbitraryMatch(new Object[]{pDominatedAccess, pPrevailingAccess});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pDominatedAccess the fixed value of pattern parameter dominatedAccess, or null if not bound.
   * @param pPrevailingAccess the fixed value of pattern parameter prevailingAccess, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final AccessibilityLevel pDominatedAccess, final AccessibilityLevel pPrevailingAccess) {
    return rawHasMatch(new Object[]{pDominatedAccess, pPrevailingAccess});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pDominatedAccess the fixed value of pattern parameter dominatedAccess, or null if not bound.
   * @param pPrevailingAccess the fixed value of pattern parameter prevailingAccess, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final AccessibilityLevel pDominatedAccess, final AccessibilityLevel pPrevailingAccess) {
    return rawCountMatches(new Object[]{pDominatedAccess, pPrevailingAccess});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pDominatedAccess the fixed value of pattern parameter dominatedAccess, or null if not bound.
   * @param pPrevailingAccess the fixed value of pattern parameter prevailingAccess, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final AccessibilityLevel pDominatedAccess, final AccessibilityLevel pPrevailingAccess, final IMatchProcessor<? super ResolutionMatch> processor) {
    rawForEachMatch(new Object[]{pDominatedAccess, pPrevailingAccess}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pDominatedAccess the fixed value of pattern parameter dominatedAccess, or null if not bound.
   * @param pPrevailingAccess the fixed value of pattern parameter prevailingAccess, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final AccessibilityLevel pDominatedAccess, final AccessibilityLevel pPrevailingAccess, final IMatchProcessor<? super ResolutionMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pDominatedAccess, pPrevailingAccess}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pDominatedAccess the fixed value of pattern parameter dominatedAccess, or null if not bound.
   * @param pPrevailingAccess the fixed value of pattern parameter prevailingAccess, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public ResolutionMatch newMatch(final AccessibilityLevel pDominatedAccess, final AccessibilityLevel pPrevailingAccess) {
    return ResolutionMatch.newMatch(pDominatedAccess, pPrevailingAccess);
  }
  
  /**
   * Retrieve the set of values that occur in matches for dominatedAccess.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<AccessibilityLevel> rawAccumulateAllValuesOfdominatedAccess(final Object[] parameters) {
    Set<AccessibilityLevel> results = new HashSet<AccessibilityLevel>();
    rawAccumulateAllValues(POSITION_DOMINATEDACCESS, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for dominatedAccess.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AccessibilityLevel> getAllValuesOfdominatedAccess() {
    return rawAccumulateAllValuesOfdominatedAccess(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for dominatedAccess.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AccessibilityLevel> getAllValuesOfdominatedAccess(final ResolutionMatch partialMatch) {
    return rawAccumulateAllValuesOfdominatedAccess(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for dominatedAccess.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AccessibilityLevel> getAllValuesOfdominatedAccess(final AccessibilityLevel pPrevailingAccess) {
    return rawAccumulateAllValuesOfdominatedAccess(new Object[]{
    null, 
    pPrevailingAccess
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for prevailingAccess.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<AccessibilityLevel> rawAccumulateAllValuesOfprevailingAccess(final Object[] parameters) {
    Set<AccessibilityLevel> results = new HashSet<AccessibilityLevel>();
    rawAccumulateAllValues(POSITION_PREVAILINGACCESS, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for prevailingAccess.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AccessibilityLevel> getAllValuesOfprevailingAccess() {
    return rawAccumulateAllValuesOfprevailingAccess(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for prevailingAccess.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AccessibilityLevel> getAllValuesOfprevailingAccess(final ResolutionMatch partialMatch) {
    return rawAccumulateAllValuesOfprevailingAccess(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for prevailingAccess.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AccessibilityLevel> getAllValuesOfprevailingAccess(final AccessibilityLevel pDominatedAccess) {
    return rawAccumulateAllValuesOfprevailingAccess(new Object[]{
    pDominatedAccess, 
    null
    });
  }
  
  @Override
  protected ResolutionMatch tupleToMatch(final Tuple t) {
    try {
        return ResolutionMatch.newMatch((AccessibilityLevel) t.get(POSITION_DOMINATEDACCESS), (AccessibilityLevel) t.get(POSITION_PREVAILINGACCESS));
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in tuple not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected ResolutionMatch arrayToMatch(final Object[] match) {
    try {
        return ResolutionMatch.newMatch((AccessibilityLevel) match[POSITION_DOMINATEDACCESS], (AccessibilityLevel) match[POSITION_PREVAILINGACCESS]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected ResolutionMatch arrayToMatchMutable(final Object[] match) {
    try {
        return ResolutionMatch.newMutableMatch((AccessibilityLevel) match[POSITION_DOMINATEDACCESS], (AccessibilityLevel) match[POSITION_PREVAILINGACCESS]);
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
  public static IQuerySpecification<ResolutionMatcher> querySpecification() throws ViatraQueryException {
    return ResolutionQuerySpecification.instance();
  }
}
