Algoritmo Ejer1_6
	//Se requiere obtener el área de la figura 1.3 de la forma A. Para resolver este problema se
//puede partir de que está formada por tres figuras: dos triángulos rectángulos, con H como
	//hipotenusa y R como uno de los catetos, que también es el radio de la otra figura, una
	//semicircunferencia que forma la parte circular (ver forma B). Realice un algoritmo para resolver
	//		el problema y represéntelo mediante el diagrama de flujo y el pseudocódigo.

	Definir radio, hipotenusa, areaCirculo, catetoFaltante, areaTriangulo, areaFigura Como Real
	Escribir "Ingrese el radio"
	leer radio
	Escribir  "Ingrese la hipotenusa"
	leer hipotenusa
	areaCirculo=(radio*radio*PI)/2
	catetoFaltante=rc((hipotenusa*hipotenusa)-(radio*radio))
	areaTriangulo=((catetoFaltante*radio)/2)*2
	areaFigura=areaTriangulo+areaCirculo
	Escribir "El área de la figura es: " areaFigura
	
FinAlgoritmo
