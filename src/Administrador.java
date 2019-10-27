public class Administrador extends Empregado {
    
    private double ajudaDeCusto;
    
    public Administrador (String n, String e,String t, String cs, double sb, double i, double ac){
        super (n, e, t, cs, sb, i);
        this.setAjudaDeCusto (ac);
        
    }
    
    public double getAjudaDeCusto(){
        return this.ajudaDeCusto;
    }
    public void setAjudaDeCusto (double ac){
        this.ajudaDeCusto = ac;
    }
    
    public double calcularSalario(){
        return calcularSalario() + getAjudaDeCusto();
    }
}
