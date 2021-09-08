package ejercicios2;

import java.util.Scanner;

public class Ej_15 {

	public static void main(String[] args) {
		// Realice un algoritmo que, con base en un número proporcionado (1-7), indique
		// el día de la semana que le corresponde (L-D).
		int numero;
		String dia = null;

		System.out.println("Ingrese el número (1-7)");
		Scanner lector = new Scanner(System.in);
		numero = lector.nextInt();

		while (numero < 1 || numero > 7) {
			System.out.println("valor incorrecto. Ingrese valor nuevamente");
			numero = lector.nextInt();
		}

		switch (numero) {
		case 1:
			dia = "lunes";
			break;
		case 2:
			dia = "martes";
			break;
		case 3:
			dia = "miercoles";
			break;
		case 4:
			dia = "jueves";
			break;
		case 5:
			dia = "viernes";
			break;
		case 6:
			dia = "sábado";
			break;
		default:
			dia = "domingo";
			break;
		}
		
	/*otra opcion es hacerlo con if:	
	 * if (numero == 1) {
			dia = "lunes";
		} else if (numero == 2) {
			dia = "martes";
		} else if (numero == 3) {
			dia = "miércoles";
		} else if (numero == 4) {
			dia = "jueves";
		} else if (numero == 5) {
			dia = "viernes";
		} else if (numero == 6) {
			dia = "sábado";
		} else {
			dia = "domingo";
		}*/
		
	System.out.print("El día de la semana que le corresponde es " + dia);
	}
}
