package conversorMoneda;

import javax.swing.JOptionPane;

public class FuncionMoneda {
	ConvertirMoneda moneda = new ConvertirMoneda();
	
	public void ConvertirMoneda(double valor) {
		String monedaLocal = "Peso Argentino";
		String opcion = (JOptionPane.showInputDialog(null, "Selecciona el tipo de moneda que desea convertir", "Monedas", JOptionPane.PLAIN_MESSAGE, null, 
				new Object[] { 
						monedaLocal + " a Dolar", 
						monedaLocal + " a Euro", 
						monedaLocal + " a Libra",
						monedaLocal + " a Yen",
						monedaLocal + " a Won Sur Coreano",
						"Dolar a " + monedaLocal,
						"Euro a " + monedaLocal,
						"Libra a " + monedaLocal,
						"Yen a " + monedaLocal,
						"Won Sur Coreano a " + monedaLocal,
				}, "Selección")).toString();
		
		switch (opcion.replace(monedaLocal, "")) {
		case " a Dolar":
			moneda.ConvertirMoneda(valor, "DOL");
			break;
		case " a Euro":
			moneda.ConvertirMoneda(valor, "EUR");
			break;
		case " a Libra":
			moneda.ConvertirMoneda(valor, "GBP");
			break;
		case " a Yen":
			moneda.ConvertirMoneda(valor, "JPY");
			break;
		case " a Won Sur Coreano":
			moneda.ConvertirMoneda(valor, "KRW");
			break;
		case "Dolar a ":
			moneda.ConvertirMoneda(valor, "DOL-LOC");
			break;
		case "Euro a ":
			moneda.ConvertirMoneda(valor, "EUR-LOC");
			break;
		case "Libra a ":
			moneda.ConvertirMoneda(valor, "GBP-LOC");
			break;
		case "Yen a ":
			moneda.ConvertirMoneda(valor, "JPY-LOC");
			break;
		case "Won Sur Coreano a ":
			moneda.ConvertirMoneda(valor, "KRW-LOC");
			break;
		}
	}
}