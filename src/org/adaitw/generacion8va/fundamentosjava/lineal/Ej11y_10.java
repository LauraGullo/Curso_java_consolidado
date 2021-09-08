/*La conagua requiere determinar el pago que debe realizar una persona por el total de
metros cúbicos que consume de agua al llenar una alberca (ver figura 2.5). Realice un algoritmo
y represéntelo mediante un diagrama de flujo y el pseudocódigo que permita determinar ese
pago. Las variables requeridas para la solución de este problema se muestran en la tabla 1.12*/
package ejercicios1;

import java.util.Scanner;

public class Ej11y_10 {

	public static void main(String[] args) {
		double volumen=0;
		double pagoTotal=0;
	
		System.out.println("Ingrese la altura de la alberca");
		 Scanner sc= new Scanner (System.in);
		 double altura=sc.nextDouble();
		 System.out.println("Ingrese el largo de la alberca");
		 double largo=sc.nextDouble();
		 System.out.println("Ingrese el ancho de la alberca");
		 double ancho=sc.nextDouble();	
		 System.out.println("Ingrese el costo por M2");
		 double costoM2=sc.nextDouble();
		 
		 volumen= altura*ancho*largo;
		 pagoTotal=volumen*costoM2;
		 		 
		 System.out.print ("El pago total es: "+pagoTotal );
	}
}


