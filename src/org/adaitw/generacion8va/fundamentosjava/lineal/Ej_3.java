/*Una empresa que contrata personal requiere determinar la edad de las personas que
solicitan trabajo, pero cuando se les realiza la entrevista s�lo se les pregunta el a�o en
que nacieron.*/
package ejercicios1;

import java.util.Scanner;

public class Ej_3 {

	public static void main(String[] args) {
		int edad = 0;
		final int A�O_ACTUAL = 2021;
		System.out.println("Ingrese el a�o de su nacimiento");
		Scanner sc = new Scanner(System.in);
		int a�oNacimiento = sc.nextInt();

		edad = A�O_ACTUAL - a�oNacimiento;

		System.out.print("La edad del solicitante es: " + edad);
	}
}
