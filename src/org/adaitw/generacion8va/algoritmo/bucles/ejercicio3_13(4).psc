Algoritmo ej4
	//4. Realice un algoritmo para obtener una matriz como el resultado de la resta de dos matrices de orden M x N.
	Dimension matriz1[2,2]
	matriz1[0,0]<-1
	matriz1[0,1]<-2
	matriz1[1,0]<-6
	matriz1[1,1]<-9
	
	Dimension matriz2[2,2]
	matriz2[0,0]<-1
	matriz2[0,1]<-7
	matriz2[1,0]<-6
	matriz2[1,1]<-3
	
	Dimension MatrizResta(2,2)
	
	Escribir "Matriz resultado de la resta de las matrices: "
	para i=0 hasta 1 Con Paso 1 Hacer
		para e=0 hasta 1 con paso 1 hacer
			MatrizResta(i,e)=matriz1(i,e)-matriz2(i,e)
			Escribir  "(" i "," e "): "  MatrizResta(i,e)
		FinPara
	FinPara
FinAlgoritmo
