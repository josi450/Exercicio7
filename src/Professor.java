public class Professor {
  private String nome;
  private String matricula;
  private int idade;
  
public Professor(String n,String m,int i)
{
nome = n;
matricula = m;
idade = i;
}
public String retornaNome(){ return nome; }
public String retornaMatricula(){ return matricula; }
public int retornaIdade(){ return idade; }
public float retornaSalario(){ return 0; }
}

}
}
