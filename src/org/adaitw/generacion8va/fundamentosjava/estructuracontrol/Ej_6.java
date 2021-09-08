package ejercicios2;

import java.util.Scanner;

public class Ej_6 {

	public static void main(String[] args) {
		/*
		 * Realice el diagrama de flujo y el pseudocódigo que muestren el algoritmo para
		 * determinar el costo y el descuento que tendrá un artículo. Considere que si
		 * su precio es mayor o igual a $200 se le aplica un descuento de 15%, y si su
		 * precio es mayor a $100 pero menor a $200, el descuento es de 12%, y si es
		 * menor a $100, sólo 10%
		 */
		double costoTotal, descuento, precio;

		System.out.println("Ingrese el precio del producto");
		Scanner lector = new Scanner(System.in);
		precio = lector.nextDouble();

		if (precio >= 200) {
			descuento = 0.15 * precio;
		} else if (precio >= 100) {
			descuento = 0.12 * precio;
		} else {
			descuento = 0.1 * precio;
		}

		costoTotal = precio - descuento;
		System.out.println("El descuento es $" + descuento);
		System.out.print("El costo total del producto es $" + costoTotal);

	}
}
