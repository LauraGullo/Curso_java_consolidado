package ejercicios3;

public class Ej_20 {

	public static void main(String[] args) {
		// 20. Realice un algoritmo que a partir de la matriz del problema anterior
		// encuentre cuántos elementos tienen valor par y cuántos valores
		// impares.

		int contadorPar = 0, contadorImpar = 0, matrizA[][] = new int[5][5];
	
		matrizA[0][0] = 16;
		matrizA[0][1] = 7;
		matrizA[0][2] = 8;
		matrizA[0][3] = 7;
		matrizA[0][4] = 8;
		
		matrizA[1][0] = 6;
		matrizA[1][1] = 9;
		matrizA[1][2] = 7;
		matrizA[1][3] = 7;
		matrizA[1][4] = 8;
		
		matrizA[2][0] = 0;
		matrizA[2][1] = 9;
		matrizA[2][2] = 7;
		matrizA[2][3] = 7;
		matrizA[2][4] = 8;
		
		matrizA[3][0] = 6;
		matrizA[3][1] = 9;
		matrizA[3][2] = 7;
		matrizA[3][3] = 7;
		matrizA[3][4] = 8;
		
		matrizA[4][0] = 6;
		matrizA[4][1] = 9;
		matrizA[4][2] = 7;
		matrizA[4][3] = 7;
		matrizA[4][4] = 8;

		for (int i = 0; i < matrizA.length; i++) {
			for (int e = 0; e < matrizA[0].length; e++) {
				if (matrizA[i][e] % 2 == 0) {
					contadorPar ++;
				} else {
					contadorImpar ++;
				}
			}
		}
		System.out.println("Cantidad de valores par: " + contadorPar);
		System.out.print("Cantidad de valores impar: " + contadorImpar);
	}
}
