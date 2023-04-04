import java.util.Scanner;

public class Atividadesorvete {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o sabor Letra M:");
		System.out.println("Informe o sabor Letra C:");
		String sabor = sc.next();

		System.out.println("Informe a quantidade de bolas:");
		int bolas = sc.nextInt();

		if (sabor.equalsIgnoreCase("C")) {
			if (bolas >= 3) {
				System.out.println("10% de desconto!");
			} else {
				System.out.println("5% de desconto!");
			}
		} else if (sabor.equalsIgnoreCase("M")) {
			System.out.println("Não tem desconto!");
		} else {
			System.out.println("Sabor inválido!");

		}
		sc.close();
	}
}
