package ejercicios2;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		/*
		 * Almacenes "El harapiento distinguido" tiene una promoci�n: a todos los trajes
		 * que tienen un precio superior a $2500.00 se les aplicar� un descuento de 15
		 * %, a todos los dem�s se les aplicar� s�lo 8%. Realice un algoritmo para
		 * determinar el  precio final que debe pagar una persona por comprar un
		 * traje y de cu�nto es el descuento que obtendr�
		 */
		final float DESCUENTO_MAYOR = 0.15f;
		final float DESCUENTO_MENOR = 0.08f;
		float precioFinal = 0;
		System.out.println("Ingrese el valor del traje");
		Scanner lector = new Scanner(System.in);
		float valorTraje = lector.nextFloat();
		if (valorTraje > 2500) {
			precioFinal = valorTraje - valorTraje * DESCUENTO_MAYOR;
		} else {
			precioFinal = valorTraje - valorTraje * DESCUENTO_MENOR;
		}
		System.out.print("El precio final del traje es $" + precioFinal);
	}
}
