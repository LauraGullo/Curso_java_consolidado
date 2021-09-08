//Realice un diagrama de flujo y pseudocódigo que representen el algoritmo para obtener el área de un triángulo.

package ejercicios1;

import java.util.Scanner;

public class Ej_1 {

	public static void main(String[] args) {
		int area = 0;

		System.out.println("Ingrese la altura del triángulo");
		Scanner sc = new Scanner(System.in);
		int altura = sc.nextInt();
		System.out.println("Ingrese la base del triángulo");
		int base = sc.nextInt();

		area = (altura * base) / 2;

		System.out.print("El área del triángulo es: " + area);
	}
}
