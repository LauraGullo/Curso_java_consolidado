Algoritmo Ejer14
	//Una empresa desea determinar el monto de un cheque que debe proporcionar a uno de
	//sus empleados que tendr� que ir por equis n�mero de d�as a la ciudad de Monterrey; los
//gastos que cubre la empresa son: hotel, comida y 100.00 pesos diarios para otros
	//	gastos. El monto debe estar desglosado para cada concepto. Realice un diagrama de
	//		flujo y pseudoc�digo que representen el algoritmo que determine el monto del cheque.
	
	Definir gastoHotel, gastoComida, dias, costoComida, costoHotel, otrosGastos Como real
	
	Escribir "Ingrese la cantidad de d�as que viajar�"
	leer dias
	Escribir "Ingrese el costo del hotel por d�a"
	Leer costoHotel
	Escribir "Ingrese el costo de la comida por d�a"
	leer costoComida
	gastoComida<-costoComida*dias
	gastoHotel<-costoHotel*dias
	otrosGastos<-dias*100 
	
	Escribir "El pago por concepto de hotel es de: " gastoHotel
	Escribir "El pago por concepto de comida es de: " gastoComida
	Escribir "El pago por concepto de otros gastos es de: " otrosGastos
	Escribir "El monto total del cheque es de: " gastoComida+gastoHotel+otrosGastos
	
FinAlgoritmo
