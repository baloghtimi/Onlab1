/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy_gen.vql
 */
package org.mondo.collaboration.security.increment.policy;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import org.mondo.collaboration.security.increment.policy.EnableRootUserMatch;
import org.mondo.collaboration.security.increment.policy.util.EnableRootUserQuerySpecification;

/**
 * Generated pattern matcher API of the org.mondo.collaboration.security.increment.policy.enableRootUser pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link EnableRootUserMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern enableRootUser(user: java String) {
 * 	user == "PrincipalEngineer";
 * 	} or {
 * 	user == "IOManager";
 * 	} or {
 * 	user == "SubsystemManager";
 * }
 * </pre></code>
 * 
 * @see EnableRootUserMatch
 *  @see EnableRootUserProcessor
 * @see EnableRootUserQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class EnableRootUserMatcher extends BaseMatcher<EnableRootUserMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static EnableRootUserMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    EnableRootUserMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
        matcher = (EnableRootUserMatcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static EnableRootUserMatcher create() throws ViatraQueryException {
    return new EnableRootUserMatcher();
  }
  
  private final static int POSITION_USER = 0;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(EnableRootUserMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private EnableRootUserMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @return matches represented as a EnableRootUserMatch object.
   * 
   */
  public Collection<EnableRootUserMatch> getAllMatches(final String pUser) {
    return rawGetAllMatches(new Object[]{pUser});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @return a match represented as a EnableRootUserMatch object, or null if no match is found.
   * 
   */
  public EnableRootUserMatch getOneArbitraryMatch(final String pUser) {
    return rawGetOneArbitraryMatch(new Object[]{pUser});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final String pUser) {
    return rawHasMatch(new Object[]{pUser});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final String pUser) {
    return rawCountMatches(new Object[]{pUser});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final String pUser, final IMatchProcessor<? super EnableRootUserMatch> processor) {
    rawForEachMatch(new Object[]{pUser}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final String pUser, final IMatchProcessor<? super EnableRootUserMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pUser}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public EnableRootUserMatch newMatch(final String pUser) {
    return EnableRootUserMatch.newMatch(pUser);
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
  
  @Override
  protected EnableRootUserMatch tupleToMatch(final Tuple t) {
    try {
        return EnableRootUserMatch.newMatch((String) t.get(POSITION_USER));
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in tuple not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected EnableRootUserMatch arrayToMatch(final Object[] match) {
    try {
        return EnableRootUserMatch.newMatch((String) match[POSITION_USER]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected EnableRootUserMatch arrayToMatchMutable(final Object[] match) {
    try {
        return EnableRootUserMatch.newMutableMatch((String) match[POSITION_USER]);
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
  public static IQuerySpecification<EnableRootUserMatcher> querySpecification() throws ViatraQueryException {
    return EnableRootUserQuerySpecification.instance();
  }
}
