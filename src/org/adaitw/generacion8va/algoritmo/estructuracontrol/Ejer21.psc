Algoritmo Ejer21
	//El banco "Bandido de peluche" desea calcular para uno de sus clientes el saldo actual, el
//pago mínimo y el pago para no generar intereses. Los datos que se conocen son: saldo
	//	anterior del cliente, monto de las compras que realizó y el pago que depositó en el corte
	//	anterior. Para calcular el pago mínimo se debe considerar 15% del saldo actual, y para
	//			no generar intereses corresponde 85% del saldo actual, considerando que este saldo
	//			debe incluir 12% de los intereses causados por no realizar el pago mínimo y $200 por
	//			multa por el mismo motivo. Realice el algoritmo correspondiente y represéntelo
	//				mediante el diagrama de flujo y pseudocódigo.
 
	Definir saldoAnterior, compras, pagoAnterior, pagoMinimo, saldoActual, pagoSinInteres, intereses Como real
	definir multa Como Entero
	intereses=0
	pagoMinimo=0
	multa=0
	saldoActual=0
	pagoSinInteres=0
	Escribir "Ingrese el saldo anterior"
	leer saldoAnterior
	Escribir "Ingrese el pago realizado"
	leer pagoAnterior
	
	pagoMinimo=saldoAnterior*0.15
	
	si pagoAnterior<pagoMinimo Entonces
		intereses=saldoAnterior*0.12
		multa=200
	FinSi
	
	Escribir "Ingrese el monto de las compras realizadas"
	leer compras
	
	saldoActual=saldoAnterior+compras+multa+intereses-pagoAnterior
	pagoMinimo=saldoActual*0.15
	pagoSinInteres=saldoActual*0.85
	
	
	Escribir "El saldo actual es: $" saldoActual
	Escribir "El pago mínimo es: $" pagoMinimo
	Escribir "El pago sin intereses es: $" pagoSinInteres
	
		
FinAlgoritmo