Algoritmo Ejer1_11
	//La conagua requiere determinar el pago que debe realizar una persona por el total de
	//metros c�bicos que consume de agua al llenar una alberca (ver figura 2.5). Realice un algoritmo
	//	y repres�ntelo mediante un diagrama de flujo y el pseudoc�digo que permita determinar ese
	//	pago. Las variables requeridas para la soluci�n de este problema se muestran en la tabla 1.12.
	Definir  altura, largo, ancho, costoM2, pagoTotal, volumen  Como Real
	Escribir "Ingrese la altura de la alberca"
	leer altura
	Escribir "Ingrese el largo de la alberca"
	leer largo
	Escribir "Ingrese el ancho de la alberca"
	Leer ancho
    volumen<-ancho*altura*largo
	Escribir "Ingrese el costo por M2"
	leer costoM2
	pagoTotal<-volumen*costoM2
	Escribir "El pago total es de: " pagoTotal
	
FinAlgoritmo
