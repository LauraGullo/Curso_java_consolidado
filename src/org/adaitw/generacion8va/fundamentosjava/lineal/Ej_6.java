//Se requiere determinar la hipotenusa de un triángulo rectángulo.
package ejercicios1;

import java.util.Scanner;

public class Ej_6 {

	public static void main(String[] args) {
		double segundoCateto, hipotenusa, primerCateto;
		hipotenusa = 0;
		System.out.println("Ingrese el primer cateto");
		Scanner lector = new Scanner(System.in);
		primerCateto = lector.nextDouble();
		System.out.println("Ingrese el segundo cateto");
		segundoCateto = lector.nextDouble();
		hipotenusa = Math.sqrt(primerCateto * primerCateto + segundoCateto * segundoCateto);
		System.out.printf("EL valor de la hipotenusa es %.2f ", hipotenusa);
	}
}
