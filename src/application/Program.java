package application;

import java.util.Locale;
import java.util.Scanner;

import services.BrazilInterestService;
import services.CanadaInterestService;
import services.Servicos;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.CANADA);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Valor: ");
		double valor = sc.nextDouble();
		System.out.println("Meses: ");
		int meses = sc.nextInt();
		Servicos bis = new BrazilInterestService(2.0);
		double pagamento =bis.pagamento(valor, meses);
	
		System.out.println("Valor a ser pago após "+meses+ " meses no Brasil: "+String.format("%.2f", pagamento) );
		
		Servicos cis = new CanadaInterestService(1.0);
		 pagamento =cis.pagamento(valor, meses);
	
		System.out.println("Valor a ser pago após "+meses+ " meses no Canadá: "+String.format("%.2f", pagamento) );
		
	}

}
