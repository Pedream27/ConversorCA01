package br.com.saraiva.desafio.alura.cambio.modelo;

public class Conversor {
	
	static double resultado;
		
	public static double Converter(String moeda, double quantidade) {
		
		for(Cotacao cotacao : Cotacao.values()) {
			if (cotacao.getDescricao().equals(moeda)) {
				switch (cotacao) {
				case Dolar:
					
					resultado = quantidade / Cotacao.Dolar.getCotacao();
					continue;
				case DolarY:
					resultado = quantidade/Cotacao.DolarY.getCotacao();
					continue;
				case Euro:
					resultado = quantidade/Cotacao.Euro.getCotacao();
					continue;
				case EuroY:
					resultado = quantidade/Cotacao.EuroY.getCotacao();
					continue;
				case Libra:
					resultado = quantidade/Cotacao.Libra.getCotacao();
					continue;	
				case LibraY:
					resultado = quantidade/Cotacao.LibraY.getCotacao();
					continue;
				case PesoArgentino:
					resultado = quantidade/Cotacao.PesoArgentino.getCotacao();
					continue;
				case PesoArgentinoY:
					resultado = quantidade/ Cotacao.PesoArgentino.getCotacao();
					continue;
				case PesoChilieno:
					resultado = quantidade/Cotacao.PesoChilieno.getCotacao();
					continue;
				case PesoChilenoY:
					resultado = quantidade/Cotacao.PesoChilenoY.getCotacao();
					continue;
				}
			
				
			}
		}
		return resultado;
		

	}
}



