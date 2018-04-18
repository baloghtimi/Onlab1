package org.mondo.collaboration.security.increment;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.emf.EMFScope;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.mondo.collaboration.security.increment.policy.AttributeAssetMatch;
import org.mondo.collaboration.security.increment.policy.AttributeAssetMatcher;
import org.mondo.collaboration.security.increment.policy.AttributeAssetWTversionMatch;
import org.mondo.collaboration.security.increment.policy.AttributeAssetWTversionMatcher;
import org.mondo.collaboration.security.increment.policy.EffectiveJudgementOnAttributeMatch;
import org.mondo.collaboration.security.increment.policy.EffectiveJudgementOnAttributeMatcher;
import org.mondo.collaboration.security.increment.policy.EffectiveJudgementOnObjectMatch;
import org.mondo.collaboration.security.increment.policy.EffectiveJudgementOnObjectMatcher;
import org.mondo.collaboration.security.increment.policy.EffectiveJudgementOnReferenceMatch;
import org.mondo.collaboration.security.increment.policy.EffectiveJudgementOnReferenceMatcher;
import org.mondo.collaboration.security.increment.policy.ExplicitJudgementOnAttributeMatch;
import org.mondo.collaboration.security.increment.policy.ExplicitJudgementOnAttributeMatcher;
import org.mondo.collaboration.security.increment.policy.util.AttributeAssetQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.AttributeAssetWTversionQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.EffectiveJudgementOnAttributeQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.EffectiveJudgementOnObjectQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.EffectiveJudgementOnReferenceQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.ExplicitJudgementOnAttributeQuerySpecification;

import com.google.common.collect.Lists;

import WTSpec4M.WTSpec4MFactory;
import WTSpec4M.WTSpec4MPackage;

public class Application {
	private final static Logger logger = Logger.getLogger(Application.class);
	

    private static final String MODEL_PATH = 
    "C:\\Bulisuli\\1\\Onlab1\\Onlab1\\org.mondo.collaboration.security.increment\\src\\org\\mondo\\collaboration\\security\\increment\\model\\windturbineM.wtspec4m";
    private static final String METAMODEL_PATH = "C:\\Bulisuli\\1\\Onlab1\\Onlab1\\org.mondo.wt.cstudy.metamodel\\WTSpec4M.ecore";
	
	public static void main(String[] args) throws ViatraQueryException, IOException {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("wtspec4m", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());
		WTSpec4MFactory.eINSTANCE.eClass();
		WTSpec4MPackage.eINSTANCE.eClass();
		
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource model = resourceSet.getResource(URI.createFileURI(MODEL_PATH), true);
		Resource metamodel = resourceSet.getResource(URI.createFileURI(METAMODEL_PATH), true);
		
		countAssets(model);
		
		int numOfEff = 0;
		
		ViatraQueryEngine engine = AdvancedViatraQueryEngine.on(new EMFScope(resourceSet));
		numOfEff += listObjectJudgements(engine);
		numOfEff += listAttributeJudgements(engine);
		numOfEff += listReferenceJudgements(engine);
		
		logger.info("Number of effective judgements: " + numOfEff);
		
//		listExplicitAttributeJudgements(engine, numOfEff);
//		listAttributeAssets(engine, numOfEff);
	}

	private static void listAttributeAssets(ViatraQueryEngine engine, int numOfEff) throws ViatraQueryException {
		AttributeAssetMatcher matcher = AttributeAssetQuerySpecification.instance().getMatcher(engine);
		matcher.forEachMatch(new IMatchProcessor<AttributeAssetMatch>() {

			@Override
			public void process(AttributeAssetMatch match) {
				logger.info(match);
			}
		});
	}

	private static void listExplicitAttributeJudgements(ViatraQueryEngine engine, int numOfEff) throws ViatraQueryException {
		ExplicitJudgementOnAttributeQuerySpecification querySpecification = ExplicitJudgementOnAttributeQuerySpecification.instance();
		ExplicitJudgementOnAttributeMatcher matcher = engine.getMatcher(querySpecification);
		
		ExplicitJudgementOnAttributeMatch filter = matcher.newEmptyMatch();
		filter.setUser("IOManager");
		sortAndPrintMatches(matcher, filter);
	}

	private static void sortAndPrintMatches(ExplicitJudgementOnAttributeMatcher matcher,
			ExplicitJudgementOnAttributeMatch filter) {
		logger.info("Number of explicit judgements: " + matcher.countMatches(filter));
		final List<IPatternMatch> matches = Lists.newArrayList();
		matcher.forEachMatch(filter, new IMatchProcessor<ExplicitJudgementOnAttributeMatch>() {

			@Override
			public void process(ExplicitJudgementOnAttributeMatch match) {
				matches.add(match);
			}
		});
		
		matches.sort(new Comparator<IPatternMatch>() {

			@Override
			public int compare(IPatternMatch o1, IPatternMatch o2) {
				return o1.get(3).toString().compareTo(o2.get(3).toString());
			}
		});
		for (IPatternMatch match : matches) {
			System.out.println(match);
		}
	}

	private static int listReferenceJudgements(ViatraQueryEngine engine) throws ViatraQueryException {
		EffectiveJudgementOnReferenceQuerySpecification querySpecificationOnReference = EffectiveJudgementOnReferenceQuerySpecification.instance();
		EffectiveJudgementOnReferenceMatcher matcherOnReference = engine.getMatcher(querySpecificationOnReference);
		EffectiveJudgementOnReferenceMatch filterOnReference = matcherOnReference.newEmptyMatch();
		filterOnReference.setUser("IOManager");
		int numOfEff = matcherOnReference.countMatches(filterOnReference);
		logger.info("Number of effective references: " + numOfEff);
		matcherOnReference.forEachMatch(filterOnReference, new IMatchProcessor<EffectiveJudgementOnReferenceMatch>() {

			@Override
			public void process(EffectiveJudgementOnReferenceMatch match) {
				logger.info(match);
			}
		});
		
		return numOfEff;
	}

	private static int listAttributeJudgements(ViatraQueryEngine engine) throws ViatraQueryException {
		EffectiveJudgementOnAttributeQuerySpecification querySpecificationOnAttribute = EffectiveJudgementOnAttributeQuerySpecification.instance();
		EffectiveJudgementOnAttributeMatcher matcherOnAttribute = engine.getMatcher(querySpecificationOnAttribute);
		EffectiveJudgementOnAttributeMatch filterOnAttribute = matcherOnAttribute.newEmptyMatch();
		filterOnAttribute.setUser("IOManager");
	    int numOfEff = matcherOnAttribute.countMatches(filterOnAttribute);
		logger.info("Number of effective attributes: " + numOfEff);
		
		final List<IPatternMatch> matches = Lists.newArrayList();
		matcherOnAttribute.forEachMatch(filterOnAttribute, new IMatchProcessor<EffectiveJudgementOnAttributeMatch>() {

			@Override
			public void process(EffectiveJudgementOnAttributeMatch match) {
				matches.add(match);
			}
		});
		matches.sort(new Comparator<IPatternMatch>() {

			@Override
			public int compare(IPatternMatch o1, IPatternMatch o2) {
				return o1.get(1).toString().compareTo(o2.get(1).toString());
			}
		});
		for (IPatternMatch match : matches) {
			logger.info(match);
		}
		
		return numOfEff;
	}

	private static int listObjectJudgements(ViatraQueryEngine engine) throws ViatraQueryException {
		EffectiveJudgementOnObjectQuerySpecification querySpecificationOnObject = EffectiveJudgementOnObjectQuerySpecification.instance();
		EffectiveJudgementOnObjectMatcher matcherOnObject = engine.getMatcher(querySpecificationOnObject);
		EffectiveJudgementOnObjectMatch filterOnObject = matcherOnObject.newEmptyMatch();
		filterOnObject.setUser("IOManager");
		int numOfEff = matcherOnObject.countMatches(filterOnObject);
		logger.info("Number of effective objects: " + numOfEff);
		
		matcherOnObject.forEachMatch(filterOnObject, new IMatchProcessor<EffectiveJudgementOnObjectMatch>() {
			@Override
			public void process(EffectiveJudgementOnObjectMatch match) {
				logger.info(match);
			}
		});
		
		return numOfEff;
	}

	private static void countAssets(Resource model) {
		int numOfAssets = 0, numOfRef = 0, numOfAttr = 0, numOfObj = 0;
		
		TreeIterator<EObject> allContents = model.getAllContents();
		while(allContents.hasNext()){
			EObject object = allContents.next();
			
			// object
			numOfObj++;
			
//			// attributes
			for(EAttribute attribute : object.eClass().getEAllAttributes()) {
//				logger.info(object.eClass().getName() + "." + attribute.getName());
				numOfAttr++;
			}
//			
//			// references
			for(EReference reference : object.eClass().getEAllReferences()) {
				// containment reference
				if(reference.isMany()) {
    				@SuppressWarnings("unchecked")
					EList<EObject> targets = (EList<EObject>) object.eGet(reference);
    				for (EObject target : targets) {
    					numOfRef++;
					}
    			// association
    			} else {
    				EObject target = (EObject) object.eGet(reference);
    				if(target != null){
    				numOfRef++;
    				}
    			}
			}
		}
		logger.info("Number of objects: " + numOfObj);
		logger.info("Number of attributes: " + numOfAttr);
		logger.info("Number of references: " + numOfRef);
		
		logger.info("Number of assets: " + (numOfObj + numOfAttr + numOfRef));
	}
}
