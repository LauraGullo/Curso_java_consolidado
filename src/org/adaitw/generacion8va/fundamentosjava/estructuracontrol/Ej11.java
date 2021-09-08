package ejercicios2;

import java.util.Scanner;

public class Ej11 {

	public static void main(String[] args) {
		/*
		 * "El náufrago satisfecho" ofrece hamburguesas sencillas, dobles y triples, las
		 * cuales tienen un costo de $20.00, $25.00 y $28.00 respectivamente. La empresa
		 * acepta tarjetas de crédito con un cargo de 5 % sobre la compra. Suponiendo
		 * que los clientes adquieren sólo un tipo de hamburguesa, realice un algoritmo
		 * para determinar cuánto debe pagar una persona por N hamburguesas.
		 */

		double cargoTarjeta, costoTotal;
		int costoHamburguesa, nHamburguesas, tipoHamburguesa, tipoPago;

		System.out.println("Ingrese la cantidad de hamburguesas que desea comprar");
		Scanner lector = new Scanner(System.in);
		nHamburguesas = lector.nextInt();

		System.out.println("Seleccione el tipo de hamburguesa: 1_Sencilla, 2_Doble, 3_Triple");
		tipoHamburguesa = lector.nextInt();

		while (tipoHamburguesa<1 || tipoHamburguesa>3) {
			System.out.println("Valor incorrecto. Ingrese nuevamente el tipo de hamburguesa");
			tipoHamburguesa=lector.nextInt();
		}
		
		if (tipoHamburguesa == 1) {
			costoHamburguesa = 20;

		} else if (tipoHamburguesa == 2) {
			costoHamburguesa = 25;

		} else {
			costoHamburguesa = 28;
		}
		System.out.println("Seleccione tipo de pago: 1_Efvo. 2_Tarjeta");
		tipoPago = lector.nextInt();

		if (tipoPago == 1) {
			cargoTarjeta = 0;
		} else {
			cargoTarjeta = (nHamburguesas * costoHamburguesa) * 0.05;
		}

		costoTotal = costoHamburguesa * nHamburguesas + cargoTarjeta;

		System.out.print("El costo total es: $" + costoTotal);
	}
}
