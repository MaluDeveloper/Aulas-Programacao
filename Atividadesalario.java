import java.util.Scanner;

public class Atividadesalario {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Informe seu nome:");
		String nome = sc.nextLine();

		System.out.println("Informe seu sal�rio bruto:");
		double salario = sc.nextDouble();

		double salarioDesconto = (salario * 30) / 100;

		System.out.println("Informe o valor da presta��o:");
		double prestacao = sc.nextDouble();

		if (salarioDesconto > prestacao) {
			System.out.println("Sr(a)" + nome + " Empr�stimo consedido!");

		} else {
			System.out.println("Sr(a)" + nome + " Empr�stimo negado!");
		}

		sc.close();
	}

}
