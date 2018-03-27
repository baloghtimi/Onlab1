/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy.vql
 */
package org.mondo.collaboration.security.increment.policy;

import WTSpec4M.SystemVariable;
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
import org.mondo.collaboration.security.increment.policy.ReferenceitsVariablesMatch;
import org.mondo.collaboration.security.increment.policy.util.ReferenceitsVariablesQuerySpecification;

/**
 * Generated pattern matcher API of the org.mondo.collaboration.security.increment.policy.referenceitsVariables pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link ReferenceitsVariablesMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern referenceitsVariables(root : WT, variable : SystemVariable) {
 * 	WT.itsVariables(root, variable);
 * }
 * </pre></code>
 * 
 * @see ReferenceitsVariablesMatch
 *  @see ReferenceitsVariablesProcessor
 * @see ReferenceitsVariablesQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class ReferenceitsVariablesMatcher extends BaseMatcher<ReferenceitsVariablesMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static ReferenceitsVariablesMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    ReferenceitsVariablesMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
        matcher = (ReferenceitsVariablesMatcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static ReferenceitsVariablesMatcher create() throws ViatraQueryException {
    return new ReferenceitsVariablesMatcher();
  }
  
  private final static int POSITION_ROOT = 0;
  
  private final static int POSITION_VARIABLE = 1;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ReferenceitsVariablesMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private ReferenceitsVariablesMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pRoot the fixed value of pattern parameter root, or null if not bound.
   * @param pVariable the fixed value of pattern parameter variable, or null if not bound.
   * @return matches represented as a ReferenceitsVariablesMatch object.
   * 
   */
  public Collection<ReferenceitsVariablesMatch> getAllMatches(final WT pRoot, final SystemVariable pVariable) {
    return rawGetAllMatches(new Object[]{pRoot, pVariable});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pRoot the fixed value of pattern parameter root, or null if not bound.
   * @param pVariable the fixed value of pattern parameter variable, or null if not bound.
   * @return a match represented as a ReferenceitsVariablesMatch object, or null if no match is found.
   * 
   */
  public ReferenceitsVariablesMatch getOneArbitraryMatch(final WT pRoot, final SystemVariable pVariable) {
    return rawGetOneArbitraryMatch(new Object[]{pRoot, pVariable});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pRoot the fixed value of pattern parameter root, or null if not bound.
   * @param pVariable the fixed value of pattern parameter variable, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final WT pRoot, final SystemVariable pVariable) {
    return rawHasMatch(new Object[]{pRoot, pVariable});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pRoot the fixed value of pattern parameter root, or null if not bound.
   * @param pVariable the fixed value of pattern parameter variable, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final WT pRoot, final SystemVariable pVariable) {
    return rawCountMatches(new Object[]{pRoot, pVariable});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pRoot the fixed value of pattern parameter root, or null if not bound.
   * @param pVariable the fixed value of pattern parameter variable, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final WT pRoot, final SystemVariable pVariable, final IMatchProcessor<? super ReferenceitsVariablesMatch> processor) {
    rawForEachMatch(new Object[]{pRoot, pVariable}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pRoot the fixed value of pattern parameter root, or null if not bound.
   * @param pVariable the fixed value of pattern parameter variable, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final WT pRoot, final SystemVariable pVariable, final IMatchProcessor<? super ReferenceitsVariablesMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pRoot, pVariable}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pRoot the fixed value of pattern parameter root, or null if not bound.
   * @param pVariable the fixed value of pattern parameter variable, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public ReferenceitsVariablesMatch newMatch(final WT pRoot, final SystemVariable pVariable) {
    return ReferenceitsVariablesMatch.newMatch(pRoot, pVariable);
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
  public Set<WT> getAllValuesOfroot(final ReferenceitsVariablesMatch partialMatch) {
    return rawAccumulateAllValuesOfroot(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for root.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<WT> getAllValuesOfroot(final SystemVariable pVariable) {
    return rawAccumulateAllValuesOfroot(new Object[]{
    null, 
    pVariable
    });
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
  
  /**
   * Retrieve the set of values that occur in matches for variable.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<SystemVariable> getAllValuesOfvariable(final ReferenceitsVariablesMatch partialMatch) {
    return rawAccumulateAllValuesOfvariable(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for variable.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<SystemVariable> getAllValuesOfvariable(final WT pRoot) {
    return rawAccumulateAllValuesOfvariable(new Object[]{
    pRoot, 
    null
    });
  }
  
  @Override
  protected ReferenceitsVariablesMatch tupleToMatch(final Tuple t) {
    try {
        return ReferenceitsVariablesMatch.newMatch((WT) t.get(POSITION_ROOT), (SystemVariable) t.get(POSITION_VARIABLE));
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in tuple not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected ReferenceitsVariablesMatch arrayToMatch(final Object[] match) {
    try {
        return ReferenceitsVariablesMatch.newMatch((WT) match[POSITION_ROOT], (SystemVariable) match[POSITION_VARIABLE]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected ReferenceitsVariablesMatch arrayToMatchMutable(final Object[] match) {
    try {
        return ReferenceitsVariablesMatch.newMutableMatch((WT) match[POSITION_ROOT], (SystemVariable) match[POSITION_VARIABLE]);
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
  public static IQuerySpecification<ReferenceitsVariablesMatcher> querySpecification() throws ViatraQueryException {
    return ReferenceitsVariablesQuerySpecification.instance();
  }
}
