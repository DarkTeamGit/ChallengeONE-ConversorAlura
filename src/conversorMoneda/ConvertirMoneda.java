package conversorMoneda;

import javax.swing.JOptionPane;

public class ConvertirMoneda {
	double precioDolar = 217.46;
	double precioEuro = 238.24;
	double precioLibra = 270.48;
	double precioYen = 1.61;
	double precioWonSurCoreano = 0.16;
	String tipoMoneda;
	String tipoMonedaLocal = " Moneda Pesos Argentinos";
	
	public void ConvertirMoneda(double valor, String tipo) {
		double moneda = 0;

		try {
			switch (tipo) {
			case "DOL": moneda = ConvertirMonedaDolar(valor); break;
			case "EUR": moneda = ConvertirMonedaEuro(valor); break;
			case "GBP": moneda = ConvertirMonedaLibra(valor); break;
			case "JPY": moneda = ConvertirMonedaYen(valor); break;
			case "KRW": moneda = ConvertirMonedaWonSurCoreano(valor); break;
			case "DOL-LOC": moneda = ConvertirDolarMonedaLocal(valor); break;
			case "EUR-LOC": moneda = ConvertirEuroMonedaLocal(valor); break;
			case "GBP-LOC": moneda = ConvertirLibraMonedaLocal(valor); break;
			case "JPY-LOC": moneda = ConvertirYenMonedaLocal(valor); break;
			case "KRW-LOC": moneda = ConvertirWonSurCoreanoMonedaLocal(valor); break;
			}

			moneda = (double) Math.round(moneda * 100d) / 100;
			
			JOptionPane.showMessageDialog(null, "Tienes $ " + moneda + tipoMoneda);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}

	private double ConvertirMonedaDolar(double valor) {
		tipoMoneda = " Moneda Dólar";
		return (valor / precioDolar);
	}
	
	private double ConvertirMonedaEuro(double valor) {
		tipoMoneda = " Moneda Euro";
		return (valor / precioEuro);
	}
	
	private double ConvertirMonedaLibra(double valor) {
		tipoMoneda = " Moneda Libra";
		return (valor / precioLibra);
	}
	
	private double ConvertirMonedaYen(double valor) {
		tipoMoneda = " Moneda Yen";
		return (valor / precioYen);
	}
	
	private double ConvertirMonedaWonSurCoreano(double valor) {
		tipoMoneda = " Moneda Won Sur Coreano";
		return (valor / precioWonSurCoreano);
	}
	
	private double ConvertirDolarMonedaLocal(double valor) {
		tipoMoneda = tipoMonedaLocal;
		return (valor * precioDolar);
	}
	
	private double ConvertirEuroMonedaLocal(double valor) {
		tipoMoneda = tipoMonedaLocal;
		return (valor * precioEuro);
	}
	
	private double ConvertirLibraMonedaLocal(double valor) {
		tipoMoneda = tipoMonedaLocal;
		return (valor * precioLibra);
	}
	
	private double ConvertirYenMonedaLocal(double valor) {
		tipoMoneda = tipoMonedaLocal;
		return (valor * precioYen);
	}
	
	private double ConvertirWonSurCoreanoMonedaLocal(double valor) {
		tipoMoneda = tipoMonedaLocal;
		return (valor * precioWonSurCoreano);
	}
}