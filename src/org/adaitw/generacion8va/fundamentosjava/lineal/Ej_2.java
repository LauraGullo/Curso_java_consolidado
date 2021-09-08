package ejercicios1;

import java.util.Scanner;

public class Ej_2 {

	public static void main(String[] args) {
		/*
		 * Una empresa importadora desea determinar cuántos dólares puede adquirir con
		 * equis cantidad de dinero mexicano.
		 */
		double cantidadDolares = 0;
		System.out.print("Ingrese la cantidad de pesos mexicanos");
		Scanner lector = new Scanner(System.in);
		double cantidadPesos = lector.nextDouble();
		System.out.println("Ingrese el valor del dólar en pesos mexicanos");
		double valorDolar = lector.nextDouble();
		cantidadDolares = cantidadPesos / valorDolar;
		System.out.print("La cantidad de dólares que se pueden adquirir es " + cantidadDolares);
	}
}
