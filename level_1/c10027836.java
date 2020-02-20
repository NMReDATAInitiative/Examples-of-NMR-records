package de.unikoeln.chemie.nmr.ui.cl;

import java.util.List;
import org.jcamp.spectrum.NMRSpectrum;
import org.jcamp.spectrum.assignments.AtomReference;

import de.unikoeln.chemie.nmr.data.NmreData;
import de.unikoeln.chemie.nmr.data.Coupling;
import junit.framework.Assert;

public class c10027836 {
	
	private NmreData data;
	private List<Coupling> couplings;
	
	public void setNmreData(NmreData data, List<Coupling> couplings) {
		this.data=data;
		this.couplings=couplings;
	}

	public void test() {
        Assert.assertEquals(35, data.getMolecule().getAtomCount());
        Assert.assertEquals(37, data.getMolecule().getBondCount());
        Assert.assertEquals(1, data.getSpectra().size());
        Assert.assertEquals(4.42, ((NMRSpectrum)data.getSpectra().get(0)).getPeakTable()[11].getPosition()[0]);
        Assert.assertEquals(29, ((AtomReference)((NMRSpectrum)data.getSpectra().get(0)).getAssignments()[11].getTargets()[0]).getAtomNumber());
        Assert.assertEquals(4.73, ((NMRSpectrum)data.getSpectra().get(0)).getPeakTable()[14].getPosition()[0]);
        Assert.assertEquals(30, ((AtomReference)((NMRSpectrum)data.getSpectra().get(0)).getAssignments()[14].getTargets()[0]).getAtomNumber());
	}
}
