import static java.lang.System.*;
import java.util.Scanner;

public class ex16 {
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int random = (int)(Math.random()*(100+1));
		int adv, pont=0;
		
		System.out.println("---------------------");
		System.out.println("| ADIVINHA O NUMERO |");
		System.out.println("---------------------");
		System.out.println();
		
		do
		{
			System.out.print("Advinhe o número: ");
			adv=sc.nextInt();
			if(adv>random) System.out.println("O número é menor.");
			else if(adv<random) System.out.println("O número é maior");
			pont++;
		} while (adv!=random);
		
		System.out.printf("Parabéns, acertou! O número era o %d e teve uma pontuação de %d",random,pont);
		
		
	
	}
}
