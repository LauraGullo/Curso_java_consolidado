package ejercicios2;

import java.util.Scanner;

public class Ej_18 {

	public static void main(String[] args) {
		/*
		 * Realice un algoritmo y represéntelo mediante el diagrama de flujo, el
		 * pseudocódigo y el diagrama N/S que permitan determinar la cantidad del bono
		 * navideño que recibirá un empleado de una tienda, considerando que si su
		 * antigüedad es mayor a cuatro años o su sueldo es menor de dos mil pesos, le
		 * corresponderá 25 % de su sueldo, y en caso contrario sólo le corresponderá 20
		 * % de éste.
		 */

		int antiguedad;
		double sueldo, bono;

		System.out.println("Ingrese su sueldo");
		Scanner lector = new Scanner(System.in);
		sueldo = lector.nextDouble();
		System.out.println("Ingrese su antiguedad en años");
		antiguedad = lector.nextInt();

		if (antiguedad > 4 ||  sueldo<2000) {
			bono = sueldo * 0.25;
		} else {
			bono = sueldo * 0.2;
		}
		System.out.print("El bono que recibirá es $" + bono);
	}
}
