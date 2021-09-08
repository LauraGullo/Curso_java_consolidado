//Se desea implementar un algoritmo para obtener la suma de dos números cualesquiera.

package ejercicios1;

import java.util.Scanner;

public class Ej1 {
	public static void main(String[] args) {
		double resultado = 0;

		System.out.println("Ingrese el primer número");
		Scanner sc = new Scanner(System.in);
		double primerNumero = sc.nextDouble();
		System.out.println("Ingrese el segundo número");
		double segundoNumero = sc.nextDouble();

		resultado = primerNumero + segundoNumero;
		System.out.printf("El resultado es %.2f", resultado);
	}

}
