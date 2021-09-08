package ejercicios3;

public class Ej_2 {

	public static void main(String[] args) {
		// 2. Realice y represente mediante un diagrama de flujo el algoritmo para
		// obtener el producto de dos matrices de orden M x N y P x Q

		int matriz1[][] = new int[3][2], matriz2[][] = new int[2][3],
				producto[][] = new int[matriz1.length][matriz2[0].length], i, j, k;
		// filas y columnas deben ser de igual tamaño

		matriz1[0][0] = 1;
		matriz1[0][1] = 2;
		matriz1[1][0] = 3;
		matriz1[1][1] = 4;
		matriz1[2][0] = 5;
		matriz1[2][1] = 6;

		matriz2[0][0] = 1;
		matriz2[0][1] = 2;
		matriz2[0][2] = 3;
		matriz2[1][0] = 3;
		matriz2[1][1] = 4;
		matriz2[1][2] = 5;

		for (i = 0; i < matriz1.length; i++) {
			for (j = 0; j < matriz2[0].length; j++) {
				for (k = 0; k < matriz1[0].length; k++) {
					producto[i][j] += matriz1[i][k] * matriz2[k][j];
				}
				System.out.print(producto[i][j] + " ");
			}
			System.out.println("");
		}
	}
}
