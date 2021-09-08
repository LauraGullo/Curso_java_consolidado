//Se requiere determinar el sueldo semanal de un trabajador con base en las horas que trabaja y el pago por hora que recibe.
package ejercicios1;

import java.util.Scanner;

public class Ej9 {

	public static void main(String[] args) {
		double sueldoSemanal = 0;

		System.out.println("Ingrese la cantidad de horas trabajadas en la semana");
		Scanner sc = new Scanner(System.in);
		double horasTrabajadas = sc.nextDouble();
		System.out.println("Ingrese el pago por hora");
		double pagoHora = sc.nextDouble();

		sueldoSemanal = horasTrabajadas * pagoHora;

		System.out.print("El sueldo semanal es: " + sueldoSemanal);
	}
}
