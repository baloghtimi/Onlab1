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
import org.mondo.collaboration.security.increment.policy.StrongConsequence_at_0Match;
import org.mondo.collaboration.security.increment.policy.util.StrongConsequence_at_0QuerySpecification;
import org.mondo.collaboration.security.increment.vocabulary.AccessibilityLevel;
import org.mondo.collaboration.security.increment.vocabulary.OperationType;

/**
 * Generated pattern matcher API of the org.mondo.collaboration.security.increment.policy.strongConsequence_at_0 pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link StrongConsequence_at_0Match}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern strongConsequence_at_0(user: java String,
 * 	depAsset: EObject, depOp, depAccess, 
 * 	domAsset: EObject, domOp, domAccess) 
 * {
 * 	// type II, read vs write
 * 	find effectiveJudgement_at_0(user, domAsset, domOp, domAccess);
 * 	depAsset == domAsset;
 * 	domOp == OperationType::WRITE; depOp == OperationType::READ;
 * 	domAccess == AccessibilityLevel::ALLOW; depAccess == AccessibilityLevel::ALLOW; 
 * } or {
 * 	// type II, read vs write
 * 	find effectiveJudgement_at_0(user, domAsset, domOp, domAccess);
 * 	depAsset == domAsset;
 * 	domOp == OperationType::READ; depOp == OperationType::WRITE;
 * 	domAccess == AccessibilityLevel::DENY; depAccess == AccessibilityLevel::DENY; 
 * } or {
 * 	// type III, read vs containment
 * 	find effectiveJudgement_at_0(user, domAsset, domOp, domAccess);
 * 	find contains(depAsset, domAsset);
 * 	domOp == OperationType::READ; depOp == OperationType::READ;
 * 	domAccess == AccessibilityLevel::ALLOW; depAccess == AccessibilityLevel::ALLOW; 
 * } or {
 * 	// type III, read vs containment
 * 	find effectiveJudgement_at_0(user, domAsset, domOp, domAccess);
 * 	find contains(domAsset, depAsset);
 * 	domOp == OperationType::READ; depOp == OperationType::READ;
 * 	domAccess == AccessibilityLevel::DENY; depAccess == AccessibilityLevel::DENY; 
 * }
 * </pre></code>
 * 
 * @see StrongConsequence_at_0Match
 *  @see StrongConsequence_at_0Processor
 * @see StrongConsequence_at_0QuerySpecification
 * 
 */
@SuppressWarnings("all")
public class StrongConsequence_at_0Matcher extends BaseMatcher<StrongConsequence_at_0Match> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static StrongConsequence_at_0Matcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    StrongConsequence_at_0Matcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
        matcher = (StrongConsequence_at_0Matcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static StrongConsequence_at_0Matcher create() throws ViatraQueryException {
    return new StrongConsequence_at_0Matcher();
  }
  
  private final static int POSITION_USER = 0;
  
  private final static int POSITION_DEPASSET = 1;
  
  private final static int POSITION_DEPOP = 2;
  
  private final static int POSITION_DEPACCESS = 3;
  
  private final static int POSITION_DOMASSET = 4;
  
  private final static int POSITION_DOMOP = 5;
  
  private final static int POSITION_DOMACCESS = 6;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(StrongConsequence_at_0Matcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private StrongConsequence_at_0Matcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pDepAsset the fixed value of pattern parameter depAsset, or null if not bound.
   * @param pDepOp the fixed value of pattern parameter depOp, or null if not bound.
   * @param pDepAccess the fixed value of pattern parameter depAccess, or null if not bound.
   * @param pDomAsset the fixed value of pattern parameter domAsset, or null if not bound.
   * @param pDomOp the fixed value of pattern parameter domOp, or null if not bound.
   * @param pDomAccess the fixed value of pattern parameter domAccess, or null if not bound.
   * @return matches represented as a StrongConsequence_at_0Match object.
   * 
   */
  public Collection<StrongConsequence_at_0Match> getAllMatches(final String pUser, final EObject pDepAsset, final OperationType pDepOp, final AccessibilityLevel pDepAccess, final EObject pDomAsset, final OperationType pDomOp, final AccessibilityLevel pDomAccess) {
    return rawGetAllMatches(new Object[]{pUser, pDepAsset, pDepOp, pDepAccess, pDomAsset, pDomOp, pDomAccess});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pDepAsset the fixed value of pattern parameter depAsset, or null if not bound.
   * @param pDepOp the fixed value of pattern parameter depOp, or null if not bound.
   * @param pDepAccess the fixed value of pattern parameter depAccess, or null if not bound.
   * @param pDomAsset the fixed value of pattern parameter domAsset, or null if not bound.
   * @param pDomOp the fixed value of pattern parameter domOp, or null if not bound.
   * @param pDomAccess the fixed value of pattern parameter domAccess, or null if not bound.
   * @return a match represented as a StrongConsequence_at_0Match object, or null if no match is found.
   * 
   */
  public StrongConsequence_at_0Match getOneArbitraryMatch(final String pUser, final EObject pDepAsset, final OperationType pDepOp, final AccessibilityLevel pDepAccess, final EObject pDomAsset, final OperationType pDomOp, final AccessibilityLevel pDomAccess) {
    return rawGetOneArbitraryMatch(new Object[]{pUser, pDepAsset, pDepOp, pDepAccess, pDomAsset, pDomOp, pDomAccess});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pDepAsset the fixed value of pattern parameter depAsset, or null if not bound.
   * @param pDepOp the fixed value of pattern parameter depOp, or null if not bound.
   * @param pDepAccess the fixed value of pattern parameter depAccess, or null if not bound.
   * @param pDomAsset the fixed value of pattern parameter domAsset, or null if not bound.
   * @param pDomOp the fixed value of pattern parameter domOp, or null if not bound.
   * @param pDomAccess the fixed value of pattern parameter domAccess, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final String pUser, final EObject pDepAsset, final OperationType pDepOp, final AccessibilityLevel pDepAccess, final EObject pDomAsset, final OperationType pDomOp, final AccessibilityLevel pDomAccess) {
    return rawHasMatch(new Object[]{pUser, pDepAsset, pDepOp, pDepAccess, pDomAsset, pDomOp, pDomAccess});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pDepAsset the fixed value of pattern parameter depAsset, or null if not bound.
   * @param pDepOp the fixed value of pattern parameter depOp, or null if not bound.
   * @param pDepAccess the fixed value of pattern parameter depAccess, or null if not bound.
   * @param pDomAsset the fixed value of pattern parameter domAsset, or null if not bound.
   * @param pDomOp the fixed value of pattern parameter domOp, or null if not bound.
   * @param pDomAccess the fixed value of pattern parameter domAccess, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final String pUser, final EObject pDepAsset, final OperationType pDepOp, final AccessibilityLevel pDepAccess, final EObject pDomAsset, final OperationType pDomOp, final AccessibilityLevel pDomAccess) {
    return rawCountMatches(new Object[]{pUser, pDepAsset, pDepOp, pDepAccess, pDomAsset, pDomOp, pDomAccess});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pDepAsset the fixed value of pattern parameter depAsset, or null if not bound.
   * @param pDepOp the fixed value of pattern parameter depOp, or null if not bound.
   * @param pDepAccess the fixed value of pattern parameter depAccess, or null if not bound.
   * @param pDomAsset the fixed value of pattern parameter domAsset, or null if not bound.
   * @param pDomOp the fixed value of pattern parameter domOp, or null if not bound.
   * @param pDomAccess the fixed value of pattern parameter domAccess, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final String pUser, final EObject pDepAsset, final OperationType pDepOp, final AccessibilityLevel pDepAccess, final EObject pDomAsset, final OperationType pDomOp, final AccessibilityLevel pDomAccess, final IMatchProcessor<? super StrongConsequence_at_0Match> processor) {
    rawForEachMatch(new Object[]{pUser, pDepAsset, pDepOp, pDepAccess, pDomAsset, pDomOp, pDomAccess}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pDepAsset the fixed value of pattern parameter depAsset, or null if not bound.
   * @param pDepOp the fixed value of pattern parameter depOp, or null if not bound.
   * @param pDepAccess the fixed value of pattern parameter depAccess, or null if not bound.
   * @param pDomAsset the fixed value of pattern parameter domAsset, or null if not bound.
   * @param pDomOp the fixed value of pattern parameter domOp, or null if not bound.
   * @param pDomAccess the fixed value of pattern parameter domAccess, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final String pUser, final EObject pDepAsset, final OperationType pDepOp, final AccessibilityLevel pDepAccess, final EObject pDomAsset, final OperationType pDomOp, final AccessibilityLevel pDomAccess, final IMatchProcessor<? super StrongConsequence_at_0Match> processor) {
    return rawForOneArbitraryMatch(new Object[]{pUser, pDepAsset, pDepOp, pDepAccess, pDomAsset, pDomOp, pDomAccess}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pDepAsset the fixed value of pattern parameter depAsset, or null if not bound.
   * @param pDepOp the fixed value of pattern parameter depOp, or null if not bound.
   * @param pDepAccess the fixed value of pattern parameter depAccess, or null if not bound.
   * @param pDomAsset the fixed value of pattern parameter domAsset, or null if not bound.
   * @param pDomOp the fixed value of pattern parameter domOp, or null if not bound.
   * @param pDomAccess the fixed value of pattern parameter domAccess, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public StrongConsequence_at_0Match newMatch(final String pUser, final EObject pDepAsset, final OperationType pDepOp, final AccessibilityLevel pDepAccess, final EObject pDomAsset, final OperationType pDomOp, final AccessibilityLevel pDomAccess) {
    return StrongConsequence_at_0Match.newMatch(pUser, pDepAsset, pDepOp, pDepAccess, pDomAsset, pDomOp, pDomAccess);
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
  public Set<String> getAllValuesOfuser(final StrongConsequence_at_0Match partialMatch) {
    return rawAccumulateAllValuesOfuser(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for user.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfuser(final EObject pDepAsset, final OperationType pDepOp, final AccessibilityLevel pDepAccess, final EObject pDomAsset, final OperationType pDomOp, final AccessibilityLevel pDomAccess) {
    return rawAccumulateAllValuesOfuser(new Object[]{
    null, 
    pDepAsset, 
    pDepOp, 
    pDepAccess, 
    pDomAsset, 
    pDomOp, 
    pDomAccess
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for depAsset.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<EObject> rawAccumulateAllValuesOfdepAsset(final Object[] parameters) {
    Set<EObject> results = new HashSet<EObject>();
    rawAccumulateAllValues(POSITION_DEPASSET, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for depAsset.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<EObject> getAllValuesOfdepAsset() {
    return rawAccumulateAllValuesOfdepAsset(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for depAsset.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<EObject> getAllValuesOfdepAsset(final StrongConsequence_at_0Match partialMatch) {
    return rawAccumulateAllValuesOfdepAsset(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for depAsset.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<EObject> getAllValuesOfdepAsset(final String pUser, final OperationType pDepOp, final AccessibilityLevel pDepAccess, final EObject pDomAsset, final OperationType pDomOp, final AccessibilityLevel pDomAccess) {
    return rawAccumulateAllValuesOfdepAsset(new Object[]{
    pUser, 
    null, 
    pDepOp, 
    pDepAccess, 
    pDomAsset, 
    pDomOp, 
    pDomAccess
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for depOp.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<OperationType> rawAccumulateAllValuesOfdepOp(final Object[] parameters) {
    Set<OperationType> results = new HashSet<OperationType>();
    rawAccumulateAllValues(POSITION_DEPOP, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for depOp.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<OperationType> getAllValuesOfdepOp() {
    return rawAccumulateAllValuesOfdepOp(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for depOp.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<OperationType> getAllValuesOfdepOp(final StrongConsequence_at_0Match partialMatch) {
    return rawAccumulateAllValuesOfdepOp(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for depOp.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<OperationType> getAllValuesOfdepOp(final String pUser, final EObject pDepAsset, final AccessibilityLevel pDepAccess, final EObject pDomAsset, final OperationType pDomOp, final AccessibilityLevel pDomAccess) {
    return rawAccumulateAllValuesOfdepOp(new Object[]{
    pUser, 
    pDepAsset, 
    null, 
    pDepAccess, 
    pDomAsset, 
    pDomOp, 
    pDomAccess
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for depAccess.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<AccessibilityLevel> rawAccumulateAllValuesOfdepAccess(final Object[] parameters) {
    Set<AccessibilityLevel> results = new HashSet<AccessibilityLevel>();
    rawAccumulateAllValues(POSITION_DEPACCESS, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for depAccess.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AccessibilityLevel> getAllValuesOfdepAccess() {
    return rawAccumulateAllValuesOfdepAccess(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for depAccess.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AccessibilityLevel> getAllValuesOfdepAccess(final StrongConsequence_at_0Match partialMatch) {
    return rawAccumulateAllValuesOfdepAccess(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for depAccess.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AccessibilityLevel> getAllValuesOfdepAccess(final String pUser, final EObject pDepAsset, final OperationType pDepOp, final EObject pDomAsset, final OperationType pDomOp, final AccessibilityLevel pDomAccess) {
    return rawAccumulateAllValuesOfdepAccess(new Object[]{
    pUser, 
    pDepAsset, 
    pDepOp, 
    null, 
    pDomAsset, 
    pDomOp, 
    pDomAccess
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for domAsset.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<EObject> rawAccumulateAllValuesOfdomAsset(final Object[] parameters) {
    Set<EObject> results = new HashSet<EObject>();
    rawAccumulateAllValues(POSITION_DOMASSET, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for domAsset.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<EObject> getAllValuesOfdomAsset() {
    return rawAccumulateAllValuesOfdomAsset(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for domAsset.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<EObject> getAllValuesOfdomAsset(final StrongConsequence_at_0Match partialMatch) {
    return rawAccumulateAllValuesOfdomAsset(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for domAsset.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<EObject> getAllValuesOfdomAsset(final String pUser, final EObject pDepAsset, final OperationType pDepOp, final AccessibilityLevel pDepAccess, final OperationType pDomOp, final AccessibilityLevel pDomAccess) {
    return rawAccumulateAllValuesOfdomAsset(new Object[]{
    pUser, 
    pDepAsset, 
    pDepOp, 
    pDepAccess, 
    null, 
    pDomOp, 
    pDomAccess
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for domOp.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<OperationType> rawAccumulateAllValuesOfdomOp(final Object[] parameters) {
    Set<OperationType> results = new HashSet<OperationType>();
    rawAccumulateAllValues(POSITION_DOMOP, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for domOp.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<OperationType> getAllValuesOfdomOp() {
    return rawAccumulateAllValuesOfdomOp(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for domOp.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<OperationType> getAllValuesOfdomOp(final StrongConsequence_at_0Match partialMatch) {
    return rawAccumulateAllValuesOfdomOp(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for domOp.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<OperationType> getAllValuesOfdomOp(final String pUser, final EObject pDepAsset, final OperationType pDepOp, final AccessibilityLevel pDepAccess, final EObject pDomAsset, final AccessibilityLevel pDomAccess) {
    return rawAccumulateAllValuesOfdomOp(new Object[]{
    pUser, 
    pDepAsset, 
    pDepOp, 
    pDepAccess, 
    pDomAsset, 
    null, 
    pDomAccess
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for domAccess.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<AccessibilityLevel> rawAccumulateAllValuesOfdomAccess(final Object[] parameters) {
    Set<AccessibilityLevel> results = new HashSet<AccessibilityLevel>();
    rawAccumulateAllValues(POSITION_DOMACCESS, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for domAccess.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AccessibilityLevel> getAllValuesOfdomAccess() {
    return rawAccumulateAllValuesOfdomAccess(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for domAccess.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AccessibilityLevel> getAllValuesOfdomAccess(final StrongConsequence_at_0Match partialMatch) {
    return rawAccumulateAllValuesOfdomAccess(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for domAccess.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AccessibilityLevel> getAllValuesOfdomAccess(final String pUser, final EObject pDepAsset, final OperationType pDepOp, final AccessibilityLevel pDepAccess, final EObject pDomAsset, final OperationType pDomOp) {
    return rawAccumulateAllValuesOfdomAccess(new Object[]{
    pUser, 
    pDepAsset, 
    pDepOp, 
    pDepAccess, 
    pDomAsset, 
    pDomOp, 
    null
    });
  }
  
  @Override
  protected StrongConsequence_at_0Match tupleToMatch(final Tuple t) {
    try {
        return StrongConsequence_at_0Match.newMatch((String) t.get(POSITION_USER), (EObject) t.get(POSITION_DEPASSET), (OperationType) t.get(POSITION_DEPOP), (AccessibilityLevel) t.get(POSITION_DEPACCESS), (EObject) t.get(POSITION_DOMASSET), (OperationType) t.get(POSITION_DOMOP), (AccessibilityLevel) t.get(POSITION_DOMACCESS));
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in tuple not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected StrongConsequence_at_0Match arrayToMatch(final Object[] match) {
    try {
        return StrongConsequence_at_0Match.newMatch((String) match[POSITION_USER], (EObject) match[POSITION_DEPASSET], (OperationType) match[POSITION_DEPOP], (AccessibilityLevel) match[POSITION_DEPACCESS], (EObject) match[POSITION_DOMASSET], (OperationType) match[POSITION_DOMOP], (AccessibilityLevel) match[POSITION_DOMACCESS]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected StrongConsequence_at_0Match arrayToMatchMutable(final Object[] match) {
    try {
        return StrongConsequence_at_0Match.newMutableMatch((String) match[POSITION_USER], (EObject) match[POSITION_DEPASSET], (OperationType) match[POSITION_DEPOP], (AccessibilityLevel) match[POSITION_DEPACCESS], (EObject) match[POSITION_DOMASSET], (OperationType) match[POSITION_DOMOP], (AccessibilityLevel) match[POSITION_DOMACCESS]);
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
  public static IQuerySpecification<StrongConsequence_at_0Matcher> querySpecification() throws ViatraQueryException {
    return StrongConsequence_at_0QuerySpecification.instance();
  }
}
