Algoritmo Ej3_7
	//La empresa de transportes "The Big Old" cuenta con N choferes, de los cuales se conoce su nombre y los kil�metros que conducen durante
	//cada d�a de la semana, esa informaci�n se guarda en un arreglo de N x 6. Se requiere un algoritmo que capture esa informaci�n y 
	//genere un vector con el total de kil�metros que recorri� cada chofer durante la semana. Realice el algoritmo y repres�ntelo 
	//mediante el diagrama de flujo y el pseudoc�digo. Al final se debe presentar un reporte donde se muestre el nombre del chofer, 
	//los kil�metros recorridos cada d�a y el total de �stos
	
	definir cantidadChoferes Como Entero
	
	Dimension dias(6)
	dias(0)= "Lunes"
 	dias(1)= "Martes"
	dias(2)="Mi�rcoles"
	dias(3)="Jueves"
	dias(4)="Viernes"
	dias(5)="S�bado"
	
	Escribir  "Ingrese la cantidad de choferes"
	Leer  cantidadChoferes
	
	Dimension nombre(cantidadChoferes)
	dimension kmRecorridosDiarios(cantidadChoferes,6)
	Dimension kmRecorridosSemanal(cantidadChoferes)
	
	Para i<-0 Hasta cantidadChoferes-1 Con Paso 1 Hacer
		Escribir "Ingrese el nombre del chofer ", i+1
		Leer nombre(i)
		
		Para e<-0 Hasta 5 Con Paso 1 Hacer
			Escribir "Ingrese la cantidad de Km. recorridos el " dias(e)
			Leer kmRecorridosDiarios[i,e]
			kmRecorridosSemanal(i)=kmRecorridosSemanal(i)+kmRecorridosDiarios(i,e)
			
		Fin Para
	FinPara
	
	para i=0 hasta cantidadChoferes-1 Con Paso 1 hacer
		
		Escribir "El total de los km recorridos en la semana por " nombre(i) " es " kmRecorridosSemanal(i)
		
		
	FinPara
	
	
	
FinAlgoritmo


