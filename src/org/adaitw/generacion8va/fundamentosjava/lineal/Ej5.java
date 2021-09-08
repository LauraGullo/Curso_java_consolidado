package ejercicios1;

import java.util.Scanner;
/*Una empresa constructora vende terrenos con la forma A de la figura 1.2. Realice un
  algoritmo y represéntelo mediante un diagrama de flujo y el pseudocódigo para obtener el área
  respectiva de un terreno de medidas de cualquier valor*/

public class Ej5 {

	public static void main(String[] args) {
		double areaTriangulo=0;
		double areaRectangulo=0;
		double areaTerreno=0;
		
		System.out.println("Ingrese la base del rectángulo");
		 Scanner sc= new Scanner (System.in);
		 double baseRectangulo=sc.nextDouble();
		 System.out.println("Ingrese la altura del rectángulo");
		 double alturaRectangulo=sc.nextDouble();
		 System.out.println("Ingrese la base del triángulo");
		 double baseTriangulo=sc.nextDouble();
		 System.out.println("Ingrese la altura del triángulo");
		 double alturaTriangulo=sc.nextDouble();
		 
		 areaTriangulo= (baseTriangulo*alturaTriangulo)/2;
		 areaRectangulo=baseRectangulo*alturaRectangulo;
		 areaTerreno=areaTriangulo+areaRectangulo;
		 System.out.print ("El área del terreno es: "+areaTerreno);
				 
	}

}
