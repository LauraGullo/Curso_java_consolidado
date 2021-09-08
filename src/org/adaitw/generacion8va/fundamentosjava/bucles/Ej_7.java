package ejercicios3;

import java.util.Scanner;

public class Ej_7 {
	// 7. Realice un algoritmo que lea un vector y a partir de él forme un segundo
	// vector, de tal forma que el primer elemento pase a ser
	// el segundo, el segundo pase a ser el tercero, el último pase a ser el
	// primero, y así sucesivamente. Represéntelo mediante un diagrama de
	// flujo.
	public static void main(String[] args) {

		int i, n;
		Scanner lector=new Scanner(System.in);

		System.out.println("Ingrese la cantidad de elementos del vector:");
        n = lector.nextInt();
        
        int vector[] = new int[n], nuevoVector[] = new int[n];
        
		for (i = 0; i < n; i++) {
            System.out.println("Introduzca el valor del elemento "+(i+1));
            vector[i] = lector.nextInt();
			
			if (i == n-1) {
				nuevoVector[0] = vector[i];
			} else {
				nuevoVector[i + 1] = vector[i];
			}
		}

		for (i = 0; i < n; i++) {
			System.out.print("Posición " + (i + 1) + ": " + nuevoVector[i] + "\n");
		}
	}
}
	

