import static java.lang.System.*;
import java.util.Scanner;

public class ex13 {
  public static final Scanner in = new Scanner(System.in);

  public static void main(String[] args) {
    int n=0;
    do {	
		System.out.print("N: ");
		n = in.nextInt();
	  }while (n<1);
    

    String verb = isPrime(n)? "is" : "is not";
    out.printf("Number %d %s prime\n", n, verb);
  }

   static boolean isPrime(int n) {
		int i = 2;
		do{
			if(n==2) return true;
			if(n%i==0) return false;
			i++;
	}  while ( i < (n/3));
        return true;
	}
}
