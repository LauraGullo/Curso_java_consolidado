package ejercicios3;

public class Ej_17 {

	public static void main(String[] args) {
		// 17. Se tiene un arreglo de seis filas y ocho columnas y se sabe que se tiene
		// un elemento negativo. Realice un algoritmo que indique la
		// posición que ese elemento ocupa en el arreglo (en la fila y la columna en la
		// que se encuentra ese elemento).

		int temporalI = 0, temporalE = 0, matrizA[][] = new int[6][8], i, e;

		matrizA[0][0] = 16;
		matrizA[0][1] = 7;
		matrizA[0][2] = 8;
		matrizA[0][3] = 7;
		matrizA[0][4] = 8;
		matrizA[0][5] = 6;
		matrizA[0][6] = 7;
		matrizA[0][7] = 8;

		matrizA[1][0] = 6;
		matrizA[1][1] = 9;
		matrizA[1][2] = 7;
		matrizA[1][3] = 7;
		matrizA[1][4] = 8;
		matrizA[1][5] = 6;
		matrizA[1][6] = 7;
		matrizA[1][7] = 8;

		matrizA[2][0] = 0;
		matrizA[2][1] = 9;
		matrizA[2][2] = 7;
		matrizA[2][3] = 7;
		matrizA[2][4] = 8;
		matrizA[2][5] = 6;
		matrizA[2][6] = 7;
		matrizA[2][7] = 8;

		matrizA[3][0] = 6;
		matrizA[3][1] = 9;
		matrizA[3][2] = 7;
		matrizA[3][3] = 7;
		matrizA[3][4] = 8;
		matrizA[3][5] = 6;
		matrizA[3][6] = 7;

		matrizA[4][0] = 6;
		matrizA[4][1] = 9;
		matrizA[4][2] = 7;
		matrizA[4][3] = 7;
		matrizA[4][4] = 8;
		matrizA[4][5] = 6;
		matrizA[4][6] = 7;
		matrizA[4][7] = 8;

		matrizA[5][0] = 6;
		matrizA[5][1] = 9;
		matrizA[5][2] = 7;
		matrizA[5][3] = 7;
		matrizA[5][4] = 8;
		matrizA[5][5] = 6;
		matrizA[5][6] = 7;
		matrizA[5][7] =- 8;
		
		for (i = 0; i < matrizA.length; i++) {
			for (e = 0; e < matrizA[0].length; e++) {
				if (matrizA[i][e] < 0) {
					temporalI = i;
					temporalE = e;
				}
			}
		}
		System.out.print("La posición del elemento negativo en la matriz es: [" + temporalI + "," + temporalE + "]");
	}
}
