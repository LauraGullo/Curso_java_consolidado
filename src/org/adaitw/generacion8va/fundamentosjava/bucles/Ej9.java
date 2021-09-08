package ejercicios3;

public class Ej9 {

	public static void main(String[] args) {

		// Realice un algoritmo para obtener una matriz como el resultado de la suma de
		// dos matrices de orden M x N.

		int matriz1[][] = new int[2][2], matriz2[][] = new int[2][2], matriz3[][] = new int[2][2], e;

		matriz1[0][0] = 2;
		matriz1[0][1] = 2;
		matriz1[1][0] = 6;
		matriz1[1][1] = 1;

		matriz2[0][0] = 1;
		matriz2[0][1] = 17;
		matriz2[1][0] = 5;
		matriz2[1][1] = 11;

		System.out.println("Matriz C: ");
		for (int i = 0; i < 2; i++) {
			for (e = 0; e < 2; e++) {
				matriz3[i][e] = matriz1[i][e] + matriz2[i][e];
			}
		}
		for (int i = 0; i < 2; i++) {
			for (e = 0; e < 2; e++) {
				System.out.println("[" + i + "][" + e + "]" + matriz3[i][e]);
			}
		}
	}
}


