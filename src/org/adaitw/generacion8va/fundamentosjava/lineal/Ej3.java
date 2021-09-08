//Se requiere conocer el área de un rectángulo.
package ejercicios1;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		double area = 0;

		System.out.println("Ingrese la altura del rectángulo");
		Scanner sc = new Scanner(System.in);
		double altura = sc.nextDouble();
		System.out.println("Ingrese la base del rectángulo");
		double base = sc.nextDouble();

		area = (altura * base);
		System.out.print("El área del rectángulo es: " + area);
	}
}
