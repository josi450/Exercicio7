public class AlunosGrad extends Aluno {
    
    private String periodo;
    
    public AlunosGrad (String n, String m, String p){
        super (n, m);
        this.setPeriodo (p);
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
    
    
}
