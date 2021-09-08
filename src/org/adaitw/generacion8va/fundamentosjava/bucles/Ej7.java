package ejercicios3;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		/*
		 * La empresa de transportes "The Big Old" cuenta con N choferes, de los cuales
		 * se conoce su nombre y los kil�metros que conducen durante cada d�a de la
		 * semana, esa informaci�n se guarda en un arreglo de N x 6. Se requiere un
		 * algoritmo que capture esa informaci�n y genere un vector con el total de
		 * kil�metros que recorri� cada chofer durante la semana. Realice el algoritmo y
		 * repres�ntelo mediante el diagrama de flujo y el pseudoc�digo. Al final se
		 * debe presentar un reporte donde se muestre el nombre del chofer, los
		 * kil�metros recorridos cada d�a y el total de �stos
		 */

		int cantidadChoferes;
		String[] dias = { "lunes", "martes", "mi�rcoles", "jueves", "viernes", "s�bado" };

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
