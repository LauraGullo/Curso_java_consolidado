Algoritmo ej3_4
	//Cierta empresa requiere controlar la existencia de diez productos, los cuales se almacenan en un vector A, mientras que los pedidos de 
	//los clientes de estos productos se almacenan en un vector B. Se requiere generar un tercer vector C con base en los anteriores que represente
	//lo que se requiere comprar para mantener el stock de inventario, para esto se considera lo siguiente: si los valores correspondientes de los 
	//vectores A y B son iguales se almacena este mismo valor, si el valor de B es mayor que el de A se almacena el doble de la diferencia 
	//entre B y A, si se da el caso de que A es mayor que B, se almacena B, que indica lo que se requiere comprar para mantener el stock de 
	//inventario.
	
	dimension existencia(10)
	para i=0 hasta 10-1 Con Paso 1 Hacer
		Escribir "Ingresar stock disponible del producto " i+1
		leer existencia(i)
	FinPara
	dimension pedidos(10)
	para i=0 hasta 10-1 Con Paso 1 Hacer
		Escribir "ingresar pedido del cliente del producto " i+1
		Leer pedidos(i) 
	FinPara
	
	dimension requerimientos(10)
	Para i=0  Hasta 10-1 Con Paso 1 Hacer
		
	
	Si existencia(i)=pedidos(i) Entonces
		escribir "Para mantener el stock del producto " i+1 " faltan " existencia(i) " unidades"
		SiNo
		Si existencia(i)>pedidos(i) Entonces
			escribir "Para mantener el stock del producto " i+1 " faltan " pedidos(i) " unidades"
		SiNo
			escribir "Para mantener el stock del producto " i+1 " faltan " (pedidos(i)-existencia(i))*2 " unidades"
		Fin Si
		
	Fin Si
	fin para
	
FinAlgoritmo
