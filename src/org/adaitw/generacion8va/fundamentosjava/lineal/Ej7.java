/*Un productor de leche lleva el registro de lo que produce en litros, pero cuando entrega
le pagan en galones. Realice un algoritmo, y repres�ntelo mediante un diagrama de flujo y el
pseudoc�digo, que ayude al productor a saber cu�nto recibir� por la entrega de su producci�n
de un d�a (1 gal�n = 3.785 litros).*/
package ejercicios1;

import java.util.Scanner;

public class Ej7 {

	private static final int GALON_LITROS = 3785;

	public static void main(String[] args) {
		double ganancia = 0;
		double cantidadGalones = 0;

		System.out.println("Ingrese la cantidad de litros vendidos en un d�a");
		Scanner sc = new Scanner(System.in);
		double cantidadLitros = sc.nextInt();
		System.out.println("Ingrese el precio del gal�n");
		double precioGalon = sc.nextInt();

		cantidadGalones = cantidadLitros / GALON_LITROS;
		ganancia = cantidadGalones * precioGalon;

		System.out.print("La ganancia es: " + ganancia);
	}
}
