/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy_helper_pattern.vql
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
import org.mondo.collaboration.security.increment.policy.RestrictRootAssetMatch;
import org.mondo.collaboration.security.increment.policy.util.RestrictRootAssetQuerySpecification;

/**
 * Generated pattern matcher API of the org.mondo.collaboration.security.increment.policy.restrictRootAsset pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link RestrictRootAssetMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern restrictRootAsset(root : EObject) {
 *     	    find objectRoot(root);
 * }
 * </pre></code>
 * 
 * @see RestrictRootAssetMatch
 *  @see RestrictRootAssetProcessor
 * @see RestrictRootAssetQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class RestrictRootAssetMatcher extends BaseMatcher<RestrictRootAssetMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static RestrictRootAssetMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    RestrictRootAssetMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
        matcher = (RestrictRootAssetMatcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static RestrictRootAssetMatcher create() throws ViatraQueryException {
    return new RestrictRootAssetMatcher();
  }
  
  private final static int POSITION_ROOT = 0;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(RestrictRootAssetMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private RestrictRootAssetMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pRoot the fixed value of pattern parameter root, or null if not bound.
   * @return matches represented as a RestrictRootAssetMatch object.
   * 
   */
  public Collection<RestrictRootAssetMatch> getAllMatches(final EObject pRoot) {
    return rawGetAllMatches(new Object[]{pRoot});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pRoot the fixed value of pattern parameter root, or null if not bound.
   * @return a match represented as a RestrictRootAssetMatch object, or null if no match is found.
   * 
   */
  public RestrictRootAssetMatch getOneArbitraryMatch(final EObject pRoot) {
    return rawGetOneArbitraryMatch(new Object[]{pRoot});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pRoot the fixed value of pattern parameter root, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final EObject pRoot) {
    return rawHasMatch(new Object[]{pRoot});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pRoot the fixed value of pattern parameter root, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final EObject pRoot) {
    return rawCountMatches(new Object[]{pRoot});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pRoot the fixed value of pattern parameter root, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final EObject pRoot, final IMatchProcessor<? super RestrictRootAssetMatch> processor) {
    rawForEachMatch(new Object[]{pRoot}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pRoot the fixed value of pattern parameter root, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final EObject pRoot, final IMatchProcessor<? super RestrictRootAssetMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pRoot}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pRoot the fixed value of pattern parameter root, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public RestrictRootAssetMatch newMatch(final EObject pRoot) {
    return RestrictRootAssetMatch.newMatch(pRoot);
  }
  
  /**
   * Retrieve the set of values that occur in matches for root.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<EObject> rawAccumulateAllValuesOfroot(final Object[] parameters) {
    Set<EObject> results = new HashSet<EObject>();
    rawAccumulateAllValues(POSITION_ROOT, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for root.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<EObject> getAllValuesOfroot() {
    return rawAccumulateAllValuesOfroot(emptyArray());
  }
  
  @Override
  protected RestrictRootAssetMatch tupleToMatch(final Tuple t) {
    try {
        return RestrictRootAssetMatch.newMatch((EObject) t.get(POSITION_ROOT));
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in tuple not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected RestrictRootAssetMatch arrayToMatch(final Object[] match) {
    try {
        return RestrictRootAssetMatch.newMatch((EObject) match[POSITION_ROOT]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected RestrictRootAssetMatch arrayToMatchMutable(final Object[] match) {
    try {
        return RestrictRootAssetMatch.newMutableMatch((EObject) match[POSITION_ROOT]);
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
  public static IQuerySpecification<RestrictRootAssetMatcher> querySpecification() throws ViatraQueryException {
    return RestrictRootAssetQuerySpecification.instance();
  }
}
