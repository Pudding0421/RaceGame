/*
 * generated by Xtext 2.26.0
 */
package kcl.uk.dzh.zpl.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractRaceGameValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(kcl.uk.dzh.zpl.raceGame.RaceGamePackage.eINSTANCE);
		return result;
	}
}
