package ejercicios2;

import java.util.Scanner;

public class Ej_17 {

	public static void main(String[] args) {
		/*
		 * Realice un algoritmo y represéntelo mediante el diagrama de flujo, el
		 * pseudocódigo y el diagrama N/S que permitan determinar qué paquete se puede
		 * comprar una persona con el dinero que recibirá en diciembre, considerando lo
		 * siguiente: a. Paquete A. Si recibe $50,000 o más se comprará una televisión,
		 * un modular, tres pares de zapatos, cinco camisas y cinco pantalones. b.
		 * Paquete B. Si recibe menos de $50,000 pero más (o igual) de $20,000, se
		 * comprará una grabadora, tres pares de zapatos, cinco camisas y cinco
		 * pantalones. c. Paquete C. Si recibe menos de $20,000 pero más (o igual) de
		 * $10,000, se comprará dos pares de zapatos, tres camisas y tres pantalones. d.
		 * Paquete D. Si recibe menos de $10,000, se tendrá que conformar con un par de
		 * zapatos, dos camisas y dos pantalones
		 */
		double dinero;
		String paquete;

		System.out.println("Ingrese el dinero que recibió");
		Scanner lector = new Scanner(System.in);
		dinero = lector.nextDouble();

		if (dinero >= 50000) {
			paquete = "A: una televisión, un modular, tres pares de zapatos, cinco camisas y cinco pantalones";
		} else if (dinero >= 20000) {
			paquete = "B: una grabadora, tres pares de zapatos, cinco camisas y cinco pantalones";
		} else if (dinero >= 10000) {
			paquete = "C: dos pares de zapatos, tres camisas y tres pantalones";
		} else {
			paquete = "paquete D: Un par de zapatos, dos camisas y dos pantalones";
		}
		System.out.print("EL paquete que se puede comprar es " + paquete);
	}
}
