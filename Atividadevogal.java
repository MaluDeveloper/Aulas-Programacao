import java.util.Scanner;

public class Atividadevogal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe uma vogal:");
		//String vogal = sc.net();
		//String vogal = sc.next().toUpperCase();
		char vogal = sc.next().charAt(0);
		
		//if(vogal.equals("A")) {
			if (vogal == 'A') {
			System.out.println("� vogal");
		}else {
			System.out.println("N�o � vogal:");
		}
			sc.close();
	}
}
