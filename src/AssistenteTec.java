public class AssistenteTec extends Assistente {
    
    private double bonus;

    public AssistenteTec (String n, String m, String nd, String s, double b){
        super (n, m, nd, s);
        this.setBonus(b);
    }
    
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    
    
}

