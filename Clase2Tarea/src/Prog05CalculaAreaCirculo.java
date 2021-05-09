
import java.io.*;

class AreaCirculo {
	private float radio;

	AreaCirculo() {
		radio = 0;
	}

	void calcularArea() throws IOException {
		InputStreamReader lector = new InputStreamReader(System.in);
		BufferedReader entrada = new BufferedReader(lector);
		System.out.println("Escribe el radio : ");
		String cadena = entrada.readLine();
		radio = Float.parseFloat(cadena);
		System.out.print("El radio del area es " + radio);
		double area = Math.PI * radio * radio;
		System.out.println(" el area del circulo seria: " + area);
	}
}

public class Prog05CalculaAreaCirculo {
	public static void main(String[] args) throws IOException {
		AreaCirculo area = new AreaCirculo();
		area.calcularArea();
	}
}
