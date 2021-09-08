package ejercicios1;

import java.util.Scanner;

public class Ej_19 {

	public static void main(String[] args) {
		/*
		 * El hotel "Cama Arena" requiere determinar lo que le debe cobrar a un huésped
		 * por su //estancia en una de sus habitaciones. Realice un diagrama de flujo y
		 * pseudocódigo que //representen el algoritmo para determinar ese cobro.
		 */
		double cobroTotal=0;
		System.out.println("Ingrese los días que va a quedarse en el hotel");
		Scanner lector = new Scanner(System.in);
		int dias = lector.nextInt();
		System.out.println("Ingrese el precio de la habitación por día");
		double precioHabitacion = lector.nextDouble();
		cobroTotal = precioHabitacion * dias;
		System.out.print("El cobro total es $ " + cobroTotal);
	}
}
