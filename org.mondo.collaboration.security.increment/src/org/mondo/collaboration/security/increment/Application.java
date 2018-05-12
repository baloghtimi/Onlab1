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
import org.mondo.collaboration.security.increment.policy.EffectiveJudgementOnAttributeMatch;
import org.mondo.collaboration.security.increment.policy.EffectiveJudgementOnAttributeMatcher;
import org.mondo.collaboration.security.increment.policy.EffectiveJudgementOnObjectMatch;
import org.mondo.collaboration.security.increment.policy.EffectiveJudgementOnObjectMatcher;
import org.mondo.collaboration.security.increment.policy.EffectiveJudgementOnReferenceMatch;
import org.mondo.collaboration.security.increment.policy.EffectiveJudgementOnReferenceMatcher;
import org.mondo.collaboration.security.increment.policy.JudgementOnAttribute_at_1Match;
import org.mondo.collaboration.security.increment.policy.JudgementOnAttribute_at_1Matcher;
import org.mondo.collaboration.security.increment.policy.StrongConsequenceJudgementOnAttribute_at_1Match;
import org.mondo.collaboration.security.increment.policy.StrongConsequenceJudgementOnAttribute_at_1Matcher;
import org.mondo.collaboration.security.increment.policy.StrongConsequenceJudgementOnAttribute_at_weakMatch;
import org.mondo.collaboration.security.increment.policy.StrongConsequenceJudgementOnAttribute_at_weakMatcher;
import org.mondo.collaboration.security.increment.policy.StrongConsequenceJudgementOnObject_at_weakMatch;
import org.mondo.collaboration.security.increment.policy.StrongConsequenceJudgementOnObject_at_weakMatcher;
import org.mondo.collaboration.security.increment.policy.StrongConsequenceJudgementOnReference_at_weakMatch;
import org.mondo.collaboration.security.increment.policy.StrongConsequenceJudgementOnReference_at_weakMatcher;
import org.mondo.collaboration.security.increment.policy.WeakConsequenceJudgementOnAttributeMatch;
import org.mondo.collaboration.security.increment.policy.WeakConsequenceJudgementOnAttributeMatcher;
import org.mondo.collaboration.security.increment.policy.WeakConsequenceJudgementOnReferenceMatch;
import org.mondo.collaboration.security.increment.policy.WeakConsequenceJudgementOnReferenceMatcher;
import org.mondo.collaboration.security.increment.policy.util.EffectiveJudgementOnAttributeQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.EffectiveJudgementOnObjectQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.EffectiveJudgementOnReferenceQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.JudgementOnAttribute_at_1QuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.StrongConsequenceJudgementOnAttribute_at_1QuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.StrongConsequenceJudgementOnAttribute_at_weakQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.StrongConsequenceJudgementOnObject_at_weakQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.StrongConsequenceJudgementOnReference_at_weakQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.WeakConsequenceJudgementOnAttributeQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.WeakConsequenceJudgementOnReferenceQuerySpecification;

import com.google.common.collect.Lists;

import WTSpec4M.WTSpec4MFactory;
import WTSpec4M.WTSpec4MPackage;

public class Application {
	private final static Logger logger = Logger.getLogger(Application.class);

    private static final String MODEL_PATH = 
    "C:\\Bulisuli\\1\\Onlab1\\Onlab1\\org.mondo.collaboration.security.increment\\src\\org\\mondo\\collaboration\\security\\increment\\model\\windturbineXS.wtspec4m";
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
		
		ViatraQueryEngine engine = AdvancedViatraQueryEngine.on(new EMFScope(resourceSet));
		
//		String user = "PrincipalEngineer";
//		String user = "SubsystemManager";
		String user = "IOManager";
		
		int numOfEff = 0;
//		listWeakConsequenceJudgementOnAttribute(engine, user);
//		listWeakConsequenceJudgementOnReference(engine, user);
//		listStrongConsequenceJudgementOnObjectAtWeak(engine, user);
//		listStrongConsequenceJudgementOnAttributeAtWeak(engine, user);
//		listStrongConsequenceJudgementOnReferenceAtWeak(engine, user);
		
//		listStrongConsequenceJudgementOnAttributeAtOne(engine, user);
//		listJudgementOnAttributeAtOne(engine, user);
		
		numOfEff += listEffectiveJudgementsOnObjects(engine, user);
		numOfEff += listEffectiveJudgementsOnAttributes(engine, user);
		numOfEff += listEffectiveJudgementsOnReferences(engine, user);
		logger.info("All judgements: " + numOfEff);
	}
	
	private static void listStrongConsequenceJudgementOnObjectAtWeak(ViatraQueryEngine engine, String user) throws ViatraQueryException {
		StrongConsequenceJudgementOnObject_at_weakQuerySpecification querySpecification = StrongConsequenceJudgementOnObject_at_weakQuerySpecification.instance();
		StrongConsequenceJudgementOnObject_at_weakMatcher matcher = engine.getMatcher(querySpecification);
		StrongConsequenceJudgementOnObject_at_weakMatch filter = matcher.newEmptyMatch();
		filter.setUser(user);
		int numOfEff = matcher.countMatches(filter);
		logger.info("strong consequences on objects at weak: " + numOfEff);
		
		final List<IPatternMatch> matches = Lists.newArrayList();
		matcher.forEachMatch(filter, new IMatchProcessor<StrongConsequenceJudgementOnObject_at_weakMatch>() {
			@Override
			public void process(StrongConsequenceJudgementOnObject_at_weakMatch match) {
				matches.add(match);
			}
		});
		sortAndPrintMatches(matches);
	}
	
	private static void listStrongConsequenceJudgementOnReferenceAtWeak(ViatraQueryEngine engine, String user) throws ViatraQueryException {
		StrongConsequenceJudgementOnReference_at_weakQuerySpecification querySpecification = StrongConsequenceJudgementOnReference_at_weakQuerySpecification.instance();
		StrongConsequenceJudgementOnReference_at_weakMatcher matcher = engine.getMatcher(querySpecification);
		StrongConsequenceJudgementOnReference_at_weakMatch filter = matcher.newEmptyMatch();
		filter.setUser(user);
		int numOfEff = matcher.countMatches(filter);
		logger.info("strong consequences on references at weak: " + numOfEff);
		
		final List<IPatternMatch> matches = Lists.newArrayList();
		matcher.forEachMatch(filter, new IMatchProcessor<StrongConsequenceJudgementOnReference_at_weakMatch>() {
			@Override
			public void process(StrongConsequenceJudgementOnReference_at_weakMatch match) {
				matches.add(match);
			}
		});
		sortAndPrintMatches(matches);
	}
	
	private static void listWeakConsequenceJudgementOnAttribute(ViatraQueryEngine engine, String user) throws ViatraQueryException {
		WeakConsequenceJudgementOnAttributeQuerySpecification querySpecification = WeakConsequenceJudgementOnAttributeQuerySpecification.instance();
		WeakConsequenceJudgementOnAttributeMatcher matcher = engine.getMatcher(querySpecification);
		WeakConsequenceJudgementOnAttributeMatch filter = matcher.newEmptyMatch();
		filter.setUser(user);
		int numOfEff = matcher.countMatches(filter);
		logger.info("weak consequences on attributes: " + numOfEff);
		
		final List<IPatternMatch> matches = Lists.newArrayList();
		matcher.forEachMatch(filter, new IMatchProcessor<WeakConsequenceJudgementOnAttributeMatch>() {
			@Override
			public void process(WeakConsequenceJudgementOnAttributeMatch match) {
				matches.add(match);
			}
		});
		sortAndPrintMatches(matches);
	}
	
	private static void listWeakConsequenceJudgementOnReference(ViatraQueryEngine engine, String user) throws ViatraQueryException {
		WeakConsequenceJudgementOnReferenceQuerySpecification querySpecification = WeakConsequenceJudgementOnReferenceQuerySpecification.instance();
		WeakConsequenceJudgementOnReferenceMatcher matcher = engine.getMatcher(querySpecification);
		WeakConsequenceJudgementOnReferenceMatch filter = matcher.newEmptyMatch();
		filter.setUser(user);
		int numOfEff = matcher.countMatches(filter);
		logger.info("weak consequences on references: " + numOfEff);
		
		final List<IPatternMatch> matches = Lists.newArrayList();
		matcher.forEachMatch(filter, new IMatchProcessor<WeakConsequenceJudgementOnReferenceMatch>() {
			@Override
			public void process(WeakConsequenceJudgementOnReferenceMatch match) {
				matches.add(match);
			}
		});
		sortAndPrintMatches(matches);
	}
	
	private static void listStrongConsequenceJudgementOnAttributeAtWeak(ViatraQueryEngine engine, String user) throws ViatraQueryException {
		StrongConsequenceJudgementOnAttribute_at_weakQuerySpecification querySpecification = StrongConsequenceJudgementOnAttribute_at_weakQuerySpecification.instance();
		StrongConsequenceJudgementOnAttribute_at_weakMatcher matcher = engine.getMatcher(querySpecification);
		StrongConsequenceJudgementOnAttribute_at_weakMatch filter = matcher.newEmptyMatch();
		filter.setUser(user);
		int numOfEff = matcher.countMatches(filter);
		logger.info("strong consequences on attributes at weak: " + numOfEff);
		
		final List<IPatternMatch> matches = Lists.newArrayList();
		matcher.forEachMatch(filter, new IMatchProcessor<StrongConsequenceJudgementOnAttribute_at_weakMatch>() {
			@Override
			public void process(StrongConsequenceJudgementOnAttribute_at_weakMatch match) {
				matches.add(match);
			}
		});
		sortAndPrintMatches(matches);
	}
	
	private static void listStrongConsequenceJudgementOnAttributeAtOne(ViatraQueryEngine engine, String user) throws ViatraQueryException {
		StrongConsequenceJudgementOnAttribute_at_1QuerySpecification querySpecification = StrongConsequenceJudgementOnAttribute_at_1QuerySpecification.instance();
		StrongConsequenceJudgementOnAttribute_at_1Matcher matcher = engine.getMatcher(querySpecification);
		StrongConsequenceJudgementOnAttribute_at_1Match filter = matcher.newEmptyMatch();
		filter.setUser(user);
		int numOfEff = matcher.countMatches(filter);
		logger.info("strong consequences on attributes at 1: " + numOfEff);
		
		final List<IPatternMatch> matches = Lists.newArrayList();
		matcher.forEachMatch(filter, new IMatchProcessor<StrongConsequenceJudgementOnAttribute_at_1Match>() {
			@Override
			public void process(StrongConsequenceJudgementOnAttribute_at_1Match match) {
				matches.add(match);
			}
		});
		sortAndPrintMatches(matches);
	}
	
	private static void listJudgementOnAttributeAtOne(ViatraQueryEngine engine, String user) throws ViatraQueryException {
		JudgementOnAttribute_at_1QuerySpecification querySpecification = JudgementOnAttribute_at_1QuerySpecification.instance();
		JudgementOnAttribute_at_1Matcher matcher = engine.getMatcher(querySpecification);
		JudgementOnAttribute_at_1Match filter = matcher.newEmptyMatch();
		filter.setUser(user);
		int numOfEff = matcher.countMatches(filter);
		logger.info("judgements on attributes at 1: " + numOfEff);
		
		final List<IPatternMatch> matches = Lists.newArrayList();
		matcher.forEachMatch(filter, new IMatchProcessor<JudgementOnAttribute_at_1Match>() {
			@Override
			public void process(JudgementOnAttribute_at_1Match match) {
				matches.add(match);
			}
		});
		sortAndPrintMatches(matches);
	}
	
	private static int listEffectiveJudgementsOnObjects(ViatraQueryEngine engine, String user) throws ViatraQueryException {
		EffectiveJudgementOnObjectQuerySpecification querySpecification = EffectiveJudgementOnObjectQuerySpecification.instance();
		EffectiveJudgementOnObjectMatcher matcher = engine.getMatcher(querySpecification);
		EffectiveJudgementOnObjectMatch filter = matcher.newEmptyMatch();
		filter.setUser(user);
		int numOfEff = matcher.countMatches(filter);
		logger.info("Object judgements: " + numOfEff);
		
		final List<IPatternMatch> matches = Lists.newArrayList();
		matcher.forEachMatch(filter, new IMatchProcessor<EffectiveJudgementOnObjectMatch>() {
			@Override
			public void process(EffectiveJudgementOnObjectMatch match) {
				matches.add(match);
			}
		});
		sortAndPrintMatches(matches);
		return numOfEff;
	}
	
	private static int listEffectiveJudgementsOnAttributes(ViatraQueryEngine engine, String user) throws ViatraQueryException {
		EffectiveJudgementOnAttributeQuerySpecification querySpecification = EffectiveJudgementOnAttributeQuerySpecification.instance();
		EffectiveJudgementOnAttributeMatcher matcher = engine.getMatcher(querySpecification);
		EffectiveJudgementOnAttributeMatch filter = matcher.newEmptyMatch();
		filter.setUser(user);
	    int numOfEff = matcher.countMatches(filter);
		logger.info("Attribute judgements: " + numOfEff);
		
		final List<IPatternMatch> matches = Lists.newArrayList();
		matcher.forEachMatch(filter, new IMatchProcessor<EffectiveJudgementOnAttributeMatch>() {
			@Override
			public void process(EffectiveJudgementOnAttributeMatch match) {
				matches.add(match);
			}
		});
		sortAndPrintMatches(matches);
		return numOfEff;
	}
	
	private static int listEffectiveJudgementsOnReferences(ViatraQueryEngine engine, String user) throws ViatraQueryException {
		EffectiveJudgementOnReferenceQuerySpecification querySpecification = EffectiveJudgementOnReferenceQuerySpecification.instance();
		EffectiveJudgementOnReferenceMatcher matcher = engine.getMatcher(querySpecification);
		EffectiveJudgementOnReferenceMatch filter = matcher.newEmptyMatch();
		filter.setUser(user);
		int numOfEff = matcher.countMatches(filter);
		logger.info("Reference judgements: " + numOfEff);
		
		final List<IPatternMatch> matches = Lists.newArrayList();
		matcher.forEachMatch(filter, new IMatchProcessor<EffectiveJudgementOnReferenceMatch>() {
			@Override
			public void process(EffectiveJudgementOnReferenceMatch match) {
				matches.add(match);
			}
		});
		sortAndPrintMatches(matches);
		return numOfEff;
	}

	private static void sortAndPrintMatches(List<IPatternMatch> matches) {
		matches.sort(new Comparator<IPatternMatch>() {

			@Override
			public int compare(IPatternMatch o1, IPatternMatch o2) {
				return o1.get(1).toString().compareTo(o2.get(1).toString());
			}
		});
		
		for (IPatternMatch match : matches) {
			logger.info(match);
		}
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
		logger.info("Objects: " + numOfObj);
		logger.info("Attributes: " + numOfAttr);
		logger.info("References: " + numOfRef);
		logger.info("All assets: " + (numOfObj + numOfAttr + numOfRef));
	}
}
