Algoritmo Ejer2_13
	//Fábricas "El cometa" produce artículos con claves (1, 2, 3, 4, 5 y 6). Se requiere un
//algoritmo para calcular los precios de venta, para esto hay que considerar lo siguiente:
		//		Costo de producción = materia prima + mano de obra + gastos de fabricación.
		//		Precio de venta = costo de producción + 45 % de costo de producción.
		//	El costo de la mano de obra se obtiene de la siguiente forma: para los productos con
		//			clave 3 o 4 se carga 75 % del costo de la materia prima; para los que tienen clave 1 y 5 se carga
		//				80 %, y para los que tienen clave 2 o 6, 85 %.
		//					Para calcular el gasto de fabricación se considera que si el artículo que se va a producir
		//							tiene claves 2 o 5, este gasto representa 30 % sobre el costo de la materia prima; si las claves
		//								son 3 o 6, representa 35 %; si las claves son 1 o 4, representa 28 %. La materia prima tiene el
		//									mismo costo para cualquier clave.
	Definir costoProduccion, materiaPrima, manoObra, gastoFabricacion, precioVenta   Como Real 
	Definir claveArticulo Como Entero
				
	Escribir "Ingrese el costo de la materia prima"
	leer materiaPrima
	Escribir "Ingrese la clave del artículo: 1, 2, 3, 4, 5, ó 6"
	Repetir
		
		leer claveArticulo
		Si claveArticulo<1 o claveArticulo>6 Entonces
			Escribir "valor incorrecto. Ingrese valor nuevamente"
		FinSi
	Hasta Que claveArticulo>=1 y claveArticulo<=6
	
	Si claveArticulo=3 o claveArticulo=4 Entonces
		manoObra=0.75*materiaPrima
	SiNo
		Si claveArticulo=1 o claveArticulo=5 Entonces
			manoObra=0.8*materiaPrima
		SiNo
			manoObra=0.85*materiaPrima
		Fin Si
	Fin Si
	Si claveArticulo=2 o claveArticulo=5 Entonces
		gastoFabricacion=0.30*materiaPrima
	SiNo
		Si claveArticulo=3 o claveArticulo=6 Entonces
			gastoFabricacion=0.35*materiaPrima
		SiNo
			gastoFabricacion=0.28*materiaPrima
		Fin Si
	Fin Si
	
	costoProduccion=materiaPrima+manoObra+gastoFabricacion
	precioVenta=	costoProduccion*0.45+costoProduccion
	Escribir "El precio de venta es: " precioVenta
FinAlgoritmo
