/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy_judgement.vql
 */
package org.mondo.collaboration.security.increment.policy;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EAttribute;
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
import org.mondo.collaboration.security.increment.policy.JudgementOnAttribute_at_defaultMatch;
import org.mondo.collaboration.security.increment.policy.util.JudgementOnAttribute_at_defaultQuerySpecification;

/**
 * Generated pattern matcher API of the org.mondo.collaboration.security.increment.policy.judgementOnAttribute_at_default pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link JudgementOnAttribute_at_defaultMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern judgementOnAttribute_at_default(user: java String, source: EObject, value: java Object, attribute: EAttribute, operation, access)
 * {
 *     find explicitJudgementOnAttribute(user, source, value, attribute, operation, access, eval(-1));
 * }
 * </pre></code>
 * 
 * @see JudgementOnAttribute_at_defaultMatch
 *  @see JudgementOnAttribute_at_defaultProcessor
 * @see JudgementOnAttribute_at_defaultQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class JudgementOnAttribute_at_defaultMatcher extends BaseMatcher<JudgementOnAttribute_at_defaultMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static JudgementOnAttribute_at_defaultMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    JudgementOnAttribute_at_defaultMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
        matcher = (JudgementOnAttribute_at_defaultMatcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static JudgementOnAttribute_at_defaultMatcher create() throws ViatraQueryException {
    return new JudgementOnAttribute_at_defaultMatcher();
  }
  
  private final static int POSITION_USER = 0;
  
  private final static int POSITION_SOURCE = 1;
  
  private final static int POSITION_VALUE = 2;
  
  private final static int POSITION_ATTRIBUTE = 3;
  
  private final static int POSITION_OPERATION = 4;
  
  private final static int POSITION_ACCESS = 5;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(JudgementOnAttribute_at_defaultMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private JudgementOnAttribute_at_defaultMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pSource the fixed value of pattern parameter source, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pAccess the fixed value of pattern parameter access, or null if not bound.
   * @return matches represented as a JudgementOnAttribute_at_defaultMatch object.
   * 
   */
  public Collection<JudgementOnAttribute_at_defaultMatch> getAllMatches(final String pUser, final EObject pSource, final Object pValue, final EAttribute pAttribute, final OperationType pOperation, final AccessibilityLevel pAccess) {
    return rawGetAllMatches(new Object[]{pUser, pSource, pValue, pAttribute, pOperation, pAccess});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pSource the fixed value of pattern parameter source, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pAccess the fixed value of pattern parameter access, or null if not bound.
   * @return a match represented as a JudgementOnAttribute_at_defaultMatch object, or null if no match is found.
   * 
   */
  public JudgementOnAttribute_at_defaultMatch getOneArbitraryMatch(final String pUser, final EObject pSource, final Object pValue, final EAttribute pAttribute, final OperationType pOperation, final AccessibilityLevel pAccess) {
    return rawGetOneArbitraryMatch(new Object[]{pUser, pSource, pValue, pAttribute, pOperation, pAccess});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pSource the fixed value of pattern parameter source, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pAccess the fixed value of pattern parameter access, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final String pUser, final EObject pSource, final Object pValue, final EAttribute pAttribute, final OperationType pOperation, final AccessibilityLevel pAccess) {
    return rawHasMatch(new Object[]{pUser, pSource, pValue, pAttribute, pOperation, pAccess});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pSource the fixed value of pattern parameter source, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pAccess the fixed value of pattern parameter access, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final String pUser, final EObject pSource, final Object pValue, final EAttribute pAttribute, final OperationType pOperation, final AccessibilityLevel pAccess) {
    return rawCountMatches(new Object[]{pUser, pSource, pValue, pAttribute, pOperation, pAccess});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pSource the fixed value of pattern parameter source, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pAccess the fixed value of pattern parameter access, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final String pUser, final EObject pSource, final Object pValue, final EAttribute pAttribute, final OperationType pOperation, final AccessibilityLevel pAccess, final IMatchProcessor<? super JudgementOnAttribute_at_defaultMatch> processor) {
    rawForEachMatch(new Object[]{pUser, pSource, pValue, pAttribute, pOperation, pAccess}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pSource the fixed value of pattern parameter source, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pAccess the fixed value of pattern parameter access, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final String pUser, final EObject pSource, final Object pValue, final EAttribute pAttribute, final OperationType pOperation, final AccessibilityLevel pAccess, final IMatchProcessor<? super JudgementOnAttribute_at_defaultMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pUser, pSource, pValue, pAttribute, pOperation, pAccess}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pSource the fixed value of pattern parameter source, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pAccess the fixed value of pattern parameter access, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public JudgementOnAttribute_at_defaultMatch newMatch(final String pUser, final EObject pSource, final Object pValue, final EAttribute pAttribute, final OperationType pOperation, final AccessibilityLevel pAccess) {
    return JudgementOnAttribute_at_defaultMatch.newMatch(pUser, pSource, pValue, pAttribute, pOperation, pAccess);
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
  public Set<String> getAllValuesOfuser(final JudgementOnAttribute_at_defaultMatch partialMatch) {
    return rawAccumulateAllValuesOfuser(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for user.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfuser(final EObject pSource, final Object pValue, final EAttribute pAttribute, final OperationType pOperation, final AccessibilityLevel pAccess) {
    return rawAccumulateAllValuesOfuser(new Object[]{
    null, 
    pSource, 
    pValue, 
    pAttribute, 
    pOperation, 
    pAccess
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
  public Set<EObject> getAllValuesOfsource(final JudgementOnAttribute_at_defaultMatch partialMatch) {
    return rawAccumulateAllValuesOfsource(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for source.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<EObject> getAllValuesOfsource(final String pUser, final Object pValue, final EAttribute pAttribute, final OperationType pOperation, final AccessibilityLevel pAccess) {
    return rawAccumulateAllValuesOfsource(new Object[]{
    pUser, 
    null, 
    pValue, 
    pAttribute, 
    pOperation, 
    pAccess
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for value.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<Object> rawAccumulateAllValuesOfvalue(final Object[] parameters) {
    Set<Object> results = new HashSet<Object>();
    rawAccumulateAllValues(POSITION_VALUE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for value.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<Object> getAllValuesOfvalue() {
    return rawAccumulateAllValuesOfvalue(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for value.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<Object> getAllValuesOfvalue(final JudgementOnAttribute_at_defaultMatch partialMatch) {
    return rawAccumulateAllValuesOfvalue(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for value.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<Object> getAllValuesOfvalue(final String pUser, final EObject pSource, final EAttribute pAttribute, final OperationType pOperation, final AccessibilityLevel pAccess) {
    return rawAccumulateAllValuesOfvalue(new Object[]{
    pUser, 
    pSource, 
    null, 
    pAttribute, 
    pOperation, 
    pAccess
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for attribute.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<EAttribute> rawAccumulateAllValuesOfattribute(final Object[] parameters) {
    Set<EAttribute> results = new HashSet<EAttribute>();
    rawAccumulateAllValues(POSITION_ATTRIBUTE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for attribute.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<EAttribute> getAllValuesOfattribute() {
    return rawAccumulateAllValuesOfattribute(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for attribute.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<EAttribute> getAllValuesOfattribute(final JudgementOnAttribute_at_defaultMatch partialMatch) {
    return rawAccumulateAllValuesOfattribute(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for attribute.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<EAttribute> getAllValuesOfattribute(final String pUser, final EObject pSource, final Object pValue, final OperationType pOperation, final AccessibilityLevel pAccess) {
    return rawAccumulateAllValuesOfattribute(new Object[]{
    pUser, 
    pSource, 
    pValue, 
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
  public Set<OperationType> getAllValuesOfoperation(final JudgementOnAttribute_at_defaultMatch partialMatch) {
    return rawAccumulateAllValuesOfoperation(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for operation.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<OperationType> getAllValuesOfoperation(final String pUser, final EObject pSource, final Object pValue, final EAttribute pAttribute, final AccessibilityLevel pAccess) {
    return rawAccumulateAllValuesOfoperation(new Object[]{
    pUser, 
    pSource, 
    pValue, 
    pAttribute, 
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
  public Set<AccessibilityLevel> getAllValuesOfaccess(final JudgementOnAttribute_at_defaultMatch partialMatch) {
    return rawAccumulateAllValuesOfaccess(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for access.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AccessibilityLevel> getAllValuesOfaccess(final String pUser, final EObject pSource, final Object pValue, final EAttribute pAttribute, final OperationType pOperation) {
    return rawAccumulateAllValuesOfaccess(new Object[]{
    pUser, 
    pSource, 
    pValue, 
    pAttribute, 
    pOperation, 
    null
    });
  }
  
  @Override
  protected JudgementOnAttribute_at_defaultMatch tupleToMatch(final Tuple t) {
    try {
        return JudgementOnAttribute_at_defaultMatch.newMatch((String) t.get(POSITION_USER), (EObject) t.get(POSITION_SOURCE), (Object) t.get(POSITION_VALUE), (EAttribute) t.get(POSITION_ATTRIBUTE), (OperationType) t.get(POSITION_OPERATION), (AccessibilityLevel) t.get(POSITION_ACCESS));
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in tuple not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected JudgementOnAttribute_at_defaultMatch arrayToMatch(final Object[] match) {
    try {
        return JudgementOnAttribute_at_defaultMatch.newMatch((String) match[POSITION_USER], (EObject) match[POSITION_SOURCE], (Object) match[POSITION_VALUE], (EAttribute) match[POSITION_ATTRIBUTE], (OperationType) match[POSITION_OPERATION], (AccessibilityLevel) match[POSITION_ACCESS]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected JudgementOnAttribute_at_defaultMatch arrayToMatchMutable(final Object[] match) {
    try {
        return JudgementOnAttribute_at_defaultMatch.newMutableMatch((String) match[POSITION_USER], (EObject) match[POSITION_SOURCE], (Object) match[POSITION_VALUE], (EAttribute) match[POSITION_ATTRIBUTE], (OperationType) match[POSITION_OPERATION], (AccessibilityLevel) match[POSITION_ACCESS]);
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
  public static IQuerySpecification<JudgementOnAttribute_at_defaultMatcher> querySpecification() throws ViatraQueryException {
    return JudgementOnAttribute_at_defaultQuerySpecification.instance();
  }
}
