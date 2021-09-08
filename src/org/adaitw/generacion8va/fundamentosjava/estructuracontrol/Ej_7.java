package ejercicios2;

import java.util.Scanner;

public class Ej_7 {

	public static void main(String[] args) {
		/*
		 * El presidente de la república ha decidido estimular a todos los estudiantes
		 * de una universidad mediante la asignación de becas mensuales, para esto se
		 * tomarán en consideración los siguientes criterios: Para alumnos mayores de 18
		 * años con promedio mayor o igual a 9, la beca será de $2000.00; con promedio
		 * mayor o igual a 7.5, de $1000.00; para los promedios menores de 7.5 pero
		 * mayores o iguales a 6.0, de $500.00; a los demás se les enviará una carta de
		 * invitación incitándolos a que estudien más en el próximo ciclo escolar. A los
		 * alumnos de 18 años o menores de esta edad, con promedios mayores o iguales a
		 * 9, se les dará $3000; con promedios menores a 9 pero mayores o iguales a 8,
		 * $2000; para los alumnos con promedios menores a 8 pero mayores o iguales a 6,
		 * se les dará $100, y a los alumnos que tengan promedios menores a 6 se les
		 * enviará carta deinvitación
		 */
		int edad, bono;
		double promedio;

		System.out.println("Ingrese su edad");
		Scanner lector = new Scanner(System.in);
		edad = lector.nextInt();
		System.out.println("Ingrese su promedio");
		promedio = lector.nextDouble();
		if (edad > 18) {
			if (promedio >= 9) {
				bono = 2000;
			} else if (promedio >= 7.5) {
				bono = 1000;
			} else if (promedio >= 6) {
				bono = 500;
			} else {
				bono = 0;
				System.out.println("Lo invitamos a estudiar mas en el próximo ciclo escolar.");
			}
		} else if (promedio >= 9) {
			bono = 3000;
		} else if (promedio >= 8) {
			bono = 2000;
		} else if (promedio >= 6) {

			bono = 100;
		} else {
			bono = 0;
			System.out.println("Lo invitamos a estudiar mas el próximo ciclo escolar");
		}

		System.out.print("El bono correspondiente es $" + bono);
	}
}
