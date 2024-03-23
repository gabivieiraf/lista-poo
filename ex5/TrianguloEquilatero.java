package ex5;

public class TrianguloEquilatero {
	double lado, perimetro, area;
	
	public TrianguloEquilatero(double lado) {
		this.lado = lado;
	}
	
	public void calcArea() {
		area = (lado*Math.sqrt(3))/2;
		System.out.println("Area = " + area);
	}
	
	public void calcPerimetro() {
		perimetro = 3*lado;
		System.out.println("Perimetro = " + perimetro);
	}
	
}
