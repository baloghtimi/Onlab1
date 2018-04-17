/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy_domination_higher_priority.vql
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
import org.mondo.collaboration.security.increment.policy.DominationOnObject_of_defaultMatch;
import org.mondo.collaboration.security.increment.policy.util.DominationOnObject_of_defaultQuerySpecification;

/**
 * Generated pattern matcher API of the org.mondo.collaboration.security.increment.policy.dominationOnObject_of_default pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link DominationOnObject_of_defaultMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern dominationOnObject_of_default(user: java String, object: EObject, operation)
 * {
 * find effectiveJudgementOnObject_at_1(user, object, operation, _access);
 * }
 * </pre></code>
 * 
 * @see DominationOnObject_of_defaultMatch
 *  @see DominationOnObject_of_defaultProcessor
 * @see DominationOnObject_of_defaultQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class DominationOnObject_of_defaultMatcher extends BaseMatcher<DominationOnObject_of_defaultMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static DominationOnObject_of_defaultMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    DominationOnObject_of_defaultMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
        matcher = (DominationOnObject_of_defaultMatcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static DominationOnObject_of_defaultMatcher create() throws ViatraQueryException {
    return new DominationOnObject_of_defaultMatcher();
  }
  
  private final static int POSITION_USER = 0;
  
  private final static int POSITION_OBJECT = 1;
  
  private final static int POSITION_OPERATION = 2;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(DominationOnObject_of_defaultMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private DominationOnObject_of_defaultMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pObject the fixed value of pattern parameter object, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @return matches represented as a DominationOnObject_of_defaultMatch object.
   * 
   */
  public Collection<DominationOnObject_of_defaultMatch> getAllMatches(final String pUser, final EObject pObject, final Object pOperation) {
    return rawGetAllMatches(new Object[]{pUser, pObject, pOperation});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pObject the fixed value of pattern parameter object, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @return a match represented as a DominationOnObject_of_defaultMatch object, or null if no match is found.
   * 
   */
  public DominationOnObject_of_defaultMatch getOneArbitraryMatch(final String pUser, final EObject pObject, final Object pOperation) {
    return rawGetOneArbitraryMatch(new Object[]{pUser, pObject, pOperation});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pObject the fixed value of pattern parameter object, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final String pUser, final EObject pObject, final Object pOperation) {
    return rawHasMatch(new Object[]{pUser, pObject, pOperation});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pObject the fixed value of pattern parameter object, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final String pUser, final EObject pObject, final Object pOperation) {
    return rawCountMatches(new Object[]{pUser, pObject, pOperation});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pObject the fixed value of pattern parameter object, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final String pUser, final EObject pObject, final Object pOperation, final IMatchProcessor<? super DominationOnObject_of_defaultMatch> processor) {
    rawForEachMatch(new Object[]{pUser, pObject, pOperation}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pObject the fixed value of pattern parameter object, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final String pUser, final EObject pObject, final Object pOperation, final IMatchProcessor<? super DominationOnObject_of_defaultMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pUser, pObject, pOperation}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pObject the fixed value of pattern parameter object, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public DominationOnObject_of_defaultMatch newMatch(final String pUser, final EObject pObject, final Object pOperation) {
    return DominationOnObject_of_defaultMatch.newMatch(pUser, pObject, pOperation);
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
  public Set<String> getAllValuesOfuser(final DominationOnObject_of_defaultMatch partialMatch) {
    return rawAccumulateAllValuesOfuser(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for user.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfuser(final EObject pObject, final Object pOperation) {
    return rawAccumulateAllValuesOfuser(new Object[]{
    null, 
    pObject, 
    pOperation
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for object.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<EObject> rawAccumulateAllValuesOfobject(final Object[] parameters) {
    Set<EObject> results = new HashSet<EObject>();
    rawAccumulateAllValues(POSITION_OBJECT, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for object.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<EObject> getAllValuesOfobject() {
    return rawAccumulateAllValuesOfobject(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for object.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<EObject> getAllValuesOfobject(final DominationOnObject_of_defaultMatch partialMatch) {
    return rawAccumulateAllValuesOfobject(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for object.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<EObject> getAllValuesOfobject(final String pUser, final Object pOperation) {
    return rawAccumulateAllValuesOfobject(new Object[]{
    pUser, 
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
  public Set<Object> getAllValuesOfoperation(final DominationOnObject_of_defaultMatch partialMatch) {
    return rawAccumulateAllValuesOfoperation(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for operation.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<Object> getAllValuesOfoperation(final String pUser, final EObject pObject) {
    return rawAccumulateAllValuesOfoperation(new Object[]{
    pUser, 
    pObject, 
    null
    });
  }
  
  @Override
  protected DominationOnObject_of_defaultMatch tupleToMatch(final Tuple t) {
    try {
        return DominationOnObject_of_defaultMatch.newMatch((String) t.get(POSITION_USER), (EObject) t.get(POSITION_OBJECT), (Object) t.get(POSITION_OPERATION));
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in tuple not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected DominationOnObject_of_defaultMatch arrayToMatch(final Object[] match) {
    try {
        return DominationOnObject_of_defaultMatch.newMatch((String) match[POSITION_USER], (EObject) match[POSITION_OBJECT], (Object) match[POSITION_OPERATION]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected DominationOnObject_of_defaultMatch arrayToMatchMutable(final Object[] match) {
    try {
        return DominationOnObject_of_defaultMatch.newMutableMatch((String) match[POSITION_USER], (EObject) match[POSITION_OBJECT], (Object) match[POSITION_OPERATION]);
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
  public static IQuerySpecification<DominationOnObject_of_defaultMatcher> querySpecification() throws ViatraQueryException {
    return DominationOnObject_of_defaultQuerySpecification.instance();
  }
}
