import java.util.Scanner;

public class Aula4Op {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int resultado = 0, fim = 0;
		
		do {
		
		System.out.print("Informe um valor: ");
		int valor1 = sc.nextInt();

		System.out.print("Informe outro valor: ");
		int valor2 = sc.nextInt();

		System.out.print("Informe qual a operação aritmética: ");
		String operacao = sc.next();

		if (operacao.equals("+")) {
			resultado = valor1 + valor2;

		} else if (operacao.equals("-")) {
			resultado = valor1 - valor2;

		} else if (operacao.equals("*")) {
			resultado = valor1 * valor2;

		} else if (operacao.equals("/")) {
			resultado = valor1 / valor2;

		} else {
			System.out.println("Operação inválida, escolha um destes valores: +, -, * ou /. ");
			sc.close();
			return;
		}

		if (resultado > 0) {
			System.out.println(String.format("O resultado de %d %s %d é igual a %d. Ele é maior que zero!", valor1,
					operacao, valor2, resultado));

		} else if (resultado < 0) {
			System.out.println(String.format("O resultado de %d %s %d é igual a %d. Ele é menor que zero!", valor1,
					operacao, valor2, resultado));

		} else {
			System.out.println(String.format("O resultado de %d %s %d é igual a %d. Ele é igual a zero!", valor1, operacao,
					valor2, resultado));
		}
		
		System.out.println();
		
		if (resultado % 2 == 0) {
			System.out.println("O resultado é PAR!!");
		} else {
			System.out.println("O resultado é ÍMPAR!!");

		}
		
		System.out.println("Insira qualquer valor para continuar ou -999 para finalizar um programa.");
		fim = sc.nextInt();
		
		} while (fim != -999);
		System.out.println("Seu programa acaba aqui!!!!");
		
		sc.close();
	}

}

