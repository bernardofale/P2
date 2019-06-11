import static java.lang.System.*;
import java.util.Scanner;

// Complete o programa para calcular a nota final NF de
// um aluno de Programação 2 (2017-2018) na época normal.
public class ex12
{
  public static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args)
  {
    double pg1 = readInRange("PG1? ", 0.0, 20.0);
    double pg2 = readInRange("PG2? ", 0.0, 20.0);
    double tpi = readInRange("TPI? ", 0.0, 20.0);
    double ef = readInRange("EF? ", 0.0, 20.0);
    double nf;

    nf = ((pg1+pg2)/3) * 0.7 + ((tpi+ef)/2)*0.3;

    System.out.printf("NF = %.1f\n", nf);
    if (nf < 9.5)
      System.out.println("REPROVADO!");
    else
      System.out.println("APROVADO!");
  }

  // Reads a double that must be in the range [min, max].
  // Shows the prompt, reads a double value.
  // If the value is not in the range, prints a warning and repeats.
  public static double readInRange(String prompt, double min, double max)
  {
    
    double value;
    System.out.print(prompt);
    value=sc.nextDouble();
    if (value<=0 || value>=20) System.exit(1);

    return value;
  }
}
