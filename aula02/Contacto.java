public class Contacto {
  private String nome;
  private String telefone;
  private String eMail;  
  
  public Contacto(String n, String t, String e){
	  this.nome = n.toUpperCase();
	  this.telefone = t;
	  this.eMail = e;
  }
  public Contacto(String n, String t){
	  this.nome = n.toUpperCase();
	  this.telefone = t; 
  }
  public String n(){
	  return nome; }
  public String t(){
	  return telefone; }
  public String e(){
	  return eMail; }
  }

