Algoritmo Ejer20
	//Realice un algoritmo para resolver el siguiente problema: una fábrica de pantalones
	//desea calcular cuál es el precio final de venta y cuánto ganará por los N pantalones que
	//produzca con el corte de alguno de sus modelos, para esto se cuenta con la siguiente
	//información:
	//	a. Tiene dos modelos A y B, tallas 30, 32 y 36 para ambos modelos.
	//		b. Para el modelo A se utiliza 1.50 m de tela, y para el B 1.80 m.
	//				c. Al modelo A se le carga 80 % del costo de la tela, por mano de obra. Al modelo B
	//				se le carga 95 % del costo de la tela, por el mismo concepto.
	//				d. A las tallas 32 y 36 se les carga 4 % del costo generado por mano de obra y tela,
	//				sin importar el modelo.
	//				e. Cuando se realiza el corte para fabricar una prenda sólo se hace de un solo
	//					modelo y una sola talla.
	//					f. Finalmente, a la suma de estos costos se les carga 30%, que representa la
	//					ganancia extra de la tienda.

	Definir precioVenta, ganancia, cargoTalle, mtsTela, manoObra, precioTela, costoTela, gananciaTotal Como real
	definir talle, nPantalones, modelo Como Entero
	
	Escribir "Ingrese el modelo: 1_Modelo A o 2_Modelo B"
	Repetir
		leer modelo
		si modelo<1 o modelo>2 Entonces
			Escribir "Valor incorrecto. Colocar valor nuevamente"
		FinSi
	Hasta Que modelo=1 o modelo=2
	
	Escribir "Ingrese el precio de la tela por metro"
	leer precioTela
	
	Escribir "Ingrese el talle: 30, 32 ó 36 "
	Repetir
	Leer  talle
	si talle<>30 y talle<>32 y talle<>36 Entonces
		Escribir "El talle ingresado es incorrecto. Vuelva a ingresar el talle"
	FinSi
	Hasta Que talle=30 o talle=32 o talle=36
	
	Escribir "Ingrese el total de pantalones que se produjeron"
	leer nPantalones
				 
	si modelo=1 Entonces
		mtsTela=1.5
		manoObra=(precioTela*mtsTela)*0.8 
	SiNo
		mtsTela=1.8
		manoObra=(precioTela*mtsTela)*0.95
	Fin Si
	costoTela=(precioTela*mtsTela)+manoObra
	
	Si talle>=32 Entonces		
		cargoTalle=costoTela*0.04
	
	Fin Si
	ganancia=(costoTela+cargoTalle)*0.3
	precioVenta=costoTela+cargoTalle+ganancia
	
	gananciaTotal=precioVenta*nPantalones
	
	Escribir "El precio final de venta es: " precioVenta
	Escribir "La ganancia por el total de pantalones que produce es: " gananciaTotal
	
		
FinAlgoritmo