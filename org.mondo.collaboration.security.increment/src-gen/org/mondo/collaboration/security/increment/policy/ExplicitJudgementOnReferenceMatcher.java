/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy_explicit_judgement.vql
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
import org.mondo.collaboration.security.increment.policy.ExplicitJudgementOnReferenceMatch;
import org.mondo.collaboration.security.increment.policy.util.ExplicitJudgementOnReferenceQuerySpecification;

/**
 * Generated pattern matcher API of the org.mondo.collaboration.security.increment.policy.explicitJudgementOnReference pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link ExplicitJudgementOnReferenceMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern explicitJudgementOnReference(user : java String, source : EObject, target : EObject, reference : EReference, operation, access, priority: java Integer)
 * {
 * 	
 * //  rule default
 *     find referenceAsset(source, target, reference);
 *     find allUsers(user);
 *     find readWriteOperation(operation);
 *     access == AccessibilityLevel::ALLOW;
 *     priority == eval(-1);
 * }
 * </pre></code>
 * 
 * @see ExplicitJudgementOnReferenceMatch
 *  @see ExplicitJudgementOnReferenceProcessor
 * @see ExplicitJudgementOnReferenceQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class ExplicitJudgementOnReferenceMatcher extends BaseMatcher<ExplicitJudgementOnReferenceMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static ExplicitJudgementOnReferenceMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    ExplicitJudgementOnReferenceMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
        matcher = (ExplicitJudgementOnReferenceMatcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static ExplicitJudgementOnReferenceMatcher create() throws ViatraQueryException {
    return new ExplicitJudgementOnReferenceMatcher();
  }
  
  private final static int POSITION_USER = 0;
  
  private final static int POSITION_SOURCE = 1;
  
  private final static int POSITION_TARGET = 2;
  
  private final static int POSITION_REFERENCE = 3;
  
  private final static int POSITION_OPERATION = 4;
  
  private final static int POSITION_ACCESS = 5;
  
  private final static int POSITION_PRIORITY = 6;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ExplicitJudgementOnReferenceMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private ExplicitJudgementOnReferenceMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pSource the fixed value of pattern parameter source, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pReference the fixed value of pattern parameter reference, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pAccess the fixed value of pattern parameter access, or null if not bound.
   * @param pPriority the fixed value of pattern parameter priority, or null if not bound.
   * @return matches represented as a ExplicitJudgementOnReferenceMatch object.
   * 
   */
  public Collection<ExplicitJudgementOnReferenceMatch> getAllMatches(final String pUser, final EObject pSource, final EObject pTarget, final EReference pReference, final OperationType pOperation, final AccessibilityLevel pAccess, final Integer pPriority) {
    return rawGetAllMatches(new Object[]{pUser, pSource, pTarget, pReference, pOperation, pAccess, pPriority});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pSource the fixed value of pattern parameter source, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pReference the fixed value of pattern parameter reference, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pAccess the fixed value of pattern parameter access, or null if not bound.
   * @param pPriority the fixed value of pattern parameter priority, or null if not bound.
   * @return a match represented as a ExplicitJudgementOnReferenceMatch object, or null if no match is found.
   * 
   */
  public ExplicitJudgementOnReferenceMatch getOneArbitraryMatch(final String pUser, final EObject pSource, final EObject pTarget, final EReference pReference, final OperationType pOperation, final AccessibilityLevel pAccess, final Integer pPriority) {
    return rawGetOneArbitraryMatch(new Object[]{pUser, pSource, pTarget, pReference, pOperation, pAccess, pPriority});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pSource the fixed value of pattern parameter source, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pReference the fixed value of pattern parameter reference, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pAccess the fixed value of pattern parameter access, or null if not bound.
   * @param pPriority the fixed value of pattern parameter priority, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final String pUser, final EObject pSource, final EObject pTarget, final EReference pReference, final OperationType pOperation, final AccessibilityLevel pAccess, final Integer pPriority) {
    return rawHasMatch(new Object[]{pUser, pSource, pTarget, pReference, pOperation, pAccess, pPriority});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pSource the fixed value of pattern parameter source, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pReference the fixed value of pattern parameter reference, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pAccess the fixed value of pattern parameter access, or null if not bound.
   * @param pPriority the fixed value of pattern parameter priority, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final String pUser, final EObject pSource, final EObject pTarget, final EReference pReference, final OperationType pOperation, final AccessibilityLevel pAccess, final Integer pPriority) {
    return rawCountMatches(new Object[]{pUser, pSource, pTarget, pReference, pOperation, pAccess, pPriority});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pSource the fixed value of pattern parameter source, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pReference the fixed value of pattern parameter reference, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pAccess the fixed value of pattern parameter access, or null if not bound.
   * @param pPriority the fixed value of pattern parameter priority, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final String pUser, final EObject pSource, final EObject pTarget, final EReference pReference, final OperationType pOperation, final AccessibilityLevel pAccess, final Integer pPriority, final IMatchProcessor<? super ExplicitJudgementOnReferenceMatch> processor) {
    rawForEachMatch(new Object[]{pUser, pSource, pTarget, pReference, pOperation, pAccess, pPriority}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pSource the fixed value of pattern parameter source, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pReference the fixed value of pattern parameter reference, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pAccess the fixed value of pattern parameter access, or null if not bound.
   * @param pPriority the fixed value of pattern parameter priority, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final String pUser, final EObject pSource, final EObject pTarget, final EReference pReference, final OperationType pOperation, final AccessibilityLevel pAccess, final Integer pPriority, final IMatchProcessor<? super ExplicitJudgementOnReferenceMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pUser, pSource, pTarget, pReference, pOperation, pAccess, pPriority}, processor);
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
   * @param pAccess the fixed value of pattern parameter access, or null if not bound.
   * @param pPriority the fixed value of pattern parameter priority, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public ExplicitJudgementOnReferenceMatch newMatch(final String pUser, final EObject pSource, final EObject pTarget, final EReference pReference, final OperationType pOperation, final AccessibilityLevel pAccess, final Integer pPriority) {
    return ExplicitJudgementOnReferenceMatch.newMatch(pUser, pSource, pTarget, pReference, pOperation, pAccess, pPriority);
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
  public Set<String> getAllValuesOfuser(final ExplicitJudgementOnReferenceMatch partialMatch) {
    return rawAccumulateAllValuesOfuser(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for user.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfuser(final EObject pSource, final EObject pTarget, final EReference pReference, final OperationType pOperation, final AccessibilityLevel pAccess, final Integer pPriority) {
    return rawAccumulateAllValuesOfuser(new Object[]{
    null, 
    pSource, 
    pTarget, 
    pReference, 
    pOperation, 
    pAccess, 
    pPriority
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
  public Set<EObject> getAllValuesOfsource(final ExplicitJudgementOnReferenceMatch partialMatch) {
    return rawAccumulateAllValuesOfsource(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for source.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<EObject> getAllValuesOfsource(final String pUser, final EObject pTarget, final EReference pReference, final OperationType pOperation, final AccessibilityLevel pAccess, final Integer pPriority) {
    return rawAccumulateAllValuesOfsource(new Object[]{
    pUser, 
    null, 
    pTarget, 
    pReference, 
    pOperation, 
    pAccess, 
    pPriority
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
  public Set<EObject> getAllValuesOftarget(final ExplicitJudgementOnReferenceMatch partialMatch) {
    return rawAccumulateAllValuesOftarget(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for target.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<EObject> getAllValuesOftarget(final String pUser, final EObject pSource, final EReference pReference, final OperationType pOperation, final AccessibilityLevel pAccess, final Integer pPriority) {
    return rawAccumulateAllValuesOftarget(new Object[]{
    pUser, 
    pSource, 
    null, 
    pReference, 
    pOperation, 
    pAccess, 
    pPriority
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
  public Set<EReference> getAllValuesOfreference(final ExplicitJudgementOnReferenceMatch partialMatch) {
    return rawAccumulateAllValuesOfreference(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for reference.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<EReference> getAllValuesOfreference(final String pUser, final EObject pSource, final EObject pTarget, final OperationType pOperation, final AccessibilityLevel pAccess, final Integer pPriority) {
    return rawAccumulateAllValuesOfreference(new Object[]{
    pUser, 
    pSource, 
    pTarget, 
    null, 
    pOperation, 
    pAccess, 
    pPriority
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
  public Set<OperationType> getAllValuesOfoperation(final ExplicitJudgementOnReferenceMatch partialMatch) {
    return rawAccumulateAllValuesOfoperation(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for operation.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<OperationType> getAllValuesOfoperation(final String pUser, final EObject pSource, final EObject pTarget, final EReference pReference, final AccessibilityLevel pAccess, final Integer pPriority) {
    return rawAccumulateAllValuesOfoperation(new Object[]{
    pUser, 
    pSource, 
    pTarget, 
    pReference, 
    null, 
    pAccess, 
    pPriority
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for access.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<AccessibilityLevel> rawAccumulateAllValuesOfaccess(final Object[] parameters) {
    Set<AccessibilityLevel> results = new HashSet<AccessibilityLevel>();
    rawAccumulateAllValues(POSITION_ACCESS, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for access.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AccessibilityLevel> getAllValuesOfaccess() {
    return rawAccumulateAllValuesOfaccess(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for access.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AccessibilityLevel> getAllValuesOfaccess(final ExplicitJudgementOnReferenceMatch partialMatch) {
    return rawAccumulateAllValuesOfaccess(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for access.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AccessibilityLevel> getAllValuesOfaccess(final String pUser, final EObject pSource, final EObject pTarget, final EReference pReference, final OperationType pOperation, final Integer pPriority) {
    return rawAccumulateAllValuesOfaccess(new Object[]{
    pUser, 
    pSource, 
    pTarget, 
    pReference, 
    pOperation, 
    null, 
    pPriority
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for priority.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<Integer> rawAccumulateAllValuesOfpriority(final Object[] parameters) {
    Set<Integer> results = new HashSet<Integer>();
    rawAccumulateAllValues(POSITION_PRIORITY, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for priority.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<Integer> getAllValuesOfpriority() {
    return rawAccumulateAllValuesOfpriority(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for priority.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<Integer> getAllValuesOfpriority(final ExplicitJudgementOnReferenceMatch partialMatch) {
    return rawAccumulateAllValuesOfpriority(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for priority.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<Integer> getAllValuesOfpriority(final String pUser, final EObject pSource, final EObject pTarget, final EReference pReference, final OperationType pOperation, final AccessibilityLevel pAccess) {
    return rawAccumulateAllValuesOfpriority(new Object[]{
    pUser, 
    pSource, 
    pTarget, 
    pReference, 
    pOperation, 
    pAccess, 
    null
    });
  }
  
  @Override
  protected ExplicitJudgementOnReferenceMatch tupleToMatch(final Tuple t) {
    try {
        return ExplicitJudgementOnReferenceMatch.newMatch((String) t.get(POSITION_USER), (EObject) t.get(POSITION_SOURCE), (EObject) t.get(POSITION_TARGET), (EReference) t.get(POSITION_REFERENCE), (OperationType) t.get(POSITION_OPERATION), (AccessibilityLevel) t.get(POSITION_ACCESS), (Integer) t.get(POSITION_PRIORITY));
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in tuple not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected ExplicitJudgementOnReferenceMatch arrayToMatch(final Object[] match) {
    try {
        return ExplicitJudgementOnReferenceMatch.newMatch((String) match[POSITION_USER], (EObject) match[POSITION_SOURCE], (EObject) match[POSITION_TARGET], (EReference) match[POSITION_REFERENCE], (OperationType) match[POSITION_OPERATION], (AccessibilityLevel) match[POSITION_ACCESS], (Integer) match[POSITION_PRIORITY]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected ExplicitJudgementOnReferenceMatch arrayToMatchMutable(final Object[] match) {
    try {
        return ExplicitJudgementOnReferenceMatch.newMutableMatch((String) match[POSITION_USER], (EObject) match[POSITION_SOURCE], (EObject) match[POSITION_TARGET], (EReference) match[POSITION_REFERENCE], (OperationType) match[POSITION_OPERATION], (AccessibilityLevel) match[POSITION_ACCESS], (Integer) match[POSITION_PRIORITY]);
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
  public static IQuerySpecification<ExplicitJudgementOnReferenceMatcher> querySpecification() throws ViatraQueryException {
    return ExplicitJudgementOnReferenceQuerySpecification.instance();
  }
}
