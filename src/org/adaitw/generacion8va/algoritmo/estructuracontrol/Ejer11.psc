Algoritmo Ejer11
	//Se les dará un bono por antigüedad a los empleados de una tienda. Si tienen un año, se
	//les dará $100; si tienen 2 años, $200, y así sucesivamente hasta los 5 años. Para los que
	//		tengan más de 5, el bono será de $1000. Realice un algoritmo y represéntelo mediante el
	//			diagrama de flujo y el pseudocódigo que permita determinar el bono que recibirá un
//trabajador.
	Definir antiguedad  Como real
	definir bono Como entero
	
							
	Escribir "Ingrese los años de antiguedad"
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