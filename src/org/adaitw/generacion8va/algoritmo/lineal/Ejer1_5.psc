Algoritmo Ejer1_5
	//Una empresa constructora vende terrenos con la forma A de la figura 1.2. Realice un
	//algoritmo y represéntelo mediante un diagrama de flujo y el pseudocódigo para obtener el área
	//		respectiva de un terreno de medidas de cualquier valor
	Definir areaTriangulo, areaRectangulo, baseRectangulo, baseTriangulo, alturaRectangulo, alturaTriangulo, areaTerreno  Como Real
	Escribir "Ingrese la base del rectangulo"
	Leer baseRectangulo
	Escribir "Ingrese la altura del rectangulo"
	Leer alturaRectangulo
	areaRectangulo<-baseRectangulo*alturaRectangulo
	
	
	Escribir "Ingrese la base del triangulo"
	Leer baseTriangulo
	Escribir "Ingrese la altura del triangulo"
	Leer alturaTriangulo
	areaTriangulo<-(baseTriangulo*alturaTriangulo)/2
	
	areaTerreno<-areaRectangulo+areaTriangulo
	Escribir "El area es del terreno es: " areaTerreno
	
	
FinAlgoritmo
