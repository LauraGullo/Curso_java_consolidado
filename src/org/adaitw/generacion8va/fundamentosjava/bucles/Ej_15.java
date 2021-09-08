package ejercicios3;

public class Ej_15 {

	public static void main(String[] args) {
		// 15. Realice un algoritmo que calcule el producto de dos vectores. Uno de
		// ellos es de una fila con diez elementos y el otro con una columna
		// de diez elementos. Represéntelo mediante diagrama y pseudocódigo.

		int vectorFila[] = new int[10], vectorColumna[] = new int[10], producto[] = new int[10], i, e;

		vectorFila[0] = 2;
		vectorFila[1] = 7;
		vectorFila[2] = 8;
		vectorFila[3] = 7;
		vectorFila[4] = 1;
		vectorFila[5] = 0;
		vectorFila[6] = 8;
		vectorFila[7] = 7;
		vectorFila[8] = 1;
		vectorFila[9] = 1;

		vectorColumna[0] = 2;
		vectorColumna[1] = 7;
		vectorColumna[2] = 8;
		vectorColumna[3] = 7;
		vectorColumna[4] = 1;
		vectorColumna[5] = 0;
		vectorColumna[6] = 8;
		vectorColumna[7] = 7;
		vectorColumna[8] = 1;
		vectorColumna[9] = 1;

		for ( i = 0, e=0; i < 10 && e < 10; e++, i++) {
			producto[i] += vectorColumna[e] * vectorFila[i];
			
		}
		System.out.print("Producto [" + i + "]: " + producto[i]+"\n");

	}
}
