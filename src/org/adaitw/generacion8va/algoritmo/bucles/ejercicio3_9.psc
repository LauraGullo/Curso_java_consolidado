Algoritmo Ej3_9
	
	//Realice un algoritmo para obtener una matriz como el resultado de la suma de dos matrices de orden M x N. 
	
	Dimension matriz1[2,2]
	matriz1[0,0]<-1
	matriz1[0,1]<-2
	matriz1[1,0]<-6
	matriz1[1,1]<-9
		
	Dimension matriz2[2,2]
	matriz2[0,0]<-1
	matriz2[0,1]<-7
	matriz2[1,0]<-6
	matriz2[1,1]<-9
		
	Dimension matriz3(2,2)
	
	Escribir "Matriz C: "
	para i=0 hasta 1 Con Paso 1 Hacer
		para e=0 hasta 1 con paso 1 hacer
			matriz3(i,e)=matriz1(i,e)+matriz2(i,e)
			Escribir  "(" i "," e "): " matriz3(i,e)
		FinPara
	FinPara

FinAlgoritmo
