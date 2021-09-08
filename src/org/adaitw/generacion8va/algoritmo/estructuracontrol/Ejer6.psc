Algoritmo Ejer6
	//Realice el diagrama de flujo y el pseudocódigo que muestren el algoritmo para
	//determinar el costo y el descuento que tendrá un artículo. Considere que si su precio es
	//	mayor o igual a $200 se le aplica un descuento de 15%, y si su precio es mayor a $100
	//		pero menor a $200, el descuento es de 12%, y si es menor a $100, sólo 10%
	Definir costoTotal, descuento, precio Como real

					
	Escribir "Ingrese el precio del producto"
	leer precio
		
	Si precio>=200 Entonces
		descuento=0.15*precio
	SiNo
		Si precio>=100 Entonces
			descuento=0.12*precio
		SiNo
			descuento=0.1*precio
			
		Fin Si
	Fin Si
	
	costoTotal=precio-descuento
	Escribir "El descuento es: " descuento
	Escribir "El costo total del producto es: " costoTotal 
	
FinAlgoritmo
