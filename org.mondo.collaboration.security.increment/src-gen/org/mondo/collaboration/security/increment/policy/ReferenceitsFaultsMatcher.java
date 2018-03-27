/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy.vql
 */
package org.mondo.collaboration.security.increment.policy;

import WTSpec4M.SystemFault;
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
import org.mondo.collaboration.security.increment.policy.ReferenceitsFaultsMatch;
import org.mondo.collaboration.security.increment.policy.util.ReferenceitsFaultsQuerySpecification;

/**
 * Generated pattern matcher API of the org.mondo.collaboration.security.increment.policy.referenceitsFaults pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link ReferenceitsFaultsMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern referenceitsFaults(root : WT, fault : SystemFault) {
 * 	WT.itsFaults(root, fault);
 * }
 * </pre></code>
 * 
 * @see ReferenceitsFaultsMatch
 *  @see ReferenceitsFaultsProcessor
 * @see ReferenceitsFaultsQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class ReferenceitsFaultsMatcher extends BaseMatcher<ReferenceitsFaultsMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static ReferenceitsFaultsMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    ReferenceitsFaultsMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
        matcher = (ReferenceitsFaultsMatcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static ReferenceitsFaultsMatcher create() throws ViatraQueryException {
    return new ReferenceitsFaultsMatcher();
  }
  
  private final static int POSITION_ROOT = 0;
  
  private final static int POSITION_FAULT = 1;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ReferenceitsFaultsMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private ReferenceitsFaultsMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pRoot the fixed value of pattern parameter root, or null if not bound.
   * @param pFault the fixed value of pattern parameter fault, or null if not bound.
   * @return matches represented as a ReferenceitsFaultsMatch object.
   * 
   */
  public Collection<ReferenceitsFaultsMatch> getAllMatches(final WT pRoot, final SystemFault pFault) {
    return rawGetAllMatches(new Object[]{pRoot, pFault});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pRoot the fixed value of pattern parameter root, or null if not bound.
   * @param pFault the fixed value of pattern parameter fault, or null if not bound.
   * @return a match represented as a ReferenceitsFaultsMatch object, or null if no match is found.
   * 
   */
  public ReferenceitsFaultsMatch getOneArbitraryMatch(final WT pRoot, final SystemFault pFault) {
    return rawGetOneArbitraryMatch(new Object[]{pRoot, pFault});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pRoot the fixed value of pattern parameter root, or null if not bound.
   * @param pFault the fixed value of pattern parameter fault, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final WT pRoot, final SystemFault pFault) {
    return rawHasMatch(new Object[]{pRoot, pFault});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pRoot the fixed value of pattern parameter root, or null if not bound.
   * @param pFault the fixed value of pattern parameter fault, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final WT pRoot, final SystemFault pFault) {
    return rawCountMatches(new Object[]{pRoot, pFault});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pRoot the fixed value of pattern parameter root, or null if not bound.
   * @param pFault the fixed value of pattern parameter fault, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final WT pRoot, final SystemFault pFault, final IMatchProcessor<? super ReferenceitsFaultsMatch> processor) {
    rawForEachMatch(new Object[]{pRoot, pFault}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pRoot the fixed value of pattern parameter root, or null if not bound.
   * @param pFault the fixed value of pattern parameter fault, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final WT pRoot, final SystemFault pFault, final IMatchProcessor<? super ReferenceitsFaultsMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pRoot, pFault}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pRoot the fixed value of pattern parameter root, or null if not bound.
   * @param pFault the fixed value of pattern parameter fault, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public ReferenceitsFaultsMatch newMatch(final WT pRoot, final SystemFault pFault) {
    return ReferenceitsFaultsMatch.newMatch(pRoot, pFault);
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
  public Set<WT> getAllValuesOfroot(final ReferenceitsFaultsMatch partialMatch) {
    return rawAccumulateAllValuesOfroot(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for root.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<WT> getAllValuesOfroot(final SystemFault pFault) {
    return rawAccumulateAllValuesOfroot(new Object[]{
    null, 
    pFault
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for fault.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<SystemFault> rawAccumulateAllValuesOffault(final Object[] parameters) {
    Set<SystemFault> results = new HashSet<SystemFault>();
    rawAccumulateAllValues(POSITION_FAULT, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for fault.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<SystemFault> getAllValuesOffault() {
    return rawAccumulateAllValuesOffault(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for fault.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<SystemFault> getAllValuesOffault(final ReferenceitsFaultsMatch partialMatch) {
    return rawAccumulateAllValuesOffault(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for fault.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<SystemFault> getAllValuesOffault(final WT pRoot) {
    return rawAccumulateAllValuesOffault(new Object[]{
    pRoot, 
    null
    });
  }
  
  @Override
  protected ReferenceitsFaultsMatch tupleToMatch(final Tuple t) {
    try {
        return ReferenceitsFaultsMatch.newMatch((WT) t.get(POSITION_ROOT), (SystemFault) t.get(POSITION_FAULT));
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in tuple not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected ReferenceitsFaultsMatch arrayToMatch(final Object[] match) {
    try {
        return ReferenceitsFaultsMatch.newMatch((WT) match[POSITION_ROOT], (SystemFault) match[POSITION_FAULT]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected ReferenceitsFaultsMatch arrayToMatchMutable(final Object[] match) {
    try {
        return ReferenceitsFaultsMatch.newMutableMatch((WT) match[POSITION_ROOT], (SystemFault) match[POSITION_FAULT]);
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
  public static IQuerySpecification<ReferenceitsFaultsMatcher> querySpecification() throws ViatraQueryException {
    return ReferenceitsFaultsQuerySpecification.instance();
  }
}
