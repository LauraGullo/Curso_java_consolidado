Algoritmo Ejer3_5
	//Realice un algoritmo que lea un vector de seis elementos e intercambie las posiciones de sus elementos, de tal forma que el primer 
	//elemento pase a ser el último y el último el primero, el segundo el penúltimo y así sucesivamente, e imprima ese vector.
	
	Dimension valores[6]
	valores(0) = 1
	valores(1)= 2
	valores(2) = 3
	valores(3)= 4
	valores(4) = 5
	valores(5) = 6
	
	j=0
	Para i=0 Hasta 2 Con Paso 1 Hacer
		temporal=valores(i)
		valores(i)=valores(5-j)
		valores(5-j)=temporal
		j=j+1	
	Fin Para
	
	para i=0 hasta 5 Con Paso 1 hacer	
		escribir "valores (" i "):" valores(i)
				
	fin para
	
	
	
	
FinAlgoritmo
