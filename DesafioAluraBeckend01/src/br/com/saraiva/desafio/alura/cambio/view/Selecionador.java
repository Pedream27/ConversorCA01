package br.com.saraiva.desafio.alura.cambio.view;

import java.text.DecimalFormat;
import java.util.IllegalFormatCodePointException;

import javax.swing.JOptionPane;

import br.com.saraiva.desafio.alura.cambio.modelo.Conversor;

public class Selecionador {

	double quantidade;
	String moedas;
	Object[] escolhaDeConversor;

	protected void Start() {

		selecionadorDeConversor();

	}

	private void startConvertorA() {
		quantidade = inputQuantidade();
		moedas = selecionarMoeda().toString();
		double resultado = Conversor.Converter(moedas, quantidade);
		caixaResultado(resultado);
		Continuar();

	}

	private void startConvertorB() {
		quantidade = inputQuantidade();
		moedas = selecionarMoeda().toString();
		double resultado = Conversor.Converter(moedas, quantidade);
		caixaResultado(resultado);
		Continuar();

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

	private void caixaResultado(double numero) {
		DecimalFormat df = new DecimalFormat("#,###.00");

		String menssagem = "O valor da Conversão é de : R$" + df.format(numero);
		;
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
