package ejercicios1;

import java.util.Scanner;

/*La compañía de luz y sombras (CLS) requiere determinar el pago que debe realizar una
persona por el consumo de energía eléctrica, la cual se mide en kilowatts (KW).*/
public class Ej_11 {

	public static void main(String[] args) {
		double pagoTotal = 0;
		System.out.print("Ingrese el consumo de energía eléctrica en KW");
		Scanner lector = new Scanner(System.in);
		double consumo = lector.nextDouble();
		System.out.print("Ingrese el costo de energía eléctrica por KW");
		double costoKW = lector.nextDouble();
		pagoTotal = costoKW * consumo;
		System.out.print("El pago total por el consumo de energía eléctrica es " + pagoTotal);
	}
}
