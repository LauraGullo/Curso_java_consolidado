package ejercicios3;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		// Se tienen los nombres de los N alumnos de una escuela, además de su promedio
		// general. Realice un algoritmo para capturar esta
		// información, la cual se debe almacenar en arreglos, un vector para el nombre
		// y otro para el promedio, después de capturar la
		// información se debe ordenar con base en su promedio, de mayor a menor, los
		// nombres deben corresponder con los promedios.
		// Realice el algoritmo y represéntelo mediante el diagrama de flujo y el
		// pseudocódigo.

		int cantidadAlumnos, i;

		System.out.println("¿Cuantos alumnos desea ingresar?");
		Scanner lector = new Scanner(System.in);
		cantidadAlumnos = lector.nextInt();
		lector.nextLine();// <- Esto es porque me saltea el primer nombre y no se porque

		
		String temporalNombres, nombres[] = new String[cantidadAlumnos];
		float temporalPromedios, promedios[] = new float[cantidadAlumnos];

		
		for (i = 0; i < cantidadAlumnos; i++) {
			System.out.println("Escriba el nombre del alumno " + (i + 1)); 
			nombres[i] = lector.nextLine();
		}
		for (i = 0; i < cantidadAlumnos; i++) {

			System.out.println("Escriba el promedio del alumno " + (i + 1));
			promedios[i] = lector.nextFloat();
		}

		for (i = 0; i < cantidadAlumnos; i++) {
			for (int j = i + 1; j < cantidadAlumnos; j++) {
				if (promedios[j] > promedios[i]) {
					//Esta parte la saque de google pero no comprendo como funciona
					temporalPromedios = promedios[i];
					promedios[i] = promedios[j];
					promedios[j] = temporalPromedios;
					temporalNombres = nombres[j];
					nombres[i] = nombres[j];
					nombres[j] = temporalNombres;
				}
			}
		}
		for (i = 0; i < cantidadAlumnos; i++) {
			System.out.println(nombres[i] + ":" + promedios[i]);
		}
	}
}
