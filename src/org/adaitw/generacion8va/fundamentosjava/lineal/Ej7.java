/*Un productor de leche lleva el registro de lo que produce en litros, pero cuando entrega
le pagan en galones. Realice un algoritmo, y represéntelo mediante un diagrama de flujo y el
pseudocódigo, que ayude al productor a saber cuánto recibirá por la entrega de su producción
de un día (1 galón = 3.785 litros).*/
package ejercicios1;

import java.util.Scanner;

public class Ej7 {

	private static final int GALON_LITROS = 3785;

	public static void main(String[] args) {
		double ganancia = 0;
		double cantidadGalones = 0;

		System.out.println("Ingrese la cantidad de litros vendidos en un día");
		Scanner sc = new Scanner(System.in);
		double cantidadLitros = sc.nextInt();
		System.out.println("Ingrese el precio del galón");
		double precioGalon = sc.nextInt();

		cantidadGalones = cantidadLitros / GALON_LITROS;
		ganancia = cantidadGalones * precioGalon;

		System.out.print("La ganancia es: " + ganancia);
	}
}
