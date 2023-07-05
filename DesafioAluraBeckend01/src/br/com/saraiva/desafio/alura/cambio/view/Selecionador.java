package br.com.saraiva.desafio.alura.cambio.view;

import java.text.DecimalFormat;
import java.util.IllegalFormatCodePointException;

import javax.swing.JOptionPane;

import br.com.saraiva.desafio.alura.cambio.modelo.Conversor;
import br.com.saraiva.desafio.alura.cambio.modelo.ConversorT;

public class Selecionador {

	double quantidade;
	String util;
	
	Object[] escolhaDeConversor;

	protected void Start() {

		selecionadorDeConversor();

	}

	private void startConvertorA() {
		quantidade = inputQuantidade();
		util = selecionarMoeda().toString();
		double resultado = Conversor.Converter(util, quantidade);
		caixaResultado(resultado, "O valor da Conversão é de : R$");
		Continuar();

	}

	private void startConvertorB() {
		/// Em prodrução
		util = selecionarT().toString();
		quantidade = inputTemperatura();
		double resultado = ConversorT.Converter(util, quantidade);
		caixaResultado(resultado, "Sua temperatura convertida é igual a  : ");
		Continuar();
		
		
	}
	
	private String selecionarT() {
		Object[] escolhaDeConversor = { "Celsius para Fahrenheit",
				"Fahrenheit para Celsius", "Celsius para Kelvin",
				"Celsius para Reaumur", "Celsius para Rankine",};
		Object selecionarMoeda = JOptionPane.showInputDialog(null, "Seleciona um: ", "Entrada",
				JOptionPane.INFORMATION_MESSAGE, null, escolhaDeConversor, escolhaDeConversor[0]);

		return selecionarMoeda.toString();
		
		
		
	}
	private double inputTemperatura() {
		String resultado = JOptionPane.showInputDialog("Insira A temperatura : ");
		Verifica(resultado);
		try {
			quantidade = Double.parseDouble(resultado);
		} catch (Exception e) {
			e.getMessage();
		}

		return quantidade;
	}

	private Double inputQuantidade() {
		// Double quantidade = Double.parseDouble(JOptionPane.showInputDialog("Insira um
		// valor: "));
		String resultado = JOptionPane.showInputDialog("Insira um valor: ");
		Verifica(resultado);
		try {
			quantidade = Double.parseDouble(resultado);
		} catch (Exception e) {
			e.getMessage();
		}

		return quantidade;
	}

	private String selecionarMoeda() {

		Object[] escolhaDeConversor = { "De Reais a Dólar", "De Reais a Euro", "De Reais a Libras Esterlinas ",
				"De Reais a Peso argentino", "De Reais a Peso Chileno", "De Dólar a Reais", "De Euro a Reais",
				"De Libras Esterlinas a Reais", "De Pesos argentino a Reais" };
		Object selecionarMoeda = JOptionPane.showInputDialog(null, "Seleciona um: ", "Entrada",
				JOptionPane.INFORMATION_MESSAGE, null, escolhaDeConversor, escolhaDeConversor[0]);

		return selecionarMoeda.toString();
	}

	private void selecionadorDeConversor() {

		Object[] escolhaDeConversor = { "Connversor de moeda", "Conversor de Temperatura" };

		Object selecionarConversor = JOptionPane.showInputDialog(null, "Seleciona um: ", "Entrada",
				JOptionPane.INFORMATION_MESSAGE, null, escolhaDeConversor, escolhaDeConversor[0]);

		selecionarConversor.toString();

		if (selecionarConversor.toString().equalsIgnoreCase("Connversor de moeda")) {
			startConvertorA();

		} else if (selecionarConversor.toString().equals("Conversor de Temperatura")) {

			startConvertorB();

		}

	}

	private void caixaResultado(double numero , String txt) {
		DecimalFormat df = new DecimalFormat("#,###.00");

		String menssagem = txt + df.format(numero);
		JOptionPane.showMessageDialog(null, menssagem, "Menssagem", 0);

	}
	
	

	public void Verifica(String resultado) {
		boolean verifica = resultado.matches("[0-9]+");
		if (verifica) {

		} else {
			Object txt = "Só aceitamos numeros. ";
			JOptionPane.showMessageDialog(null, txt);
			inputQuantidade();

		}
	}

	private void Continuar() {

		Object[] botao = { "Sim", "Não" };
		Object texto = "Deseja Continuar ? ";
		Object teste = JOptionPane.showOptionDialog(null, texto, " ", 0, 0, null, botao, null);
		// 0-SIm 1-Não
		if (teste.toString().equals("0")) {
			Start();

		} else {

			Object txt = "Programa Finalizado";
			JOptionPane.showMessageDialog(null, txt);

		}

	}

}


