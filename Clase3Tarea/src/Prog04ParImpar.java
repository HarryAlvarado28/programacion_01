import java.util.Scanner;

class ParImpar {
	private int numero;

	public ParImpar() {
		System.out.println("---ParImpar---");
	}

	public void leerCadena() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese una numero: ");
		this.numero = scanner.nextInt();
	}

	public void EsPar() {
		if ((this.numero % 2) == 0) {
			System.out.println("El " + this.numero + " es PAR");
		} else {
			System.out.println("El " + this.numero + " es IMPAR");
		}
	}

}

public class Prog04ParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParImpar parImpar = new ParImpar();
		parImpar.leerCadena();
		parImpar.EsPar();
	}

}
