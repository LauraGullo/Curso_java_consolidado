package ejercicios2;

import java.util.Scanner;

public class Ej12 {

	public static void main(String[] args) {
		/*
		 * El consultorio del Dr. Lorenzo T. Mata Lozano tiene como política cobrar la
		 * consulta con base en el número de cita, de la siguiente forma: _ Las tres
		 * primeras citas a $200.00 c/u. _ Las siguientes dos citas a $150.00 c/u. _ Las
		 * tres siguientes citas a $100.00 c/u. _ Las restantes a $50.00 c/u, mientras
		 * dure el tratamiento. Se requiere un algoritmo para determinar: a) Cuánto
		 * pagará el paciente por la cita. b) El monto de lo que ha pagado el paciente
		 * por el tratamiento.
		 */

		int costoCita, nCitas, costoTotal;

		System.out.println("Ingrese la cantidad de citas");
		Scanner lector = new Scanner(System.in);
		nCitas = lector.nextInt();

		if (nCitas <= 3) {
			costoTotal = 200 * nCitas;
		} else if (nCitas <= 5) {
			costoTotal = ((nCitas - 3) * 150) + 600;
		} else if (nCitas <= 8) {
			costoTotal = ((nCitas - 5) * 100) + 900;
		} else {
			costoTotal = ((nCitas - 8) * 50) + 1200;
		}

		costoCita = costoTotal / nCitas;

		System.out.println("El costo por cada cita es de $" + costoCita);
		System.out.print("El costo total es $" + costoTotal);
	}
}
