import static java.lang.System.*;
import java.util.Scanner;
import p2utils.*;

public class palindrome {

	public static void main (String[] args) {
		assert args.length >= 0;

		Stack<Character> stack = new Stack<Character>();
		Queue<Character> queue = new Queue<Character>();


for (int i = 0; i < args[0].length(); i++ ) {
    char c = args[0].charAt(i);

    if (c != ' ') {
      stack.push(c);
      queue.in(c);
    }
  }

String res = "";

do{
  if(stack.top().compareTo(queue.peek()) != 0){
    res = "not ";
    stack.pop();
    queue.out();
  }
}while(!stack.isEmpty());
  out.printf("Text \"%s\" is %sa palindrome!\n", args[0], res);

  }
}
