/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy.vql
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
import org.mondo.collaboration.security.increment.policy.ContainsMatch;
import org.mondo.collaboration.security.increment.policy.util.ContainsQuerySpecification;

/**
 * Generated pattern matcher API of the org.mondo.collaboration.security.increment.policy.contains pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link ContainsMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern contains(container: EObject, contained: EObject) = {
 * 	WT.itsSubsystems(container, contained);
 * } or {
 * 	WT.itsInputs(container, contained);
 * } or {
 * 	WT.itsOutputs(container, contained);
 * }
 * </pre></code>
 * 
 * @see ContainsMatch
 *  @see ContainsProcessor
 * @see ContainsQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class ContainsMatcher extends BaseMatcher<ContainsMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static ContainsMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    ContainsMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
        matcher = (ContainsMatcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static ContainsMatcher create() throws ViatraQueryException {
    return new ContainsMatcher();
  }
  
  private final static int POSITION_CONTAINER = 0;
  
  private final static int POSITION_CONTAINED = 1;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ContainsMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private ContainsMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pContainer the fixed value of pattern parameter container, or null if not bound.
   * @param pContained the fixed value of pattern parameter contained, or null if not bound.
   * @return matches represented as a ContainsMatch object.
   * 
   */
  public Collection<ContainsMatch> getAllMatches(final EObject pContainer, final EObject pContained) {
    return rawGetAllMatches(new Object[]{pContainer, pContained});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pContainer the fixed value of pattern parameter container, or null if not bound.
   * @param pContained the fixed value of pattern parameter contained, or null if not bound.
   * @return a match represented as a ContainsMatch object, or null if no match is found.
   * 
   */
  public ContainsMatch getOneArbitraryMatch(final EObject pContainer, final EObject pContained) {
    return rawGetOneArbitraryMatch(new Object[]{pContainer, pContained});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pContainer the fixed value of pattern parameter container, or null if not bound.
   * @param pContained the fixed value of pattern parameter contained, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final EObject pContainer, final EObject pContained) {
    return rawHasMatch(new Object[]{pContainer, pContained});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pContainer the fixed value of pattern parameter container, or null if not bound.
   * @param pContained the fixed value of pattern parameter contained, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final EObject pContainer, final EObject pContained) {
    return rawCountMatches(new Object[]{pContainer, pContained});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pContainer the fixed value of pattern parameter container, or null if not bound.
   * @param pContained the fixed value of pattern parameter contained, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final EObject pContainer, final EObject pContained, final IMatchProcessor<? super ContainsMatch> processor) {
    rawForEachMatch(new Object[]{pContainer, pContained}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pContainer the fixed value of pattern parameter container, or null if not bound.
   * @param pContained the fixed value of pattern parameter contained, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final EObject pContainer, final EObject pContained, final IMatchProcessor<? super ContainsMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pContainer, pContained}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pContainer the fixed value of pattern parameter container, or null if not bound.
   * @param pContained the fixed value of pattern parameter contained, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public ContainsMatch newMatch(final EObject pContainer, final EObject pContained) {
    return ContainsMatch.newMatch(pContainer, pContained);
  }
  
  /**
   * Retrieve the set of values that occur in matches for container.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<EObject> rawAccumulateAllValuesOfcontainer(final Object[] parameters) {
    Set<EObject> results = new HashSet<EObject>();
    rawAccumulateAllValues(POSITION_CONTAINER, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for container.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<EObject> getAllValuesOfcontainer() {
    return rawAccumulateAllValuesOfcontainer(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for container.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<EObject> getAllValuesOfcontainer(final ContainsMatch partialMatch) {
    return rawAccumulateAllValuesOfcontainer(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for container.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<EObject> getAllValuesOfcontainer(final EObject pContained) {
    return rawAccumulateAllValuesOfcontainer(new Object[]{
    null, 
    pContained
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for contained.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<EObject> rawAccumulateAllValuesOfcontained(final Object[] parameters) {
    Set<EObject> results = new HashSet<EObject>();
    rawAccumulateAllValues(POSITION_CONTAINED, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for contained.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<EObject> getAllValuesOfcontained() {
    return rawAccumulateAllValuesOfcontained(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for contained.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<EObject> getAllValuesOfcontained(final ContainsMatch partialMatch) {
    return rawAccumulateAllValuesOfcontained(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for contained.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<EObject> getAllValuesOfcontained(final EObject pContainer) {
    return rawAccumulateAllValuesOfcontained(new Object[]{
    pContainer, 
    null
    });
  }
  
  @Override
  protected ContainsMatch tupleToMatch(final Tuple t) {
    try {
        return ContainsMatch.newMatch((EObject) t.get(POSITION_CONTAINER), (EObject) t.get(POSITION_CONTAINED));
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in tuple not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected ContainsMatch arrayToMatch(final Object[] match) {
    try {
        return ContainsMatch.newMatch((EObject) match[POSITION_CONTAINER], (EObject) match[POSITION_CONTAINED]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected ContainsMatch arrayToMatchMutable(final Object[] match) {
    try {
        return ContainsMatch.newMutableMatch((EObject) match[POSITION_CONTAINER], (EObject) match[POSITION_CONTAINED]);
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
  public static IQuerySpecification<ContainsMatcher> querySpecification() throws ViatraQueryException {
    return ContainsQuerySpecification.instance();
  }
}
