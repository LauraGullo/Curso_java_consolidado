Algoritmo Ej3_7
	//7. Realice un algoritmo que lea un vector y a partir de él forme un segundo vector, de tal forma que el primer elemento pase a ser 
	//el segundo, el segundo pase a ser el tercero, el último pase a ser el primero, y así sucesivamente. Represéntelo mediante un diagrama de 
	//flujo.

	
	Dimension valores[6]
	valores(0) = 1
	valores(1)= 2
	valores(2) = 3
	valores(3)= 4
	valores(4) = 5
	valores(5) = 6
	
	Dimension  nuevoarreglo(6)
	
	para i=0 hasta 5 con paso 1 hacer
		si i=6-1 Entonces
			nuevoarreglo(0)=valores(i)
		SiNo
			nuevoarreglo(i+1)=valores(i)
		FinSi
	FinPara
	
	para i=0 hasta 5 Con Paso 1 hacer	
		escribir "Posición " i ": " nuevoarreglo(i)
		
	fin para
FinAlgoritmo
