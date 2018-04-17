/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy_domination_higher_priority.vql
 */
package org.mondo.collaboration.security.increment.policy;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import org.mondo.collaboration.security.increment.policy.DominationOnReference_of_weakMatch;
import org.mondo.collaboration.security.increment.policy.util.DominationOnReference_of_weakQuerySpecification;

/**
 * Generated pattern matcher API of the org.mondo.collaboration.security.increment.policy.dominationOnReference_of_weak pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link DominationOnReference_of_weakMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern dominationOnReference_of_weak(user: java String, source: EObject, target: EObject, reference: EReference, operation)
 * {
 *     find effectiveJudgementOnReference_at_1(user, source, target, reference, operation, _access);
 * }
 * </pre></code>
 * 
 * @see DominationOnReference_of_weakMatch
 *  @see DominationOnReference_of_weakProcessor
 * @see DominationOnReference_of_weakQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class DominationOnReference_of_weakMatcher extends BaseMatcher<DominationOnReference_of_weakMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static DominationOnReference_of_weakMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    DominationOnReference_of_weakMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
        matcher = (DominationOnReference_of_weakMatcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static DominationOnReference_of_weakMatcher create() throws ViatraQueryException {
    return new DominationOnReference_of_weakMatcher();
  }
  
  private final static int POSITION_USER = 0;
  
  private final static int POSITION_SOURCE = 1;
  
  private final static int POSITION_TARGET = 2;
  
  private final static int POSITION_REFERENCE = 3;
  
  private final static int POSITION_OPERATION = 4;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(DominationOnReference_of_weakMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private DominationOnReference_of_weakMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pSource the fixed value of pattern parameter source, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pReference the fixed value of pattern parameter reference, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @return matches represented as a DominationOnReference_of_weakMatch object.
   * 
   */
  public Collection<DominationOnReference_of_weakMatch> getAllMatches(final String pUser, final EObject pSource, final EObject pTarget, final EReference pReference, final Object pOperation) {
    return rawGetAllMatches(new Object[]{pUser, pSource, pTarget, pReference, pOperation});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pSource the fixed value of pattern parameter source, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pReference the fixed value of pattern parameter reference, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @return a match represented as a DominationOnReference_of_weakMatch object, or null if no match is found.
   * 
   */
  public DominationOnReference_of_weakMatch getOneArbitraryMatch(final String pUser, final EObject pSource, final EObject pTarget, final EReference pReference, final Object pOperation) {
    return rawGetOneArbitraryMatch(new Object[]{pUser, pSource, pTarget, pReference, pOperation});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pSource the fixed value of pattern parameter source, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pReference the fixed value of pattern parameter reference, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final String pUser, final EObject pSource, final EObject pTarget, final EReference pReference, final Object pOperation) {
    return rawHasMatch(new Object[]{pUser, pSource, pTarget, pReference, pOperation});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pSource the fixed value of pattern parameter source, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pReference the fixed value of pattern parameter reference, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final String pUser, final EObject pSource, final EObject pTarget, final EReference pReference, final Object pOperation) {
    return rawCountMatches(new Object[]{pUser, pSource, pTarget, pReference, pOperation});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pSource the fixed value of pattern parameter source, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pReference the fixed value of pattern parameter reference, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final String pUser, final EObject pSource, final EObject pTarget, final EReference pReference, final Object pOperation, final IMatchProcessor<? super DominationOnReference_of_weakMatch> processor) {
    rawForEachMatch(new Object[]{pUser, pSource, pTarget, pReference, pOperation}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pSource the fixed value of pattern parameter source, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pReference the fixed value of pattern parameter reference, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final String pUser, final EObject pSource, final EObject pTarget, final EReference pReference, final Object pOperation, final IMatchProcessor<? super DominationOnReference_of_weakMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pUser, pSource, pTarget, pReference, pOperation}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pSource the fixed value of pattern parameter source, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pReference the fixed value of pattern parameter reference, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public DominationOnReference_of_weakMatch newMatch(final String pUser, final EObject pSource, final EObject pTarget, final EReference pReference, final Object pOperation) {
    return DominationOnReference_of_weakMatch.newMatch(pUser, pSource, pTarget, pReference, pOperation);
  }
  
  /**
   * Retrieve the set of values that occur in matches for user.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<String> rawAccumulateAllValuesOfuser(final Object[] parameters) {
    Set<String> results = new HashSet<String>();
    rawAccumulateAllValues(POSITION_USER, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for user.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfuser() {
    return rawAccumulateAllValuesOfuser(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for user.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfuser(final DominationOnReference_of_weakMatch partialMatch) {
    return rawAccumulateAllValuesOfuser(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for user.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfuser(final EObject pSource, final EObject pTarget, final EReference pReference, final Object pOperation) {
    return rawAccumulateAllValuesOfuser(new Object[]{
    null, 
    pSource, 
    pTarget, 
    pReference, 
    pOperation
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for source.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<EObject> rawAccumulateAllValuesOfsource(final Object[] parameters) {
    Set<EObject> results = new HashSet<EObject>();
    rawAccumulateAllValues(POSITION_SOURCE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for source.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<EObject> getAllValuesOfsource() {
    return rawAccumulateAllValuesOfsource(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for source.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<EObject> getAllValuesOfsource(final DominationOnReference_of_weakMatch partialMatch) {
    return rawAccumulateAllValuesOfsource(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for source.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<EObject> getAllValuesOfsource(final String pUser, final EObject pTarget, final EReference pReference, final Object pOperation) {
    return rawAccumulateAllValuesOfsource(new Object[]{
    pUser, 
    null, 
    pTarget, 
    pReference, 
    pOperation
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for target.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<EObject> rawAccumulateAllValuesOftarget(final Object[] parameters) {
    Set<EObject> results = new HashSet<EObject>();
    rawAccumulateAllValues(POSITION_TARGET, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for target.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<EObject> getAllValuesOftarget() {
    return rawAccumulateAllValuesOftarget(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for target.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<EObject> getAllValuesOftarget(final DominationOnReference_of_weakMatch partialMatch) {
    return rawAccumulateAllValuesOftarget(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for target.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<EObject> getAllValuesOftarget(final String pUser, final EObject pSource, final EReference pReference, final Object pOperation) {
    return rawAccumulateAllValuesOftarget(new Object[]{
    pUser, 
    pSource, 
    null, 
    pReference, 
    pOperation
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for reference.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<EReference> rawAccumulateAllValuesOfreference(final Object[] parameters) {
    Set<EReference> results = new HashSet<EReference>();
    rawAccumulateAllValues(POSITION_REFERENCE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for reference.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<EReference> getAllValuesOfreference() {
    return rawAccumulateAllValuesOfreference(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for reference.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<EReference> getAllValuesOfreference(final DominationOnReference_of_weakMatch partialMatch) {
    return rawAccumulateAllValuesOfreference(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for reference.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<EReference> getAllValuesOfreference(final String pUser, final EObject pSource, final EObject pTarget, final Object pOperation) {
    return rawAccumulateAllValuesOfreference(new Object[]{
    pUser, 
    pSource, 
    pTarget, 
    null, 
    pOperation
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for operation.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<Object> rawAccumulateAllValuesOfoperation(final Object[] parameters) {
    Set<Object> results = new HashSet<Object>();
    rawAccumulateAllValues(POSITION_OPERATION, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for operation.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<Object> getAllValuesOfoperation() {
    return rawAccumulateAllValuesOfoperation(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for operation.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<Object> getAllValuesOfoperation(final DominationOnReference_of_weakMatch partialMatch) {
    return rawAccumulateAllValuesOfoperation(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for operation.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<Object> getAllValuesOfoperation(final String pUser, final EObject pSource, final EObject pTarget, final EReference pReference) {
    return rawAccumulateAllValuesOfoperation(new Object[]{
    pUser, 
    pSource, 
    pTarget, 
    pReference, 
    null
    });
  }
  
  @Override
  protected DominationOnReference_of_weakMatch tupleToMatch(final Tuple t) {
    try {
        return DominationOnReference_of_weakMatch.newMatch((String) t.get(POSITION_USER), (EObject) t.get(POSITION_SOURCE), (EObject) t.get(POSITION_TARGET), (EReference) t.get(POSITION_REFERENCE), (Object) t.get(POSITION_OPERATION));
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in tuple not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected DominationOnReference_of_weakMatch arrayToMatch(final Object[] match) {
    try {
        return DominationOnReference_of_weakMatch.newMatch((String) match[POSITION_USER], (EObject) match[POSITION_SOURCE], (EObject) match[POSITION_TARGET], (EReference) match[POSITION_REFERENCE], (Object) match[POSITION_OPERATION]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected DominationOnReference_of_weakMatch arrayToMatchMutable(final Object[] match) {
    try {
        return DominationOnReference_of_weakMatch.newMutableMatch((String) match[POSITION_USER], (EObject) match[POSITION_SOURCE], (EObject) match[POSITION_TARGET], (EReference) match[POSITION_REFERENCE], (Object) match[POSITION_OPERATION]);
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
  public static IQuerySpecification<DominationOnReference_of_weakMatcher> querySpecification() throws ViatraQueryException {
    return DominationOnReference_of_weakQuerySpecification.instance();
  }
}
