//Se requiere obtener la distancia entre dos puntos en el plano cartesiano, tal y como se muestra en la figura 1.4.
package ejercicios1;

import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {
		double catetoY = 0;
		double catetoX = 0;
		double distancia = 0;

		System.out.println("Ingrese abscisa 1");
		Scanner sc = new Scanner(System.in);
		double abscisa1 = sc.nextDouble();
		System.out.println("Ingrese abscisa 2");
		double abscisa2 = sc.nextDouble();
		System.out.println("Ingrese ordenada 1");
		double ordenada1 = sc.nextDouble();
		System.out.println("Ingrese ordenada 2");
		double ordenada2 = sc.nextDouble();

		catetoY = ordenada2 - ordenada1;
		catetoX = abscisa2 - abscisa1;
		distancia = Math.sqrt((catetoX * catetoX) + (catetoY * catetoY));

		System.out.print("La distancia entre los puntos es: " + distancia);
	}
}
