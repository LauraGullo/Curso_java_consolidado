/*Una modista, para realizar sus prendas de vestir, encarga las telas al extranjero. Para
cada pedido, tiene que proporcionar las medidas de la tela en pulgadas, pero ella generalmente
las tiene en metros. Realice un algoritmo para ayudar a resolver el problema, determinando
cuantas pulgadas debe pedir con base en los metros que requiere (1 pulgada = 0.0254 m).*/
package ejercicios1;

import java.util.Scanner;

public class Ej10 {

	private static final double PULGADA_EN_METROS = 0.0254;

	public static void main(String[] args) {
		double medidaPulgadas = 0;

		System.out.println("Ingrese la cantidad de metros a pedir");
		Scanner sc = new Scanner(System.in);
		double medidasMetros = sc.nextDouble();

		medidaPulgadas = medidasMetros / PULGADA_EN_METROS;

		System.out.print("El pedido en pulgadas es: " + medidaPulgadas);
	}
}
