Algoritmo Ejer14
	//Realice un algoritmo que, con base en una calificación proporcionada (0-10), indique con
	//letra la calificación que le corresponde: 10 es "A", 9 es "B", 8 es "C", 7 y 6 son "D", y de 5
	//a 0 son "F".
	Definir calificacion Como entero
	Definir letra Como Caracter
								
	Escribir "Ingrese la caificación (0-10)"
	
	Repetir
		leer calificacion
		Si calificacion<0 o calificacion>10 Entonces
			Escribir "valor incorrecto. Ingrese valor nuevamente"
		FinSi
	Hasta Que calificacion>=0 y calificacion<=10
	
	si calificacion=10 Entonces
		letra="A"	
	SiNo
		Si calificacion=9 Entonces
			letra="B"
		SiNo
			Si calificacion=8 Entonces
				letra="C"
			SiNo
				Si calificacion=6 o calificacion=5 Entonces
					letra="D"
				SiNo
					letra="F"
				Fin Si
			fin si
		Fin Si
	Fin Si
		
	Escribir "La calificación que le corresponde es: " letra
		
FinAlgoritmo