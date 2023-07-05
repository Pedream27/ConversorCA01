package br.com.saraiva.desafio.alura.cambio.modelo;

public enum Cotacao {

	Dolar(4.75, "De Reais a Dólar" ),
	Euro(5.22, "De Reais a Euro"),
	Libra(53.88, "De Reais a Libras Esterlinas"),
	PesoArgentino(53.88, "De Reais a Peso argentino"),
	PesoChilieno(157.07,  "De Reais a Peso Chileno"),
	DolarY(0.21, "De Dólar a Reais"), EuroY(0.19 , "De Euro a Reais"),
	LibraY(0.16, "De Libras Esterlinas a Reais"), PesoArgentinoY(0.019, "De Pesos argentino a Reais"),
	PesoChilenoY(0.0060, "De Peso chilenos a Reais" );

	private double valorX;
	private String descricao;
	
	Cotacao(double valorX,  String descricao) {

		this.valorX = valorX;
		this.descricao = descricao;

	}
	
	String getDescricao() {
		return descricao;
	}

	double getCotacao() {

		return valorX;
	}

	

}
