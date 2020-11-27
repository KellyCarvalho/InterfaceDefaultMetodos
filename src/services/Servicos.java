package services;

import java.security.InvalidParameterException;

public interface Servicos {
	
	double getTaxa();
	default double pagamento(double valor, int meses) {
		if(meses<1) {
			throw new InvalidParameterException("Meses devem ser maiores que zero");
		}
		
		return valor * Math.pow(1.0+getTaxa()/100.0, meses);
		
	};

}
