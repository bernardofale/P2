import static java.lang.System.*;

public class HanoiTowers<E>{

  private int move = 0;
	private Stack<E> TA;
	private Stack<E> TB = new Stack<E>();
	private Stack<E> TC = new Stack<E>();

  public HanoiTowers(int n){
    this.n  = n;

  }

  private void solve(int n, Stack<E> origem, Stack<E> destino, Stack<E> auxiliar){
		assert n >= 0;
		if (n > 0){
			//Moves
			moveDiscs(n-1, origem, auxiliar, destino);

			moveOneDisc(origem, destino);

			//Moves them again
			moveDiscs(n-1, auxiliar, destino, origem);

}
}
  public static moveOneDisc(Stack<E> origem, Stack<E> destino){
    move++;
    destino.push(origem.top());
    origem.pop();
  }

  public static numberOfMoves(){ return move; }

  public void start(int n){
    moveDiscs(n, TA, TC, TB)
  }

  public void printHanoi(){
		//Prints the elements in the stacks
		out.printf("After %d moves: \n", move);
		out.println("TA: " + TA.toString());
		out.println("TB: " + TC.toString());
		out.println("TC: " + TB.toString() + "\n");
	}
  }
