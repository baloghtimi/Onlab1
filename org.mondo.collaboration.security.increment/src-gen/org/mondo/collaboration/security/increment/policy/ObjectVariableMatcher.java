/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy.vql
 */
package org.mondo.collaboration.security.increment.policy;

import WTSpec4M.SystemVariable;
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
import org.mondo.collaboration.security.increment.policy.ObjectVariableMatch;
import org.mondo.collaboration.security.increment.policy.util.ObjectVariableQuerySpecification;

/**
 * Generated pattern matcher API of the org.mondo.collaboration.security.increment.policy.objectVariable pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link ObjectVariableMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern objectVariable(variable : SystemVariable) {
 * 	SystemVariable(variable);
 * }
 * </pre></code>
 * 
 * @see ObjectVariableMatch
 *  @see ObjectVariableProcessor
 * @see ObjectVariableQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class ObjectVariableMatcher extends BaseMatcher<ObjectVariableMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static ObjectVariableMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    ObjectVariableMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
        matcher = (ObjectVariableMatcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static ObjectVariableMatcher create() throws ViatraQueryException {
    return new ObjectVariableMatcher();
  }
  
  private final static int POSITION_VARIABLE = 0;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ObjectVariableMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private ObjectVariableMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pVariable the fixed value of pattern parameter variable, or null if not bound.
   * @return matches represented as a ObjectVariableMatch object.
   * 
   */
  public Collection<ObjectVariableMatch> getAllMatches(final SystemVariable pVariable) {
    return rawGetAllMatches(new Object[]{pVariable});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pVariable the fixed value of pattern parameter variable, or null if not bound.
   * @return a match represented as a ObjectVariableMatch object, or null if no match is found.
   * 
   */
  public ObjectVariableMatch getOneArbitraryMatch(final SystemVariable pVariable) {
    return rawGetOneArbitraryMatch(new Object[]{pVariable});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pVariable the fixed value of pattern parameter variable, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final SystemVariable pVariable) {
    return rawHasMatch(new Object[]{pVariable});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pVariable the fixed value of pattern parameter variable, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final SystemVariable pVariable) {
    return rawCountMatches(new Object[]{pVariable});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pVariable the fixed value of pattern parameter variable, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final SystemVariable pVariable, final IMatchProcessor<? super ObjectVariableMatch> processor) {
    rawForEachMatch(new Object[]{pVariable}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pVariable the fixed value of pattern parameter variable, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final SystemVariable pVariable, final IMatchProcessor<? super ObjectVariableMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pVariable}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pVariable the fixed value of pattern parameter variable, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public ObjectVariableMatch newMatch(final SystemVariable pVariable) {
    return ObjectVariableMatch.newMatch(pVariable);
  }
  
  /**
   * Retrieve the set of values that occur in matches for variable.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<SystemVariable> rawAccumulateAllValuesOfvariable(final Object[] parameters) {
    Set<SystemVariable> results = new HashSet<SystemVariable>();
    rawAccumulateAllValues(POSITION_VARIABLE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for variable.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<SystemVariable> getAllValuesOfvariable() {
    return rawAccumulateAllValuesOfvariable(emptyArray());
  }
  
  @Override
  protected ObjectVariableMatch tupleToMatch(final Tuple t) {
    try {
        return ObjectVariableMatch.newMatch((SystemVariable) t.get(POSITION_VARIABLE));
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in tuple not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected ObjectVariableMatch arrayToMatch(final Object[] match) {
    try {
        return ObjectVariableMatch.newMatch((SystemVariable) match[POSITION_VARIABLE]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected ObjectVariableMatch arrayToMatchMutable(final Object[] match) {
    try {
        return ObjectVariableMatch.newMutableMatch((SystemVariable) match[POSITION_VARIABLE]);
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
  public static IQuerySpecification<ObjectVariableMatcher> querySpecification() throws ViatraQueryException {
    return ObjectVariableQuerySpecification.instance();
  }
}
