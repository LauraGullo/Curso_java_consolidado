Algoritmo Ejer2_2
	//Realice un algoritmo para determinar si un número es positivo o negativo
	Definir num Como real
	definir resultado Como Caracter
		
	Escribir "Ingrese el número a determinar"
	leer num
	Si num=0 Entonces
		resultado="neutro"
	SiNo
		Si num<0 Entonces
			resultado="negativo"
		SiNo
			resultado="positivo"
		Fin Si
	Fin Si
		
	Escribir "El número es: " resultado
		
FinAlgoritmo
