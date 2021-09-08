package ejercicios3;

public class Ej_3 {

	public static void main(String[] args) {
		// 3. Realice y represente mediante diagrama de flujo y pseudocódigo un
		// algoritmo que lea un arreglo de M filas y N columnas y que calcule
		// la suma de los elementos de la diagonal principal.

		int suma = 0;

		int matriz[][] = new int[3][3];
		matriz[0][0] = 1;
		matriz[0][1] = 2;
		matriz[0][2] = 0;
		matriz[1][0] = 6;
		matriz[1][1] = 5;
		matriz[1][2] = 0;
		matriz[2][0] = 5;
		matriz[2][1] = 1;
		matriz[2][2] = 0;

		for (int i = 0; i <= 2; i++) {
			for (int e = 0; e <= 2; e++) {
				if (i == e) {
					suma += matriz[i][i];
				}
			}
		}
		System.out.print("La suma de los elementos de la diagonal principal es " + suma);
	}
}
