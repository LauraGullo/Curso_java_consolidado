package ejercicios2;

import java.util.Scanner;

public class Ej_16 {

	public static void main(String[] args) {
		/*
		 * El secretario de educaci�n ha decidido otorgar un bono por desempe�o a todos
		 * los profesores con base en la puntuaci�n siguiente: Puntos Premio 0 - 100 1
		 * salario, 101 - 150 2 salarios m�nimos, 151 - en adelante 3 salarios m�nimos,
		 * Realice un algoritmo que permita determine el monto de bono que percibir� un
		 * profesor (debe capturar el valor del salario m�nimo y los puntos del
		 * profesor).
		 */
		int puntos;
		double salario, bono;

		System.out.println("Ingrese el salario m�nimo");
		Scanner lector = new Scanner(System.in);
		salario = lector.nextDouble();
		System.out.println("Ingrese los puntos obtenidos");
		puntos = lector.nextInt();
		while (puntos < 0) {
			System.out.print("valor incorrecto. Ingrese valor nuevamente");
			puntos = lector.nextInt();
		}

		if (puntos <= 100) {
			bono = salario;
		} else if (puntos <= 150) {
			bono = salario * 2;
		} else {
			bono = salario * 3;
		}
		System.out.print("El bono que le corresponde por " + puntos + " puntos es $" + bono);
	}
}
