/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy.vql
 */
package org.mondo.collaboration.security.increment.policy;

import WTSpec4M.SystemTimer;
import WTSpec4M.WT;
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
import org.mondo.collaboration.security.increment.policy.ReferenceitsTimersMatch;
import org.mondo.collaboration.security.increment.policy.util.ReferenceitsTimersQuerySpecification;

/**
 * Generated pattern matcher API of the org.mondo.collaboration.security.increment.policy.referenceitsTimers pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link ReferenceitsTimersMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern referenceitsTimers(root : WT, timer : SystemTimer) {
 * 	WT.itsTimers(root, timer);
 * }
 * </pre></code>
 * 
 * @see ReferenceitsTimersMatch
 *  @see ReferenceitsTimersProcessor
 * @see ReferenceitsTimersQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class ReferenceitsTimersMatcher extends BaseMatcher<ReferenceitsTimersMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static ReferenceitsTimersMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    ReferenceitsTimersMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
        matcher = (ReferenceitsTimersMatcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static ReferenceitsTimersMatcher create() throws ViatraQueryException {
    return new ReferenceitsTimersMatcher();
  }
  
  private final static int POSITION_ROOT = 0;
  
  private final static int POSITION_TIMER = 1;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ReferenceitsTimersMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private ReferenceitsTimersMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pRoot the fixed value of pattern parameter root, or null if not bound.
   * @param pTimer the fixed value of pattern parameter timer, or null if not bound.
   * @return matches represented as a ReferenceitsTimersMatch object.
   * 
   */
  public Collection<ReferenceitsTimersMatch> getAllMatches(final WT pRoot, final SystemTimer pTimer) {
    return rawGetAllMatches(new Object[]{pRoot, pTimer});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pRoot the fixed value of pattern parameter root, or null if not bound.
   * @param pTimer the fixed value of pattern parameter timer, or null if not bound.
   * @return a match represented as a ReferenceitsTimersMatch object, or null if no match is found.
   * 
   */
  public ReferenceitsTimersMatch getOneArbitraryMatch(final WT pRoot, final SystemTimer pTimer) {
    return rawGetOneArbitraryMatch(new Object[]{pRoot, pTimer});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pRoot the fixed value of pattern parameter root, or null if not bound.
   * @param pTimer the fixed value of pattern parameter timer, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final WT pRoot, final SystemTimer pTimer) {
    return rawHasMatch(new Object[]{pRoot, pTimer});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pRoot the fixed value of pattern parameter root, or null if not bound.
   * @param pTimer the fixed value of pattern parameter timer, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final WT pRoot, final SystemTimer pTimer) {
    return rawCountMatches(new Object[]{pRoot, pTimer});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pRoot the fixed value of pattern parameter root, or null if not bound.
   * @param pTimer the fixed value of pattern parameter timer, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final WT pRoot, final SystemTimer pTimer, final IMatchProcessor<? super ReferenceitsTimersMatch> processor) {
    rawForEachMatch(new Object[]{pRoot, pTimer}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pRoot the fixed value of pattern parameter root, or null if not bound.
   * @param pTimer the fixed value of pattern parameter timer, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final WT pRoot, final SystemTimer pTimer, final IMatchProcessor<? super ReferenceitsTimersMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pRoot, pTimer}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pRoot the fixed value of pattern parameter root, or null if not bound.
   * @param pTimer the fixed value of pattern parameter timer, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public ReferenceitsTimersMatch newMatch(final WT pRoot, final SystemTimer pTimer) {
    return ReferenceitsTimersMatch.newMatch(pRoot, pTimer);
  }
  
  /**
   * Retrieve the set of values that occur in matches for root.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<WT> rawAccumulateAllValuesOfroot(final Object[] parameters) {
    Set<WT> results = new HashSet<WT>();
    rawAccumulateAllValues(POSITION_ROOT, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for root.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<WT> getAllValuesOfroot() {
    return rawAccumulateAllValuesOfroot(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for root.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<WT> getAllValuesOfroot(final ReferenceitsTimersMatch partialMatch) {
    return rawAccumulateAllValuesOfroot(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for root.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<WT> getAllValuesOfroot(final SystemTimer pTimer) {
    return rawAccumulateAllValuesOfroot(new Object[]{
    null, 
    pTimer
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for timer.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<SystemTimer> rawAccumulateAllValuesOftimer(final Object[] parameters) {
    Set<SystemTimer> results = new HashSet<SystemTimer>();
    rawAccumulateAllValues(POSITION_TIMER, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for timer.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<SystemTimer> getAllValuesOftimer() {
    return rawAccumulateAllValuesOftimer(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for timer.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<SystemTimer> getAllValuesOftimer(final ReferenceitsTimersMatch partialMatch) {
    return rawAccumulateAllValuesOftimer(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for timer.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<SystemTimer> getAllValuesOftimer(final WT pRoot) {
    return rawAccumulateAllValuesOftimer(new Object[]{
    pRoot, 
    null
    });
  }
  
  @Override
  protected ReferenceitsTimersMatch tupleToMatch(final Tuple t) {
    try {
        return ReferenceitsTimersMatch.newMatch((WT) t.get(POSITION_ROOT), (SystemTimer) t.get(POSITION_TIMER));
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in tuple not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected ReferenceitsTimersMatch arrayToMatch(final Object[] match) {
    try {
        return ReferenceitsTimersMatch.newMatch((WT) match[POSITION_ROOT], (SystemTimer) match[POSITION_TIMER]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected ReferenceitsTimersMatch arrayToMatchMutable(final Object[] match) {
    try {
        return ReferenceitsTimersMatch.newMutableMatch((WT) match[POSITION_ROOT], (SystemTimer) match[POSITION_TIMER]);
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
  public static IQuerySpecification<ReferenceitsTimersMatcher> querySpecification() throws ViatraQueryException {
    return ReferenceitsTimersQuerySpecification.instance();
  }
}
