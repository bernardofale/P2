import static java.lang.System.*;

public class SumArgs
{
  public static void main(String[] args) {
    // Criar array com um elemento por cada argumento do programa:
    double[] arr = new double[args.length];

    // Preencher arr com os valores obtidos dos argumentos:
    for (int i = 0; i < arr.length ; i++ ) {
      arr[i] = Double.parseDouble(args[i]);
      }


    // Calcular a soma com função recursiva:
    double total = sumRec(arr, 0, arr.length);
    out.printf("sum of arguments = %f\n", total);

    // Verificação de correção do resultado:
    assert sumRec(arr, 0, arr.length) == sum(arr, 0, arr.length);
  }

  // sum of subarray [start,end[ of arr:
  public static double sum(double[] arr, int start, int end) {
    assert arr != null;
    assert start >= 0 && start <= end && end <= arr.length;

    double res = 0;
    for (int i = start; i < end; i++)
      res += arr[i];
    return res;
  }

  // same thing, recursive:
  public static double sumRec(double[] arr, int start, int end) {
    assert arr != null;
    assert start >= 0 && start <= end && end <= arr.length;

    if (start == end - 1) return arr[start];
    else return arr[start] + sumRec(arr, start + 1, end);


  }

}
