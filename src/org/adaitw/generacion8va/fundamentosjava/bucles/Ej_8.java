package ejercicios3;

public class Ej_8 {

	public static void main(String[] args) {
		// 8. Se tiene un arreglo de 15 filas y 12 columnas. Realice un algoritmo que
		// permita leer el arreglo y que calcule y presente los
		// resultados siguientes:
		// El menor elemento del arreglo; la suma de los elementos de las cinco primeras
		// filas del arreglo; y el total de elementos negativos en
		// las columnas de la quinta a la nueve.

		int i, e, contadorNegativos = 0, temporalE = 0, temporalI = 0, suma = 0;

		int matriz[][] = new int[15][12];

		matriz[0][0] = 16;
		matriz[0][1] = 7;
		matriz[0][2] = 8;
		matriz[0][3] = 7;
		matriz[0][4] = 8;
		matriz[0][5] = 6;
		matriz[0][6] = 7;
		matriz[0][7] = 8;
		matriz[0][8] = 7;
		matriz[0][9] = 8;
		matriz[0][10] = 6;
		matriz[0][11] = 7;

		matriz[1][0] = 6;
		matriz[1][1] = 9;
		matriz[1][2] = -7;
		matriz[1][3] = 7;
		matriz[1][4] = 8;
		matriz[1][5] = 6;
		matriz[1][6] = 7;
		matriz[1][7] = 8;
		matriz[1][8] = 7;
		matriz[1][9] = 8;
		matriz[1][10] = 16;
		matriz[1][11] = 7;

		matriz[2][0] = 0;
		matriz[2][1] = -9;
		matriz[2][2] = 7;
		matriz[2][3] = 7;
		matriz[2][4] = 8;
		matriz[2][5] = 6;
		matriz[2][6] = 7;
		matriz[2][7] = 8;
		matriz[2][8] = 7;
		matriz[2][9] = 8;
		matriz[2][10] = 6;
		matriz[2][11] = 7;

		matriz[3][0] = 6;
		matriz[3][1] = 9;
		matriz[3][2] = -7;
		matriz[3][3] = 7;
		matriz[3][4] = 8;
		matriz[3][5] = 6;
		matriz[3][6] = 7;
		matriz[3][7] = 8;
		matriz[3][8] = 7;
		matriz[3][9] = 8;
		matriz[3][10] = 16;
		matriz[3][11] = 7;

		matriz[4][0] = 6;
		matriz[4][1] = 9;
		matriz[4][2] = -7;
		matriz[4][3] = 7;
		matriz[4][4] = 8;
		matriz[4][5] = 6;
		matriz[4][6] = 7;
		matriz[4][7] = 8;
		matriz[4][8] = 7;
		matriz[4][9] = 8;
		matriz[4][10] = 16;
		matriz[4][11] = 17;

		matriz[5][0] = 6;
		matriz[5][1] = 9;
		matriz[5][2] = -7;
		matriz[5][3] = 7;
		matriz[5][4] = 8;
		matriz[5][5] = 6;
		matriz[5][6] = 7;
		matriz[5][7] = 8;
		matriz[5][8] = 7;
		matriz[5][9] = 8;
		matriz[5][10] = 16;
		matriz[5][11] = 7;

		matriz[6][0] = 6;
		matriz[6][1] = 9;
		matriz[6][2] = -7;
		matriz[6][3] = 7;
		matriz[6][4] = 8;
		matriz[6][5] = 6;
		matriz[6][6] = 7;
		matriz[6][7] = 8;
		matriz[6][8] = 7;
		matriz[6][9] = 8;
		matriz[6][10] = 16;
		matriz[6][11] = 7;

		matriz[7][0] = 6;
		matriz[7][1] = 9;
		matriz[7][2] = -7;
		matriz[7][3] = 7;
		matriz[7][4] = 8;
		matriz[7][5] = 6;
		matriz[7][6] = 7;
		matriz[7][7] = 8;
		matriz[7][8] = 7;
		matriz[7][9] = 8;
		matriz[7][10] = 16;
		matriz[7][11] = 7;

		matriz[8][0] = 6;
		matriz[8][1] = 9;
		matriz[8][2] = -7;
		matriz[8][3] = 7;
		matriz[8][4] = 8;
		matriz[8][5] = 6;
		matriz[8][6] = 7;
		matriz[8][7] = 8;
		matriz[8][8] = 7;
		matriz[8][9] = 8;
		matriz[8][10] = 16;
		matriz[8][11] = 7;

		matriz[9][0] = 6;
		matriz[9][1] = 9;
		matriz[9][2] = -7;
		matriz[9][3] = 7;
		matriz[9][4] = 8;
		matriz[9][5] = 6;
		matriz[9][6] = 7;
		matriz[9][7] = 8;
		matriz[9][8] = 7;
		matriz[9][9] = 8;
		matriz[9][10] = 16;
		matriz[9][11] = 7;

		matriz[10][0] = 6;
		matriz[10][1] = 9;
		matriz[10][2] = -7;
		matriz[10][3] = 7;
		matriz[10][4] = 8;
		matriz[10][5] = 6;
		matriz[10][6] = 7;
		matriz[10][7] = 8;
		matriz[10][8] = 7;
		matriz[10][9] = 8;
		matriz[10][10] = 16;
		matriz[10][11] = 7;

		matriz[11][0] = 6;
		matriz[11][1] = 9;
		matriz[11][2] = -7;
		matriz[11][3] = 7;
		matriz[11][4] = 8;
		matriz[11][5] = 6;
		matriz[11][6] = 7;
		matriz[11][7] = 8;
		matriz[11][8] = 7;
		matriz[11][9] = 8;
		matriz[11][10] = 16;
		matriz[11][11] = 7;

		matriz[12][0] = 6;
		matriz[12][1] = 9;
		matriz[12][2] = -7;
		matriz[12][3] = 7;
		matriz[12][4] = 8;
		matriz[12][5] = 6;
		matriz[12][6] = 7;
		matriz[12][7] = 8;
		matriz[12][8] = 7;
		matriz[12][9] = 8;
		matriz[12][10] = 16;
		matriz[12][11] = 7;

		matriz[13][0] = 6;
		matriz[13][1] = 9;
		matriz[13][2] = -7;
		matriz[13][3] = 7;
		matriz[13][4] = 8;
		matriz[13][5] = 6;
		matriz[13][6] = 7;
		matriz[13][7] = 8;
		matriz[13][8] = 7;
		matriz[13][9] = 8;
		matriz[13][10] = 16;
		matriz[13][11] = 7;

		matriz[14][0] = 6;
		matriz[14][1] = 9;
		matriz[14][2] = -7;
		matriz[14][3] = 7;
		matriz[14][4] = 8;
		matriz[14][5] = 6;
		matriz[14][6] = 7;
		matriz[14][7] = 8;
		matriz[14][8] = 7;
		matriz[14][9] = -8;
		matriz[14][10] = 16;
		matriz[14][11] = -777;
				
		for (i = 0; i < 5; i++) {
			for (e = 0; e < 12; e++) {
				suma += matriz[i][e];
			}
		}

		// si hay varios elementos iguales toma el primero que aparece
		for (i = 0; i <= 14; i++) {
			for (e = 0; e < 12; e++) {
				if (matriz[i][e] < matriz[temporalI][temporalE]) {
					temporalI = i;
					temporalE = e;
				}
			}
		}
		for (i = 0; i <= 14; i++) {
			for (e = 4; e < 10; e++) {
				if (matriz[i][e] < 0) {
					contadorNegativos += 1;
				}
			}
		}
		System.out.println("Cantidad de negativos en columnas 4 a 9: " + contadorNegativos);
		System.out.println("Suma de filas 0 a 4: " + suma);
		System.out.println("El  menor elemento es ["+ temporalI +"]["+temporalE +"]:" + matriz[temporalI][temporalE]);
	}
}
