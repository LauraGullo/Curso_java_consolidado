Algoritmo Ejer12
	//Realice un diagrama de flujo y pseudocódigo que representen el algoritmo para
	//determinar cuánto pagará finalmente una persona por un artículo equis, considerando
	//que tiene un descuento de 20%, y debe pagar 15% de IVA (debe mostrar el precio con
	//descuento y el precio final).

	Definir costoArtículo, IVA, descuento Como real
	
	Escribir "Ingrese el costo del artículo"
	leer costoArtículo
	IVA<-costoArtículo*0.15
	descuento<-costoArtículo*0.20
	precioDescuento<-costoArtículo-descuento
	precioFinal<-precioDescuento+IVA
	Escribir "El precio con el descuento es de: " precioDescuento		
	Escribir "El pago total por el artículo es de: " precioFinal
	
FinAlgoritmo
