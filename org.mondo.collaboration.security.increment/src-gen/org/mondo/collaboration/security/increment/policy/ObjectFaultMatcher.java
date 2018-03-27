/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy.vql
 */
package org.mondo.collaboration.security.increment.policy;

import WTSpec4M.SystemFault;
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
import org.mondo.collaboration.security.increment.policy.ObjectFaultMatch;
import org.mondo.collaboration.security.increment.policy.util.ObjectFaultQuerySpecification;

/**
 * Generated pattern matcher API of the org.mondo.collaboration.security.increment.policy.objectFault pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link ObjectFaultMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern objectFault(fault : SystemFault) {
 * 	SystemFault(fault);
 * }
 * </pre></code>
 * 
 * @see ObjectFaultMatch
 *  @see ObjectFaultProcessor
 * @see ObjectFaultQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class ObjectFaultMatcher extends BaseMatcher<ObjectFaultMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static ObjectFaultMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    ObjectFaultMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
        matcher = (ObjectFaultMatcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static ObjectFaultMatcher create() throws ViatraQueryException {
    return new ObjectFaultMatcher();
  }
  
  private final static int POSITION_FAULT = 0;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ObjectFaultMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private ObjectFaultMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pFault the fixed value of pattern parameter fault, or null if not bound.
   * @return matches represented as a ObjectFaultMatch object.
   * 
   */
  public Collection<ObjectFaultMatch> getAllMatches(final SystemFault pFault) {
    return rawGetAllMatches(new Object[]{pFault});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pFault the fixed value of pattern parameter fault, or null if not bound.
   * @return a match represented as a ObjectFaultMatch object, or null if no match is found.
   * 
   */
  public ObjectFaultMatch getOneArbitraryMatch(final SystemFault pFault) {
    return rawGetOneArbitraryMatch(new Object[]{pFault});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pFault the fixed value of pattern parameter fault, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final SystemFault pFault) {
    return rawHasMatch(new Object[]{pFault});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pFault the fixed value of pattern parameter fault, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final SystemFault pFault) {
    return rawCountMatches(new Object[]{pFault});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pFault the fixed value of pattern parameter fault, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final SystemFault pFault, final IMatchProcessor<? super ObjectFaultMatch> processor) {
    rawForEachMatch(new Object[]{pFault}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pFault the fixed value of pattern parameter fault, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final SystemFault pFault, final IMatchProcessor<? super ObjectFaultMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pFault}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pFault the fixed value of pattern parameter fault, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public ObjectFaultMatch newMatch(final SystemFault pFault) {
    return ObjectFaultMatch.newMatch(pFault);
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
  
  @Override
  protected ObjectFaultMatch tupleToMatch(final Tuple t) {
    try {
        return ObjectFaultMatch.newMatch((SystemFault) t.get(POSITION_FAULT));
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in tuple not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected ObjectFaultMatch arrayToMatch(final Object[] match) {
    try {
        return ObjectFaultMatch.newMatch((SystemFault) match[POSITION_FAULT]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected ObjectFaultMatch arrayToMatchMutable(final Object[] match) {
    try {
        return ObjectFaultMatch.newMutableMatch((SystemFault) match[POSITION_FAULT]);
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
  public static IQuerySpecification<ObjectFaultMatcher> querySpecification() throws ViatraQueryException {
    return ObjectFaultQuerySpecification.instance();
  }
}
