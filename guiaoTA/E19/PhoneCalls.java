import static java.lang.System.*;
import java.util.Scanner;
import java.io.*;
import p2utils.*;

public class PhoneCalls
{
  public static void main(String[] args) throws IOException{
    if(args.length == 0){
      out.printf("input error");
    }

    HashTable<KeyValueList> chamadas = new HashTable<>(500);
    HashTable<String> contactos = new HashTable<>(500);

    for(String fileName : args){
      if(fileName.contains(".nms")){
        Scanner scf = new Scanner(new File(fileName));
        while(scf.hasNextLine()){
          String[] linha = scf.nextLine().split(" ");
          contactos.set(linha[0], linha[1] + " " + linha[2]);
        }
      }else if(fileName.contains(".cls")){
        Scanner read = new Scanner(new File(fileName));
        while(read.hasNextLine()){
          String[] lines = read.nextLine().split(" ");
          String caller = lines[0];
          String called = lines[1];

          if(contactos.contains(caller))  caller = contactos.get(lines[0]);

          if(contactos.contains(called))  called = contactos.get(lines[1]);

          if(chamadas.contains(lines[0])){
            KeyValueList<String> chavs = chamadas.get(lines[0]);
            chavs.set(lines[2], lines[1]);
            chamadas.set(lines[0], chavs);

          }else{
            KeyValueList<String> chavs = new KeyValueList<>();
            chavs.set(lines[2], lines[1]);
            chamadas.set(lines[0], chavs);
            }
            out.println(caller + " to " + called + " " + lines[2]);
          }
        }
      }
    }
  }
