package ejercicios2;

import java.util.Scanner;

public class Ej_3 {

	public static void main(String[] args) {
		/*
		 * El 14 de febrero una persona desea comprarle un regalo al ser querido que más
		 * aprecia en ese momento, su dilema radica en qué regalo puede hacerle, las
		 * alternativas que tiene son las siguientes: REGALO COSTO Tarjeta $10.00 o
		 * menos Chocolates $11.00 a $100.00 Flores $101.00 a $250.00 Anillo Más de
		 * $251.00 Se requiere un diagrama de flujo con el algoritmo que ayude a
		 * determinar qué regalo se le puede comprar a ese ser tan especial por el día
		 * del amor y la amistad
		 */
		double dinero;
		String regalo;

		System.out.println("Ingrese el dinero disponible para el regalo");
		Scanner lector = new Scanner(System.in);
		dinero = lector.nextDouble();

		if (dinero <= 10) {
			regalo = "tarjeta.";
		} else if (dinero <= 100) {
			regalo = "chocolates.";
		} else if (dinero <= 250) {
			regalo = "flores.";
		} else {
			regalo = "anillo.";
		}
		System.out.print("El regalo que puede comprar es: " + regalo);
	}
}
