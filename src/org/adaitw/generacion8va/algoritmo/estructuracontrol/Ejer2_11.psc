Algoritmo Ejer2_11
	//"El náufrago satisfecho" ofrece hamburguesas sencillas, dobles y triples, las
	//cuales tienen un costo de $20.00, $25.00 y $28.00 respectivamente. La empresa acepta
	//tarjetas de crédito con un cargo de 5 % sobre la compra. Suponiendo que los clientes
	//adquieren sólo un tipo de hamburguesa, realice un algoritmo para determinar cuánto
		//	debe pagar una persona por N hamburguesas. 
    Definir cargoTarjeta, costoTotal Como real
	Definir costoHamburguesa, nHamburguesas, tipoHamburguesa, tipoPago Como entero
				
	Escribir "Ingrese la cantidad de hamburguesas"
	leer nHamburguesas
	
	Escribir "Seleccione el tipo de hamburguesa: 1_Sencilla, 2_Doble, 3_Triple"
	repetir
		leer tipoHamburguesa
		si tipoHamburguesa>3 o tipoHamburguesa<1 Entonces
			Escribir "Valor incorrecto. Ingrese valor nuevamente"
		FinSi
	Hasta Que tipoHamburguesa=3 o tipoHamburguesa=2 o tipoHamburguesa=1
	
	Si tipoHamburguesa=1 Entonces
		costoHamburguesa=20
				
	SiNo
		Si tipoHamburguesa=2 Entonces
			costoHamburguesa=25
			
		SiNo
			costoHamburguesa=28
		Fin Si
	
	Fin Si
	
	Escribir "Seleccione tipo de pago: 1_Efvo. 2_Tarjeta"
	repetir
		leer tipoPago
		si tipoPago>2 o tipoPago<1 Entonces
			Escribir "Valor incorrecto. Ingrese valor nuevamente"
		FinSi
	Hasta Que tipoPago=2 o tipoPago=1
	Si tipoPago=1 Entonces
		cargoTarjeta=0
	SiNo
		cargoTarjeta=(nHamburguesas*costoHamburguesa)*0.05
	Fin Si
		
	costoTotal=costoHamburguesa*nHamburguesas+cargoTarjeta
	
	Escribir "El costo total es: " costoTotal
FinAlgoritmo
