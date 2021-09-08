package ejercicios2;

import java.util.Scanner;

public class Ej_1 {

	public static void main(String[] args) {
		// Realice un algoritmo para determinar si una persona puede votar con base en
		// su edad en las próximas elecciones
		int edad;

		System.out.println("Ingrese su edad");
		Scanner lector = new Scanner(System.in);
		edad = lector.nextInt();
		
		String puedeVotar=(edad>=18)?"si":"no";
		
		System.out.print("Puede votar: "+puedeVotar);
		
		/*if (edad >= 18) {
			System.out.print("Puede votar");
		} else {
			System.out.print("No tiene edad para votar");
		}*/
	}
}
