//Se requiere obtener el �rea de una circunferencia.

package ejercicios1;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {

		final double PI = 3.14;

		double area = 0;

		System.out.println("Ingrese el radio de la circunferencia");
		Scanner sc = new Scanner(System.in);
		double radio = sc.nextDouble();

		area = radio * radio * PI;
		System.out.print("El �rea de la circunferencia es: " + area);
	}
}
