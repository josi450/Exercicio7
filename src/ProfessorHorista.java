
public class ProfessorHorista extends ProfessorIntegral {
    
   

    public ProfessorHorista (String n, int i, int m, int h){
        super (n, i, m, h);
       
    }
    
        
    public void salarioHorista (double salar){
        salar *= this.getHoras();
    }
    
}

