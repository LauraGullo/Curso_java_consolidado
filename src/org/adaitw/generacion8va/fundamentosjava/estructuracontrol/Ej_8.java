package ejercicios2;

import java.util.Scanner;

public class Ej_8 {

	public static void main(String[] args) {
		/*
		 * Cierta empresa proporciona un bono mensual a sus trabajadores, el cual puede
		 * ser por su antig�edad o bien por el monto de su sueldo (el que sea mayor), de
		 * la siguiente forma: Cuando la antig�edad es mayor a 2 a�os pero menor a 5, se
		 * otorga 20 % de su sueldo; cuando es de 5 a�os o m�s, 30 %. Ahora bien, el
		 * bono por concepto de sueldo, si �ste es menor a $1000, se da 25 % de �ste,
		 * cuando �ste es mayor a $1000, pero menor o igual a $3500, se otorga 15% de su
		 * sueldo, para m�s de $3500. 10%. Realice el algoritmo correspondiente para
		 * calcular los dos tipos de bono, asignando el mayor y repres�ntelo con un
		 * diagrama de flujo y pseudoc�digo
		 */
		double bonoAntiguedad, bonoSueldo, antiguedad, sueldo;

		System.out.println("Ingrese su antiguedad en a�os");
		Scanner lector = new Scanner(System.in);
		antiguedad = lector.nextDouble();
		System.out.println("Ingrese su sueldo");
		sueldo = lector.nextDouble();
		if (antiguedad >= 5) {
			bonoAntiguedad = sueldo * 0.3;
		} else if (antiguedad > 2) {
			bonoAntiguedad = sueldo * 0.20;
		} else {
			bonoAntiguedad = 0;
		}
		if (sueldo < 1000) {
			bonoSueldo = sueldo * 0.25;
		} else if (sueldo < 3500) {
			bonoSueldo = 0.15 * sueldo;
		} else {
			bonoSueldo = 0.1 * sueldo;
		}
		if (bonoAntiguedad > bonoSueldo) {
			System.out.print("El bono correspondiente es $" + bonoAntiguedad);
		} else {
			System.out.print("El bono correspondiente es $" + bonoSueldo);
		}
	}
}
