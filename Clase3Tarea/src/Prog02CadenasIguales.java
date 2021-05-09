import java.util.Scanner;

class CadenasIguales {
	private String cadena1, cadena2;

	public CadenasIguales() {
		System.out.println("---CadenasIguales---");
	}

	public void leerCadenas() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese La Cadena #1: ");
		this.cadena1 = scanner.next();

		System.out.println("Ingrese La Cadena #2: ");
		this.cadena2 = scanner.next();
	}

	public void SonIguales() {
		if (cadena1.equals(cadena2)) {
			System.out.println("Las Cadenas SI son IGUALES");
		} else {
			System.out.println("Las Cadenas NO son IGUALES");
		}
	}

}

public class Prog02CadenasIguales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CadenasIguales cadenas = new CadenasIguales();
		cadenas.leerCadenas();
		cadenas.SonIguales();
	}

}
