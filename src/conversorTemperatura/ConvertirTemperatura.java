package conversorTemperatura;

import javax.swing.JOptionPane;

public class ConvertirTemperatura {
	String tipoTemperatura;
	
	public void ConvertirTemperatura(double valor, String grado) {
		double temperatura = 0;
		
		try {
			switch (grado) {
			case "C": temperatura = ConvertirCelsius(valor); break;
			case "F": temperatura = ConvertirFahrenheit(valor); break;
			}
			
			temperatura = (double) Math.round(temperatura);
			
			JOptionPane.showMessageDialog(null, "Temperatura a " + temperatura + tipoTemperatura);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
	
	private double ConvertirCelsius(double valor) {
		tipoTemperatura = " °C";
		return ((valor - 32) / 1.8);
	}
	
	private double ConvertirFahrenheit(double valor) {
		tipoTemperatura = " °F";
		return ((valor * 1.8) + 32);
	}
}