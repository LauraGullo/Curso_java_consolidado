package ejercicios1;

import java.util.Scanner;

/*Se requiere determinar el costo que tendrá realizar una llamada telefónica con base en
el tiempo que dura la llamada y en el costo por minuto.*/
public class Ej_9y18 { 
	public static void main(String[] args) {
		System.out.println("Ingrese la duración de la llamada en minutos");
		Scanner lector = new Scanner(System.in);
		double duracion = lector.nextDouble();
		System.out.println("Ingrese el costo por minuto");
		double costoMinuto = lector.nextDouble();
		double costoTotal = costoMinuto * duracion;
		System.out.print("El costo de la llamada es " + costoTotal);
	}
}
