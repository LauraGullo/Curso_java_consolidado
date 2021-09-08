Algoritmo Ej2 
	//2. Realice y represente mediante un diagrama de flujo el algoritmo para obtener el producto de dos matrices de orden M x N y P x Q
	Dimension matriz1[3,2]
	matriz1[0,0]<-1
	matriz1[0,1]<-2
	matriz1[1,0]<-3
	matriz1[1,1]<-4
	matriz1[2,0]<-5
	matriz1[2,1]<-6
	
	Dimension matriz2[2,3]
	matriz2[0,0]<-1
	matriz2[0,1]<-2
	matriz2[0,2]<-3
	matriz2[1,0]<-3
	matriz2[1,1]<-4
	matriz2[1,2]<-5
		
	dimension producto(3,3)
		
	escribir "El producto de 2 matrices es:"
	
	para  i = 0 hasta 2 con paso 1 hacer
		para j = 0 hasta 2 con paso 1 hacer  
			producto(i,j)=0
	     	para  k = 0 hasta 1 con paso 1 hacer
				producto[i,j] =producto(i,j)+ matriz1[i,k] * matriz2[k,j];
			finpara
		fin para 
	fin para

	para i=0 hasta 2
		para j=0 hasta 2
			escribir "(" i "," j ")" producto[i,j] 
		FinPara
	finpara

FinAlgoritmo
