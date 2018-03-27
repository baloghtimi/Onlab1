package org.mondo.collaboration.security.increment;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.emf.EMFScope;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import org.mondo.collaboration.security.increment.policy.EffectiveJudgementMatch;
import org.mondo.collaboration.security.increment.policy.EffectiveJudgementMatcher;
import org.mondo.collaboration.security.increment.policy.ExplicitJudgementMatch;
import org.mondo.collaboration.security.increment.policy.ExplicitJudgementMatcher;
import org.mondo.collaboration.security.increment.policy.util.EffectiveJudgementQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.ExplicitJudgementQuerySpecification;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import WTSpec4M.WTSpec4MFactory;
import WTSpec4M.WTSpec4MPackage;

public class Application {
	private final static Logger logger = Logger.getLogger(Application.class);
	

    private static final String MODEL_PATH = 
    "C:\\Bulisuli\\1\\Onlab1\\workspace\\org.mondo.collaboration.security.increment\\src\\org\\mondo\\collaboration\\security\\increment\\model\\windturbineXS.wtspec4m";

	
	public static void main(String[] args) throws ViatraQueryException {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("wtspec4m", new XMIResourceFactoryImpl());
		WTSpec4MFactory.eINSTANCE.eClass();
		WTSpec4MPackage.eINSTANCE.eClass();
		
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource model = resourceSet.getResource(URI.createFileURI(MODEL_PATH), true);
		
		int numOfAssets = 0;
		TreeIterator<EObject> allContents = model.getAllContents();
		while(allContents.hasNext()){
			EObject object = allContents.next();
			
			// object
			numOfAssets++;
			
//			// attributes
//			for(EAttribute attribute : object.eClass().getEAllAttributes()) {
//				numOfAssets++;
//			}
//			
//			// references
//			for(EReference reference : object.eClass().getEAllReferences()) {
//				// containment reference
//				if(reference.isMany()) {
//    				@SuppressWarnings("unchecked")
//					EList<EObject> targets = (EList<EObject>) object.eGet(reference);
//    				for (EObject target : targets) {
//    					numOfAssets++;
//					}
//    			// association
//    			} else {
//    				EObject target = (EObject) object.eGet(reference);
//    				if(target != null){
//    				numOfAssets++;
//    				}
//    			}
//			}
		}
		logger.info("Number of assets: " + numOfAssets);
		
		ViatraQueryEngine engine = AdvancedViatraQueryEngine.on(new EMFScope(model));
		EffectiveJudgementQuerySpecification querySpecification = EffectiveJudgementQuerySpecification.instance();
		EffectiveJudgementMatcher matcher = engine.getMatcher(querySpecification);
		
		EffectiveJudgementMatch filter = matcher.newEmptyMatch();
//		filter.setUser("PrincipalEngineer");
		filter.setUser("IOManager");
//		filter.setUser("SubsystemManager");
		matcher.forEachMatch(filter, new IMatchProcessor<EffectiveJudgementMatch>() {

			@Override
			public void process(EffectiveJudgementMatch match) {
				logger.info(match);
			}
		});
		logger.info("Number of effective judgements: " + matcher.countMatches(filter));
		
//		ViatraQueryEngine engine = AdvancedViatraQueryEngine.on(new EMFScope(model));
//		ExplicitJudgementQuerySpecification querySpecification = ExplicitJudgementQuerySpecification.instance();
//		ExplicitJudgementMatcher matcher = engine.getMatcher(querySpecification);
//		
//		ExplicitJudgementMatch filter = matcher.newEmptyMatch();
//		filter.setUser("IOManager");
//		logger.info("Number of explicit judgements: " + matcher.countMatches(filter));
//		matcher.forEachMatch(filter, new IMatchProcessor<ExplicitJudgementMatch>() {
//
//			@Override
//			public void process(ExplicitJudgementMatch match) {
//				System.out.println(match);
//			}
//		});
	}
}
