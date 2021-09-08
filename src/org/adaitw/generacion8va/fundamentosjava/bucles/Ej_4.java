package ejercicios3;

public class Ej_4 {

	public static void main(String[] args) {
		// 4. Realice un algoritmo para obtener una matriz como el resultado de la resta
		// de dos matrices de orden M x N.
		int matriz1[][] = new int[2][2];
		matriz1[0][0] = 1;
		matriz1[0][1] = 2;
		matriz1[1][0] = 6;
		matriz1[1][1] = 9;

		int matriz2[][] = new int[2][2];
		matriz2[0][0] = 1;
		matriz2[0][1] = 7;
		matriz2[1][0] = 6;
		matriz2[1][1] = 3;

		int MatrizResta[][] = new int[2][2];

		System.out.println("Matriz resultado de la resta de las matrices: ");
		for (int i = 0; i <= 1; i++) {
			for (int e = 0; e <= 1; e++) {
				MatrizResta[i][e] = matriz1[i][e] - matriz2[i][e];
				System.out.print("[" + i + "," + e + "]: " + MatrizResta[i][e]+"\n");
			}
		}
	}
}