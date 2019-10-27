public class Fornecedor extends Pessoa {
    
    private double valorCred;
    private double valorDiv;
    
    public Fornecedor (String n, String e, String t, double vc, double vd){
        super (n, e, t);
        this.setValorCred (vc);
        this.setValorDiv (vd);
    }
    
    public double getValorCred(){
        return this.valorCred;
    }
    public void setValorCred(double vc){
        this.valorCred = vc;
    }
    
    public double getValorDiv(){
        return this.valorDiv;
    }
    public void setValorDiv(double vd){
        this.valorDiv = vd;
    }
    
    public double obterSaldo(){
        return getValorCred() - getValorDiv();
    }
       
}
