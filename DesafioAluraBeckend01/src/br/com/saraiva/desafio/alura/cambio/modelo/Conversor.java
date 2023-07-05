package br.com.saraiva.desafio.alura.cambio.modelo;

public class Conversor {

	public static double Converter(String moedas, double quantidade) {
		double resultado;
		if (moedas.equalsIgnoreCase("De Reais a Dólar")) {
			resultado = quantidade / Cotacao.Dolar.getCotacao();
			return resultado;
		} else if (moedas.equalsIgnoreCase("De Reais a Euro")) {
			resultado = quantidade / Cotacao.Euro.getCotacao();
			return resultado;

		} else if (moedas.equalsIgnoreCase("De Reais a Libras Esterlinas")) {
			resultado = quantidade / Cotacao.Libra.getCotacao();

			return resultado;
		} else if (moedas.equalsIgnoreCase("De Reais a Peso argentino")) {
			resultado = quantidade * Cotacao.PesoArgentino.getCotacao();
			return resultado;
		} else if (moedas.equalsIgnoreCase("De Reais a Peso Chileno")) {
			resultado = quantidade * Cotacao.PesoChilieno.getCotacao();
			return resultado;
		} else if (moedas.equalsIgnoreCase("De Dólar a Reais")) {
			resultado = quantidade / Cotacao.Dolar.getCotacao2();
			return resultado;
		} else if (moedas.equalsIgnoreCase("De Euro a Reais")) {
			resultado = quantidade / Cotacao.Euro.getCotacao2();
			;
			return resultado;
		} else if (moedas.equalsIgnoreCase("De Libras Esterlinas a Reais")) {
			resultado = quantidade / Cotacao.Libra.getCotacao2();
			;
			return resultado;
		} else if (moedas.equalsIgnoreCase("De Pesos argentino a Reais")) {
			resultado = quantidade / Cotacao.PesoArgentino.getCotacao2();
			;
			return resultado;
		} else if (moedas.equalsIgnoreCase("De Peso chilenos a Reais")) {
			resultado = quantidade / Cotacao.PesoChilieno.getCotacao2();
			;
			return resultado;
		}

		return -1;
	}
}



