import java.util.*;

class Promedio {
	float Nota1, Nota2, Nota3, Promedio;
	String estudiante = "";

	Promedio() {
		Scanner scanner = new Scanner(System.in);
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce el nombre del estudiante: ");
		estudiante = teclado.nextLine();
		System.out.println("Introduce Nota1: ");
		Nota1 = scanner.nextFloat();
		System.out.println("Introduce Nota2: ");
		Nota2 = scanner.nextFloat();
		System.out.println("Introduce Nota3: ");
		Nota3 = scanner.nextFloat();

	}

	private float calcular() {
		return (Nota1 + Nota2 + Nota3) / 3;
	}

	public void mostrarMensaje() {
		Promedio = this.calcular();
		System.out.println("El Promedio del Estudiante es " + estudiante + " y su promedio es " + Promedio);
	}

}

public class Prog04CalculaPromedio {

	public static void main(String[] args) {
		Promedio promedio = new Promedio();
		promedio.mostrarMensaje();
	}

}
