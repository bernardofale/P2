import static java.lang.System.*;

public class DatasPassadas {

  public static void main(String[] args) {
    Data atual = new Data();
    Data passado = new Data(25,12,2018);
   
	
	
	while (true)
	{
		if (atual.dia()==passado.dia() && atual.mes()==passado.mes() && atual.ano()==passado.ano())
		{
			break;
		}else{
			out.println(passado.extenso());
			passado.seguinte();
	}
}
	
	
	
	
	
 
 
  }

}

