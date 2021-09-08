package ejercicios2;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		// Realice un algoritmo para determinar cuánto se debe pagar por equis cantidad
		// de lápices considerando que si son 1000 o más el
		// costo es de 85$; de lo contrario, el precio es de 90$.
		final int COSTO_X_MAYOR = 85;
		final int COSTO_X_MENOR = 90;
		int precioFinal = 0;
		System.out.println("Ingrese la cantidad de lapices que desea comprar");
		Scanner lector = new Scanner(System.in);
		int cantidadLapices = lector.nextInt();
		if (cantidadLapices >= 1000) {
			precioFinal = cantidadLapices * COSTO_X_MAYOR;
		} else {
			precioFinal = cantidadLapices * COSTO_X_MENOR;
		}
		System.out.print("El precio total es $" + precioFinal);
	}
}
