Algoritmo Ej3_29_20
	//20. Realice un algoritmo que a partir de la matriz del problema anterior encuentre cuántos elementos tienen valor par y cuántos valores 
	//impares. 
	
	Definir contadorPar, contadorImpar Como Entero
	contadorImpar=0
	contadorPar=0	
	
	Dimension matriz(5,5)
	matriz[0,0] = 19
	matriz[0,1] = 7
	matriz[0,2] = 8
	matriz[0,3] = 7
	matriz[0,4] = 7
	
	matriz[1,0] = 2
	matriz[1,1] = 4
	matriz[1,2] = 8
	matriz[1,3] = 7
	matriz[1,4] = 7
	
	matriz[2,0] = 2
	matriz[2,1] = 7
	matriz[2,2] = 4
	matriz[2,3] = 7
	matriz[2,4] = 7
	
	matriz[3,0] = 2
	matriz[3,1] = 7
	matriz[3,2] = 8
	matriz[3,3] = 1
	matriz[3,4] = 7
	
	matriz[4,0] = 2
	matriz[4,1] = 7
	matriz[4,2] = 8
	matriz[4,3] = 9
	matriz[4,4] = 3
	
	para i=0 hasta 4
		para e=0 hasta 4
			si matriz(i,e)%2=0
				contadorPar=contadorPar+1
			SiNo
				contadorImpar=contadorImpar+1
			FinSi
		finpara
	FinPara
	
	Escribir "Cantidad de valores par: " contadorPar
	Escribir "Cantidad de valores impar: " contadorImpar
	
	
FinAlgoritmo
