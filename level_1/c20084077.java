package de.unikoeln.chemie.nmr.ui.cl;

import java.util.List;
import org.jcamp.spectrum.NMRSpectrum;
import org.jcamp.spectrum.assignments.AtomReference;

import de.unikoeln.chemie.nmr.data.NmreData;
import de.unikoeln.chemie.nmr.data.Coupling;
import junit.framework.Assert;

public class c20084077 {
	
	private NmreData data;
	private List<Coupling> couplings;
	
	public void setNmreData(NmreData data, List<Coupling> couplings) {
		this.data=data;
		this.couplings=couplings;
	}

	public void test() {
        Assert.assertEquals(57, data.getMolecule().getAtomCount());
        Assert.assertEquals(59, data.getMolecule().getBondCount());
        Assert.assertEquals(1, data.getSpectra().size());
        Assert.assertEquals(1.67, ((NMRSpectrum)data.getSpectra().get(0)).getPeakTable()[3].getPosition()[0]);
        Assert.assertEquals(34, ((AtomReference)((NMRSpectrum)data.getSpectra().get(0)).getAssignments()[3].getTargets()[0]).getAtomNumber());
        Assert.assertEquals(1.86, ((NMRSpectrum)data.getSpectra().get(0)).getPeakTable()[4].getPosition()[0]);
        Assert.assertEquals(29, ((AtomReference)((NMRSpectrum)data.getSpectra().get(0)).getAssignments()[4].getTargets()[0]).getAtomNumber());
	}
}
