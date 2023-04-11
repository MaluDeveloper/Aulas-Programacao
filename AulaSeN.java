import java.util.Scanner;

public class AulaSeN {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String resp = "SIM";
		while (resp.equalsIgnoreCase("SIM")) {
			System.out.println("Olá Maria!");

			System.out.println("Deseja continuar: Sim ou Nao ?");
			resp = sc.next().toUpperCase();

		}
		System.out.println("Finalizado!!!");
		sc.close();
	}
}
