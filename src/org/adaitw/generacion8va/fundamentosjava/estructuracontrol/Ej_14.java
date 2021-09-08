package ejercicios2;

import java.util.Scanner;

public class Ej_14 {

	public static void main(String[] args) {
		/*
		 * Realice un algoritmo que, con base en una calificación proporcionada (0-10),
		 * indique con letra la calificación que le corresponde: 10 es "A", 9 es "B", 8
		 * es "C", 7 y 6 son "D", y de 5 a 0 son "F".
		 */
		int calificacion;
		String letra;

		System.out.println("Ingrese la caificación (0-10)");
		Scanner lector = new Scanner(System.in);
		calificacion = lector.nextInt();

		while (calificacion < 0 || calificacion > 10) {
			System.out.println("valor incorrecto. Ingrese valor nuevamente");
			calificacion = lector.nextInt();
		}
		
		if (calificacion == 10) {
			letra = "A";
		} else if (calificacion == 9) {
			letra = "B";
		} else if (calificacion == 8) {
			letra = "C";
		} else if (calificacion == 6 || calificacion == 7) {
			letra = "D";
		} else {
			letra = "F";
		}
		
		/*otra forma de hacerlo es con switch
		switch (calificacion) {
		case 10:
			letra = "A";
			break;
		case 9:
			letra = "B";
			break;
		case 8:
			letra = "C";
			break;
		case 7, 6:
			letra = "D";
			break;
		default:
			letra = "F";
			break;
		}*/

		System.out.print("La calificación que le corresponde es " + letra);
	}
}
