/*Un estacionamiento requiere determinar el cobro que debe aplicar a las personas que lo
utilizan. Considere que el cobro es con base en las horas que lo disponen y que las
fracciones de hora se toman como completas*/
package ejercicios1;

import java.util.Scanner;

public class Ej_4 {

	public static void main(String[] args) {
		int horas;
		double precioHora, cobro;
		System.out.println("Ingrese la cantidad de horas que utilizó el estacionamiento");
		Scanner lector = new Scanner(System.in);
		horas = lector.nextInt();
		System.out.println("Ingrese el precio por hora");
		precioHora = lector.nextDouble();
		cobro = precioHora * horas;
		System.out.print("El cobro que se debe aplicar es: " + cobro);
	}
}
