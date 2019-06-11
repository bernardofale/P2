import static java.lang.System.*;
import java.util.Scanner;

class Agenda {
	private Tarefa[] tarefas = new Tarefa[1000] ;
	private int savePos = 0; 
	
	public void novaTarefa(Tarefa tarefa) {
		tarefas[savePos] = tarefa;
		savePos++;
		
		for (int i = 0; i < savePos; i++)
		{
			for (int o = i + 1; o < savePos; o++)
			{
					if(tarefas[o].Inicio().compareTo(tarefas[i].Inicio()) == -1) {
						Tarefa tmp = tarefas[i];
						tarefas[i] = tarefas[o];
						tarefas[o] = tmp;
                }
            }
        }
	}
        
        
      public void escreve() {
		  for (int i = 0; i < savePos; i++)
		  {
			  System.out.println("----------->" + tarefas[i].Inicio().extenso());
		  System.out.println("------------>" + tarefas[i].Fim().extenso());
		  System.out.println("------------>" + tarefas[i].s());
		}
	}
}
	


			
		
