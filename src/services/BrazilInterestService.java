package services;

import java.security.InvalidParameterException;

public class BrazilInterestService implements Servicos{
	private double taxa=2;

	public BrazilInterestService(double taxa) {

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
