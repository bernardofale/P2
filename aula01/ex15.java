import static java.lang.System.*;
import java.util.Scanner;

public class ex15 {
		

  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n=0,valor;
	int soma =0;
	double media;
	do
	{
		System.out.print("Valor: ");
		valor = sc.nextInt();
		if(valor==0 && n==0){
			System.exit(1);
		}
		soma+=valor;
		if(valor!=0) n++;
		} while (valor!=0);
		media = soma/n;
		System.out.printf("A soma é: %d\n",soma);
		System.out.printf("A média é: %.1f\n",media);
		
	}
}
	
