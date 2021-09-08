Algoritmo Ejer5
	//Se tiene el nombre y la edad de tres personas. Se desea saber el nombre y la edad de la
	//persona de menor edad. 
	Definir edad1, edad2, edad3, menorEdad Como entero
	definir nombre1, nombre2, nombre3 Como Caracter
				
	Escribir "Ingrese el primer nombre"
	leer nombre1
	Escribir "Ingrese la edad correspondiente"
	leer edad1
	Escribir "Ingrese el segundo nombre"
	leer nombre2
	Escribir "Ingrese la edad correspondiente"
	leer edad2
	Escribir "Ingrese el tercer nombre"
	leer nombre3
	Escribir "Ingrese la edad correspondiente"
	leer edad3
	
	Si edad1<edad2 Entonces
		Si edad1<edad3 Entonces
			Escribir "La persona de menor edad es: " nombre1 " " edad1 " años"
		SiNo
			Escribir "La persona de menor edad es: " nombre3 " " edad3 " años"
		Fin Si
	SiNo
		Si edad2<edad3 Entonces
			Escribir "La persona de menor edad es: " nombre2 " " edad2 " años"
		SiNo
			Escribir "La persona de menor edad es: " nombre3 " " edad3 " años"
			
		Fin Si
	Fin Si
	
FinAlgoritmo
