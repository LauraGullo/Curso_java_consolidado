package ejercicios1;

import java.util.Scanner;

/*Realice un diagrama de flujo y pseudocódigo que representen el algoritmo para
determinar cuánto pagará finalmente una persona por un artículo equis, considerando
que tiene un descuento de 20%, y debe pagar 15% de IVA (debe mostrar el precio con
descuento y el precio final).*/

public class Ej_12 {

	public static void main(String[] args) {
		double DESCUENTO = 0.2;
		double IVA = 0.15;
		double precioConDescuento = 0;
		double precioFinal = 0;

		System.out.println("Ingrese el precio del producto");
		Scanner lector = new Scanner(System.in);
		double precio = lector.nextDouble();
		precioConDescuento = precio - (precio * DESCUENTO);
		precioFinal = precioConDescuento + (precio * IVA);
		System.out.print("El precio con descuento es $" + precioConDescuento + "\nEl precio final es $" + precioFinal);
	}
}
