/*Un estudiante realiza cuatro exámenes durante el semestre, los cuales tienen la misma
ponderación. Realice el pseudocódigo y el diagrama de flujo que representen el algoritmo
correspondiente para obtener el promedio de las calificaciones obtenidas*/

package ejercicios1;

import java.util.Scanner;

public class Ej2 {

	private static final int CANT_EXAMENES = 4;

	public static void main(String[] args) {
		double promedio = 0;

		System.out.println("Ingrese la primer calificación");
		Scanner sc = new Scanner(System.in);
		double primerCalificacion = sc.nextDouble();
		System.out.println("Ingrese la segunda calificación");
		double segundaCalificacion = sc.nextDouble();
		System.out.println("Ingrese la tercer calificación");
		double tercerCalificacion = sc.nextDouble();
		System.out.println("Ingrese la cuarta calificación");
		double cuartaCalificacion = sc.nextDouble();

		promedio = (primerCalificacion + segundaCalificacion + tercerCalificacion + cuartaCalificacion) / CANT_EXAMENES;
		System.out.print("El resultado es: " + promedio);

	}
}