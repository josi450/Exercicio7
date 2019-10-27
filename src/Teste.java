public class Teste {
    
    public static void main (String [] args){
        
        Pessoa p1 = new Pessoa ("Paulo", "Av. Januária, 25", "3743-2521");
        Fornecedor f1 = new Fornecedor("Victor", "Rua H, 234", "999902-0222", 1030.52, 321.99);
        Empregado e1 = new Empregado ("Josiane", "Rua F, 56", "1234-5678", "cod-SI22", 2896.54, 0.22);
        Administrador a1 = new Administrador ("Meiri", "Av. 13 de Maio, 925", "999-9999", "CONT-56", 1723.48, 0.05, 182.0);
        Operario o1 = new Operario ("Enio", "Rua Montes Claros, 182", "3743-7215", "LMA-32", 1569.32, 0.06, 160.000, 15.86);
        
       
        System.out.println(e1.calcularSalario());
        System.out.println(a1.calcularSalario());
        System.out.println(o1.calcularSalario());
        
    }
    
}
