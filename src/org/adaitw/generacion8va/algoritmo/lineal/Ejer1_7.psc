Algoritmo Ejer1_7
	//Un productor de leche lleva el registro de lo que produce en litros, pero cuando entrega
	//le pagan en galones. Realice un algoritmo, y repres�ntelo mediante un diagrama de flujo y el
	//	pseudoc�digo, que ayude al productor a saber cu�nto recibir� por la entrega de su producci�n
	//	de un d�a (1 gal�n = 3.785 litros).
	Definir  cantidadLitros, precioGalon, cantidadGalones, ganancia  Como Real
	Escribir "Ingrese la cantidad de litros vendidos en un dia"
	Leer cantidadlitros
	Escribir "ingrese el precio del galon"
	leer precioGalon
	cantidadGalones<-cantidadlitros/3785
	ganancia<-cantidadGalones*precioGalon
	Escribir "La ganancia es de: " ganancia	
	
FinAlgoritmo
