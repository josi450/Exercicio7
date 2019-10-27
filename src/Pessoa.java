
public class Pessoa {
  private String nome;
  priavte String endereco;
  private String telefone;
  
  //construtor
  public Aluno(String n, String e, String t) {
        this.nome = n;
        this.endereco = e;
        this.telefone = t;
    }
  public String getNome() {
        return this.nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public void setEndereco(String e) {
        this.endereco = e;
    }

    public void setTelefone(String t) {
        this.telefone = t;
    }

}
