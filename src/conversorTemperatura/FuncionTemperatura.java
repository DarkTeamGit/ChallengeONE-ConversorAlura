package conversorTemperatura;

import javax.swing.JOptionPane;

public class FuncionTemperatura {
	ConvertirTemperatura temperatura = new ConvertirTemperatura();
	
	public void ConvertirTemperatura(double valor) {
		String opcion = (JOptionPane.showInputDialog(null, "Selecciona el tipo de temperatura que desea convertir", "Temperaturas", JOptionPane.PLAIN_MESSAGE, null,
				new Object[] { 
						"Celsius a Fahrenheit", 
						"Fahrenheit a Celsius"
				}, "Selección")).toString();
		
		switch (opcion) {
		case "Celsius a Fahrenheit":
			temperatura.ConvertirTemperatura(valor, "F");
			break;
		case "Fahrenheit a Celsius":
			temperatura.ConvertirTemperatura(valor, "C");
			break;
		}
	}
}