public class Operario extends Empregado {
    
    private double valorProd;
    private double comissao;
    
    public Operario (String n, String e, String t, String cs, double sb, double i, double vp, double c){
        super (n, e, t, cs, sb, i);
        this.setValorProd (vp);
        this.setComissao (c);
    }
    
    public double getValorProd(){
        return this.valorProd;
    }
    public void setValorProd (double vp){
        this.valorProd = vp;
    }
    
    public double getComissao(){
        return this.comissao;
    }
    public void setComissao (double c){
        this.comissao = c;
    }
    
    public double calcularSalario(){
        return calcularSalario() + getComissao();
    }
    
}
