import java.util.Scanner;

public class AtividadeNotas {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe seu nome?");
		String nome = entrada.nextLine();

		System.out.println("Informe a nota 1:");
		double n1 = entrada.nextDouble();

		System.out.println("Informe a nota 2:");
		Double n2 = entrada.nextDouble();

		Double media = (n1 + n2) / 2;

		if (media >= 7) {
			System.out.println(nome + " Está Aprovado");

		} else {
			System.out.println(nome + " Não está Aprovado!");

		}
		
		entrada.close();
	}

}
