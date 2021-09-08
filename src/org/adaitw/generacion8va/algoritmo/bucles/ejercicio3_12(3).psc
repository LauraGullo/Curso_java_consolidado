Algoritmo Ej3
	//3. Realice y represente mediante diagrama de flujo y pseudocódigo un algoritmo que lea un arreglo de M filas y N columnas y que calcule 
	//la suma de los elementos de la diagonal principal.

	definir suma Como Real
	suma=0
	
	Dimension matriz[3,3]
	matriz[0,0]<-1
	matriz[0,1]<-2
	matriz(0,2)=0
	matriz[1,0]<-6
	matriz[1,1]<-5
	matriz(1,2)=0
	matriz(2,0)=5
	matriz(2,1)=1
	matriz(2,2)=0
			
	para i=0 hasta 2 Con Paso 1 Hacer
		para e=0 hasta 2 con paso 1 hacer
			si i=e entonces
				suma=suma+matriz(i,i)
				finsi
		FinPara
	FinPara
	Escribir "La suma de los elementos de la diagonal principal es " suma
	
FinAlgoritmo
