Algoritmo ej3_1
	
	//Se requiere obtener la suma de las cantidades contenidas en un arreglo de 10 elementos. Realice el algoritmo y repres�ntelo mediante el 
	//diagrama de flujo y el pseudoc�digo.
	
	suma=0
	
	dimension cantidades(10)
	para i<-0 hasta 10-1 Con Paso 1 Hacer
		Escribir "ingrese cantidad del elemento " i+1
		leer cantidades(i)		
		suma=suma+cantidades(i)
		
	FinPara
	Escribir "La suma de las cantidades es: " suma
	
	
FinAlgoritmo
