
public class ProfessorHorista {

protected float salario_hora;
protected int total_horas;
public ProfessorHorista(String n,String m,int i,int h, float vs)
{
super(n,m,i);
if (h > 0) total_horas = h;
if (vs > 0) salario_hora = vs;
}
public float retornaSalario()
{
float salario_base = salario_hora * total_horas;
return salario_base - (salario_base * 0.16);
}
}


