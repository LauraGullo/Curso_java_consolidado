package ejercicios3;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		// Cierta empresa requiere controlar la existencia de diez productos, los cuales
		// se almacenan en un vector A, mientras que los pedidos de
		// los clientes de estos productos se almacenan en un vector B. Se requiere
		// generar un tercer vector C con base en los anteriores que represente
		// lo que se requiere comprar para mantener el stock de inventario, para esto se
		// considera lo siguiente: si los valores correspondientes de los
		// vectores A y B son iguales se almacena este mismo valor, si el valor de B es
		// mayor que el de A se almacena el doble de la diferencia
		// entre B y A, si se da el caso de que A es mayor que B, se almacena B, que
		// indica lo que se requiere comprar para mantener el stock de
		// inventario.

		int existencia[] = new int[10], i, pedidos[] = new int[10], requerimientos[] = new int[10];

		for (i = 0; i < existencia.length; i++) {
			System.out.println("Ingresar stock disponible del producto " + (i + 1));
			Scanner lector = new Scanner(System.in);
			existencia[i] = lector.nextInt();
			System.out.println("ingresar pedido del cliente del producto " + (i + 1));
			pedidos[i] = lector.nextInt();
		}

		for (i = 0; i < existencia.length; i++) {
			if (existencia[i] == pedidos[i]) {
				System.out.println(
						"Para mantener el stock del producto " + (i + 1) + " faltan " + existencia[i] + " unidades");
			} else if (existencia[i] > pedidos[i]) {
				System.out.println(
						"Para mantener el stock del producto " + (i + 1) + " faltan " + pedidos[i] + " unidades");
			} else {
				System.out.println("Para mantener el stock del producto " + (i + 1) + " faltan "
						+ ((pedidos[i] - existencia[i]) * 2) + " unidades");
			}
		}
	}
}
