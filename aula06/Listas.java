import java.io.*;
import static java.lang.System.*;

public class Listas
{
    public static void main(String[] args)
    {
        assert args.length == 1 : "Argumentos em falta. java -ea ListRec directory";
        String nome = args[0];
        listDirFiles(nome);
    }

    public static void listDirFiles(String n) {

        File nome1 = new File(n);

        if(nome1.isDirectory())
        {
            for(int i = 0; i < nome1.listFiles().length; i++)
            {
                out.println(nome1.listFiles()[i].getPath());
                listDirFiles(nome1.listFiles()[i].getPath());
            }
        }
        else
        {
            out.println(nome1.getPath());
        }
    }
}
