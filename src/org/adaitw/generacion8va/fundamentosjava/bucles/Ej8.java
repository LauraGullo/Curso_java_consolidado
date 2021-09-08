package ejercicios3;

public class Ej8 {

	public static void main(String[] args) {
		/*
		 * En un arreglo se tienen registradas las ventas de cinco empleados durante
		 * cinco días de la semana. Se requiere determinar cuál fue la venta mayor
		 * realizada.
		 */

		int mayorVenta = 0, ventas[][] = new int[5][5];

		ventas[0][0] = 0;
		ventas[0][1] = 2;
		ventas[0][2] = 3;
		ventas[0][3] = 14;
		ventas[0][4] = 4;
		ventas[1][0] = 1;
		ventas[1][1] = 2;
		ventas[1][2] = 3;
		ventas[1][3] = 4;
		ventas[1][4] = 4;
		ventas[2][0] = 1;
		ventas[2][1] = 0;
		ventas[2][2] = 0;
		ventas[2][3] = 4;
		ventas[2][4] = 4;
		ventas[3][0] = 0;
		ventas[3][1] = 2;
		ventas[3][2] = 3;
		ventas[3][3] = 4;
		ventas[3][4] = 4;

		for (int i = 0; i < ventas.length; i++) {
			for (int e = 0; e < ventas[0].length; e++) {
				if (ventas[i][e] > mayorVenta) {
					mayorVenta = ventas[i][e];
				}
			}
		}
		System.out.print("La mayor venta realizada fue: " + mayorVenta);
	}
}
