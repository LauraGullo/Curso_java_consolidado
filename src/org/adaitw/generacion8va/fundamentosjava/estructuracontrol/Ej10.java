package ejercicios2;

import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {
		/*
		 * Una compañía de viajes cuenta con tres tipos de autobuses (A, B y C), cada
		 * uno tiene un precio por kilómetro recorrido por persona, los costos
		 * respectivos son $2.0, $2.5 y $3.0. Se requiere determinar el costo total y
		 * por persona del viaje considerando que cuando éste se presupuesta debe haber
		 * un mínimo de 20 personas, de lo contrario el cobro se realiza con base en
		 * este número límite.
		 */

		double km, costoKm=0, costoPersona, costoTotal;
		int personas;

		System.out.println("Ingrese los km del recorrido");
		Scanner lector = new Scanner(System.in);
		km = lector.nextDouble();
		System.out.println("Ingrese cantidad de personas");
		personas = lector.nextInt();

		System.out.println("Seleccione el tipo de autobus: A, B o C");
		String tipoAutobus = lector.next();
		
		if (tipoAutobus.equals("a")) {
			costoKm = 2;
		} else if (tipoAutobus.equals("b")) {
			costoKm = 2.5;
		} else if (tipoAutobus.equals("c")) {
			costoKm = 3;
		} else {
			System.out.println("El tipo de autobus es incorrecto");
		}
		

		if (personas < 20) {
			costoTotal = costoKm * 20 * km;
		} else {
			costoTotal = costoKm * personas * km;
		}

		costoPersona = costoTotal / personas;

		System.out.println("El costo por persona es $" + costoPersona);
		System.out.print("El costo total es $" + costoTotal);
	}
}
