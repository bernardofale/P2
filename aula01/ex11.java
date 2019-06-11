import java.util.*;

public class ex11 {
	
	public static void main (String[] args) {
		String input;
		Scanner sc = new Scanner(System.in);
		System.out.print("Operação: ");
		input = sc.nextLine();
		double resultado = opera(input);
		System.out.printf("Resultado = %.02f\n",resultado);
	}
	
	static double opera(String input){
		double a,b;
		String opera;
		Scanner sc = new Scanner(input);
		a = sc.nextDouble();
		opera = sc.next();
		b = sc.nextDouble();
		if(opera.equals("+")) return a+b;
		else if(opera.equals("-")) return a-b;
		else if(opera.equals("*")) return a*b;
		else if(opera.equals("/")) return a/b;
		else{ 
			System.err.println("Operacao invalida!");
			System.exit(1);
		}
		return 0;
	}
}
