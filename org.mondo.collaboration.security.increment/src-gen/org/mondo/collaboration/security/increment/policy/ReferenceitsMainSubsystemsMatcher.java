/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy.vql
 */
package org.mondo.collaboration.security.increment.policy;

import WTSpec4M.MainSubsystem;
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
import org.mondo.collaboration.security.increment.policy.ReferenceitsMainSubsystemsMatch;
import org.mondo.collaboration.security.increment.policy.util.ReferenceitsMainSubsystemsQuerySpecification;

/**
 * Generated pattern matcher API of the org.mondo.collaboration.security.increment.policy.referenceitsMainSubsystems pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link ReferenceitsMainSubsystemsMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern referenceitsMainSubsystems(root : WT, subsystem : MainSubsystem) {
 * 	WT.itsSubsystems(root, subsystem);
 * }
 * </pre></code>
 * 
 * @see ReferenceitsMainSubsystemsMatch
 *  @see ReferenceitsMainSubsystemsProcessor
 * @see ReferenceitsMainSubsystemsQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class ReferenceitsMainSubsystemsMatcher extends BaseMatcher<ReferenceitsMainSubsystemsMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static ReferenceitsMainSubsystemsMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    ReferenceitsMainSubsystemsMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
        matcher = (ReferenceitsMainSubsystemsMatcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static ReferenceitsMainSubsystemsMatcher create() throws ViatraQueryException {
    return new ReferenceitsMainSubsystemsMatcher();
  }
  
  private final static int POSITION_ROOT = 0;
  
  private final static int POSITION_SUBSYSTEM = 1;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ReferenceitsMainSubsystemsMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private ReferenceitsMainSubsystemsMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pRoot the fixed value of pattern parameter root, or null if not bound.
   * @param pSubsystem the fixed value of pattern parameter subsystem, or null if not bound.
   * @return matches represented as a ReferenceitsMainSubsystemsMatch object.
   * 
   */
  public Collection<ReferenceitsMainSubsystemsMatch> getAllMatches(final WT pRoot, final MainSubsystem pSubsystem) {
    return rawGetAllMatches(new Object[]{pRoot, pSubsystem});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pRoot the fixed value of pattern parameter root, or null if not bound.
   * @param pSubsystem the fixed value of pattern parameter subsystem, or null if not bound.
   * @return a match represented as a ReferenceitsMainSubsystemsMatch object, or null if no match is found.
   * 
   */
  public ReferenceitsMainSubsystemsMatch getOneArbitraryMatch(final WT pRoot, final MainSubsystem pSubsystem) {
    return rawGetOneArbitraryMatch(new Object[]{pRoot, pSubsystem});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pRoot the fixed value of pattern parameter root, or null if not bound.
   * @param pSubsystem the fixed value of pattern parameter subsystem, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final WT pRoot, final MainSubsystem pSubsystem) {
    return rawHasMatch(new Object[]{pRoot, pSubsystem});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pRoot the fixed value of pattern parameter root, or null if not bound.
   * @param pSubsystem the fixed value of pattern parameter subsystem, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final WT pRoot, final MainSubsystem pSubsystem) {
    return rawCountMatches(new Object[]{pRoot, pSubsystem});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pRoot the fixed value of pattern parameter root, or null if not bound.
   * @param pSubsystem the fixed value of pattern parameter subsystem, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final WT pRoot, final MainSubsystem pSubsystem, final IMatchProcessor<? super ReferenceitsMainSubsystemsMatch> processor) {
    rawForEachMatch(new Object[]{pRoot, pSubsystem}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pRoot the fixed value of pattern parameter root, or null if not bound.
   * @param pSubsystem the fixed value of pattern parameter subsystem, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final WT pRoot, final MainSubsystem pSubsystem, final IMatchProcessor<? super ReferenceitsMainSubsystemsMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pRoot, pSubsystem}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pRoot the fixed value of pattern parameter root, or null if not bound.
   * @param pSubsystem the fixed value of pattern parameter subsystem, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public ReferenceitsMainSubsystemsMatch newMatch(final WT pRoot, final MainSubsystem pSubsystem) {
    return ReferenceitsMainSubsystemsMatch.newMatch(pRoot, pSubsystem);
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
  public Set<WT> getAllValuesOfroot(final ReferenceitsMainSubsystemsMatch partialMatch) {
    return rawAccumulateAllValuesOfroot(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for root.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<WT> getAllValuesOfroot(final MainSubsystem pSubsystem) {
    return rawAccumulateAllValuesOfroot(new Object[]{
    null, 
    pSubsystem
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for subsystem.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<MainSubsystem> rawAccumulateAllValuesOfsubsystem(final Object[] parameters) {
    Set<MainSubsystem> results = new HashSet<MainSubsystem>();
    rawAccumulateAllValues(POSITION_SUBSYSTEM, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for subsystem.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<MainSubsystem> getAllValuesOfsubsystem() {
    return rawAccumulateAllValuesOfsubsystem(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for subsystem.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<MainSubsystem> getAllValuesOfsubsystem(final ReferenceitsMainSubsystemsMatch partialMatch) {
    return rawAccumulateAllValuesOfsubsystem(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for subsystem.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<MainSubsystem> getAllValuesOfsubsystem(final WT pRoot) {
    return rawAccumulateAllValuesOfsubsystem(new Object[]{
    pRoot, 
    null
    });
  }
  
  @Override
  protected ReferenceitsMainSubsystemsMatch tupleToMatch(final Tuple t) {
    try {
        return ReferenceitsMainSubsystemsMatch.newMatch((WT) t.get(POSITION_ROOT), (MainSubsystem) t.get(POSITION_SUBSYSTEM));
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in tuple not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected ReferenceitsMainSubsystemsMatch arrayToMatch(final Object[] match) {
    try {
        return ReferenceitsMainSubsystemsMatch.newMatch((WT) match[POSITION_ROOT], (MainSubsystem) match[POSITION_SUBSYSTEM]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected ReferenceitsMainSubsystemsMatch arrayToMatchMutable(final Object[] match) {
    try {
        return ReferenceitsMainSubsystemsMatch.newMutableMatch((WT) match[POSITION_ROOT], (MainSubsystem) match[POSITION_SUBSYSTEM]);
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
  public static IQuerySpecification<ReferenceitsMainSubsystemsMatcher> querySpecification() throws ViatraQueryException {
    return ReferenceitsMainSubsystemsQuerySpecification.instance();
  }
}
