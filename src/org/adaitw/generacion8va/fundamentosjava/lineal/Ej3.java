//Se requiere conocer el �rea de un rect�ngulo.
package ejercicios1;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		double area = 0;

		System.out.println("Ingrese la altura del rect�ngulo");
		Scanner sc = new Scanner(System.in);
		double altura = sc.nextDouble();
		System.out.println("Ingrese la base del rect�ngulo");
		double base = sc.nextDouble();

		area = (altura * base);
		System.out.print("El �rea del rect�ngulo es: " + area);
	}
}
