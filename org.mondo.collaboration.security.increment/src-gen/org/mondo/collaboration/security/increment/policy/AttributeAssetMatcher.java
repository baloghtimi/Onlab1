/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/windturbineS_gen.vql
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
import org.mondo.collaboration.security.increment.policy.AttributeAssetMatch;
import org.mondo.collaboration.security.increment.policy.util.AttributeAssetQuerySpecification;

/**
 * Generated pattern matcher API of the org.mondo.collaboration.security.increment.policy.attributeAsset pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link AttributeAssetMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern attributeAsset(source : EObject, value: java Object, attribute : EAttribute) {
 * 	WT.sysId(source, value);
 * 	EClass.name(class, "WT");
 * 	EClass.eStructuralFeatures(class, attribute);
 * 	EAttribute.name(attribute, "sysId");
 * 	} or {
 * 	WT.model(source, value);
 * 	EClass.name(class, "WT");
 * 	EClass.eStructuralFeatures(class, attribute);
 * 	EAttribute.name(attribute, "model");
 * 	} or {
 * 	WT.version(source, value);
 * 	EClass.name(class, "WT");
 * 	EClass.eStructuralFeatures(class, attribute);
 * 	EAttribute.name(attribute, "version");
 * 	} or {
 * 	Subsystem.sysId(source, value);
 * 	EClass.name(class, "Subsystem");
 * 	EClass.eStructuralFeatures(class, attribute);
 * 	EAttribute.name(attribute, "sysId");
 * 	} or {
 * 	Subsystem.description(source, value);
 * 	EClass.name(class, "Subsystem");
 * 	EClass.eStructuralFeatures(class, attribute);
 * 	EAttribute.name(attribute, "description");
 * 	} or {
 * 	Subsystem.sysId(source, value);
 * 	EClass.name(class, "Subsystem");
 * 	EClass.eStructuralFeatures(class, attribute);
 * 	EAttribute.name(attribute, "sysId");
 * 	} or {
 * 	Subsystem.description(source, value);
 * 	EClass.name(class, "Subsystem");
 * 	EClass.eStructuralFeatures(class, attribute);
 * 	EAttribute.name(attribute, "description");
 * 	} or {
 * 	SystemInput.sysId(source, value);
 * 	EClass.name(class, "SystemInput");
 * 	EClass.eStructuralFeatures(class, attribute);
 * 	EAttribute.name(attribute, "sysId");
 * 	} or {
 * 	SystemInput.description(source, value);
 * 	EClass.name(class, "SystemInput");
 * 	EClass.eStructuralFeatures(class, attribute);
 * 	EAttribute.name(attribute, "description");
 * 	} or {
 * 	SystemInput.sysId(source, value);
 * 	EClass.name(class, "SystemInput");
 * 	EClass.eStructuralFeatures(class, attribute);
 * 	EAttribute.name(attribute, "sysId");
 * 	} or {
 * 	SystemInput.description(source, value);
 * 	EClass.name(class, "SystemInput");
 * 	EClass.eStructuralFeatures(class, attribute);
 * 	EAttribute.name(attribute, "description");
 * 	} or {
 * 	SystemInput.sysId(source, value);
 * 	EClass.name(class, "SystemInput");
 * 	EClass.eStructuralFeatures(class, attribute);
 * 	EAttribute.name(attribute, "sysId");
 * 	} or {
 * 	SystemInput.description(source, value);
 * 	EClass.name(class, "SystemInput");
 * 	EClass.eStructuralFeatures(class, attribute);
 * 	EAttribute.name(attribute, "description");
 * 	} or {
 * 	SystemInput.sysId(source, value);
 * 	EClass.name(class, "SystemInput");
 * 	EClass.eStructuralFeatures(class, attribute);
 * 	EAttribute.name(attribute, "sysId");
 * 	} or {
 * 	SystemInput.description(source, value);
 * 	EClass.name(class, "SystemInput");
 * 	EClass.eStructuralFeatures(class, attribute);
 * 	EAttribute.name(attribute, "description");
 * 	} or {
 * 	SystemInput.sysId(source, value);
 * 	EClass.name(class, "SystemInput");
 * 	EClass.eStructuralFeatures(class, attribute);
 * 	EAttribute.name(attribute, "sysId");
 * 	} or {
 * 	SystemInput.description(source, value);
 * 	EClass.name(class, "SystemInput");
 * 	EClass.eStructuralFeatures(class, attribute);
 * 	EAttribute.name(attribute, "description");
 * 	} or {
 * 	SystemOutput.sysId(source, value);
 * 	EClass.name(class, "SystemOutput");
 * 	EClass.eStructuralFeatures(class, attribute);
 * 	EAttribute.name(attribute, "sysId");
 * 	} or {
 * 	SystemOutput.description(source, value);
 * 	EClass.name(class, "SystemOutput");
 * 	EClass.eStructuralFeatures(class, attribute);
 * 	EAttribute.name(attribute, "description");
 * 	} or {
 * 	SystemOutput.sysId(source, value);
 * 	EClass.name(class, "SystemOutput");
 * 	EClass.eStructuralFeatures(class, attribute);
 * 	EAttribute.name(attribute, "sysId");
 * 	} or {
 * 	SystemOutput.description(source, value);
 * 	EClass.name(class, "SystemOutput");
 * 	EClass.eStructuralFeatures(class, attribute);
 * 	EAttribute.name(attribute, "description");
 * 	} or {
 * 	SystemOutput.sysId(source, value);
 * 	EClass.name(class, "SystemOutput");
 * 	EClass.eStructuralFeatures(class, attribute);
 * 	EAttribute.name(attribute, "sysId");
 * 	} or {
 * 	SystemOutput.description(source, value);
 * 	EClass.name(class, "SystemOutput");
 * 	EClass.eStructuralFeatures(class, attribute);
 * 	EAttribute.name(attribute, "description");
 * 	} or {
 * 	SystemOutput.sysId(source, value);
 * 	EClass.name(class, "SystemOutput");
 * 	EClass.eStructuralFeatures(class, attribute);
 * 	EAttribute.name(attribute, "sysId");
 * 	} or {
 * 	SystemOutput.description(source, value);
 * 	EClass.name(class, "SystemOutput");
 * 	EClass.eStructuralFeatures(class, attribute);
 * 	EAttribute.name(attribute, "description");
 * 	} or {
 * 	SystemOutput.sysId(source, value);
 * 	EClass.name(class, "SystemOutput");
 * 	EClass.eStructuralFeatures(class, attribute);
 * 	EAttribute.name(attribute, "sysId");
 * 	} or {
 * 	SystemOutput.description(source, value);
 * 	EClass.name(class, "SystemOutput");
 * 	EClass.eStructuralFeatures(class, attribute);
 * 	EAttribute.name(attribute, "description");
 * 	} or {
 * 	SystemParam.sysId(source, value);
 * 	EClass.name(class, "SystemParam");
 * 	EClass.eStructuralFeatures(class, attribute);
 * 	EAttribute.name(attribute, "sysId");
 * 	} or {
 * 	SystemParam.description(source, value);
 * 	EClass.name(class, "SystemParam");
 * 	EClass.eStructuralFeatures(class, attribute);
 * 	EAttribute.name(attribute, "description");
 * 	} or {
 * 	SystemParam.value(source, value);
 * 	EClass.name(class, "SystemParam");
 * 	EClass.eStructuralFeatures(class, attribute);
 * 	EAttribute.name(attribute, "value");
 * 	} or {
 * 	SystemParam.settable(source, value);
 * 	EClass.name(class, "SystemParam");
 * 	EClass.eStructuralFeatures(class, attribute);
 * 	EAttribute.name(attribute, "settable");
 * 	} or {
 * 	SystemParam.sysId(source, value);
 * 	EClass.name(class, "SystemParam");
 * 	EClass.eStructuralFeatures(class, attribute);
 * 	EAttribute.name(attribute, "sysId");
 * 	} or {
 * 	SystemParam.description(source, value);
 * 	EClass.name(class, "SystemParam");
 * 	EClass.eStructuralFeatures(class, attribute);
 * 	EAttribute.name(attribute, "description");
 * 	} or {
 * 	SystemParam.value(source, value);
 * 	EClass.name(class, "SystemParam");
 * 	EClass.eStructuralFeatures(class, attribute);
 * 	EAttribute.name(attribute, "value");
 * 	} or {
 * 	SystemParam.settable(source, value);
 * 	EClass.name(class, "SystemParam");
 * 	EClass.eStructuralFeatures(class, attribute);
 * 	EAttribute.name(attribute, "settable");
 * 	} or {
 * 	SystemTimer.sysId(source, value);
 * 	EClass.name(class, "SystemTimer");
 * 	EClass.eStructuralFeatures(class, attribute);
 * 	EAttribute.name(attribute, "sysId");
 * 	} or {
 * 	SystemTimer.description(source, value);
 * 	EClass.name(class, "SystemTimer");
 * 	EClass.eStructuralFeatures(class, attribute);
 * 	EAttribute.name(attribute, "description");
 * 	} or {
 * 	SystemTimer.value(source, value);
 * 	EClass.name(class, "SystemTimer");
 * 	EClass.eStructuralFeatures(class, attribute);
 * 	EAttribute.name(attribute, "value");
 * 	} or {
 * 	SystemTimer.sysId(source, value);
 * 	EClass.name(class, "SystemTimer");
 * 	EClass.eStructuralFeatures(class, attribute);
 * 	EAttribute.name(attribute, "sysId");
 * 	} or {
 * 	SystemTimer.description(source, value);
 * 	EClass.name(class, "SystemTimer");
 * 	EClass.eStructuralFeatures(class, attribute);
 * 	EAttribute.name(attribute, "description");
 * 	} or {
 * 	SystemTimer.value(source, value);
 * 	EClass.name(class, "SystemTimer");
 * 	EClass.eStructuralFeatures(class, attribute);
 * 	EAttribute.name(attribute, "value");
 * 	} or {
 * 	SystemFault.sysId(source, value);
 * 	EClass.name(class, "SystemFault");
 * 	EClass.eStructuralFeatures(class, attribute);
 * 	EAttribute.name(attribute, "sysId");
 * 	} or {
 * 	SystemFault.description(source, value);
 * 	EClass.name(class, "SystemFault");
 * 	EClass.eStructuralFeatures(class, attribute);
 * 	EAttribute.name(attribute, "description");
 * 	} or {
 * 	SystemFault.value(source, value);
 * 	EClass.name(class, "SystemFault");
 * 	EClass.eStructuralFeatures(class, attribute);
 * 	EAttribute.name(attribute, "value");
 * 	} or {
 * 	SystemFault.sysId(source, value);
 * 	EClass.name(class, "SystemFault");
 * 	EClass.eStructuralFeatures(class, attribute);
 * 	EAttribute.name(attribute, "sysId");
 * 	} or {
 * 	SystemFault.description(source, value);
 * 	EClass.name(class, "SystemFault");
 * 	EClass.eStructuralFeatures(class, attribute);
 * 	EAttribute.name(attribute, "description");
 * 	} or {
 * 	SystemFault.value(source, value);
 * 	EClass.name(class, "SystemFault");
 * 	EClass.eStructuralFeatures(class, attribute);
 * 	EAttribute.name(attribute, "value");
 * 	} or {
 * 	SystemFault.sysId(source, value);
 * 	EClass.name(class, "SystemFault");
 * 	EClass.eStructuralFeatures(class, attribute);
 * 	EAttribute.name(attribute, "sysId");
 * 	} or {
 * 	SystemFault.description(source, value);
 * 	EClass.name(class, "SystemFault");
 * 	EClass.eStructuralFeatures(class, attribute);
 * 	EAttribute.name(attribute, "description");
 * 	} or {
 * 	SystemFault.value(source, value);
 * 	EClass.name(class, "SystemFault");
 * 	EClass.eStructuralFeatures(class, attribute);
 * 	EAttribute.name(attribute, "value");
 * }
 * </pre></code>
 * 
 * @see AttributeAssetMatch
 *  @see AttributeAssetProcessor
 * @see AttributeAssetQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class AttributeAssetMatcher extends BaseMatcher<AttributeAssetMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static AttributeAssetMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    AttributeAssetMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
        matcher = (AttributeAssetMatcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static AttributeAssetMatcher create() throws ViatraQueryException {
    return new AttributeAssetMatcher();
  }
  
  private final static int POSITION_SOURCE = 0;
  
  private final static int POSITION_VALUE = 1;
  
  private final static int POSITION_ATTRIBUTE = 2;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(AttributeAssetMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private AttributeAssetMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSource the fixed value of pattern parameter source, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
   * @return matches represented as a AttributeAssetMatch object.
   * 
   */
  public Collection<AttributeAssetMatch> getAllMatches(final EObject pSource, final Object pValue, final EAttribute pAttribute) {
    return rawGetAllMatches(new Object[]{pSource, pValue, pAttribute});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSource the fixed value of pattern parameter source, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
   * @return a match represented as a AttributeAssetMatch object, or null if no match is found.
   * 
   */
  public AttributeAssetMatch getOneArbitraryMatch(final EObject pSource, final Object pValue, final EAttribute pAttribute) {
    return rawGetOneArbitraryMatch(new Object[]{pSource, pValue, pAttribute});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pSource the fixed value of pattern parameter source, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final EObject pSource, final Object pValue, final EAttribute pAttribute) {
    return rawHasMatch(new Object[]{pSource, pValue, pAttribute});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSource the fixed value of pattern parameter source, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final EObject pSource, final Object pValue, final EAttribute pAttribute) {
    return rawCountMatches(new Object[]{pSource, pValue, pAttribute});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pSource the fixed value of pattern parameter source, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final EObject pSource, final Object pValue, final EAttribute pAttribute, final IMatchProcessor<? super AttributeAssetMatch> processor) {
    rawForEachMatch(new Object[]{pSource, pValue, pAttribute}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSource the fixed value of pattern parameter source, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final EObject pSource, final Object pValue, final EAttribute pAttribute, final IMatchProcessor<? super AttributeAssetMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pSource, pValue, pAttribute}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pSource the fixed value of pattern parameter source, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public AttributeAssetMatch newMatch(final EObject pSource, final Object pValue, final EAttribute pAttribute) {
    return AttributeAssetMatch.newMatch(pSource, pValue, pAttribute);
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
  public Set<EObject> getAllValuesOfsource(final AttributeAssetMatch partialMatch) {
    return rawAccumulateAllValuesOfsource(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for source.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<EObject> getAllValuesOfsource(final Object pValue, final EAttribute pAttribute) {
    return rawAccumulateAllValuesOfsource(new Object[]{
    null, 
    pValue, 
    pAttribute
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
  public Set<Object> getAllValuesOfvalue(final AttributeAssetMatch partialMatch) {
    return rawAccumulateAllValuesOfvalue(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for value.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<Object> getAllValuesOfvalue(final EObject pSource, final EAttribute pAttribute) {
    return rawAccumulateAllValuesOfvalue(new Object[]{
    pSource, 
    null, 
    pAttribute
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
  public Set<EAttribute> getAllValuesOfattribute(final AttributeAssetMatch partialMatch) {
    return rawAccumulateAllValuesOfattribute(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for attribute.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<EAttribute> getAllValuesOfattribute(final EObject pSource, final Object pValue) {
    return rawAccumulateAllValuesOfattribute(new Object[]{
    pSource, 
    pValue, 
    null
    });
  }
  
  @Override
  protected AttributeAssetMatch tupleToMatch(final Tuple t) {
    try {
        return AttributeAssetMatch.newMatch((EObject) t.get(POSITION_SOURCE), (Object) t.get(POSITION_VALUE), (EAttribute) t.get(POSITION_ATTRIBUTE));
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in tuple not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected AttributeAssetMatch arrayToMatch(final Object[] match) {
    try {
        return AttributeAssetMatch.newMatch((EObject) match[POSITION_SOURCE], (Object) match[POSITION_VALUE], (EAttribute) match[POSITION_ATTRIBUTE]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected AttributeAssetMatch arrayToMatchMutable(final Object[] match) {
    try {
        return AttributeAssetMatch.newMutableMatch((EObject) match[POSITION_SOURCE], (Object) match[POSITION_VALUE], (EAttribute) match[POSITION_ATTRIBUTE]);
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
  public static IQuerySpecification<AttributeAssetMatcher> querySpecification() throws ViatraQueryException {
    return AttributeAssetQuerySpecification.instance();
  }
}
