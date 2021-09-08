package ejercicios2;

import java.util.Scanner;

public class EJ7 {

	public static void main(String[] args) {
		/*
		 * La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al
		 * kilo de uva, la cual se clasifica en tipos A y B, y adem�s en tama�os 1 y 2.
		 * Cuando se realiza la venta del producto, �sta es de un solo tipo y tama�o, se
		 * requiere determinar cu�nto recibir� un productor por la uva que entrega en un
		 * embarque, considerando lo siguiente: si es de tipo A, se le cargan 20$ al
		 * precio inicial cuando es de tama�o 1; y 30$ si es de tama�o 2. Si es de tipo
		 * B, se rebajan 30$ cuando es de tama�o 1, y 50$ cuando es de tama�o 2
		 */

		float kilos, precioInicial, ganancia = 0;
		int tama�o, tipo;

		System.out.println("Ingrese la cantidad de kilos");
		Scanner lector = new Scanner(System.in);
		kilos = lector.nextFloat();
		System.out.println("Ingrese el precio inicial por kilo");
		precioInicial = lector.nextFloat();
		System.out.println("Ingrese tipo de uva: 1 para tipo A o 2 para tipo B");

		tipo = lector.nextInt();

		System.out.println("Ingrese tama�o de uva 1 o 2");
		tama�o = lector.nextInt();
		if (tipo == 1) {
			if (tama�o == 1) {
				ganancia = (precioInicial + 20) * kilos;
			} else {
				ganancia = (precioInicial + 30) * kilos;
			}
		}

		else {
			if (tama�o == 1) {
				ganancia = (precioInicial - 30) * kilos;
			} else {
				ganancia = (precioInicial - 50) * kilos;
			}
		}

		System.out.print("La ganancia total es: $" + ganancia);
	}
}
