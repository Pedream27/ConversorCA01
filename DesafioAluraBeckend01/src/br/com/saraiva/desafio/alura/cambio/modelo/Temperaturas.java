package br.com.saraiva.desafio.alura.cambio.modelo;



public enum Temperaturas {
	
	
	Fahrenheit("Celsius para Fahrenheit"),
	Kelvin("Celsius para Kelvin"),
	Reaumur("Celsius para Reaumur"),
	Rankine("Celsius para Rankine"),;
	
	private final String string;
	
	
	Temperaturas(String string) {
		this.string = string;
		
	}
	
	public String get() {
		
		return string;
	}
	
}
