package br.com.saraiva.desafio.alura.cambio.modelo;

import java.util.Iterator;

public class ConversorT {

	static double resultado;
	
	public static double Converter(String temperatura, double quantidade) {
		
		for(Temperaturas temperaturas : Temperaturas.values()) {
			if (temperaturas.get().equals(temperatura)) {
				switch (temperaturas) {
				case Fahrenheit:
					
					resultado = (quantidade * 9/5) + 32;
					continue;
		
				case Kelvin:
					
					resultado = quantidade + 273.15;
	
					continue;
				case Rankine:
					
					resultado = (quantidade + 273.15) * 9/5 + 491.67;;
					continue;
				case Reaumur:
					
					resultado = quantidade*4/5;
					
					continue;
				}
		 		
			}
		}
			return resultado;
		
	}
	
	
	
}

	
	
//	public static void main(String[] args) {
	//String temperatura ="Celsius para Fahrenheit";		
	
	//switch (Temperaturas.valueOf(temperatura)) {
	//case Fahrenheit:
	//	System.out.println("teste");
		
	//	break;

	
		
	//}
//}


