package ejercicios2;

import java.util.Scanner;

public class Ej13 {

	public static void main(String[] args) {

		/*
		 * F�bricas "El cometa" produce art�culos con claves (1, 2, 3, 4, 5 y 6). Se
		 * requiere un algoritmo para calcular los precios de venta, para esto hay que
		 * considerar lo siguiente: Costo de producci�n = materia prima + mano de obra +
		 * gastos de fabricaci�n. Precio de venta = costo de producci�n + 45 % de costo
		 * de producci�n. El costo de la mano de obra se obtiene de la siguiente forma:
		 * para los productos con clave 3 o 4 se carga 75 % del costo de la materia
		 * prima; para los que tienen clave 1 y 5 se carga 80 %, y para los que tienen
		 * clave 2 o 6, 85 %. Para calcular el gasto de fabricaci�n se considera que si
		 * el art�culo que se va a producir tiene claves 2 o 5, este gasto representa 30
		 * % sobre el costo de la materia prima; si las claves son 3 o 6, representa 35
		 * %; si las claves son 1 o 4, representa 28 %. La materia prima tiene el mismo
		 * costo para cualquier clave.
		 */

		double costoProduccion, materiaPrima, manoObra, gastoFabricacion, precioVenta;
		int claveArticulo;

		System.out.println("Ingrese el costo de la materia prima");
		Scanner lector = new Scanner(System.in);
		materiaPrima = lector.nextDouble();
		System.out.println("Ingrese la clave del art�culo: 1, 2, 3, 4, 5, � 6");
		claveArticulo = lector.nextInt();

		while (claveArticulo < 1 || claveArticulo > 6) {
			System.out.print("valor incorrecto. Ingrese valor nuevamente");
			claveArticulo = lector.nextInt();
		}

		if (claveArticulo == 3 || claveArticulo == 4) {
			manoObra = 0.75 * materiaPrima;
		} else if (claveArticulo == 1 || claveArticulo == 5) {
			manoObra = 0.8 * materiaPrima;
		} else {
			manoObra = 0.85 * materiaPrima;
		}

		if (claveArticulo == 2 || claveArticulo == 5) {
			gastoFabricacion = 0.30 * materiaPrima;
		} else if (claveArticulo == 3 || claveArticulo == 6) {
			gastoFabricacion = 0.35 * materiaPrima;
		} else {
			gastoFabricacion = 0.28 * materiaPrima;
		}

		costoProduccion = materiaPrima + manoObra + gastoFabricacion;
		precioVenta = costoProduccion * 0.45 + costoProduccion;
		System.out.print("El precio de venta es $" + precioVenta);
	}
}
