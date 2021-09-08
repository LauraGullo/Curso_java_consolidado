package ejercicios3;

public class Ej_13 {

	public static void main(String[] args) {
		// 13. Realice un algoritmo que lea un vector de cien ("10") elementos y que
		// calcule su magnitud.

		int vector[] = new int[10];
		double suma = 0;
		double magnitud = 0;

		vector[0] = 1;
		vector[1] = 2;
		vector[2] = 3;
		vector[3] = 4;
		vector[4] = 5;
		vector[5] = 6;
		vector[6] = 7;
		vector[7] = 8;
		vector[8] = 9;
		vector[9] = 10;

		for (int i = 0; i < vector.length; i++) {
			suma = suma + Math.pow(vector[i], 2);
		}
		magnitud = Math.sqrt(suma);

		System.out.print("La magnitud del vector es: " + magnitud);
	}
}
