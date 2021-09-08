package ejercicios3;

public class Ej_11 {

	public static void main(String[] args) {
		// 11. Se tiene una matriz de 12 filas por 19 columnas y se desea un algoritmo
		// para encontrar todos sus elementos negativos y para que
		// les cambie ese valor negativo por un cero. Realice un algoritmo para tal fin
		// y represéntelo mediante diagrama de flujo y pseudocódigo.
		int matrizA[][] = new int[12][19];

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
		matrizA[0][12] = 8;
		matrizA[0][13] = 7;
		matrizA[0][14] = 8;
		matrizA[0][15] = 6;
		matrizA[0][16] = 7;
		matrizA[0][17] = 8;
		matrizA[0][18] = 7;
		
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
		matrizA[1][12] = 8;
		matrizA[1][13] = 7;
		matrizA[1][14] = 8;
		matrizA[1][15] = 6;
		matrizA[1][16] = 7;
		matrizA[1][17] = 8;
		matrizA[1][18] = 7;

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
		matrizA[2][12] = 8;
		matrizA[2][13] = 7;
		matrizA[2][14] = 8;
		matrizA[2][15] = 6;
		matrizA[2][16] = 7;
		matrizA[2][17] = 8;
		matrizA[2][18] = 7;

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
		matrizA[3][12] = 8;
		matrizA[3][13] = 7;
		matrizA[3][14] = 8;
		matrizA[3][15] = 6;
		matrizA[3][16] = 7;
		matrizA[3][17] = 8;
		matrizA[3][18] = 7;

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
		matrizA[4][12] = 8;
		matrizA[4][13] = 7;
		matrizA[4][14] = 8;
		matrizA[4][15] = 6;
		matrizA[4][16] = 7;
		matrizA[4][17] = 8;
		matrizA[4][18] = 7;

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
		matrizA[5][12] = 8;
		matrizA[5][13] = 7;
		matrizA[5][14] = 8;
		matrizA[5][15] = 6;
		matrizA[5][16] = 7;
		matrizA[5][17] = 8;
		matrizA[5][18] = 7;

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
		matrizA[6][12] = 8;
		matrizA[6][13] = 7;
		matrizA[6][14] = 8;
		matrizA[6][15] = 6;
		matrizA[6][16] = 7;
		matrizA[6][17] = 8;
		matrizA[6][18] = 7;

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
		matrizA[7][12] = 8;
		matrizA[7][13] = 7;
		matrizA[7][14] = 8;
		matrizA[7][15] = 6;
		matrizA[7][16] = 7;
		matrizA[7][17] = 8;
		matrizA[7][18] = 7;

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
		matrizA[8][12] = 8;
		matrizA[8][13] = 7;
		matrizA[8][14] = 8;
		matrizA[8][15] = 6;
		matrizA[8][16] = 7;
		matrizA[8][17] = 8;
		matrizA[8][18] = 7;

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
		matrizA[9][12] = 8;
		matrizA[9][13] = 7;
		matrizA[9][14] = 8;
		matrizA[9][15] = 6;
		matrizA[9][16] = 7;
		matrizA[9][17] = 8;
		matrizA[9][18] = 7;

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
		matrizA[10][12] = 8;
		matrizA[10][13] = 7;
		matrizA[10][14] = 8;
		matrizA[10][15] = 6;
		matrizA[10][16] = 7;
		matrizA[10][17] = 8;
		matrizA[10][18] = 7;

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
		matrizA[11][12] = 8;
		matrizA[11][13] = 7;
		matrizA[11][14] = 8;
		matrizA[11][15] = 6;
		matrizA[11][16] = 7;
		matrizA[11][17] = 8;
		matrizA[11][18] =- 7;

		for (int i = 0; i < 12; i++) {
			for (int e = 0; e < 19; e++) {
				if (matrizA[i][e] < 0) {
					matrizA[i][e] = 0;
					System.out.print("MatrizA (" + i + "," + e + "): " + matrizA[i][e] + "\n");
				}
			}
		}
	}
}
