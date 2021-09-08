Algoritmo Ej3_7
	//La empresa de transportes "The Big Old" cuenta con N choferes, de los cuales se conoce su nombre y los kilómetros que conducen durante
	//cada día de la semana, esa información se guarda en un arreglo de N x 6. Se requiere un algoritmo que capture esa información y 
	//genere un vector con el total de kilómetros que recorrió cada chofer durante la semana. Realice el algoritmo y represéntelo 
	//mediante el diagrama de flujo y el pseudocódigo. Al final se debe presentar un reporte donde se muestre el nombre del chofer, 
	//los kilómetros recorridos cada día y el total de éstos
	
	definir cantidadChoferes Como Entero
	
	Dimension dias(6)
	dias(0)= "Lunes"
 	dias(1)= "Martes"
	dias(2)="Miércoles"
	dias(3)="Jueves"
	dias(4)="Viernes"
	dias(5)="Sábado"
	
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


