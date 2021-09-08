package ejercicios3;

import java.util.Scanner;

public class Ej2_9 {

	public static void main(String[] args) {
		// Se requiere un algoritmo para obtener un vector (C) de N elementos que
		// contenga la suma de los elementos correspondientes de otros
		// dos vectores (A y B). Represéntelo mediante el diagrama de flujo y el
		// pseudocódigo.
		int elementos=0; 

		System.out.println("Cuantos elementos hay en los vectores?");
		Scanner lector = new Scanner(System.in);
		 elementos = lector.nextInt();

		int vectorA[] = new int[elementos], vectorB[] = new int[elementos], i, vectorC[] = new int[elementos];
 		 
		for (i = 0; i < elementos; i++) {
			System.out.println("Ingresar el valor del elemento " + (i + 1) + " del vector A");
			vectorA[i] = lector.nextInt();
			System.out.println("Ingresar el valor del elemento " + (i + 1) + " del vector B");
			vectorB[i] = lector.nextInt();
		}
		for (i = 0; i < elementos; i++) {
			vectorC[i] = vectorA[i] + vectorB[i];
			System.out.println("Vector C elemento " + (i + 1) + ": " + vectorC[i]+"\n");
		}
	}
}
