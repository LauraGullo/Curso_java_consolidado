/*Una empresa que contrata personal requiere determinar la edad de las personas que
solicitan trabajo, pero cuando se les realiza la entrevista sólo se les pregunta el año en
que nacieron.*/
package ejercicios1;

import java.util.Scanner;

public class Ej_3 {

	public static void main(String[] args) {
		int edad = 0;
		final int AÑO_ACTUAL = 2021;
		System.out.println("Ingrese el año de su nacimiento");
		Scanner sc = new Scanner(System.in);
		int añoNacimiento = sc.nextInt();

		edad = AÑO_ACTUAL - añoNacimiento;

		System.out.print("La edad del solicitante es: " + edad);
	}
}
