package ejercicios2;

import java.util.Scanner;

public class Ej14 {

	public static void main(String[] args) {
		/*
		 * Una compa��a de paqueter�a internacional tiene servicio en algunos pa�ses de
		 * Am�rica del Norte, Am�rica Central, Am�rica del Sur, Europa y Asia. El costo
		 * por el servicio de paqueter�a se basa en el peso del paquete y la zona a la
		 * que va dirigido. Lo anterior se muestra en la siguiente tabla: Zona Ubicaci�n
		 * Costo/gramo 1 Am�rica del Norte $11.00 2 Am�rica Central $10.00 4 Europa
		 * $24.00 5 Asia $27.00 Parte de su pol�tica implica que los paquetes con un
		 * peso superior a 5 kg no son transportados, esto por cuestiones de log�stica y
		 * de seguridad. Realice un algoritmo para determinar el cobro por la entrega de
		 * un paquete o, en su caso, el rechazo de la entrega;
		 * 
		 */
		int peso, costo = 0, zonaEntrega;
		final int AMERICA_DEL_NORTE=11, AMERICA_CENTRAL=10, AMERICA_DEL_SUR=12, EUROPA=24, ASIA=27;
		System.out.println("Ingrese el peso del paquete en Gr.");
		Scanner lector = new Scanner(System.in);
		peso = lector.nextInt();

		if (peso > 5000) {
			System.out.println("El paquete no puede ser transportado.");
		} else {
			System.out.println(
					"Ingrese zona de entrega: 1_America del Norte, 2_America Central, 3_America del Sur, 4_Europa, 5_Asia");
			zonaEntrega = lector.nextInt();
			switch (zonaEntrega) {
			case 1:
				costo = peso * AMERICA_DEL_NORTE;
				break;
			case 2:
				costo = peso * AMERICA_CENTRAL;
				break;
			case 3:
				costo = peso * AMERICA_DEL_SUR;
				break;
			case 4:
				costo = peso * EUROPA;
				break;
			case 5:
				costo = peso * ASIA;
				break;
			default:
				System.out.println("No es una zona v�lida");
				break;
			}
		}
		if (costo > 0) {
			System.out.print("El costo es $" + costo);
		} else {
			System.out.print("No es posible determinar el costo.");
		}
	}
}
