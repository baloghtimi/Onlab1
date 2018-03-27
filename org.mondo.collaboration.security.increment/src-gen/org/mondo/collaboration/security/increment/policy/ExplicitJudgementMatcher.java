/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy_gen.vql
 */
package org.mondo.collaboration.security.increment.policy;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import org.mondo.collaboration.security.increment.policy.ExplicitJudgementMatch;
import org.mondo.collaboration.security.increment.policy.util.ExplicitJudgementQuerySpecification;
import org.mondo.collaboration.security.increment.vocabulary.AccessibilityLevel;
import org.mondo.collaboration.security.increment.vocabulary.OperationType;

/**
 * Generated pattern matcher API of the org.mondo.collaboration.security.increment.policy.explicitJudgement pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link ExplicitJudgementMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern explicitJudgement(user: java String, asset: EObject, operation, access, priority: java Integer)
 * {
 * 	
 * //  rule restrictRoot
 *     find restrictRootAsset(asset);
 *     find restrictRootUser(user);
 *     operation == OperationType::WRITE;
 *     access == AccessibilityLevel::DENY;
 *     priority == 1;
 * 
 * } or {
 * 
 * //  rule enableRoot
 *     find enableRootAsset(asset);
 *     find enableRootUser(user);
 *     operation == OperationType::READ;
 *     access == AccessibilityLevel::ALLOW;
 *     priority == 1;
 * 
 * } or {
 * 
 * //  rule enableIO
 *     find enableIOAsset(asset);
 *     find enableIOUser(user);
 *     find readWriteOperation(operation);
 *     access == AccessibilityLevel::ALLOW;
 *     priority == 1;
 * 
 * } or {
 * 
 * //  rule restrictNotIO
 *     find restrictNotIOAsset(asset);
 *     find restrictNotIOUser(user);
 *     operation == OperationType::READ;
 *     access == AccessibilityLevel::DENY;
 *     priority == 1;
 * 
 * } or {
 * 
 * //  rule restrictIO
 *     find restrictIOAsset(asset);
 *     find restrictIOUser(user);
 *     operation == OperationType::WRITE;
 *     access == AccessibilityLevel::DENY;
 *     priority == 1;
 * 
 * } or {
 * 
 * //  rule default
 *     find objectAllObjects(asset);
 *     find allUsers(user);
 *     find readWriteOperation(operation);
 *     access == AccessibilityLevel::ALLOW;
 *     priority == 0;
 * }
 * </pre></code>
 * 
 * @see ExplicitJudgementMatch
 *  @see ExplicitJudgementProcessor
 * @see ExplicitJudgementQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class ExplicitJudgementMatcher extends BaseMatcher<ExplicitJudgementMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static ExplicitJudgementMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    ExplicitJudgementMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
        matcher = (ExplicitJudgementMatcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static ExplicitJudgementMatcher create() throws ViatraQueryException {
    return new ExplicitJudgementMatcher();
  }
  
  private final static int POSITION_USER = 0;
  
  private final static int POSITION_ASSET = 1;
  
  private final static int POSITION_OPERATION = 2;
  
  private final static int POSITION_ACCESS = 3;
  
  private final static int POSITION_PRIORITY = 4;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ExplicitJudgementMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private ExplicitJudgementMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pAsset the fixed value of pattern parameter asset, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pAccess the fixed value of pattern parameter access, or null if not bound.
   * @param pPriority the fixed value of pattern parameter priority, or null if not bound.
   * @return matches represented as a ExplicitJudgementMatch object.
   * 
   */
  public Collection<ExplicitJudgementMatch> getAllMatches(final String pUser, final EObject pAsset, final OperationType pOperation, final AccessibilityLevel pAccess, final Integer pPriority) {
    return rawGetAllMatches(new Object[]{pUser, pAsset, pOperation, pAccess, pPriority});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pAsset the fixed value of pattern parameter asset, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pAccess the fixed value of pattern parameter access, or null if not bound.
   * @param pPriority the fixed value of pattern parameter priority, or null if not bound.
   * @return a match represented as a ExplicitJudgementMatch object, or null if no match is found.
   * 
   */
  public ExplicitJudgementMatch getOneArbitraryMatch(final String pUser, final EObject pAsset, final OperationType pOperation, final AccessibilityLevel pAccess, final Integer pPriority) {
    return rawGetOneArbitraryMatch(new Object[]{pUser, pAsset, pOperation, pAccess, pPriority});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pAsset the fixed value of pattern parameter asset, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pAccess the fixed value of pattern parameter access, or null if not bound.
   * @param pPriority the fixed value of pattern parameter priority, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final String pUser, final EObject pAsset, final OperationType pOperation, final AccessibilityLevel pAccess, final Integer pPriority) {
    return rawHasMatch(new Object[]{pUser, pAsset, pOperation, pAccess, pPriority});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pAsset the fixed value of pattern parameter asset, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pAccess the fixed value of pattern parameter access, or null if not bound.
   * @param pPriority the fixed value of pattern parameter priority, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final String pUser, final EObject pAsset, final OperationType pOperation, final AccessibilityLevel pAccess, final Integer pPriority) {
    return rawCountMatches(new Object[]{pUser, pAsset, pOperation, pAccess, pPriority});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pAsset the fixed value of pattern parameter asset, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pAccess the fixed value of pattern parameter access, or null if not bound.
   * @param pPriority the fixed value of pattern parameter priority, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final String pUser, final EObject pAsset, final OperationType pOperation, final AccessibilityLevel pAccess, final Integer pPriority, final IMatchProcessor<? super ExplicitJudgementMatch> processor) {
    rawForEachMatch(new Object[]{pUser, pAsset, pOperation, pAccess, pPriority}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pAsset the fixed value of pattern parameter asset, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pAccess the fixed value of pattern parameter access, or null if not bound.
   * @param pPriority the fixed value of pattern parameter priority, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final String pUser, final EObject pAsset, final OperationType pOperation, final AccessibilityLevel pAccess, final Integer pPriority, final IMatchProcessor<? super ExplicitJudgementMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pUser, pAsset, pOperation, pAccess, pPriority}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pAsset the fixed value of pattern parameter asset, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pAccess the fixed value of pattern parameter access, or null if not bound.
   * @param pPriority the fixed value of pattern parameter priority, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public ExplicitJudgementMatch newMatch(final String pUser, final EObject pAsset, final OperationType pOperation, final AccessibilityLevel pAccess, final Integer pPriority) {
    return ExplicitJudgementMatch.newMatch(pUser, pAsset, pOperation, pAccess, pPriority);
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
  public Set<String> getAllValuesOfuser(final ExplicitJudgementMatch partialMatch) {
    return rawAccumulateAllValuesOfuser(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for user.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfuser(final EObject pAsset, final OperationType pOperation, final AccessibilityLevel pAccess, final Integer pPriority) {
    return rawAccumulateAllValuesOfuser(new Object[]{
    null, 
    pAsset, 
    pOperation, 
    pAccess, 
    pPriority
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for asset.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<EObject> rawAccumulateAllValuesOfasset(final Object[] parameters) {
    Set<EObject> results = new HashSet<EObject>();
    rawAccumulateAllValues(POSITION_ASSET, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for asset.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<EObject> getAllValuesOfasset() {
    return rawAccumulateAllValuesOfasset(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for asset.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<EObject> getAllValuesOfasset(final ExplicitJudgementMatch partialMatch) {
    return rawAccumulateAllValuesOfasset(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for asset.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<EObject> getAllValuesOfasset(final String pUser, final OperationType pOperation, final AccessibilityLevel pAccess, final Integer pPriority) {
    return rawAccumulateAllValuesOfasset(new Object[]{
    pUser, 
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
  public Set<OperationType> getAllValuesOfoperation(final ExplicitJudgementMatch partialMatch) {
    return rawAccumulateAllValuesOfoperation(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for operation.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<OperationType> getAllValuesOfoperation(final String pUser, final EObject pAsset, final AccessibilityLevel pAccess, final Integer pPriority) {
    return rawAccumulateAllValuesOfoperation(new Object[]{
    pUser, 
    pAsset, 
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
  public Set<AccessibilityLevel> getAllValuesOfaccess(final ExplicitJudgementMatch partialMatch) {
    return rawAccumulateAllValuesOfaccess(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for access.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AccessibilityLevel> getAllValuesOfaccess(final String pUser, final EObject pAsset, final OperationType pOperation, final Integer pPriority) {
    return rawAccumulateAllValuesOfaccess(new Object[]{
    pUser, 
    pAsset, 
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
  public Set<Integer> getAllValuesOfpriority(final ExplicitJudgementMatch partialMatch) {
    return rawAccumulateAllValuesOfpriority(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for priority.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<Integer> getAllValuesOfpriority(final String pUser, final EObject pAsset, final OperationType pOperation, final AccessibilityLevel pAccess) {
    return rawAccumulateAllValuesOfpriority(new Object[]{
    pUser, 
    pAsset, 
    pOperation, 
    pAccess, 
    null
    });
  }
  
  @Override
  protected ExplicitJudgementMatch tupleToMatch(final Tuple t) {
    try {
        return ExplicitJudgementMatch.newMatch((String) t.get(POSITION_USER), (EObject) t.get(POSITION_ASSET), (OperationType) t.get(POSITION_OPERATION), (AccessibilityLevel) t.get(POSITION_ACCESS), (Integer) t.get(POSITION_PRIORITY));
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in tuple not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected ExplicitJudgementMatch arrayToMatch(final Object[] match) {
    try {
        return ExplicitJudgementMatch.newMatch((String) match[POSITION_USER], (EObject) match[POSITION_ASSET], (OperationType) match[POSITION_OPERATION], (AccessibilityLevel) match[POSITION_ACCESS], (Integer) match[POSITION_PRIORITY]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected ExplicitJudgementMatch arrayToMatchMutable(final Object[] match) {
    try {
        return ExplicitJudgementMatch.newMutableMatch((String) match[POSITION_USER], (EObject) match[POSITION_ASSET], (OperationType) match[POSITION_OPERATION], (AccessibilityLevel) match[POSITION_ACCESS], (Integer) match[POSITION_PRIORITY]);
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
  public static IQuerySpecification<ExplicitJudgementMatcher> querySpecification() throws ViatraQueryException {
    return ExplicitJudgementQuerySpecification.instance();
  }
}
