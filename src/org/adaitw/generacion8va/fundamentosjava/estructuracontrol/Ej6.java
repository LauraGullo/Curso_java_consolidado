package ejercicios2;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		/*
		 * La langosta ahumada" es una empresa dedicada a ofrecer banquetes; sus tarifas
		 * son las siguientes: el costo de platillo por persona es de $950.00, pero si
		 * el número de personas es mayor a 200 pero menor o igual a 300, el costo es de
		 * $850.00. Para más de 300 personas el costo por platillo es de $750.00. Se
		 * requiere un algoritmo que ayude a determinar el presupuesto que se debe
		 * presentar a los clientes que deseen realizar un evento.
		 */
		final int COSTO_BASE = 950;
		final int COSTO_MAYOR_200 = 850;
		final int COSTO_MAYOR_300 = 750;
		int presupuesto = 0;
		System.out.println("Ingrese la cantidad de comensales");
		Scanner lector = new Scanner(System.in);
		int comensales = lector.nextInt();
		if (comensales > 300) {
			presupuesto = comensales * COSTO_MAYOR_300;
		} else if (comensales > 200) {
			presupuesto = comensales * COSTO_MAYOR_200;
		} else {
			presupuesto = comensales * COSTO_BASE;
		}
		System.out.print("El presuupuesto es $" + presupuesto);
	}
}

	


