Algoritmo Ejer10
	//Represente un algoritmo mediante un diagrama de flujo y el pseudocódigo para
	//determinar a qué lugar podrá ir de vacaciones una persona, considerando que la línea de
	//autobuses "La tortuga" cobra por kilómetro recorrido. Se debe considerar el costo del
	//pasaje tanto de ida, como de vuelta; los datos que se conocen y que son fijos son:
	//	México, 750 km; P.V., 800 km; Acapulco, 1200 km, y Cancún, 1800 km. También se debe
	//	considerar la posibilidad de tener que quedarse en casa.
	Definir dinero, precioXKm, Km  Como real
	definir destino Como caracter
	
							
	Escribir "Ingrese cuanto dinero desea gastar"
	leer dinero
	
	escribir "Ingrese el precio por Km."
	leer precioXKm
	
	Km=(dinero/precioXKm)/2
	
	Si km>=1800 Entonces
		destino="Cancún"
	SiNo
		Si km>=1200 Entonces
			destino="Acapulco"
		SiNo
			Si km>=800 Entonces
				destino="P.V."
			SiNo
				Si km>=750 Entonces
					destino="México"
				SiNo
					destino="Considere la posibilidad de quedarse en casa"
				Fin Si
			Fin Si
		Fin Si
	Fin Si
	
	
		
	
	Escribir "Su destino es: " destino
	
	
	
FinAlgoritmo