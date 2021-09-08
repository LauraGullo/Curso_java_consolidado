Algoritmo Ej5
	//5. Realice un diagrama de flujo que represente el algoritmo para determinar si una matriz es de tipo diagonal: es una matriz cuadrada 
	//en la cual todos sus elementos son cero, excepto los electos de la diagonal principal.
	definir resultado Como Logico
	resultado=Verdadero
	Definir filasColumnas Como Entero
	
	Escribir "Introduzca el valor de filas y columnas (deben ser iguales) que desea en la matriz: "
	Leer filasColumnas
	dimension matriz[filasColumnas,filasColumnas]	
	
		Para i<-0 Hasta filasColumnas-1 Con Paso 1 Hacer
			Para j<-0 Hasta filasColumnas-1 Con Paso 1 Hacer
				Escribir "Introduzca el valor de los indices: ", i, " y ", j
				Leer matriz[i,j]
			Fin Para
		Fin Para
	
		Para i<-0 Hasta filasColumnas-1 Con Paso 1 Hacer
			para j=0 hasta filasColumnas-1 con paso 1 hacer
			 	si( i<>j y matriz(i,j)<>0 ) O ( i=j y matriz(i,i)=0)
					resultado= falso
				FinSi
			FinPara
		FinPara
		
	si resultado=Falso
		Escribir "La matriz no es de tipo diagonal"
	sino
		Escribir "Matriz de tipo diagonal"
	FinSi
	



	
	
	
FinAlgoritmo
