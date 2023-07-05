package br.com.saraiva.desafio.alura.cambio.modelo;

public class ConversorT {

	public static double Converter(String temperatura, double quantidade) {
		double resultado;
		
		if (temperatura.toString().equals("Celsius para Fahrenheit")) {
			resultado = (quantidade * 9/5) + 32;
			return resultado;
			
		}else if (temperatura.toString().equals("Celsius para Kelvin")) {
			resultado = quantidade + 273.15;
			return resultado;
		
		}else if (temperatura.toString().equals("Celsius para Reaumur")) {
			resultado = quantidade*4/5;
			
		}else if (temperatura.toString().equals("Celsius para Rankine")) {
			resultado = (quantidade + 273.15) * 9/5 + 491.67;
			return resultado;
			
		}
	
		return 25.5;
	}
}
