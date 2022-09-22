package figurasConHerencia;

public class Main {

	public static void main(String[] args) {
		Circulo c1 = new Circulo ("Rojo", 2);
		Figura c2 = new Circulo ("Verde", 4);
		
		Circulo c3;
		
		if (c2 instanceof Circulo) {
			c3 = (Circulo)c2;
			System.out.println(c3.getRadio());
		}
		
		System.out.println(c1.getRadio());
	
		Figura cuadradito = new Cuadrado ("Azul", 5);
		Triangulo triangulito = new Triangulo("Amarillo", 4, 6);
		
		Figura figuras [] = new Figura [3];
		figuras[0] = c1;
		figuras[1] = cuadradito;
		figuras[2] = triangulito;
		
		for (Figura cadaFigura : figuras) {
			System.out.println(cadaFigura.getArea() + " " + cadaFigura.getPerimetro() + " " + cadaFigura.getColor() + " ");
		}
		
	}

}
