/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy.vql
 */
package org.mondo.collaboration.security.increment.policy;

import WTSpec4M.SystemParam;
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
import org.mondo.collaboration.security.increment.policy.LockParameterValuesMatch;
import org.mondo.collaboration.security.increment.policy.util.LockParameterValuesQuerySpecification;

/**
 * Generated pattern matcher API of the org.mondo.collaboration.security.increment.policy.lockParameterValues pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link LockParameterValuesMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern lockParameterValues(param : SystemParam, value) {
 * 	SystemParam.value(param,value);
 * }
 * </pre></code>
 * 
 * @see LockParameterValuesMatch
 *  @see LockParameterValuesProcessor
 * @see LockParameterValuesQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class LockParameterValuesMatcher extends BaseMatcher<LockParameterValuesMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static LockParameterValuesMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    LockParameterValuesMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
        matcher = (LockParameterValuesMatcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static LockParameterValuesMatcher create() throws ViatraQueryException {
    return new LockParameterValuesMatcher();
  }
  
  private final static int POSITION_PARAM = 0;
  
  private final static int POSITION_VALUE = 1;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(LockParameterValuesMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private LockParameterValuesMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pParam the fixed value of pattern parameter param, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @return matches represented as a LockParameterValuesMatch object.
   * 
   */
  public Collection<LockParameterValuesMatch> getAllMatches(final SystemParam pParam, final Integer pValue) {
    return rawGetAllMatches(new Object[]{pParam, pValue});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pParam the fixed value of pattern parameter param, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @return a match represented as a LockParameterValuesMatch object, or null if no match is found.
   * 
   */
  public LockParameterValuesMatch getOneArbitraryMatch(final SystemParam pParam, final Integer pValue) {
    return rawGetOneArbitraryMatch(new Object[]{pParam, pValue});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pParam the fixed value of pattern parameter param, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final SystemParam pParam, final Integer pValue) {
    return rawHasMatch(new Object[]{pParam, pValue});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pParam the fixed value of pattern parameter param, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final SystemParam pParam, final Integer pValue) {
    return rawCountMatches(new Object[]{pParam, pValue});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pParam the fixed value of pattern parameter param, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final SystemParam pParam, final Integer pValue, final IMatchProcessor<? super LockParameterValuesMatch> processor) {
    rawForEachMatch(new Object[]{pParam, pValue}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pParam the fixed value of pattern parameter param, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final SystemParam pParam, final Integer pValue, final IMatchProcessor<? super LockParameterValuesMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pParam, pValue}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pParam the fixed value of pattern parameter param, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public LockParameterValuesMatch newMatch(final SystemParam pParam, final Integer pValue) {
    return LockParameterValuesMatch.newMatch(pParam, pValue);
  }
  
  /**
   * Retrieve the set of values that occur in matches for param.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<SystemParam> rawAccumulateAllValuesOfparam(final Object[] parameters) {
    Set<SystemParam> results = new HashSet<SystemParam>();
    rawAccumulateAllValues(POSITION_PARAM, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for param.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<SystemParam> getAllValuesOfparam() {
    return rawAccumulateAllValuesOfparam(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for param.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<SystemParam> getAllValuesOfparam(final LockParameterValuesMatch partialMatch) {
    return rawAccumulateAllValuesOfparam(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for param.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<SystemParam> getAllValuesOfparam(final Integer pValue) {
    return rawAccumulateAllValuesOfparam(new Object[]{
    null, 
    pValue
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for value.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<Integer> rawAccumulateAllValuesOfvalue(final Object[] parameters) {
    Set<Integer> results = new HashSet<Integer>();
    rawAccumulateAllValues(POSITION_VALUE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for value.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<Integer> getAllValuesOfvalue() {
    return rawAccumulateAllValuesOfvalue(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for value.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<Integer> getAllValuesOfvalue(final LockParameterValuesMatch partialMatch) {
    return rawAccumulateAllValuesOfvalue(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for value.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<Integer> getAllValuesOfvalue(final SystemParam pParam) {
    return rawAccumulateAllValuesOfvalue(new Object[]{
    pParam, 
    null
    });
  }
  
  @Override
  protected LockParameterValuesMatch tupleToMatch(final Tuple t) {
    try {
        return LockParameterValuesMatch.newMatch((SystemParam) t.get(POSITION_PARAM), (Integer) t.get(POSITION_VALUE));
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in tuple not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected LockParameterValuesMatch arrayToMatch(final Object[] match) {
    try {
        return LockParameterValuesMatch.newMatch((SystemParam) match[POSITION_PARAM], (Integer) match[POSITION_VALUE]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected LockParameterValuesMatch arrayToMatchMutable(final Object[] match) {
    try {
        return LockParameterValuesMatch.newMutableMatch((SystemParam) match[POSITION_PARAM], (Integer) match[POSITION_VALUE]);
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
  public static IQuerySpecification<LockParameterValuesMatcher> querySpecification() throws ViatraQueryException {
    return LockParameterValuesQuerySpecification.instance();
  }
}
