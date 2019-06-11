import static java.lang.System.*;
import java.util.Calendar;

class Tarefa {
	  private Data Fim;
	  private Data Inicio;
	  private String s;
	  
		public Tarefa(Data Inicio, Data Fim, String s) {
			this.Inicio = Inicio;
			this.Fim = Fim;
			this.s=s;
		}
		
		public Data Inicio() {
			return this.Inicio;
		}
		public Data Fim() {
			return this.Fim;
		}
		public String s() {
			return this.s;
		}
		
		public boolean intersecta(Tarefa otherTarefa) {
        
        if((this.Inicio().compareTo(otherTarefa.Fim()) == -1 || this.Inicio().compareTo(otherTarefa.Fim()) == 0) && (otherTarefa.Inicio().compareTo(this.Fim()) == -1 || otherTarefa.Inicio().compareTo(this.Fim()) == 0))
        {
            return true;
        }
        else
        {
            return false;
        }
	}
}

		

