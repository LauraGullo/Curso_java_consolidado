//Realice un diagrama de flujo y pseudoc�digo que representen el algoritmo para obtener el �rea de un tri�ngulo.

package ejercicios1;

import java.util.Scanner;

public class Ej_1 {

	public static void main(String[] args) {
		int area = 0;

		System.out.println("Ingrese la altura del tri�ngulo");
		Scanner sc = new Scanner(System.in);
		int altura = sc.nextInt();
		System.out.println("Ingrese la base del tri�ngulo");
		int base = sc.nextInt();

		area = (altura * base) / 2;

		System.out.print("El �rea del tri�ngulo es: " + area);
	}
}
