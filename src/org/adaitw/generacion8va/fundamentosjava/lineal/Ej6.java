/*Se requiere obtener el área de la figura 1.3 de la forma A. Para resolver este problema se
puede partir de que está formada por tres figuras: dos triángulos rectángulos, con H como
hipotenusa y R como uno de los catetos, que también es el radio de la otra figura, una
semicircunferencia que forma la parte circular (ver forma B).*/
package ejercicios1;

import java.util.Scanner;

public class Ej6 {

	private static final double PI = 3.14;

	public static void main(String[] args) {
		double areaCirculo = 0;
		double catetoFaltante = 0;
		double areaTriangulo = 0;
		double areaFigura = 0;

		System.out.println("Ingrese el radio");
		Scanner sc = new Scanner(System.in);
		double radio = sc.nextDouble();
		System.out.println("Ingrese la hipotenusa");
		double hipotenusa = sc.nextDouble();

		areaCirculo = (radio * radio * PI) / 2;
		catetoFaltante = Math.sqrt((hipotenusa * hipotenusa) - (radio * radio));
		areaTriangulo = ((catetoFaltante * radio) / 2) * 2;
		areaFigura = areaTriangulo + areaCirculo;
		System.out.print("El área de la figura es: " + areaFigura);
	}
}
