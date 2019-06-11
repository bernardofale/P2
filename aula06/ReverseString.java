import static java.lang.System.*;
import java.io.*;
import java.util.*;


public class ReverseString {

  public static void main(String[] args) {
    out.println(printString(args[0]));
  }

  public static String printString(String n) {

    if (n.isEmpty()) {
      return n;
    }
    return printString(n.substring(1))+n.charAt(0);
    }

    }
