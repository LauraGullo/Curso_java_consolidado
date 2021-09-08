Algoritmo ej3_2
	//Se requiere un algoritmo para obtener un vector (C) de N elementos que contenga la suma de los elementos correspondientes de otros 
	//dos vectores (A y B). Represéntelo mediante el diagrama de flujo y el pseudocódigo. 
	Definir elementos Como Entero
	Escribir 'Cuantos elementos hay?'
	Leer elementos
	Dimension A[elementos]
	Dimension B[elementos]
	Dimension C[elementos]
	
	Para i<-0 Hasta elementos-1 Con Paso 1 Hacer
		Escribir 'Ingresar el valor del elemento ',i+1,' del vector A'
		Leer A[i]
		Escribir 'Ingresar el valor del elemento ',i+1,' del vector B'
		Leer B[i]
	FinPara
	
	Para i<-0 Hasta elementos-1 Con Paso 1 Hacer
		C[i] <- A[i]+B[i]
		Escribir "Vector C elemento " i+1 ": " C[i]
	FinPara
FinAlgoritmo
