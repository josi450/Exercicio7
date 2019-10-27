public class Professor {
   
    
    private String nome;
    private int idade;
    private int matricula;

    public Professor (String n, int i, int m){
        this.setNome(n);
        this.setIdade (i);
        this.setMatricula(m);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    
    
    
}

