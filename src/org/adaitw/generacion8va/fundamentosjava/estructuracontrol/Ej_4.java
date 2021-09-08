package ejercicios2;

import java.util.Scanner;

public class Ej_4 {

	public static void main(String[] args) {
		/*
		 * El dueño de un estacionamiento requiere un diagrama de flujo con el algoritmo
		 * que le permita determinar cuánto debe cobrar por el uso del estacionamiento a
		 * sus clientes. Las tarifas que se tienen son las siguientes: a. Las dos
		 * primeras horas a $5.00 c/u. b. Las siguientes tres a $4.00 c/u. c. Las cinco
		 * siguientes a $3.00 c/u. d. Después de diez horas el costo por cada una es de
		 * dos pesos.
		 */
		double costo, horas;
		System.out.println("Ingrese la cantidad de horas de uso del estacionamiento");
		Scanner lector = new Scanner(System.in);
		horas = lector.nextDouble();

		if (horas <= 2) {
			costo = 5 * horas;
		} else if (horas <= 5) {
			costo = (horas - 2) * 4 + (2*5);
		} else if (horas <= 10) {
			costo = (horas - 5) * 3 + (3*4)+(2*5);
		} else {
			costo = (horas - 10) * 2 + (5*3)+(3*4)+(2*5);
		}
		System.out.print("El costo por el estacionamiento es $" + costo);
	}
}
