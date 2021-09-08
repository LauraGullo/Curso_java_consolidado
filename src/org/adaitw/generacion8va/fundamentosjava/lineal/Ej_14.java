package ejercicios1;

import java.util.Scanner;

public class Ej_14 {

	public static void main(String[] args) {
		/*
		 * Una empresa desea determinar el monto de un cheque que debe proporcionar a
		 * uno de sus empleados que tendrá que ir por equis número de días a la ciudad
		 * de Monterrey; los gastos que cubre la empresa son: hotel, comida y 100.00
		 * pesos diarios para otros gastos. El monto debe estar desglosado para cada
		 * concepto.
		 */
		int OTROS = 100, gastoOtros = 0;
		float gastoTotal = 0;
		float gastoComida = 0;
		float gastoHotel = 0;

		System.out.print("Ingrese la cantidad de días que se quedará en la ciudad");
		Scanner lector = new Scanner(System.in);
		int dias = lector.nextInt();
		System.out.println("Ingrese el costo del hotel por día");
		float hotel = lector.nextFloat();
		System.out.println("Ingrese el gasto de comida por día");
		float comida = lector.nextFloat();
		gastoComida = comida * dias;
		gastoOtros = OTROS * dias;
		gastoHotel = hotel * dias;
		gastoTotal = gastoComida + gastoOtros + gastoHotel;
		System.out.print("El monto total del cheque es $" + gastoTotal + "\nGasto comida: $" + gastoComida
				+ "\nGasto hotel: $" + gastoHotel + "\n" + "Otros gastos: $" + gastoOtros);
	}
}
