import java.util.Scanner;

public class Aulasexo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Informe o sexo:");
	String sexo = sc.next().toUpperCase();
	
	switch (sexo) {
	case "M" :
			System.out.println("Maculino");
	break;
	case "F":
			System.out.println("Feminino");
	break;
	default:
		System.out.println("Sexo Inválido");
		
		
		}
	sc.close();
		
	}

}
