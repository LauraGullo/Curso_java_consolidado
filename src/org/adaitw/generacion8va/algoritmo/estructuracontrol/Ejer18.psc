Algoritmo Ejer18
	//Realice un algoritmo y repres�ntelo mediante el diagrama de flujo, el pseudoc�digo y el
	//diagrama N/S que permitan determinar la cantidad del bono navide�o que recibir� un
	//empleado de una tienda, considerando que si su antig�edad es mayor a cuatro a�os o
	//	su sueldo es menor de dos mil pesos, le corresponder� 25 % de su sueldo, y en caso
	//	contrario s�lo le corresponder� 20 % de �ste.

	Definir antiguedad, sueldo, bono Como real
	
	Escribir "Ingrese su sueldo"
	leer sueldo
	Escribir "Ingrese su antiguedad en a�os"
	leer antiguedad
			 
	si antiguedad>4 Entonces
		bono= sueldo*0.25
	SiNo
		Si sueldo<2000 Entonces
			bono=sueldo*0.25
		SiNo
			bono=sueldo*0.2
		Fin Si
	Fin Si
			
	Escribir "El bono que recibir� es " bono
	
		
FinAlgoritmo