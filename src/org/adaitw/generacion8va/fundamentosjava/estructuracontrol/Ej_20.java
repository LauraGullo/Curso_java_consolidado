package ejercicios2;

import java.util.Scanner;

public class Ej_20 {

	public static void main(String[] args) {
		/*
		 * Realice un algoritmo para resolver el siguiente problema: una fábrica de
		 * pantalones desea calcular cuál es el precio final de venta y cuánto ganará
		 * por los N pantalones que produzca con el corte de alguno de sus modelos, para
		 * esto se cuenta con la siguiente información: a. Tiene dos modelos A y B,
		 * tallas 30, 32 y 36 para ambos modelos. b. Para el modelo A se utiliza 1.50 m
		 * de tela, y para el B 1.80 m. c. Al modelo A se le carga 80 % del costo de la
		 * tela, por mano de obra. Al modelo B se le carga 95 % del costo de la tela,
		 * por el mismo concepto. d. A las tallas 32 y 36 se les carga 4 % del costo
		 * generado por mano de obra y tela, sin importar el modelo. e. Cuando se
		 * realiza el corte para fabricar una prenda sólo se hace de un solo modelo y
		 * una sola talla. f. Finalmente, a la suma de estos costos se les carga 30%,
		 * que representa la ganancia extra de la tienda.
		 */

		double precioVenta, ganancia, cargoTalle = 0., mtsTela, manoObra, precioTela, costoTela, gananciaTotal;
		int talle, nPantalones;
		String modelo;

		System.out.println("Ingrese el modelo A o B");
		Scanner sc = new Scanner(System.in);
		modelo = sc.next();
		while (!modelo.equals("a") && !modelo.equals("b")) {
			System.out.println("modelo incorrecto. Colocar modelo nuevamente");
			modelo = sc.next();
		}

		System.out.println("Ingrese el precio de la tela por metro");
		precioTela = sc.nextDouble();

		System.out.println("Ingrese el talle: 30, 32 ó 36 ");
		talle = sc.nextInt();
		while (talle != 30 && talle != 32 && talle != 36) {
			System.out.println("El talle ingresado es incorrecto. Vuelva a ingresar el talle");
			talle = sc.nextInt();
		}

		System.out.println("Ingrese el total de pantalones que se produjeron");
		nPantalones = sc.nextInt();

		if (modelo.equals("a")) {
			mtsTela = 1.5;
			manoObra = (precioTela * mtsTela) * 0.8;
		} else {
			mtsTela = 1.8;
			manoObra = (precioTela * mtsTela) * 0.95;
		}
		costoTela = (precioTela * mtsTela) + manoObra;

		if (talle >= 32) {
			cargoTalle = costoTela * 0.04;
		}

		ganancia = (costoTela + cargoTalle) * 0.3;
		precioVenta = costoTela + cargoTalle + ganancia;

		gananciaTotal = precioVenta * nPantalones;

		System.out.println("El precio final de venta es $" + precioVenta);
		System.out.println("La ganancia por el total de pantalones que produce es " + gananciaTotal);
	}
}
