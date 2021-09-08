//Se requiere determinar el tiempo que tarda una persona en llegar de una ciudad a otra en bicicleta, considerando que lleva una velocidad constante.
package ejercicios1;

import java.util.Scanner;

public class Ej_8 {

	public static void main(String[] args) {
		int kmXH;
		double distancia, tiempo;
		tiempo = 0;
		System.out.println("Ingrese la velocidad en km/h");
		Scanner lector = new Scanner(System.in);
		kmXH = lector.nextInt();
		System.out.println("Ingrese la distancia en Km hasta la ciudad");
		distancia = lector.nextDouble();
		tiempo = distancia / kmXH;
		System.out.print("El tiempo en llegar de una ciudad a otra en bicleta es " + tiempo + " horas");
	}
}
