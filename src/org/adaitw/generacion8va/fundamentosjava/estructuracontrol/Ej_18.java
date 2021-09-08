package ejercicios2;

import java.util.Scanner;

public class Ej_18 {

	public static void main(String[] args) {
		/*
		 * Realice un algoritmo y repres�ntelo mediante el diagrama de flujo, el
		 * pseudoc�digo y el diagrama N/S que permitan determinar la cantidad del bono
		 * navide�o que recibir� un empleado de una tienda, considerando que si su
		 * antig�edad es mayor a cuatro a�os o su sueldo es menor de dos mil pesos, le
		 * corresponder� 25 % de su sueldo, y en caso contrario s�lo le corresponder� 20
		 * % de �ste.
		 */

		int antiguedad;
		double sueldo, bono;

		System.out.println("Ingrese su sueldo");
		Scanner lector = new Scanner(System.in);
		sueldo = lector.nextDouble();
		System.out.println("Ingrese su antiguedad en a�os");
		antiguedad = lector.nextInt();

		if (antiguedad > 4 ||  sueldo<2000) {
			bono = sueldo * 0.25;
		} else {
			bono = sueldo * 0.2;
		}
		System.out.print("El bono que recibir� es $" + bono);
	}
}
