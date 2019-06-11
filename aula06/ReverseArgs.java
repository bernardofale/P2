import static java.lang.System.*;
import java.io.*;
import java.util.*;


public class ReverseArgs {

  public static void main(String[] args) {
    printArray(args, args.length);
  }

  /** Imprime as N primeiras strings do array, uma por linha. */
  public static void printArray(String[] array, int N) {
    assert N > 0;
    if (N != 0) {
        N--;
        out.println(array[N]);
        printArray(array,N);
      }
    }
}
