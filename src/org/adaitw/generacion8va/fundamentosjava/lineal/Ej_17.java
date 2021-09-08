package ejercicios1;

import java.util.Scanner;

public class Ej_17 {

	public static void main(String[] args) {
		/*
		 * Realice el diagrama de flujo y pseudocódigo que representen el algoritmo para
		 * determinar el promedio que obtendrá un alumno considerando que realiza tres
		 * exámenes, de los cuales el primero y el segundo tienen una ponderación de
		 * 25%, mientras que el tercero de 50%.
		 */
		double promedio = 0;
		System.out.println("Ingrese el resultado del primer examen");
		Scanner lector = new Scanner(System.in);
		double primerExamen = lector.nextDouble();
		System.out.println("Ingrese el resultado del segundo examen");
		double segundoExamen = lector.nextDouble();
		System.out.println("Ingrese el resultado del tercer examen");
		double tercerExamen = lector.nextDouble();
		promedio = primerExamen * 0.25 + segundoExamen * 0.25 + tercerExamen * 0.5;
		System.out.print("El pomedio es " + promedio);
	}
}
