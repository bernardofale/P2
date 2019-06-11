import static java.lang.System.*;
import java.io.*;
import java.util.Scanner;
// import java.util.*;   // => "error: reference to LinkedList is ambiguous"
// java.util.LinkedList colide com p2utils.LinkedList!
import p2utils.*;

public class FilterLines
{
  public static void main(String[] args) throws IOException
  {
    if (args.length != 1) {
      err.printf("Usage: java -ea FilterLines text-file\n");
      exit(1);
    }
    File fil = new File(args[0]);

    LinkedList<String> curtas = new LinkedList<String>();
    LinkedList<String> medias = new LinkedList<String>();
    LinkedList<String> longas = new LinkedList<String>();


    Scanner fich = new Scanner(fil);
    while(fich.hasNextLine()){
      String linha = fich.nextLine();
      if(linha.length() < 20)  curtas.addFirst(linha);
      else if(linha.length() <40) medias.addFirst(linha);
      else longas.addFirst(linha);
  }

  curtas.print();
  medias.print();
  longas.print();
  }

}
