/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy_domination_same_priority.vql
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
import org.mondo.collaboration.policy.rules.AccessibilityLevel;
import org.mondo.collaboration.policy.rules.OperationType;
import org.mondo.collaboration.security.increment.policy.DominatedExplicitJudgementOnReference_at_0Match;
import org.mondo.collaboration.security.increment.policy.util.DominatedExplicitJudgementOnReference_at_0QuerySpecification;

/**
 * Generated pattern matcher API of the org.mondo.collaboration.security.increment.policy.dominatedExplicitJudgementOnReference_at_0 pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link DominatedExplicitJudgementOnReference_at_0Match}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern dominatedExplicitJudgementOnReference_at_0(user: java String, source: EObject, target: EObject, reference: EReference, operation, prevailingAccess) 
 * {
 *     find explicitJudgementOnReference(user, source, target, reference, operation, dominatedAccess, 0);
 *         find explicitJudgementOnReference(user, source, target, reference, operation, prevailingAccess, 0);
 *     find resolution(dominatedAccess, prevailingAccess);
 * }
 * </pre></code>
 * 
 * @see DominatedExplicitJudgementOnReference_at_0Match
 *  @see DominatedExplicitJudgementOnReference_at_0Processor
 * @see DominatedExplicitJudgementOnReference_at_0QuerySpecification
 * 
 */
@SuppressWarnings("all")
public class DominatedExplicitJudgementOnReference_at_0Matcher extends BaseMatcher<DominatedExplicitJudgementOnReference_at_0Match> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static DominatedExplicitJudgementOnReference_at_0Matcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    DominatedExplicitJudgementOnReference_at_0Matcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
        matcher = (DominatedExplicitJudgementOnReference_at_0Matcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static DominatedExplicitJudgementOnReference_at_0Matcher create() throws ViatraQueryException {
    return new DominatedExplicitJudgementOnReference_at_0Matcher();
  }
  
  private final static int POSITION_USER = 0;
  
  private final static int POSITION_SOURCE = 1;
  
  private final static int POSITION_TARGET = 2;
  
  private final static int POSITION_REFERENCE = 3;
  
  private final static int POSITION_OPERATION = 4;
  
  private final static int POSITION_PREVAILINGACCESS = 5;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(DominatedExplicitJudgementOnReference_at_0Matcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private DominatedExplicitJudgementOnReference_at_0Matcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pSource the fixed value of pattern parameter source, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pReference the fixed value of pattern parameter reference, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pPrevailingAccess the fixed value of pattern parameter prevailingAccess, or null if not bound.
   * @return matches represented as a DominatedExplicitJudgementOnReference_at_0Match object.
   * 
   */
  public Collection<DominatedExplicitJudgementOnReference_at_0Match> getAllMatches(final String pUser, final EObject pSource, final EObject pTarget, final EReference pReference, final OperationType pOperation, final AccessibilityLevel pPrevailingAccess) {
    return rawGetAllMatches(new Object[]{pUser, pSource, pTarget, pReference, pOperation, pPrevailingAccess});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pSource the fixed value of pattern parameter source, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pReference the fixed value of pattern parameter reference, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pPrevailingAccess the fixed value of pattern parameter prevailingAccess, or null if not bound.
   * @return a match represented as a DominatedExplicitJudgementOnReference_at_0Match object, or null if no match is found.
   * 
   */
  public DominatedExplicitJudgementOnReference_at_0Match getOneArbitraryMatch(final String pUser, final EObject pSource, final EObject pTarget, final EReference pReference, final OperationType pOperation, final AccessibilityLevel pPrevailingAccess) {
    return rawGetOneArbitraryMatch(new Object[]{pUser, pSource, pTarget, pReference, pOperation, pPrevailingAccess});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pSource the fixed value of pattern parameter source, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pReference the fixed value of pattern parameter reference, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pPrevailingAccess the fixed value of pattern parameter prevailingAccess, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final String pUser, final EObject pSource, final EObject pTarget, final EReference pReference, final OperationType pOperation, final AccessibilityLevel pPrevailingAccess) {
    return rawHasMatch(new Object[]{pUser, pSource, pTarget, pReference, pOperation, pPrevailingAccess});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pSource the fixed value of pattern parameter source, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pReference the fixed value of pattern parameter reference, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pPrevailingAccess the fixed value of pattern parameter prevailingAccess, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final String pUser, final EObject pSource, final EObject pTarget, final EReference pReference, final OperationType pOperation, final AccessibilityLevel pPrevailingAccess) {
    return rawCountMatches(new Object[]{pUser, pSource, pTarget, pReference, pOperation, pPrevailingAccess});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pSource the fixed value of pattern parameter source, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pReference the fixed value of pattern parameter reference, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pPrevailingAccess the fixed value of pattern parameter prevailingAccess, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final String pUser, final EObject pSource, final EObject pTarget, final EReference pReference, final OperationType pOperation, final AccessibilityLevel pPrevailingAccess, final IMatchProcessor<? super DominatedExplicitJudgementOnReference_at_0Match> processor) {
    rawForEachMatch(new Object[]{pUser, pSource, pTarget, pReference, pOperation, pPrevailingAccess}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pSource the fixed value of pattern parameter source, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pReference the fixed value of pattern parameter reference, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pPrevailingAccess the fixed value of pattern parameter prevailingAccess, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final String pUser, final EObject pSource, final EObject pTarget, final EReference pReference, final OperationType pOperation, final AccessibilityLevel pPrevailingAccess, final IMatchProcessor<? super DominatedExplicitJudgementOnReference_at_0Match> processor) {
    return rawForOneArbitraryMatch(new Object[]{pUser, pSource, pTarget, pReference, pOperation, pPrevailingAccess}, processor);
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
   * @param pPrevailingAccess the fixed value of pattern parameter prevailingAccess, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public DominatedExplicitJudgementOnReference_at_0Match newMatch(final String pUser, final EObject pSource, final EObject pTarget, final EReference pReference, final OperationType pOperation, final AccessibilityLevel pPrevailingAccess) {
    return DominatedExplicitJudgementOnReference_at_0Match.newMatch(pUser, pSource, pTarget, pReference, pOperation, pPrevailingAccess);
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
  public Set<String> getAllValuesOfuser(final DominatedExplicitJudgementOnReference_at_0Match partialMatch) {
    return rawAccumulateAllValuesOfuser(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for user.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfuser(final EObject pSource, final EObject pTarget, final EReference pReference, final OperationType pOperation, final AccessibilityLevel pPrevailingAccess) {
    return rawAccumulateAllValuesOfuser(new Object[]{
    null, 
    pSource, 
    pTarget, 
    pReference, 
    pOperation, 
    pPrevailingAccess
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
  public Set<EObject> getAllValuesOfsource(final DominatedExplicitJudgementOnReference_at_0Match partialMatch) {
    return rawAccumulateAllValuesOfsource(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for source.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<EObject> getAllValuesOfsource(final String pUser, final EObject pTarget, final EReference pReference, final OperationType pOperation, final AccessibilityLevel pPrevailingAccess) {
    return rawAccumulateAllValuesOfsource(new Object[]{
    pUser, 
    null, 
    pTarget, 
    pReference, 
    pOperation, 
    pPrevailingAccess
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
  public Set<EObject> getAllValuesOftarget(final DominatedExplicitJudgementOnReference_at_0Match partialMatch) {
    return rawAccumulateAllValuesOftarget(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for target.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<EObject> getAllValuesOftarget(final String pUser, final EObject pSource, final EReference pReference, final OperationType pOperation, final AccessibilityLevel pPrevailingAccess) {
    return rawAccumulateAllValuesOftarget(new Object[]{
    pUser, 
    pSource, 
    null, 
    pReference, 
    pOperation, 
    pPrevailingAccess
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
  public Set<EReference> getAllValuesOfreference(final DominatedExplicitJudgementOnReference_at_0Match partialMatch) {
    return rawAccumulateAllValuesOfreference(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for reference.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<EReference> getAllValuesOfreference(final String pUser, final EObject pSource, final EObject pTarget, final OperationType pOperation, final AccessibilityLevel pPrevailingAccess) {
    return rawAccumulateAllValuesOfreference(new Object[]{
    pUser, 
    pSource, 
    pTarget, 
    null, 
    pOperation, 
    pPrevailingAccess
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for operation.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<OperationType> rawAccumulateAllValuesOfoperation(final Object[] parameters) {
    Set<OperationType> results = new HashSet<OperationType>();
    rawAccumulateAllValues(POSITION_OPERATION, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for operation.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<OperationType> getAllValuesOfoperation() {
    return rawAccumulateAllValuesOfoperation(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for operation.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<OperationType> getAllValuesOfoperation(final DominatedExplicitJudgementOnReference_at_0Match partialMatch) {
    return rawAccumulateAllValuesOfoperation(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for operation.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<OperationType> getAllValuesOfoperation(final String pUser, final EObject pSource, final EObject pTarget, final EReference pReference, final AccessibilityLevel pPrevailingAccess) {
    return rawAccumulateAllValuesOfoperation(new Object[]{
    pUser, 
    pSource, 
    pTarget, 
    pReference, 
    null, 
    pPrevailingAccess
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for prevailingAccess.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<AccessibilityLevel> rawAccumulateAllValuesOfprevailingAccess(final Object[] parameters) {
    Set<AccessibilityLevel> results = new HashSet<AccessibilityLevel>();
    rawAccumulateAllValues(POSITION_PREVAILINGACCESS, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for prevailingAccess.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AccessibilityLevel> getAllValuesOfprevailingAccess() {
    return rawAccumulateAllValuesOfprevailingAccess(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for prevailingAccess.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AccessibilityLevel> getAllValuesOfprevailingAccess(final DominatedExplicitJudgementOnReference_at_0Match partialMatch) {
    return rawAccumulateAllValuesOfprevailingAccess(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for prevailingAccess.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AccessibilityLevel> getAllValuesOfprevailingAccess(final String pUser, final EObject pSource, final EObject pTarget, final EReference pReference, final OperationType pOperation) {
    return rawAccumulateAllValuesOfprevailingAccess(new Object[]{
    pUser, 
    pSource, 
    pTarget, 
    pReference, 
    pOperation, 
    null
    });
  }
  
  @Override
  protected DominatedExplicitJudgementOnReference_at_0Match tupleToMatch(final Tuple t) {
    try {
        return DominatedExplicitJudgementOnReference_at_0Match.newMatch((String) t.get(POSITION_USER), (EObject) t.get(POSITION_SOURCE), (EObject) t.get(POSITION_TARGET), (EReference) t.get(POSITION_REFERENCE), (OperationType) t.get(POSITION_OPERATION), (AccessibilityLevel) t.get(POSITION_PREVAILINGACCESS));
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in tuple not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected DominatedExplicitJudgementOnReference_at_0Match arrayToMatch(final Object[] match) {
    try {
        return DominatedExplicitJudgementOnReference_at_0Match.newMatch((String) match[POSITION_USER], (EObject) match[POSITION_SOURCE], (EObject) match[POSITION_TARGET], (EReference) match[POSITION_REFERENCE], (OperationType) match[POSITION_OPERATION], (AccessibilityLevel) match[POSITION_PREVAILINGACCESS]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected DominatedExplicitJudgementOnReference_at_0Match arrayToMatchMutable(final Object[] match) {
    try {
        return DominatedExplicitJudgementOnReference_at_0Match.newMutableMatch((String) match[POSITION_USER], (EObject) match[POSITION_SOURCE], (EObject) match[POSITION_TARGET], (EReference) match[POSITION_REFERENCE], (OperationType) match[POSITION_OPERATION], (AccessibilityLevel) match[POSITION_PREVAILINGACCESS]);
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
  public static IQuerySpecification<DominatedExplicitJudgementOnReference_at_0Matcher> querySpecification() throws ViatraQueryException {
    return DominatedExplicitJudgementOnReference_at_0QuerySpecification.instance();
  }
}