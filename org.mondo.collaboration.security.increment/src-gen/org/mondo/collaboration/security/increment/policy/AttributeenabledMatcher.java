/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy.vql
 */
package org.mondo.collaboration.security.increment.policy;

import WTSpec4M.wtc;
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
import org.mondo.collaboration.security.increment.policy.AttributeenabledMatch;
import org.mondo.collaboration.security.increment.policy.util.AttributeenabledQuerySpecification;

/**
 * Generated pattern matcher API of the org.mondo.collaboration.security.increment.policy.attributeenabled pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link AttributeenabledMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern attributeenabled(wtc : wtc, value) {
 * 	wtc.enabled(wtc, value);
 * }
 * </pre></code>
 * 
 * @see AttributeenabledMatch
 *  @see AttributeenabledProcessor
 * @see AttributeenabledQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class AttributeenabledMatcher extends BaseMatcher<AttributeenabledMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static AttributeenabledMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    AttributeenabledMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
        matcher = (AttributeenabledMatcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static AttributeenabledMatcher create() throws ViatraQueryException {
    return new AttributeenabledMatcher();
  }
  
  private final static int POSITION_WTC = 0;
  
  private final static int POSITION_VALUE = 1;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(AttributeenabledMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private AttributeenabledMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pWtc the fixed value of pattern parameter wtc, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @return matches represented as a AttributeenabledMatch object.
   * 
   */
  public Collection<AttributeenabledMatch> getAllMatches(final wtc pWtc, final Boolean pValue) {
    return rawGetAllMatches(new Object[]{pWtc, pValue});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pWtc the fixed value of pattern parameter wtc, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @return a match represented as a AttributeenabledMatch object, or null if no match is found.
   * 
   */
  public AttributeenabledMatch getOneArbitraryMatch(final wtc pWtc, final Boolean pValue) {
    return rawGetOneArbitraryMatch(new Object[]{pWtc, pValue});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pWtc the fixed value of pattern parameter wtc, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final wtc pWtc, final Boolean pValue) {
    return rawHasMatch(new Object[]{pWtc, pValue});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pWtc the fixed value of pattern parameter wtc, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final wtc pWtc, final Boolean pValue) {
    return rawCountMatches(new Object[]{pWtc, pValue});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pWtc the fixed value of pattern parameter wtc, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final wtc pWtc, final Boolean pValue, final IMatchProcessor<? super AttributeenabledMatch> processor) {
    rawForEachMatch(new Object[]{pWtc, pValue}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pWtc the fixed value of pattern parameter wtc, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final wtc pWtc, final Boolean pValue, final IMatchProcessor<? super AttributeenabledMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pWtc, pValue}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pWtc the fixed value of pattern parameter wtc, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public AttributeenabledMatch newMatch(final wtc pWtc, final Boolean pValue) {
    return AttributeenabledMatch.newMatch(pWtc, pValue);
  }
  
  /**
   * Retrieve the set of values that occur in matches for wtc.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<wtc> rawAccumulateAllValuesOfwtc(final Object[] parameters) {
    Set<wtc> results = new HashSet<wtc>();
    rawAccumulateAllValues(POSITION_WTC, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for wtc.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<wtc> getAllValuesOfwtc() {
    return rawAccumulateAllValuesOfwtc(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for wtc.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<wtc> getAllValuesOfwtc(final AttributeenabledMatch partialMatch) {
    return rawAccumulateAllValuesOfwtc(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for wtc.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<wtc> getAllValuesOfwtc(final Boolean pValue) {
    return rawAccumulateAllValuesOfwtc(new Object[]{
    null, 
    pValue
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for value.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<Boolean> rawAccumulateAllValuesOfvalue(final Object[] parameters) {
    Set<Boolean> results = new HashSet<Boolean>();
    rawAccumulateAllValues(POSITION_VALUE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for value.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<Boolean> getAllValuesOfvalue() {
    return rawAccumulateAllValuesOfvalue(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for value.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<Boolean> getAllValuesOfvalue(final AttributeenabledMatch partialMatch) {
    return rawAccumulateAllValuesOfvalue(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for value.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<Boolean> getAllValuesOfvalue(final wtc pWtc) {
    return rawAccumulateAllValuesOfvalue(new Object[]{
    pWtc, 
    null
    });
  }
  
  @Override
  protected AttributeenabledMatch tupleToMatch(final Tuple t) {
    try {
        return AttributeenabledMatch.newMatch((wtc) t.get(POSITION_WTC), (Boolean) t.get(POSITION_VALUE));
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in tuple not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected AttributeenabledMatch arrayToMatch(final Object[] match) {
    try {
        return AttributeenabledMatch.newMatch((wtc) match[POSITION_WTC], (Boolean) match[POSITION_VALUE]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected AttributeenabledMatch arrayToMatchMutable(final Object[] match) {
    try {
        return AttributeenabledMatch.newMutableMatch((wtc) match[POSITION_WTC], (Boolean) match[POSITION_VALUE]);
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
  public static IQuerySpecification<AttributeenabledMatcher> querySpecification() throws ViatraQueryException {
    return AttributeenabledQuerySpecification.instance();
  }
}
