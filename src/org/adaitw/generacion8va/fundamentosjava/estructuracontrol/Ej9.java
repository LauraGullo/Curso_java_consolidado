package ejercicios2;

import java.util.Scanner;

public class Ej9 {

	public static void main(String[] args) {
		/*
		 * se realiza una llamada, el cobro es por el tiempo que ésta dura, de tal forma
		 * que los primeros cinco minutos cuestan $ 1.00 c/u, los siguientes tres, 80¢
		 * c/u, los siguientes dos minutos, 70¢ c/u, y a partir del décimo minuto, 50¢
		 * c/u. Además, se carga un impuesto de 5% cuando es domingo, y si es día hábil,
		 * en turno matutino, 15%, y en turno vespertino, 10%. Realice un algoritmo para
		 * determinar cuánto debe pagar por cada concepto una persona que realiza una
		 * llamada.
		 */

		double duracionLlamada, costoBase, impuesto, costoTotal;
		int dia, turno;

		System.out.println("Ingrese la duración de la llamada en minutos");
		Scanner lector = new Scanner(System.in);
		duracionLlamada = lector.nextFloat();

		if (duracionLlamada <= 5) {
			costoBase = duracionLlamada;
		} else if (duracionLlamada <= 8) {
			costoBase = (duracionLlamada - 5) * 0.8 + 5;
		} else if (duracionLlamada <= 10) {
			costoBase = (duracionLlamada - 8) * 0.7 + 7.4;
		} else {
			costoBase = (duracionLlamada - 10) * 0.5 + 8.8;
		}
		System.out.println("Indique el día: 1_Día hábil, 2_Domingo");
		dia = lector.nextInt();

		if (dia == 2) {
			impuesto = costoBase * 0.05;
		} else
			System.out.println("Indique el turno de la llamada: 1_Matutino, 2_Vespertino");
		turno = lector.nextInt();

		if (turno == 1) {
			impuesto = costoBase * 0.15;
		} else {
			impuesto = costoBase * 0.10;
		}

		costoTotal = costoBase + impuesto;
		System.out.print("El costo total de la llamada es $" + costoTotal);
	}
}
