package ejercicios2;

import java.util.Scanner;

public class Ej_10 {

	public static void main(String[] args) {
		/*
		 * Represente un algoritmo mediante un diagrama de flujo y el pseudocódigo para
		 * determinar a qué lugar podrá ir de vacaciones una persona, considerando que
		 * la línea de autobuses "La tortuga" cobra por kilómetro recorrido. Se debe
		 * considerar el costo del pasaje tanto de ida, como de vuelta; los datos que se
		 * conocen y que son fijos son: México, 750 km; P.V., 800 km; Acapulco, 1200 km,
		 * y Cancún, 1800 km. También se debe considerar la posibilidad de tener que
		 * quedarse en casa.
		 */

		double dinero, precioXKm, km = 0;
		String destino;

		System.out.println("Ingrese cuanto dinero desea gastar");
		Scanner lector = new Scanner(System.in);
		dinero = lector.nextDouble();

		System.out.println("Ingrese el precio por Km.");
		precioXKm = lector.nextDouble();

		km = (dinero / precioXKm) / 2;

		if (km >= 1800) {
			destino = "Cancún";
		} else if (km >= 1200) {
			destino = "Acapulco";
		} else if (km >= 800) {
			destino = "P.V.";
		} else if (km >= 750) {
			destino = "México";
		} else {
			destino = "Considere la posibilidad de quedarse en casa";
		}

		System.out.print("Su destino es: " + destino);
	}
}
