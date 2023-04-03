import java.util.Scanner;

public class Atividadevalores {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o valor 1:");
		int v1 = entrada.nextInt();

		System.out.println("Informe o valor 2:");
		int v2 = entrada.nextInt();

		int resultado = v1 + v2;

		if (resultado > 20) {
			System.out.println("O resultado:" + (resultado + 5));

		} else {
			int valor = resultado * 8;
			System.out.println("O resultado:" + valor);
		}

		entrada.close();
	}

}
