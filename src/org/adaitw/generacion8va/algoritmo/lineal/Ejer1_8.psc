Algoritmo Ejer1_8
	//Se requiere obtener la distancia entre dos puntos en el plano cartesiano, tal y como se
	//muestra en la figura 1.4. Realice un diagrama de flujo y pseudocódigo que representen el
	//algoritmo para obtener la distancia entre esos puntos
	Definir abscisa1, abscisa2, ordenada1, ordenada2, catetoX, catetoY, distancia Como Real
	Escribir "Ingrese abscisa 1"
	leer abscisa1
	Escribir "Ingrese abscisa 2"
	leer abscisa2
	Escribir "Ingrese ordenada 1"
	leer ordenada1
	Escribir "Ingrese ordenada 2"
	leer ordenada2
	catetoY=ordenada2-ordenada1
	catetoX=abscisa2-abscisa1
	distancia=rc((catetoX*catetoX)+(catetoY*catetoY))
	Escribir "La distancia entre los puntos es: " distancia
	
	
	
FinAlgoritmo
