package ejercicios3;

public class Ej_1 {

	public static void main(String[] args) {
		// 1. Realice y represente mediante un diagrama de flujo el algoritmo para
		// obtener la matriz transpuesta de cualquier matriz de orden M x N

		int matriz[][] = new int[3][3];
		matriz[0][0] = 1;
		matriz[0][1] = 2;
		matriz[0][2] = 3;
		matriz[1][0] = 4;
		matriz[1][1] = 5;
		matriz[1][2] = 6;
		matriz[2][0] = 7;
		matriz[2][1] = 8;
		matriz[2][2] = 9;

		System.out.println("Matriz traspuesta:");

		for (int e = 0; e <= 2; e++) {
			for (int i = 0; i <= 2; i++) {
				System.out.print("(" + i + "," + e + ")" + matriz[e][i]+"\n");
				
				/*
				 * System.out.println("Cuántas filas tiene tu matriz?: "); int filas =
				 * escaner.nextInt();
				 * 
				 * System.out.println("Cuántas columnas tiene tu matriz?: "); int columnas =
				 * escaner.nextInt();
				 * 
				 * int matriz[][] = new int[filas][columnas];
				 * 
				 * for (int i = 0; i < filas; i++) { 
				 * 	for (int j = 0; j < columnas; j++) {
				 * 		System.out.println("Introduzca el valor de la fila " + i + " y columna " + * j);
				 *   matriz[i][j] = escaner.nextInt(); 
				 *   } 
				 *   }
				 * System.out.println("La matriz original es: ");
				 *  for (int i = 0; i < filas;  i++) { 
				 *  for (int j = 0; j < columnas; j++) { System.out.print(matriz[i][j]); }
				 * System.out.println(""); }
				 * 
				 * System.out.println("La matriz transpuesta es: "); 
				 * for (int i = 0; i < columnas; i++) {
				 *  for (int j = 0; j < filas; j++) {
				 * System.out.print(matriz[j][i]); 
				 * }
				 *  System.out.println(""); 
				 *  } 
				 */
				
			}
		}
	}
}
