package ejercicios2;

import java.util.Scanner;

public class Ej_2 {

	public static void main(String[] args) {
		/*
		 * Realice un algoritmo para determinar el sueldo semanal de un trabajador con
		 * base en las horas trabajadas y el pago por hora, considerando que después de
		 * las 40 horas cada hora se considera como excedente y se paga el doble
		 */
		double sueldoSemanal, pagoHora, horas;
		final int HORAS_MAXIMAS=40;

		System.out.println("Ingrese el pago por hora");
		Scanner lector = new Scanner(System.in);
		pagoHora = lector.nextDouble();
		System.out.println("Ingrese la cantidad de horas trabajadas");
		horas = lector.nextDouble();
		if (horas <= HORAS_MAXIMAS) {
			sueldoSemanal = horas * pagoHora;
		} else {
			sueldoSemanal = ((horas - 40) * (pagoHora * 2)) + (HORAS_MAXIMAS * pagoHora);
		}
		System.out.print("El sueldo semanal es de $" + sueldoSemanal);
	}
}
