import java.util.Scanner;

public class Atividadecasal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a idade de Jo�o:");
		int joao = sc.nextInt();

		System.out.println("Digite a idade de Jos�:");
		int jose = sc.nextInt();

		System.out.println("Digite a idade de Maria:");
		int maria = sc.nextInt();

		if ((joao < jose) && (joao < maria)) {
			System.out.println("Jo�o � o ca�ula!");
		} else {
			if ((jose < joao) && (jose < maria)) {
				System.out.println("Jo�o � o ca�ula!");
			} else {
				System.out.println("Maria � a ca�ula!");
			}
			sc.close();
		}

	}

}
