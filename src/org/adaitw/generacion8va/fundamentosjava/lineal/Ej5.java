package ejercicios1;

import java.util.Scanner;
/*Una empresa constructora vende terrenos con la forma A de la figura 1.2. Realice un
  algoritmo y repres�ntelo mediante un diagrama de flujo y el pseudoc�digo para obtener el �rea
  respectiva de un terreno de medidas de cualquier valor*/

public class Ej5 {

	public static void main(String[] args) {
		double areaTriangulo=0;
		double areaRectangulo=0;
		double areaTerreno=0;
		
		System.out.println("Ingrese la base del rect�ngulo");
		 Scanner sc= new Scanner (System.in);
		 double baseRectangulo=sc.nextDouble();
		 System.out.println("Ingrese la altura del rect�ngulo");
		 double alturaRectangulo=sc.nextDouble();
		 System.out.println("Ingrese la base del tri�ngulo");
		 double baseTriangulo=sc.nextDouble();
		 System.out.println("Ingrese la altura del tri�ngulo");
		 double alturaTriangulo=sc.nextDouble();
		 
		 areaTriangulo= (baseTriangulo*alturaTriangulo)/2;
		 areaRectangulo=baseRectangulo*alturaRectangulo;
		 areaTerreno=areaTriangulo+areaRectangulo;
		 System.out.print ("El �rea del terreno es: "+areaTerreno);
				 
	}

}
