Algoritmo Ejer11
	//Se les dar� un bono por antig�edad a los empleados de una tienda. Si tienen un a�o, se
	//les dar� $100; si tienen 2 a�os, $200, y as� sucesivamente hasta los 5 a�os. Para los que
	//		tengan m�s de 5, el bono ser� de $1000. Realice un algoritmo y repres�ntelo mediante el
	//			diagrama de flujo y el pseudoc�digo que permita determinar el bono que recibir� un
//trabajador.
	Definir antiguedad  Como real
	definir bono Como entero
	
							
	Escribir "Ingrese los a�os de antiguedad"
	leer antiguedad
		
	Si antiguedad>5 Entonces
		bono=1000
	SiNo
		Si antiguedad>4 Entonces
			bono=400
		SiNo
			Si antiguedad>3 Entonces
				bono=300
			SiNo
				Si antiguedad>2 Entonces
					bono=200
				SiNo
					bono=100
				Fin Si
			Fin Si
		Fin Si
	Fin Si
	
	//otra forma mas simple de hacaerlo
	//si (antiguedad <= 5) entonces
	//  bono = antiguedad*100;
	//sino
	//bono = 1000;
	//finsi
	
	Escribir "El bono es: " bono
		
FinAlgoritmo