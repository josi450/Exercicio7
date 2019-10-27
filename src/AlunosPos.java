public class AlunosPos extends Aluno {
    
    private String area;
    
    public AlunosPos (String n, String m, String a){
        super (n, m);
        this.setArea (a);
    }

    public String getArea() {
        return area;
    }

    public void setArea(String a) {
        this.area = a;
    }
    
    
}

