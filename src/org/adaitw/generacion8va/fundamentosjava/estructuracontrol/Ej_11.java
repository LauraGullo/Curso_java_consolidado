package ejercicios2;

import java.util.Scanner;

public class Ej_11 {

	public static void main(String[] args) {
		/*
		 * Se les dará un bono por antigüedad a los empleados de una tienda. Si tienen
		 * un año, se les dará $100; si tienen 2 años, $200, y así sucesivamente hasta
		 * los 5 años. Para los que tengan más de 5, el bono será de $1000. Realice un
		 * algoritmo y represéntelo mediante el diagrama de flujo y el pseudocódigo que
		 * permita determinar el bono que recibirá un trabajador.
		 */
		int antiguedad, bono = 0;

		System.out.println("Ingrese los años de antiguedad");
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
