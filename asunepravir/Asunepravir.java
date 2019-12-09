package de.unikoeln.chemie.nmr.ui.cl;

import java.util.List;
import org.jcamp.spectrum.NMRSpectrum;
import org.jcamp.spectrum.assignments.AtomReference;

import de.unikoeln.chemie.nmr.data.NmreData;
import de.unikoeln.chemie.nmr.data.Coupling;
import junit.framework.Assert;

public class Asunepravir {
	
	private NmreData data;
	private List<Coupling> couplings;
	
	public void setNmreData(NmreData data, List<Coupling> couplings) {
		this.data=data;
		this.couplings=couplings;
	}

	public void test() {
        Assert.assertEquals(51, data.getMolecule().getAtomCount());
        Assert.assertEquals(55, data.getMolecule().getBondCount());
        Assert.assertEquals(8, data.getSpectra().size());
        Assert.assertEquals(6, couplings.size());
        Assert.assertEquals(11.8, couplings.get(0).getConstant());
        Assert.assertEquals(0, ((AtomReference)couplings.get(0).getAssignments1()[0]).getAtomNumber());
        Assert.assertEquals(0, ((AtomReference)couplings.get(0).getAssignments2()[0]).getAtomNumber());
	}
}
