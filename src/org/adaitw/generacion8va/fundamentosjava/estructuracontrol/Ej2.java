package ejercicios2;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		// Realice un algoritmo para determinar si un número es positivo o negativo
		System.out.print("Ingrese un número");
		Scanner lector = new Scanner(System.in);
		float numero = lector.nextFloat();
		if (numero > 0) {
			System.out.print("El número ingresado es positivo");
		} else {
			System.out.print("El número ingresado es negativo");
		}
	}
}
