package ejercicios3;

public class Ej_10 {

	public static void main(String[] args) {
		// 10. Se tienen dos matrices cuadradas (de 12 filas y 12 columnas cada una).
		// Realice un algoritmo que lea los arreglos y que determine si
		// la diagonal principal de la primera es igual a la diagonal principal de la
		// segunda. (Diagonal principal es donde los subíndices I, J son
		// iguales). Represente la solución mediante el diagrama de flujo y el
		// pseudocódigo.

		boolean resultado = true;

		int matrizA[][] = new int[12][12];
		int matrizB[][] = new int[12][12];

		matrizA[0][0] = 16;
		matrizA[0][1] = 7;
		matrizA[0][2] = 8;
		matrizA[0][3] = 7;
		matrizA[0][4] = 8;
		matrizA[0][5] = 6;
		matrizA[0][6] = 7;
		matrizA[0][7] = 8;
		matrizA[0][8] = 7;
		matrizA[0][9] = 8;
		matrizA[0][10] = 6;
		matrizA[0][11] = 7;

		matrizA[1][0] = 6;
		matrizA[1][1] = 9;
		matrizA[1][2] = -7;
		matrizA[1][3] = 7;
		matrizA[1][4] = 8;
		matrizA[1][5] = 6;
		matrizA[1][6] = 7;
		matrizA[1][7] = 8;
		matrizA[1][8] = 7;
		matrizA[1][9] = 8;
		matrizA[1][10] = 16;
		matrizA[1][11] = 7;

		matrizA[2][0] = 0;
		matrizA[2][1] = -9;
		matrizA[2][2] = 7;
		matrizA[2][3] = 7;
		matrizA[2][4] = 8;
		matrizA[2][5] = 6;
		matrizA[2][6] = 7;
		matrizA[2][7] = 8;
		matrizA[2][8] = 7;
		matrizA[2][9] = 8;
		matrizA[2][10] = 6;
		matrizA[2][11] = 7;

		matrizA[3][0] = 6;
		matrizA[3][1] = 9;
		matrizA[3][2] = -7;
		matrizA[3][3] = 7;
		matrizA[3][4] = 8;
		matrizA[3][5] = 6;
		matrizA[3][6] = 7;
		matrizA[3][7] = 8;
		matrizA[3][8] = 7;
		matrizA[3][9] = 8;
		matrizA[3][10] = 16;
		matrizA[3][11] = 7;

		matrizA[4][0] = 6;
		matrizA[4][1] = 9;
		matrizA[4][2] = -7;
		matrizA[4][3] = 7;
		matrizA[4][4] = 8;
		matrizA[4][5] = 6;
		matrizA[4][6] = 7;
		matrizA[4][7] = 8;
		matrizA[4][8] = 7;
		matrizA[4][9] = 8;
		matrizA[4][10] = 16;
		matrizA[4][11] = 17;

		matrizA[5][0] = 6;
		matrizA[5][1] = 9;
		matrizA[5][2] = -7;
		matrizA[5][3] = 7;
		matrizA[5][4] = 8;
		matrizA[5][5] = 6;
		matrizA[5][6] = 7;
		matrizA[5][7] = 8;
		matrizA[5][8] = 7;
		matrizA[5][9] = 8;
		matrizA[5][10] = 16;
		matrizA[5][11] = 7;

		matrizA[6][0] = 6;
		matrizA[6][1] = 9;
		matrizA[6][2] = -7;
		matrizA[6][3] = 7;
		matrizA[6][4] = 8;
		matrizA[6][5] = 6;
		matrizA[6][6] = 7;
		matrizA[6][7] = 8;
		matrizA[6][8] = 7;
		matrizA[6][9] = 8;
		matrizA[6][10] = 16;
		matrizA[6][11] = 7;

		matrizA[7][0] = 6;
		matrizA[7][1] = 9;
		matrizA[7][2] = -7;
		matrizA[7][3] = 7;
		matrizA[7][4] = 8;
		matrizA[7][5] = 6;
		matrizA[7][6] = 7;
		matrizA[7][7] = 8;
		matrizA[7][8] = 7;
		matrizA[7][9] = 8;
		matrizA[7][10] = 16;
		matrizA[7][11] = 7;

		matrizA[8][0] = 6;
		matrizA[8][1] = 9;
		matrizA[8][2] = -7;
		matrizA[8][3] = 7;
		matrizA[8][4] = 8;
		matrizA[8][5] = 6;
		matrizA[8][6] = 7;
		matrizA[8][7] = 8;
		matrizA[8][8] = 7;
		matrizA[8][9] = 8;
		matrizA[8][10] = 16;
		matrizA[8][11] = 7;

		matrizA[9][0] = 6;
		matrizA[9][1] = 9;
		matrizA[9][2] = -7;
		matrizA[9][3] = 7;
		matrizA[9][4] = 8;
		matrizA[9][5] = 6;
		matrizA[9][6] = 7;
		matrizA[9][7] = 8;
		matrizA[9][8] = 7;
		matrizA[9][9] = 8;
		matrizA[9][10] = 16;
		matrizA[9][11] = 7;

		matrizA[10][0] = 6;
		matrizA[10][1] = 9;
		matrizA[10][2] = -7;
		matrizA[10][3] = 7;
		matrizA[10][4] = 8;
		matrizA[10][5] = 6;
		matrizA[10][6] = 7;
		matrizA[10][7] = 8;
		matrizA[10][8] = 7;
		matrizA[10][9] = 8;
		matrizA[10][10] = 16;
		matrizA[10][11] = 7;

		matrizA[11][0] = 6;
		matrizA[11][1] = 9;
		matrizA[11][2] = -7;
		matrizA[11][3] = 7;
		matrizA[11][4] = 8;
		matrizA[11][5] = 6;
		matrizA[11][6] = 7;
		matrizA[11][7] = 8;
		matrizA[11][8] = 7;
		matrizA[11][9] = 8;
		matrizA[11][10] = 16;
		matrizA[11][11] = 7;

		matrizB[0][0] = 16;
		matrizB[0][1] = 7;
		matrizB[0][2] = 8;
		matrizB[0][3] = 7;
		matrizB[0][4] = 8;
		matrizB[0][5] = 6;
		matrizB[0][6] = 7;
		matrizB[0][7] = 8;
		matrizB[0][8] = 7;
		matrizB[0][9] = 8;
		matrizB[0][10] = 6;
		matrizB[0][11] = 7;

		matrizB[1][0] = 6;
		matrizB[1][1] = 9;
		matrizB[1][2] = -7;
		matrizB[1][3] = 7;
		matrizB[1][4] = 8;
		matrizB[1][5] = 6;
		matrizB[1][6] = 7;
		matrizB[1][7] = 8;
		matrizB[1][8] = 7;
		matrizB[1][9] = 8;
		matrizB[1][10] = 16;
		matrizB[1][11] = 7;

		matrizB[2][0] = 0;
		matrizB[2][1] = -9;
		matrizB[2][2] = 7;
		matrizB[2][3] = 7;
		matrizB[2][4] = 8;
		matrizB[2][5] = 6;
		matrizB[2][6] = 7;
		matrizB[2][7] = 8;
		matrizB[2][8] = 7;
		matrizB[2][9] = 8;
		matrizB[2][10] = 6;
		matrizB[2][11] = 7;

		matrizB[3][0] = 6;
		matrizB[3][1] = 9;
		matrizB[3][2] = -7;
		matrizB[3][3] = 7;
		matrizB[3][4] = 8;
		matrizB[3][5] = 6;
		matrizB[3][6] = 7;
		matrizB[3][7] = 8;
		matrizB[3][8] = 7;
		matrizB[3][9] = 8;
		matrizB[3][10] = 16;
		matrizB[3][11] = 7;

		matrizB[4][0] = 6;
		matrizB[4][1] = 9;
		matrizB[4][2] = -7;
		matrizB[4][3] = 7;
		matrizB[4][4] = 8;
		matrizB[4][5] = 6;
		matrizB[4][6] = 7;
		matrizB[4][7] = 8;
		matrizB[4][8] = 7;
		matrizB[4][9] = 8;
		matrizB[4][10] = 16;
		matrizB[4][11] = 17;

		matrizB[5][0] = 6;
		matrizB[5][1] = 9;
		matrizB[5][2] = -7;
		matrizB[5][3] = 7;
		matrizB[5][4] = 8;
		matrizB[5][5] = 6;
		matrizB[5][6] = 7;
		matrizB[5][7] = 8;
		matrizB[5][8] = 7;
		matrizB[5][9] = 8;
		matrizB[5][10] = 16;
		matrizB[5][11] = 7;

		matrizB[6][0] = 6;
		matrizB[6][1] = 9;
		matrizB[6][2] = -7;
		matrizB[6][3] = 7;
		matrizB[6][4] = 8;
		matrizB[6][5] = 6;
		matrizB[6][6] = 7;
		matrizB[6][7] = 8;
		matrizB[6][8] = 7;
		matrizB[6][9] = 8;
		matrizB[6][10] = 16;
		matrizB[6][11] = 7;

		matrizB[7][0] = 6;
		matrizB[7][1] = 9;
		matrizB[7][2] = -7;
		matrizB[7][3] = 7;
		matrizB[7][4] = 8;
		matrizB[7][5] = 6;
		matrizB[7][6] = 7;
		matrizB[7][7] = 8;
		matrizB[7][8] = 7;
		matrizB[7][9] = 8;
		matrizB[7][10] = 16;
		matrizB[7][11] = 7;

		matrizB[8][0] = 6;
		matrizB[8][1] = 9;
		matrizB[8][2] = -7;
		matrizB[8][3] = 7;
		matrizB[8][4] = 8;
		matrizB[8][5] = 6;
		matrizB[8][6] = 7;
		matrizB[8][7] = 8;
		matrizB[8][8] = 7;
		matrizB[8][9] = 8;
		matrizB[8][10] = 16;
		matrizB[8][11] = 7;

		matrizB[9][0] = 6;
		matrizB[9][1] = 9;
		matrizB[9][2] = -7;
		matrizB[9][3] = 7;
		matrizB[9][4] = 8;
		matrizB[9][5] = 6;
		matrizB[9][6] = 7;
		matrizB[9][7] = 8;
		matrizB[9][8] = 7;
		matrizB[9][9] = 8;
		matrizB[9][10] = 16;
		matrizB[9][11] = 7;

		matrizB[10][0] = 6;
		matrizB[10][1] = 9;
		matrizB[10][2] = -7;
		matrizB[10][3] = 7;
		matrizB[10][4] = 8;
		matrizB[10][5] = 6;
		matrizB[10][6] = 7;
		matrizB[10][7] = 8;
		matrizB[10][8] = 7;
		matrizB[10][9] = 8;
		matrizB[10][10] = 16;
		matrizB[10][11] = 7;

		matrizB[11][0] = 6;
		matrizB[11][1] = 9;
		matrizB[11][2] = -7;
		matrizB[11][3] = 7;
		matrizB[11][4] = 8;
		matrizB[11][5] = 6;
		matrizB[11][6] = 7;
		matrizB[11][7] = 8;
		matrizB[11][8] = 7;
		matrizB[11][9] = 8;
		matrizB[11][10] = 16;
		matrizB[11][11] =7;

		for (int i = 0; i < 12; i++) {
			for (int e = 0; e < 12; e++) {
					if (matrizA[i][i] != matrizB[i][i]) {
						resultado = false;
					}
			}
		}

		if (resultado == true) {
			System.out.print("Las diagonales principales de las matrices son iguales");
		} else {
			System.out.print("Las diagonales principales de las matrices no son iguales");
		}
	}
}
