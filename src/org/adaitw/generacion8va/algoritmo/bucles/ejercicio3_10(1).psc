Algoritmo Ej10
	//1. Realice y represente mediante un diagrama de flujo el algoritmo para obtener la matriz transpuesta de cualquier matriz de orden M x N
	
	Dimension matriz1[3,3]
	matriz1[0,0]<-1
	matriz1[0,1]<-2
	matriz1(0,2)=3
	matriz1[1,0]=4
	matriz1[1,1]<-5
	matriz1(1,2)=6
	matriz1(2,0)=7
	matriz1(2,1)=8
	matriz1(2,2)=9
	
	
	Escribir "Matriz traspuesta: " 
	
	para e=0 hasta 2 con paso 1 hacer
		para i=0 hasta 2 Con Paso 1 Hacer
			Escribir "(" i "," e "): " matriz1(e,i)
		FinPara
	FinPara
	
FinAlgoritmo
