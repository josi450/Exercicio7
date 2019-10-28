
  public class AlunosEsp extends AlunosGrad {
    
     private String formacao;
    
    public AlunosEsp (String n, String m, String p, String f){
        super (n, m, p );
        this.setFormacao (f);
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String f) {
        this.formacao = f;
    }
    
    
}
    


