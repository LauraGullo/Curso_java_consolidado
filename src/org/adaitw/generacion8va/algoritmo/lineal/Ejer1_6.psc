Algoritmo Ejer1_6
	//Se requiere obtener el �rea de la figura 1.3 de la forma A. Para resolver este problema se
//puede partir de que est� formada por tres figuras: dos tri�ngulos rect�ngulos, con H como
	//hipotenusa y R como uno de los catetos, que tambi�n es el radio de la otra figura, una
	//semicircunferencia que forma la parte circular (ver forma B). Realice un algoritmo para resolver
	//		el problema y repres�ntelo mediante el diagrama de flujo y el pseudoc�digo.

	Definir radio, hipotenusa, areaCirculo, catetoFaltante, areaTriangulo, areaFigura Como Real
	Escribir "Ingrese el radio"
	leer radio
	Escribir  "Ingrese la hipotenusa"
	leer hipotenusa
	areaCirculo=(radio*radio*PI)/2
	catetoFaltante=rc((hipotenusa*hipotenusa)-(radio*radio))
	areaTriangulo=((catetoFaltante*radio)/2)*2
	areaFigura=areaTriangulo+areaCirculo
	Escribir "El �rea de la figura es: " areaFigura
	
FinAlgoritmo
