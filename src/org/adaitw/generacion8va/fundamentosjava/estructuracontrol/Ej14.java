package ejercicios2;

import java.util.Scanner;

public class Ej14 {

	public static void main(String[] args) {
		/*
		 * Una compañía de paquetería internacional tiene servicio en algunos países de
		 * América del Norte, América Central, América del Sur, Europa y Asia. El costo
		 * por el servicio de paquetería se basa en el peso del paquete y la zona a la
		 * que va dirigido. Lo anterior se muestra en la siguiente tabla: Zona Ubicación
		 * Costo/gramo 1 América del Norte $11.00 2 América Central $10.00 4 Europa
		 * $24.00 5 Asia $27.00 Parte de su política implica que los paquetes con un
		 * peso superior a 5 kg no son transportados, esto por cuestiones de logística y
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
				System.out.println("No es una zona válida");
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
