/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy_consequence.vql
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
import org.mondo.collaboration.policy.rules.AccessibilityLevel;
import org.mondo.collaboration.policy.rules.OperationType;
import org.mondo.collaboration.security.increment.policy.StrongConsequenceOnObject_at_1Match;
import org.mondo.collaboration.security.increment.policy.util.StrongConsequenceOnObject_at_1QuerySpecification;

/**
 * Generated pattern matcher API of the org.mondo.collaboration.security.increment.policy.strongConsequenceOnObject_at_1 pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link StrongConsequenceOnObject_at_1Match}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern strongConsequenceOnObject_at_1(user: java String, object: EObject, operation, access)
 * {
 * 	// allow W -{@literal >} allow R, object -{@literal >} object
 * 	find effectiveJudgementOnObject_at_1(user, object, OperationType::WRITE, AccessibilityLevel::ALLOW);
 * 	operation == OperationType::READ;
 * 	access == AccessibilityLevel::ALLOW;
 * } or {
 * 	// deny R -{@literal >} deny W, object -{@literal >} object
 * 	find effectiveJudgementOnObject_at_1(user, object, OperationType::READ, AccessibilityLevel::DENY);
 * 	operation == OperationType::WRITE;
 * 	access == AccessibilityLevel::DENY;
 * } or {
 * 	// allow R -{@literal >} obfuscate R, child -{@literal >} parent
 * 	find effectiveJudgementOnObject_at_1(user, child, OperationType::READ, AccessibilityLevel::ALLOW);
 * 	find contains(object, child);
 * 	neg find effectiveJudgementOnObject_at_1(user, object, OperationType::READ, AccessibilityLevel::ALLOW);
 * 	operation == OperationType::READ;
 * 	access == AccessibilityLevel::OBFUSCATE;
 * } or {
 * 	// allow R -{@literal >} obfuscate R, attribute -{@literal >} source
 * 	find effectiveJudgementOnAttribute_at_1(user, object, _value, _attribute, OperationType::READ, AccessibilityLevel::ALLOW);
 * 	neg find effectiveJudgementOnObject_at_1(user, object, OperationType::READ, AccessibilityLevel::ALLOW);
 * 	operation == OperationType::READ;
 * 	access == AccessibilityLevel::OBFUSCATE;
 * } or {
 *     // deny R, ID attribute -{@literal >} source
 *     find effectiveJudgementOnAttribute_at_1(user, object, anyValue, anyAttribute, OperationType::READ, AccessibilityLevel::DENY);
 *     find idAttribute(object, anyValue, anyAttribute);
 *     operation == OperationType::READ;
 *     access == AccessibilityLevel::DENY;
 * } or {
 *     // allow R -{@literal >} obfuscate R, reference -{@literal >} source
 *     find effectiveJudgementOnReference_at_1(user, object, _target, _reference, OperationType::READ, AccessibilityLevel::ALLOW);
 *     neg find effectiveJudgementOnObject_at_1(user, object, OperationType::READ, AccessibilityLevel::ALLOW);
 *     operation == OperationType::READ;
 *     access == AccessibilityLevel::OBFUSCATE;
 * } or {
 *     // allow R -{@literal >} obfuscate R, reference -{@literal >} target
 *     find effectiveJudgementOnReference_at_1(user, _source, object, _reference, OperationType::READ, AccessibilityLevel::ALLOW);
 *     neg find effectiveJudgementOnObject_at_1(user, object, OperationType::READ, AccessibilityLevel::ALLOW);
 *     operation == OperationType::READ;
 *     access == AccessibilityLevel::OBFUSCATE;
 * } or {
 *     // deny R, containment reference -{@literal >} target
 *     find effectiveJudgementOnReference_at_1(user, anySource, object, anyReference, OperationType::READ, AccessibilityLevel::DENY);
 *     find containmentReference(anySource, object, anyReference);
 *     operation == OperationType::READ;
 *     access == AccessibilityLevel::DENY;
 * } or {
 *     // allow W, containment reference -{@literal >} target
 *     find effectiveJudgementOnReference_at_1(user, anySource, object, anyReference, OperationType::WRITE, AccessibilityLevel::ALLOW);
 *     find containmentReference(anySource, object, anyReference);
 *     operation == OperationType::WRITE;
 *     access == AccessibilityLevel::ALLOW;
 * }
 * </pre></code>
 * 
 * @see StrongConsequenceOnObject_at_1Match
 *  @see StrongConsequenceOnObject_at_1Processor
 * @see StrongConsequenceOnObject_at_1QuerySpecification
 * 
 */
@SuppressWarnings("all")
public class StrongConsequenceOnObject_at_1Matcher extends BaseMatcher<StrongConsequenceOnObject_at_1Match> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static StrongConsequenceOnObject_at_1Matcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    StrongConsequenceOnObject_at_1Matcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
        matcher = (StrongConsequenceOnObject_at_1Matcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static StrongConsequenceOnObject_at_1Matcher create() throws ViatraQueryException {
    return new StrongConsequenceOnObject_at_1Matcher();
  }
  
  private final static int POSITION_USER = 0;
  
  private final static int POSITION_OBJECT = 1;
  
  private final static int POSITION_OPERATION = 2;
  
  private final static int POSITION_ACCESS = 3;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(StrongConsequenceOnObject_at_1Matcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private StrongConsequenceOnObject_at_1Matcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pObject the fixed value of pattern parameter object, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pAccess the fixed value of pattern parameter access, or null if not bound.
   * @return matches represented as a StrongConsequenceOnObject_at_1Match object.
   * 
   */
  public Collection<StrongConsequenceOnObject_at_1Match> getAllMatches(final String pUser, final EObject pObject, final OperationType pOperation, final AccessibilityLevel pAccess) {
    return rawGetAllMatches(new Object[]{pUser, pObject, pOperation, pAccess});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pObject the fixed value of pattern parameter object, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pAccess the fixed value of pattern parameter access, or null if not bound.
   * @return a match represented as a StrongConsequenceOnObject_at_1Match object, or null if no match is found.
   * 
   */
  public StrongConsequenceOnObject_at_1Match getOneArbitraryMatch(final String pUser, final EObject pObject, final OperationType pOperation, final AccessibilityLevel pAccess) {
    return rawGetOneArbitraryMatch(new Object[]{pUser, pObject, pOperation, pAccess});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pObject the fixed value of pattern parameter object, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pAccess the fixed value of pattern parameter access, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final String pUser, final EObject pObject, final OperationType pOperation, final AccessibilityLevel pAccess) {
    return rawHasMatch(new Object[]{pUser, pObject, pOperation, pAccess});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pObject the fixed value of pattern parameter object, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pAccess the fixed value of pattern parameter access, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final String pUser, final EObject pObject, final OperationType pOperation, final AccessibilityLevel pAccess) {
    return rawCountMatches(new Object[]{pUser, pObject, pOperation, pAccess});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pObject the fixed value of pattern parameter object, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pAccess the fixed value of pattern parameter access, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final String pUser, final EObject pObject, final OperationType pOperation, final AccessibilityLevel pAccess, final IMatchProcessor<? super StrongConsequenceOnObject_at_1Match> processor) {
    rawForEachMatch(new Object[]{pUser, pObject, pOperation, pAccess}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pObject the fixed value of pattern parameter object, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pAccess the fixed value of pattern parameter access, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final String pUser, final EObject pObject, final OperationType pOperation, final AccessibilityLevel pAccess, final IMatchProcessor<? super StrongConsequenceOnObject_at_1Match> processor) {
    return rawForOneArbitraryMatch(new Object[]{pUser, pObject, pOperation, pAccess}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pObject the fixed value of pattern parameter object, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pAccess the fixed value of pattern parameter access, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public StrongConsequenceOnObject_at_1Match newMatch(final String pUser, final EObject pObject, final OperationType pOperation, final AccessibilityLevel pAccess) {
    return StrongConsequenceOnObject_at_1Match.newMatch(pUser, pObject, pOperation, pAccess);
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
  public Set<String> getAllValuesOfuser(final StrongConsequenceOnObject_at_1Match partialMatch) {
    return rawAccumulateAllValuesOfuser(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for user.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfuser(final EObject pObject, final OperationType pOperation, final AccessibilityLevel pAccess) {
    return rawAccumulateAllValuesOfuser(new Object[]{
    null, 
    pObject, 
    pOperation, 
    pAccess
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
  public Set<EObject> getAllValuesOfobject(final StrongConsequenceOnObject_at_1Match partialMatch) {
    return rawAccumulateAllValuesOfobject(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for object.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<EObject> getAllValuesOfobject(final String pUser, final OperationType pOperation, final AccessibilityLevel pAccess) {
    return rawAccumulateAllValuesOfobject(new Object[]{
    pUser, 
    null, 
    pOperation, 
    pAccess
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
  public Set<OperationType> getAllValuesOfoperation(final StrongConsequenceOnObject_at_1Match partialMatch) {
    return rawAccumulateAllValuesOfoperation(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for operation.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<OperationType> getAllValuesOfoperation(final String pUser, final EObject pObject, final AccessibilityLevel pAccess) {
    return rawAccumulateAllValuesOfoperation(new Object[]{
    pUser, 
    pObject, 
    null, 
    pAccess
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
  public Set<AccessibilityLevel> getAllValuesOfaccess(final StrongConsequenceOnObject_at_1Match partialMatch) {
    return rawAccumulateAllValuesOfaccess(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for access.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AccessibilityLevel> getAllValuesOfaccess(final String pUser, final EObject pObject, final OperationType pOperation) {
    return rawAccumulateAllValuesOfaccess(new Object[]{
    pUser, 
    pObject, 
    pOperation, 
    null
    });
  }
  
  @Override
  protected StrongConsequenceOnObject_at_1Match tupleToMatch(final Tuple t) {
    try {
        return StrongConsequenceOnObject_at_1Match.newMatch((String) t.get(POSITION_USER), (EObject) t.get(POSITION_OBJECT), (OperationType) t.get(POSITION_OPERATION), (AccessibilityLevel) t.get(POSITION_ACCESS));
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in tuple not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected StrongConsequenceOnObject_at_1Match arrayToMatch(final Object[] match) {
    try {
        return StrongConsequenceOnObject_at_1Match.newMatch((String) match[POSITION_USER], (EObject) match[POSITION_OBJECT], (OperationType) match[POSITION_OPERATION], (AccessibilityLevel) match[POSITION_ACCESS]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected StrongConsequenceOnObject_at_1Match arrayToMatchMutable(final Object[] match) {
    try {
        return StrongConsequenceOnObject_at_1Match.newMutableMatch((String) match[POSITION_USER], (EObject) match[POSITION_OBJECT], (OperationType) match[POSITION_OPERATION], (AccessibilityLevel) match[POSITION_ACCESS]);
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
  public static IQuerySpecification<StrongConsequenceOnObject_at_1Matcher> querySpecification() throws ViatraQueryException {
    return StrongConsequenceOnObject_at_1QuerySpecification.instance();
  }
}
