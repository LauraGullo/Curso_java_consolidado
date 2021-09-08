package ejercicios2;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		// Se desea implementar un algoritmo para determinar cuál de dos valores
		// proporcionados es el mayor
		System.out.println("Ingrese el primer valor");
		Scanner lector = new Scanner(System.in);
		float primerValor = lector.nextFloat();
		System.out.println("Ingrese el segundo valor");
		float segundoValor = lector.nextFloat();
		if (primerValor > segundoValor) {
			System.out.print("El primer valor es el mayor");
		} else {
			System.out.print("El segundo valor es el mayor");
		}
	}
}
