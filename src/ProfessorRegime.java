
public class ProfessorRegime {
private float salario;
public ProfRegime(String n,String m,int i,float vs)
{
super(n,m,i);
if (vs > 0) salario = vs;
}
public float retornaSalario()
{
return salario - (salario * 0.16);
}

}
