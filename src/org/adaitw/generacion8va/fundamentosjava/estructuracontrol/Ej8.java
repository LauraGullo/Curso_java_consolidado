package ejercicios2;

import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {
		/*
		 * El director de una escuela est� organizando un viaje de estudios, y requiere
		 * determinar cu�nto debe cobrar a cada alumno y cu�nto debe pagar a la compa��a
		 * de viajes por el servicio. La forma de cobrar es la siguiente: si son 100
		 * alumnos o m�s, el costo por cada alumno es de $65.00; de 50 a 99 alumnos, el
		 * costo es de $70.00, de 30 a 49, de $95.00, y si son menos de 30, el costo de
		 * la renta del autob�s es de $4000.00, sin importar el n�mero de alumnos.
		 * Realice un algoritmo que permita determinar el pago a la compa��a de
		 * autobuses y lo que debe pagar cada alumno por el viaje (represente en
		 * pseudoc�digo y diagrama de flujo)
		 */
		int costoAlumno, costoTotal = 0, alumnos;

		System.out.println("Ingrese la cantidad de alumnos");
		Scanner lector = new Scanner(System.in);
		alumnos = lector.nextInt();

		if( alumnos>=100) {
			costoAlumno=65;
		}
		else {
			if (alumnos >= 50) {
				costoAlumno = 70;
			} else {
				if (alumnos >= 30) {
					costoAlumno = 95;
				} else {
					costoAlumno = 4000 / alumnos;

				}
			}
		}
		costoTotal = alumnos * costoAlumno;
		System.out.println("El costo de cada alumno es de $" + costoAlumno);
		System.out.print("El costo total es $" + costoTotal);
	}
}
