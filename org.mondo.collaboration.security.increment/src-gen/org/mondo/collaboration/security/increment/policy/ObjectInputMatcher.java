/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy.vql
 */
package org.mondo.collaboration.security.increment.policy;

import WTSpec4M.SystemInput;
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
import org.mondo.collaboration.security.increment.policy.ObjectInputMatch;
import org.mondo.collaboration.security.increment.policy.util.ObjectInputQuerySpecification;

/**
 * Generated pattern matcher API of the org.mondo.collaboration.security.increment.policy.objectInput pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link ObjectInputMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern objectInput(input : SystemInput) {
 * 	SystemInput(input);
 * }
 * </pre></code>
 * 
 * @see ObjectInputMatch
 *  @see ObjectInputProcessor
 * @see ObjectInputQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class ObjectInputMatcher extends BaseMatcher<ObjectInputMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static ObjectInputMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    ObjectInputMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
        matcher = (ObjectInputMatcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static ObjectInputMatcher create() throws ViatraQueryException {
    return new ObjectInputMatcher();
  }
  
  private final static int POSITION_INPUT = 0;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ObjectInputMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private ObjectInputMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pInput the fixed value of pattern parameter input, or null if not bound.
   * @return matches represented as a ObjectInputMatch object.
   * 
   */
  public Collection<ObjectInputMatch> getAllMatches(final SystemInput pInput) {
    return rawGetAllMatches(new Object[]{pInput});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pInput the fixed value of pattern parameter input, or null if not bound.
   * @return a match represented as a ObjectInputMatch object, or null if no match is found.
   * 
   */
  public ObjectInputMatch getOneArbitraryMatch(final SystemInput pInput) {
    return rawGetOneArbitraryMatch(new Object[]{pInput});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pInput the fixed value of pattern parameter input, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final SystemInput pInput) {
    return rawHasMatch(new Object[]{pInput});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pInput the fixed value of pattern parameter input, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final SystemInput pInput) {
    return rawCountMatches(new Object[]{pInput});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pInput the fixed value of pattern parameter input, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final SystemInput pInput, final IMatchProcessor<? super ObjectInputMatch> processor) {
    rawForEachMatch(new Object[]{pInput}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pInput the fixed value of pattern parameter input, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final SystemInput pInput, final IMatchProcessor<? super ObjectInputMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pInput}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pInput the fixed value of pattern parameter input, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public ObjectInputMatch newMatch(final SystemInput pInput) {
    return ObjectInputMatch.newMatch(pInput);
  }
  
  /**
   * Retrieve the set of values that occur in matches for input.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<SystemInput> rawAccumulateAllValuesOfinput(final Object[] parameters) {
    Set<SystemInput> results = new HashSet<SystemInput>();
    rawAccumulateAllValues(POSITION_INPUT, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for input.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<SystemInput> getAllValuesOfinput() {
    return rawAccumulateAllValuesOfinput(emptyArray());
  }
  
  @Override
  protected ObjectInputMatch tupleToMatch(final Tuple t) {
    try {
        return ObjectInputMatch.newMatch((SystemInput) t.get(POSITION_INPUT));
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in tuple not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected ObjectInputMatch arrayToMatch(final Object[] match) {
    try {
        return ObjectInputMatch.newMatch((SystemInput) match[POSITION_INPUT]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected ObjectInputMatch arrayToMatchMutable(final Object[] match) {
    try {
        return ObjectInputMatch.newMutableMatch((SystemInput) match[POSITION_INPUT]);
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
  public static IQuerySpecification<ObjectInputMatcher> querySpecification() throws ViatraQueryException {
    return ObjectInputQuerySpecification.instance();
  }
}
