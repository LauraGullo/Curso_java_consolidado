package ejercicios2;

import java.util.Scanner;

public class Ej_10 {

	public static void main(String[] args) {
		/*
		 * Represente un algoritmo mediante un diagrama de flujo y el pseudoc�digo para
		 * determinar a qu� lugar podr� ir de vacaciones una persona, considerando que
		 * la l�nea de autobuses "La tortuga" cobra por kil�metro recorrido. Se debe
		 * considerar el costo del pasaje tanto de ida, como de vuelta; los datos que se
		 * conocen y que son fijos son: M�xico, 750 km; P.V., 800 km; Acapulco, 1200 km,
		 * y Canc�n, 1800 km. Tambi�n se debe considerar la posibilidad de tener que
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
			destino = "Canc�n";
		} else if (km >= 1200) {
			destino = "Acapulco";
		} else if (km >= 800) {
			destino = "P.V.";
		} else if (km >= 750) {
			destino = "M�xico";
		} else {
			destino = "Considere la posibilidad de quedarse en casa";
		}

		System.out.print("Su destino es: " + destino);
	}
}
