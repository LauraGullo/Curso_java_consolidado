package ejercicios2;

import java.util.Scanner;

public class Ej_12 {

	public static void main(String[] args) {
		/*
		 * Realice un algoritmo que permita determinar el sueldo semanal de un
		 * trabajador con base en las horas trabajadas y el pago por hora, considerando
		 * que a partir de la hora número 41 y hasta la 45, cada hora se le paga el
		 * doble, de la hora 46 a la 50, el triple, y que trabajar más de 50 horas no
		 * está permitido
		 */

		double horas, pagoXHora, sueldo;

		System.out.println("Ingrese las horas trabajadas en la semana");
		Scanner lector = new Scanner(System.in);
		horas = lector.nextDouble();

		if (horas > 50) {
			System.out.print("No esta permitido trabajar mas de 50 horas");
		} else {
			System.out.println("Ingrese el pago por hora");
			pagoXHora = lector.nextDouble();
			sueldo = pagoXHora * horas;
			if (horas < 41) {
				sueldo = sueldo;
			} else if (horas <= 45) {
				sueldo = sueldo + ((horas - 41) * pagoXHora * 2);
			} else {
				sueldo = sueldo + ((horas - 45) * pagoXHora * 3);
			}
			System.out.print("El sueldo semanal es $" + sueldo);
		}
	}
}
