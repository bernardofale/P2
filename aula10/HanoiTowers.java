import static java.lang.System.*;
import java.util.Scanner;
import p2utils.Stack;

public class HanoiTowers
{
  public HanoiTowers(int n){
    while(n>0){
      torre1.push(n--);
    }
}
  public int nmrs = 0; //movimentos
  Stack<Integer> torre1 = new Stack<Integer>();
  Stack<Integer> torre2 = new Stack<Integer>();
  Stack<Integer> torre3 = new Stack<Integer>();

  public void solve(){
    assert nmrs>=0;

    moveSeveralDisks(torre1.size(), torre1, torre2, torre3);



}

  private void moveSeveralDisks(int n, Stack<Integer> torre1, Stack<Integer> torre2, Stack<Integer> torre3){

    if(n>0){
    moveSeveralDisks(n-1, torre1, torre3, torre2);

    moveDisk(torre1, torre2);

    moveSeveralDisks(n-1, torre3, torre2, torre1);
  }
}


  public void moveDisk(Stack<Integer> a, Stack<Integer> b){
    if (!b.isEmpty()) {
      if(a.top() > b.top()){
        out.print("movimento inválido");
      }else{
        nmrs++;
        b.push(a.top());
        a.pop();
      }
    }else{
        nmrs++;
        b.push(a.top());
        a.pop();
    }
  }
  public int numberOfMoves() {return nmrs;}
  }
