package ejercicios3;

public class Ej_14 {

	public static void main(String[] args) {
		// 14. Realice un algoritmo que lea una matriz de N filas y M columnas y que
		// cuente los elementos negativos que contiene,
		// así como también cuántos elementos de la diagonal principal son igual a cero.
		int i, e, contadorNegativos = 0, contadorCeros = 0;

		int matrizA[][] = new int[4][4];
		matrizA[0][0] = 10;
		matrizA[0][1] = 7;
		matrizA[0][2] = 8;
		matrizA[0][3] = 7;

		matrizA[1][0] = 6;
		matrizA[1][1] = 0;
		matrizA[1][2] = -7;
		matrizA[1][3] = 7;

		matrizA[2][0] = 6;
		matrizA[2][1] = 9;
		matrizA[2][2] = -7;
		matrizA[2][3] = -7;

		matrizA[3][0] = 0;
		matrizA[3][1] = -9;
		matrizA[3][2] = -7;
		matrizA[3][3] = 7;

		for (i = 0; i < 4; i++) {
			for (e = 0; e < 4; e++) {
				if (matrizA[i][e] < 0) {
					contadorNegativos ++;
				}

				if (i == e && matrizA[i][e] == 0) {
						contadorCeros ++;
					}
				}
			}
		
		System.out.println("La cantidad de elementos negativos en la matriz es: " + contadorNegativos);
		System.out.println("La cantidad de ceros en la diagonal principal de la matriz es: " + contadorCeros);
	}

}