package ejercicios1;

import java.util.Scanner;

/*La compa��a de autobuses "La curva loca" requiere determinar el costo que tendr� el
boleto de un viaje sencillo, esto basado en los kil�metros por recorrer y en el costo por
kil�metro.*/ 
public class Ej_7 {

	public static void main(String[] args) {
		double costoTotal, costoKm, km;
		costoTotal = 0;
		System.out.println("Ingrese los Km a recorrer");
		Scanner lector = new Scanner(System.in);
		km = lector.nextDouble();
		System.out.println("Ingrese el costo por km");
		costoKm = lector.nextDouble();
		costoTotal = costoKm * km;

		System.out.print("El costo del boleto es: " + costoTotal);
	}
}
