Algoritmo Ejer2_6
	//La langosta ahumada" es una empresa dedicada a ofrecer banquetes; sus
//tarifas son las siguientes: el costo de platillo por persona es de $950.00, pero si el
		//número de personas es mayor a 200 pero menor o igual a 300, el costo es de $850.00.
		//Para más de 300 personas el costo por platillo es de $750.00. Se requiere un algoritmo
		//		que ayude a determinar el presupuesto que se debe presentar a los clientes que deseen
		//		realizar un evento.
	Definir costoPlatillo, cantidadPersonas Como entero
			
	Escribir "Ingrese la cantidad de comensales"
	leer cantidadPersonas
	
	Si cantidadPersonas>300 Entonces
		costoPlatillo=750
		
	SiNo
		Si cantidadPersonas>200 Entonces
			costoPlatillo=850
		SiNo
			costoPlatillo=950
		Fin Si
	
	Fin Si
	
	Escribir "El presupuesto es: " costoPlatillo*cantidadPersonas
		
FinAlgoritmo
