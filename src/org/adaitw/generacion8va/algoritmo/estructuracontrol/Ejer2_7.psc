Algoritmo Ejer2_7
	//La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo de
	//uva, la cual se clasifica en tipos A y B, y adem�s en tama�os 1 y 2. Cuando se realiza la
	//venta del producto, �sta es de un solo tipo y tama�o, se requiere determinar cu�nto
//recibir� un productor por la uva que entrega en un embarque, considerando lo siguiente:
//	si es de tipo A, se le cargan 20$ al precio inicial cuando es de tama�o 1; y 30$ si es de
//	tama�o 2. Si es de tipo B, se rebajan 30$ cuando es de tama�o 1, y 50$ cuando es de
//tama�o 2
	Definir kilos, precioInicial, ganancia Como real
	Definir tama�o, tipo Como Entero
			
	Escribir "Ingrese la cantidad de kilos"
	leer kilos
	escribir "Ingrese el precio inicial por kilo"
	Leer precioInicial
	Escribir "Ingrese tipo de uva: 1 para tipo A o 2 para tipo B"
	Repetir
		leer tipo
		Si tipo<1 o tipo>2 Entonces
			Escribir "valor incorrecto. Ingrese valor nuevamente"
		FinSi
	Hasta Que tipo>=1 y tipo<=2
		
	Escribir "Ingrese tama�o de uva 1 o 2"
	Repetir
		Leer tama�o
		Si tama�o<1 o tama�o>2 Entonces
			Escribir "valor incorrecto. Ingrese valor nuevamente"
		FinSi

	Hasta Que tama�o=1 o tama�o=2
		
	Si tipo=1 Entonces
		Si tama�o=1 Entonces
			ganancia=(precioInicial+20)*kilos
		SiNo
			ganancia=(precioInicial+30)*kilos
		Fin Si
		
	SiNo
		Si tama�o=1 Entonces
			ganancia=(precioInicial-30)*kilos
		SiNo
			ganancia=(precioInicial-50)*kilos
		Fin Si
	
	Fin Si
	
	
	Escribir "La ganancia total es: " ganancia
FinAlgoritmo
