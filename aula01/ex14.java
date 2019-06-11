
import java.util.Scanner;

public class ex14 {
  

  public static void main(String[] args) {
	  Scanner read = new Scanner(System.in);
	  System.out.print("frase portuguesa: ");
	  String linha = read.nextLine(); // lê a frase
	  System.out.printf("frase do alberto: %s",tradutor(linha));
	  
	  
  }
  
  static String tradutor(String linha){	//traduz a frase
	  Scanner sc = new Scanner(linha);
	  String frases= "";
	  do
	  {
		  String word = sc.nextLine();	// a função le todas as palavras na frase enquanto .next
		  for (int i = 0; i < word.length(); i++){ //roda todas as celulas enquanto maior que 0 e menor que a grandeza da palavra
		  if (word.charAt(i) == 'l') frases += "u"; //troca o l por u
		  else if (word.charAt(i) == 'L') frases+= "U"; 
		  else if (word.charAt(i) != 'r') frases += word.charAt(i); //nao escreve os r
			}
			frases += " ";
			} while (sc.hasNext()); //enquanto nao ha mais palavras
			return frases;
		}
	}
	
	  
	  
