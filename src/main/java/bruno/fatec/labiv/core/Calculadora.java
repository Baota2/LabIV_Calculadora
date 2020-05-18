package bruno.fatec.labiv.core;

public class Calculadora {
	
	public double adicao (double valor1, double valor2) {
		return (valor1 + valor2);
				
	}
	
	public double subtracao (double valor1, double valor2) {
		return (valor1 - valor2);	
	}
	
	public double multiplicacao (double valor1, double valor2) {
		return (valor1 * valor2);		
	}
	
	public double divisao (double valor1, double valor2) {
		return (valor1 / valor2);		
	}
	
	public double porcentagem(double valor, double taxa) {
		return (valor * (taxa/100));
	}

}
