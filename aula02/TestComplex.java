import static java.lang.System.*;
import  java.util.*;
public class TestComplex {
  // Exemplo simples de utilização da class Complex
  public static void main(String[] args) {
	Complex a;
	try{ //verifica se existem valores como argmentos
		 a = new Complex(Double.parseDouble(args[0]), Double.parseDouble(args[1]));
		
		
	}catch(Exception e){ //se nao houver pergunta ao utilizador
		Scanner sc = new Scanner(System.in);
		out.print("Re: ");
		int real = sc.nextInt();
		out.print("Im: ");
		int imag = sc.nextInt();
		a = new Complex(real, imag);
	}
		out.println("(" + a.real() + " + " + a.imag() + "i)");
		out.println("  parte real = " + a.real());
		out.println("  parte imaginaria = " + a.imag());
		out.println("  modulo = " + a.abs());
		out.printf("  argumento =  %2.2f\n", a.arg());
  }

}

