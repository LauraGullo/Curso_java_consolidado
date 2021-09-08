package ejercicios1;

import java.util.Scanner;

public class Ej_16 {

	public static void main(String[] args) {
		// Realice el diagrama de flujo y pseudocódigo que representen el algoritmo para
		// encontrar el área de un cuadrado
		double area = 0;
		System.out.println("Ingrese el valor de un lado del cuadrado");
		Scanner lector = new Scanner(System.in);
		double lado = lector.nextDouble();
		area = lado * lado;
		System.out.print("El área del cuadrado es " + area);
	}
}
