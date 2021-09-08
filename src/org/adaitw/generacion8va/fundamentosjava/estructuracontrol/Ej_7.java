package ejercicios2;

import java.util.Scanner;

public class Ej_7 {

	public static void main(String[] args) {
		/*
		 * El presidente de la rep�blica ha decidido estimular a todos los estudiantes
		 * de una universidad mediante la asignaci�n de becas mensuales, para esto se
		 * tomar�n en consideraci�n los siguientes criterios: Para alumnos mayores de 18
		 * a�os con promedio mayor o igual a 9, la beca ser� de $2000.00; con promedio
		 * mayor o igual a 7.5, de $1000.00; para los promedios menores de 7.5 pero
		 * mayores o iguales a 6.0, de $500.00; a los dem�s se les enviar� una carta de
		 * invitaci�n incit�ndolos a que estudien m�s en el pr�ximo ciclo escolar. A los
		 * alumnos de 18 a�os o menores de esta edad, con promedios mayores o iguales a
		 * 9, se les dar� $3000; con promedios menores a 9 pero mayores o iguales a 8,
		 * $2000; para los alumnos con promedios menores a 8 pero mayores o iguales a 6,
		 * se les dar� $100, y a los alumnos que tengan promedios menores a 6 se les
		 * enviar� carta deinvitaci�n
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
				System.out.println("Lo invitamos a estudiar mas en el pr�ximo ciclo escolar.");
			}
		} else if (promedio >= 9) {
			bono = 3000;
		} else if (promedio >= 8) {
			bono = 2000;
		} else if (promedio >= 6) {

			bono = 100;
		} else {
			bono = 0;
			System.out.println("Lo invitamos a estudiar mas el pr�ximo ciclo escolar");
		}

		System.out.print("El bono correspondiente es $" + bono);
	}
}
