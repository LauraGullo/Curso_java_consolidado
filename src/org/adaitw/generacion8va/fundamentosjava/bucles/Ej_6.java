package ejercicios3;

import java.util.Scanner;

public class Ej_6 {

	public static void main(String[] args) {

		// 6. Realice y represente mediante diagrama de flujo y pseudocódigo un
		// algoritmo que lea los nombres y las edades de diez alumnos, y
		// que los datos se almacenen en dos vectores, y con base en esto se determine
		// el nombre del alumno con la edad mayor del arreglo.

		String nombres[] = new String[10];
		int edades[] = new int[10];
		int posicion = 0, mayorEdad = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println("Ingrese nombre y edad del alumno " + (i + 1) + ": ");
			Scanner lector = new Scanner(System.in);
			nombres[i] = lector.nextLine();
			edades[i] = lector.nextInt();
		}

		for (int i = 0; i < 10; i++) {
			if (edades[i] > mayorEdad) {
				mayorEdad = edades[i];

				posicion = i;
			}
		}

		System.out.print("El alumno de mayor edad es " + nombres[posicion]);
	}
}
