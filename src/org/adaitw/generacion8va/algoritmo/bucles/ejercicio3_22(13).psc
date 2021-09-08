Algoritmo Ej3_13
	//13. Realice un algoritmo que lea un vector de cien ("10") elementos y que calcule su magnitud.
	definir magnitud, suma Como Real
	suma=0
	magnitud=0
	
	Dimension vector(10)
	vector(0)=1
	vector(1)=2
	vector(2)=3
	vector(3)=4
	vector(4)=5
	vector(5)=6
	vector(6)=7
	vector(7)=8
	vector(8)=9
	vector(9)=10
	
	para i=0 hasta 9 con paso 1 
		suma=suma+vector(i)^2
		magnitud=rc(suma)
	FinPara
	escribir "La magnitud del vector es: " magnitud
FinAlgoritmo
