Algoritmo Ej3_8
	//En un arreglo se tienen registradas las ventas de cinco empleados durante cinco días de la semana. Se requiere determinar cuál fue la 
	//venta mayor realizada. 
	
	Definir mayorVenta Como Entero
	mayorVenta=0
	
	Dimension ventas[5,5]
	ventas[0,0]<-1
	ventas[0,1]<-2
	ventas[0,2]<-3
	ventas[0,3]<-4
	ventas[0,4]<-5
	ventas[1,0]<-6
	ventas[1,1]<-9
	ventas[1,2]<-7
	ventas[1,3]<-7
	ventas[1,4]<-1
	ventas[2,0]<-6
	ventas[2,1]<-9
	ventas[3,4]<-8
	ventas[2,2]<-7
	ventas[2,3]<-7
	ventas[2,4]<-0
	ventas[3,0]<-14
	ventas[3,1]<-9
	ventas[3,2]<-7
	ventas[3,3]<-7
	ventas[4,0]<-10
	ventas[4,1]<-19
	ventas[4,2]<-7
	ventas[4,3]<-7
	ventas[4,4]<-1
	
	Para i<-0 Hasta 4 Hacer
		Para e<-0 Hasta 4 Hacer
			Si ventas[i,e]>mayorVenta Entonces
				mayorVenta <- ventas[i,e]
			FinSi
		FinPara
	FinPara
	
	Escribir "La mayor venta realizada fue: " mayorVenta
	
FinAlgoritmo
