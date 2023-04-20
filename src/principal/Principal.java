package principal;

import javax.swing.JOptionPane;
import conversorMoneda.FuncionMoneda;
import conversorTemperatura.FuncionTemperatura;

public class Principal {
	public static void main(String[] args) {
		FuncionMoneda moneda = new FuncionMoneda();
		FuncionTemperatura temperatura = new FuncionTemperatura();
		boolean flag = true;
		
		try {
			while (flag) {
				String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menu", JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Conversor de Moneda", "Conversor de Temperatura"}, "Selección")).toString();
				
				switch (opciones) {
				case "Conversor de Moneda":
					String numero = JOptionPane.showInputDialog("Ingrese la cantidad de dinero que desee convertir:");
					
					if (ValidarNumero(numero)) {
						double monedaNumero = Double.parseDouble(numero);
						moneda.ConvertirMoneda(monedaNumero);
						
						int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?");
						
						if (respuesta == JOptionPane.OK_OPTION) {
							System.out.println("Selecciona opción Afirmativa");
						}
						else {
							flag = false;
							JOptionPane.showMessageDialog(null, "Programa terminado");
						}
					}
					else {
						JOptionPane.showMessageDialog(null, "Valor Invalido");
					}
					break;
				case "Conversor de Temperatura":
					numero =JOptionPane.showInputDialog("Ingrese el valor de la temperatura que desea convertir:");
					
					if (ValidarNumero(numero)) {
						double temperaturaNumero = Double.parseDouble(numero);
						temperatura.ConvertirTemperatura(temperaturaNumero);
						
						int respuesta = 0;
						respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
						
						if ((respuesta == 0) && (ValidarNumero(numero))) {
							System.out.println("Selecciona opción Afirmativa");
						}
						else {
							flag = false;
							JOptionPane.showMessageDialog(null, "Programa Terminado");
						}
					}
					else {
						JOptionPane.showMessageDialog(null, "Valor Invalido");
					}
					break;
				}		
			}
		} catch (Exception e) {
			flag = false;
		}
	}
	
	public static boolean ValidarNumero(String numero) {
		try {
			double resultado = Double.parseDouble(numero);
		} catch (Exception e) {
			return false;
		}
		
		return true;
	}
}