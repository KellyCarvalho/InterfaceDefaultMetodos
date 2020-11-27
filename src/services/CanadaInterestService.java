package services;

import java.security.InvalidParameterException;

public class CanadaInterestService implements Servicos {
	private double taxa=2;

	public CanadaInterestService(double taxa) {

		this.taxa = taxa;
	}
	@Override
	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}


	@Override
	public String toString() {
		return "BrazilInterestService [taxa=" + taxa + "]";
	}

}
