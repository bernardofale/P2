import static java.lang.System.*;
import java.io.*;
import java.util.Scanner;

public class SortIntegers
{
  public static void main(String[] args) throws IOException {

    if (args.length == 0){
      out.print("erro de argumento");
  }

    SortedListInt lista = new SortedListInt();

    File fil;

    for (int i = 0;i<args.length ; i++) {
      fil = new File(args[i]);
      Scanner scf = new Scanner(fil);
      try{
        while(scf.hasNextLine()){
        int x = Integer.parseInt(scf.nextLine());
        lista.insert(x);
      }
      }catch(NumberFormatException e){}
        scf.close();
      }
    lista.print();
  }
}
