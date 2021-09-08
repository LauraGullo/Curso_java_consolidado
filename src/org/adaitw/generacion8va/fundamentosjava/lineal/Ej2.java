/*Un estudiante realiza cuatro ex�menes durante el semestre, los cuales tienen la misma
ponderaci�n. Realice el pseudoc�digo y el diagrama de flujo que representen el algoritmo
correspondiente para obtener el promedio de las calificaciones obtenidas*/

package ejercicios1;

import java.util.Scanner;

public class Ej2 {

	private static final int CANT_EXAMENES = 4;

	public static void main(String[] args) {
		double promedio = 0;

		System.out.println("Ingrese la primer calificaci�n");
		Scanner sc = new Scanner(System.in);
		double primerCalificacion = sc.nextDouble();
		System.out.println("Ingrese la segunda calificaci�n");
		double segundaCalificacion = sc.nextDouble();
		System.out.println("Ingrese la tercer calificaci�n");
		double tercerCalificacion = sc.nextDouble();
		System.out.println("Ingrese la cuarta calificaci�n");
		double cuartaCalificacion = sc.nextDouble();

		promedio = (primerCalificacion + segundaCalificacion + tercerCalificacion + cuartaCalificacion) / CANT_EXAMENES;
		System.out.print("El resultado es: " + promedio);

	}
}