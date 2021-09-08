Algoritmo Ejer2_1
	//Se desea implementar un algoritmo para determinar cuál de dos valores
	//proporcionados es el mayor
	Definir primerValor, segundoValor, mayorValor Como real
		
	Escribir "Ingrese el primer valor a comparar"
	leer primerValor
	Escribir "Ingrese el segundo valor a comparar"
	leer segundoValor
	Si primerValor>segundoValor Entonces
		mayorValor=primerValor
	SiNo
		mayorValor=segundoValor
	Fin Si
	
	Escribir "El valor mas alto es: " mayorValor
	
	
FinAlgoritmo
