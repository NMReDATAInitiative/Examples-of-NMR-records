package de.unikoeln.chemie.nmr.ui.gui;

import org.jcamp.spectrum.NMRSpectrum;
import org.jcamp.spectrum.assignments.AtomReference;

import de.unikoeln.chemie.nmr.data.NmreData;
import junit.framework.Assert;

public class Asunepravir {
	
	public NmreData data;
	
	public void setNmreData(NmreData data) {
		this.data=data;
	}

	public void test() {
        Assert.assertEquals(51, data.getMolecule().getAtomCount());
        Assert.assertEquals(55, data.getMolecule().getBondCount());
        Assert.assertEquals(8, data.getSpectra().size());
	}
}
