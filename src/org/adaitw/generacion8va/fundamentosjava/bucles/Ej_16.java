package ejercicios3;

import java.util.Scanner;

public class Ej_16 {

	public static void main(String[] args) {
		// 16. Una compañía de transporte cuenta con cinco choferes, de los cuales se
		// conoce: nombre, horas trabajadas cada día de la semana (seis días) y sueldo
		// por hora. Realice un algoritmo que:
		// a. Calcule el total de horas trabajadas a la semana para cada trabajador.
		// b. Calcule el sueldo semanal para cada uno de ellos.
		// c. Calcule el total que pagará la empresa.
		// d. Indique el nombre del trabajador que labora más horas el día lunes.
		// e. Imprima un reporte con todos los datos anteriores.
		float sueldoXHora, pagoTotal = 0;
		int i, e, j = 0;

		String nombre[] = new String[5];
		float horasTrabajadasDiarias[][] = new float[5][6];
		float horasTrabajadasSemanal[] = new float[5];
		float sueldoSemanal[] = new float[5];
		String dias[] = { "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"};

		System.out.print("Ingrese el sueldo por hora $: ");
		Scanner lector = new Scanner(System.in);
		sueldoXHora = lector.nextFloat();
		lector.nextLine();

		for (i = 0; i < 5; i++) {
			System.out.print("Ingrese el nombre del chofer " + (i + 1)+": ");
			nombre[i] = lector.nextLine();

			for (e = 0; e < 5; e++) {
				System.out.print("Ingrese la cantidad de horas trabajadas el " + dias[e]+ ": ");
				horasTrabajadasDiarias[i][e] = lector.nextFloat();
				horasTrabajadasSemanal[i] += horasTrabajadasDiarias[i][e];
				sueldoSemanal[i] = horasTrabajadasSemanal[i] * sueldoXHora;
			}
		
			lector.nextLine();
		
		}
		for (i = 0; i < 5; i++) {
			pagoTotal += sueldoSemanal[i];

			System.out.println(
					"El total de las horas semanales trabajadas por " + nombre[i] + " es " + horasTrabajadasSemanal[i]);
			System.out.print("El sueldo semanal de " + nombre[i] + " es " + sueldoSemanal[i]);

			if (horasTrabajadasDiarias[i][0] > horasTrabajadasDiarias[j][0]) {
				j = i;
			}
		}
		System.out.println("El pago total que debe hacer la empresa es: " + pagoTotal);
		System.out.print("El trabajador que mas labora el lunes es: " + nombre[j]);
	}
}
