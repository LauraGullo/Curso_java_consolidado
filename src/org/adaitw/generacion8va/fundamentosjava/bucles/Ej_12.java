package ejercicios3;

public class Ej_12 {

	public static void main(String[] args) {
		// 12. Se tiene en un arreglo cien (yo lo hice con 10) elementos representando calificaciones de los
		// estudiantes de una escuela.
		// Realice un algoritmo que lea el arreglo y calcule la calificación promedio
		// del grupo, además, que cuente los estudiantes que obtuvieron
		// calificaciones arriba del promedio del grupo. Represéntelo mediante diagrama
		// de flujo y pseudocódigo.
		
		float suma=0, promedio=0;
		int arribaDelPromedio=0;
		int calificaciones[]=new int [10];
		calificaciones[0] = 1;
		calificaciones[1] = 7;
		calificaciones[2] = 8;
		calificaciones[3] = 7;
		calificaciones[4] = 8;
		calificaciones[5] = 6;
		calificaciones[6] = 7;
		calificaciones[7] = 8;
		calificaciones[8] = 7;
		calificaciones[9] = 10;
		
		int i;
		for (i = 0; i < 10; i++) {
			suma += calificaciones[i];
		}

		promedio = suma / calificaciones.length;

		for (i = 0; i < 10; i++) {
			if (calificaciones[i] > promedio) {
				arribaDelPromedio ++;
			}
		}

		System.out.println("El promedio delas calificaciones es: " + promedio);
		System.out.print("La cantidad de estudiantes que obtuvieron calificaciones arriba del promedio es: "
				+ arribaDelPromedio);
	}
}
