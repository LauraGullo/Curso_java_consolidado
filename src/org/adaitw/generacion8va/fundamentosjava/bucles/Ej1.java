package ejercicios3;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		// Se requiere obtener la suma de las cantidades contenidas en un arreglo de 10
		// elementos. Realice el algoritmo y represéntelo mediante el
		// diagrama de flujo y el pseudocódigo.

		int suma = 0, cantidades[] = new int[10];

		for (int i = 0; i < cantidades.length; i++) {
			System.out.println("Ingrese cantidad del elemento " + (i + 1));
			Scanner lector = new Scanner(System.in);
			cantidades[i] = lector.nextInt();
			suma += cantidades[i];
		}
		System.out.print("La suma de las cantidades es: " + suma);
	}
}
