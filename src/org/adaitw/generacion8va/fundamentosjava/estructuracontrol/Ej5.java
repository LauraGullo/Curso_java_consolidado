package ejercicios2;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		// Se requiere determinar cuál de tres cantidades proporcionadas es la mayor.
		float mayorValor = 0;
		System.out.println("Ingrese el primer valor");
		Scanner lector = new Scanner(System.in);
		float primerValor = lector.nextFloat();
		System.out.println("Ingrese el segundo valor");
		float segundoValor = lector.nextFloat();
		System.out.println("Ingrese el tercer valor");
		float tercerValor = lector.nextFloat();
		if (primerValor > segundoValor && primerValor > tercerValor) {
			mayorValor = primerValor;
		} else if (segundoValor > tercerValor) {
			mayorValor = segundoValor;
		} else {
			mayorValor = tercerValor;
		}
		System.out.print("El mayor valor es: "+mayorValor);
	}
}
