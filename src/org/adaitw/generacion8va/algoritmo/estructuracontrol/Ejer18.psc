Algoritmo Ejer18
	//Realice un algoritmo y represéntelo mediante el diagrama de flujo, el pseudocódigo y el
	//diagrama N/S que permitan determinar la cantidad del bono navideño que recibirá un
	//empleado de una tienda, considerando que si su antigüedad es mayor a cuatro años o
	//	su sueldo es menor de dos mil pesos, le corresponderá 25 % de su sueldo, y en caso
	//	contrario sólo le corresponderá 20 % de éste.

	Definir antiguedad, sueldo, bono Como real
	
	Escribir "Ingrese su sueldo"
	leer sueldo
	Escribir "Ingrese su antiguedad en años"
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
			
	Escribir "El bono que recibirá es " bono
	
		
FinAlgoritmo