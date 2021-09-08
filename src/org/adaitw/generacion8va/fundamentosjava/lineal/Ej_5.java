//Pinturas "La brocha gorda" requiere determinar cuánto cobrar por trabajos de pintura.Considere que se cobra por m2 
package ejercicios1;

import java.util.Scanner;

public class Ej_5 {

	public static void main(String[] args) {
		double costo, m2, cobro;
		cobro = 0;
		System.out.println("Ingrese los M2 a pintar");
		Scanner lector = new Scanner(System.in);
		m2 = lector.nextDouble();
		System.out.println("Ingrese el costo por m2");
		costo = lector.nextDouble();
		cobro = costo * m2;
		System.out.printf("El cobro total es: %.2f", cobro);

	}

}
