package ejercicios2;

import java.util.Scanner;

public class Ej_5 {

	public static void main(String[] args) {
		// Se tiene el nombre y la edad de tres personas. Se desea saber el nombre y la
		// edad de la persona de menor edad.

		int edad1, edad2, edad3, menorEdad;
		String nombre1, nombre2, nombre3;

		System.out.println("Ingrese el primer nombre");
		Scanner lector = new Scanner(System.in);
		nombre1 = lector.next();
		System.out.println("Ingrese la edad correspondiente");
		edad1 = lector.nextInt();
		System.out.println("Ingrese el segundo nombre");
		nombre2 = lector.next();
		System.out.println("Ingrese la edad correspondiente");
		edad2 = lector.nextInt();
		System.out.println("Ingrese el tercer nombre");
		nombre3 = lector.next();
		System.out.println("Ingrese la edad correspondiente");
		edad3 = lector.nextInt();

		if (edad1 < edad2 && edad1 < edad3) {
			System.out.print("La persona de menor edad es: " + nombre1 + " " + edad1 + " años");
		} else if (edad2 < edad3) {
			System.out.print("La persona de menor edad es: " + nombre2 + " " + edad2 + " años");
		} else {
			System.out.print("La persona de menor edad es: " + nombre3 + " " + edad3 + " años");
		}
	}
}