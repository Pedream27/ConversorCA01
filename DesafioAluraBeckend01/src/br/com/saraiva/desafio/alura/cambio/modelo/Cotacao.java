package br.com.saraiva.desafio.alura.cambio.modelo;

public enum Cotacao {

	Dolar(4.75, 0.21), Euro(5.22, 0.19), Libra(53.88, 0.16), PesoArgentino(53.88, 0.019), PesoChilieno(157.07, 0.0060);

	private double valorX;
	private double valorY;

	Cotacao(double valorX, double valorY) {

		this.valorX = valorX;
		this.valorY = valorY;

	}

	double getCotacao() {

		return this.valorX;
	}

	double getCotacao2() {

		return this.valorY;
	};

}
