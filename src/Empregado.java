public class Empregado extends Pessoa {
    
    private String codigoSetor;
    private double salarioBase;
    private double imposto;
    
    public Empregado (String n, String e, String t, String cs, double sb, double i){
        super (n, e, t);
        this.setCodigoSetor (cs);
        this.setSalarioBase (sb);
        this.setImposto (i);
    }
    public String getCodigoSetor(){
        return this.codigoSetor;
    }
    public void setCodigoSetor(String cs){
        this.codigoSetor = cs;
    }
    
    public double getSalarioBase(){
        return this.salarioBase;
    }
    public void setSalarioBase (double sb){
        this.salarioBase = sb;
    }
    
    public double getImposto(){
        return this.imposto;
    }
    public void setImposto (double i){
        this.imposto = i;
    }
    
    public double calcularSalario(){
        return getSalarioBase() - getImposto();
    }
}
