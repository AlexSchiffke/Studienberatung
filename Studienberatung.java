import java.util.*;
public class Studienberatung{
	
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Hast du Abitur? j/n");
		String answer = scanner.next();

		if(answer.equals("j")){
			System.out.println("Bist du wissbegierig? j/n");
			String answer = scanner.next();

			if(answer.equals("j")){

			} else if (answer.equals("n")){

			}

		} else if (answer.equals("n")){
			System.out.println("Hast du Fachabitur? j/n");
			String answer = scanner.next();

			if(answer.equals("j")){
				System.out.println("Hast du eine Berufsausbildung? j/n");
				String answer = scanner.next();

				if(answer.equals("j")){

				} else if (answer.equals("n")){

			}

			} else if (answer.equals("n")){

			}
		}

		
	}
	
}