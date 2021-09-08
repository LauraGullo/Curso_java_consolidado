package ejercicios2;

import java.util.Scanner;

public class Ej_11 {

	public static void main(String[] args) {
		/*
		 * Se les dar� un bono por antig�edad a los empleados de una tienda. Si tienen
		 * un a�o, se les dar� $100; si tienen 2 a�os, $200, y as� sucesivamente hasta
		 * los 5 a�os. Para los que tengan m�s de 5, el bono ser� de $1000. Realice un
		 * algoritmo y repres�ntelo mediante el diagrama de flujo y el pseudoc�digo que
		 * permita determinar el bono que recibir� un trabajador.
		 */
		int antiguedad, bono = 0;

		System.out.println("Ingrese los a�os de antiguedad");
		Scanner lector = new Scanner(System.in);
		antiguedad = lector.nextInt();

		if (antiguedad > 5) {
			bono = 1000;
		} else if (antiguedad == 5) {
			bono = 500;
		} else if (antiguedad == 4) {
			bono = 400;
		} else if (antiguedad == 3) {
			bono = 300;
		} else if (antiguedad == 2) {
			bono = 200;
		} else {
			bono = 100;
		}

		/*
		 * otra forma mas simple de hacerlo: 
		 * if (antiguedad <= 5){ 
		 * 		bono = antiguedad*100; 
		 * }else{ 
		 * 		bono = 1000; 
		 * }
		 */

		System.out.print("El bono es $" + bono);
	}
}
