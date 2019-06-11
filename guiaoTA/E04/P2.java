import static java.lang.System.*;

public class P2
{
  public static void main(String[] args)
  {
    out.println(printString(args[0]));
  }

  public static String printString(String n) {

    if (n.isEmpty()) {
      return n;
    }
    return printString(n.substring(1))+n.charAt(0);
    }

    }
