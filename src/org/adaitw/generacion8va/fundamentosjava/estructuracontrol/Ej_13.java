package ejercicios2;

import java.util.Scanner;

public class Ej_13 {

	public static void main(String[] args) {
		/*
		 * Los alumnos de una escuela desean realizar un viaje de estudios, pero
		 * requieren determinar cuánto les costará el pasaje, considerando que las
		 * tarifas del autobús son las siguientes: si son más de 100 alumnos, el costo
		 * es de $20; si son entre 50 y 100, $35; entre 20 y 49, $40, y si son menos de
		 * 20 alumnos, $70 por cada uno. Realice el algoritmo para determinar el costo
		 * del pasaje de cada alumno.
		 */
		int alumnos, costo;

		System.out.println("Ingrese la cantidad de alumnos");
		Scanner lector = new Scanner(System.in);
		alumnos = lector.nextInt();

		if (alumnos > 100) {
			costo = 20;
		} else if (alumnos >= 50) {
			costo = 35;
		} else if (alumnos >= 20) {
			costo = 40;
		} else {
			costo = 70;
		}
		System.out.print("El costo del pasaje de cada alumno es $" + costo);
	}
}
