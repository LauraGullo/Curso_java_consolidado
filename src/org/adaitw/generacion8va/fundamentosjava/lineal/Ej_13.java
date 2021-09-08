package ejercicios1;

import java.util.Scanner;

public class Ej_13 {
	/*
	 * Realice un diagrama de flujo y pseudocódigo que representen el algoritmo para
	 * determinar cuánto dinero ahorra una persona en un año si considera que cada
	 * semana ahorra 15% de su sueldo (considere cuatro semanas por mes y que no
	 * cambia el sueldo).
	 */
	public static void main(String[] args) {
		double PORCENTAJE_AHORRO = 0.15;
		double ahorroSemanal = 0;
		double ahorroAnual=0;
		System.out.println("Ingrese el sueldo semanal");
		Scanner lector = new Scanner(System.in);
		double sueldoSemanal = lector.nextDouble();
		ahorroSemanal = sueldoSemanal * PORCENTAJE_AHORRO;
		ahorroAnual = (ahorroSemanal * 4) * 12;
		System.out.print("El ahorro anual es de " + ahorroAnual);
	}
}
