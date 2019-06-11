import java.util.Scanner;

  public class esketit {
  static final Scanner sc = new Scanner(System.in);
  
  public static void main(String[] args) {
	  ponto zi = new ponto();
	  ponto zii = new ponto();
	  
	  zi = lerp();
	  zii= lerp();
	  
	  System.out.printf("Distância= %f\n", dist(zi,zii));
	  
	}
	public static ponto lerp(){
		ponto h = new ponto();
		
		System.out.print("Coordenada X: ");
		h.x=sc.nextDouble();
		System.out.print("Coordenada Y: ");
		h.y=sc.nextDouble();
		return h;
	}
	public static double dist(ponto a, ponto b){
	double d;
	d = Math.sqrt(Math.pow(b.x-a.x, 2) + Math.pow(b.y-a.y, 2));
	return d;
	}
		
  
  
  static class ponto{
  double x,y;
}
}
