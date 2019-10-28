public class TestaEmpresa {
    
    public static void main(String[] args) {
        
        Gerente g1 = new Gerente ("João", "12345", "BCSI"); 
        
        AssistenteAdm aa1 = new AssistenteAdm ("Josi", "4569", "BCSI", g1, 0.25);
        
        AssistenteTec at1 = new AssistenteTec ("Maria", "9956", "BCSI", g1 , 1236.52);
        
        System.out.println(aa1.getNome());
        System.out.println(aa1.getMatricula());
        System.out.println(g1.getNomedep());
        System.out.println(g1.getNome());
        System.out.println(aa1.getAdcnoturno());
        
        System.out.println(at1.getNome());
        System.out.println(at1.getMatricula());
        System.out.println(g1.getNomedep());
        System.out.println(g1.getNome());
        System.out.println(at1.getBonus());
    } 
    
}
