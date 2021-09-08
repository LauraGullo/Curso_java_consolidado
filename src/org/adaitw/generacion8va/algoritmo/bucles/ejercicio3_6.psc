Algoritmo Ej3_6
	//Se requiere determinar cuántos ceros se encuentran en un arreglo de cuatro renglones y cuatro columnas, las cuales almacenan valores 
	//comprendidos entre 0 y 9.
	
	Definir contador Como Entero
	contador=0
	
	Dimension valores[4,4]
	valores(0,0) = 0
	valores(0,1)= 2
	valores(0,2) = 3
	valores(0,3)= 4
	valores(1,0) = 1
	valores(1,1)= 2
	valores(1,2) = 3
	valores(1,3)= 4
	valores(2,0) = 1
	valores(2,1)= 2
	valores(2,2) = 0
	valores(2,3)= 4
	valores(3,0) =0
	valores(3,1)= 2
	valores(3,2) = 3
	valores(3,3)= 4
	
	
	Para i=0 Hasta 3 Con Paso 1 Hacer
		para e=0 hasta 3 Con Paso 1 Hacer
			si valores(i,e)=0
				contador=contador+1
			FinSi
		FinPara
	Fin Para
	
	Escribir "La cantidad de 0 en el arreglo es: " contador
	
FinAlgoritmo
