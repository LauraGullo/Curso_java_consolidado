package ejercicios3;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		/*
		 * La empresa de transportes "The Big Old" cuenta con N choferes, de los cuales
		 * se conoce su nombre y los kilómetros que conducen durante cada día de la
		 * semana, esa información se guarda en un arreglo de N x 6. Se requiere un
		 * algoritmo que capture esa información y genere un vector con el total de
		 * kilómetros que recorrió cada chofer durante la semana. Realice el algoritmo y
		 * represéntelo mediante el diagrama de flujo y el pseudocódigo. Al final se
		 * debe presentar un reporte donde se muestre el nombre del chofer, los
		 * kilómetros recorridos cada día y el total de éstos
		 */

		int cantidadChoferes;
		String[] dias = { "lunes", "martes", "miércoles", "jueves", "viernes", "sábado" };

		System.out.println("Ingrese la cantidad de choferes");
		Scanner lector = new Scanner(System.in);
		cantidadChoferes = lector.nextInt();

		String nombre[] = new String[cantidadChoferes];
		int kmRecorridosDiarios[][] = new int[cantidadChoferes][6], kmRecorridosSemanal[] = new int[cantidadChoferes],
				i;

		for (i = 0; i < cantidadChoferes; i++) {
			System.out.println("Ingrese el nombre del chofer " + (i + 1));
			nombre[i] = lector.next();

			for (int e = 0; e < dias.length; e++) {
				System.out.println("Ingrese la cantidad de Km. recorridos el " + dias[e]);
				kmRecorridosDiarios[i][e] = lector.nextInt();
				kmRecorridosSemanal[i] = kmRecorridosSemanal[i] + kmRecorridosDiarios[i][e];
			}
		}
		
		for (i = 0; i <nombre.length ; i++) {
			System.out.println(
					"El total de los km recorridos en la semana por " + nombre[i] + " es " + kmRecorridosSemanal[i]);
		}
	}
}
