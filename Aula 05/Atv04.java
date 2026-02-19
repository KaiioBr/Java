public class Atv04 {
    public static void main(String[] args) {
        
        System.out.println("=== TABUADAS DE 1 A 10 ===");
        System.out.println(); 
        
        for (int i = 1; i <= 10; i++) {
            
            System.out.println("Tabuada do " + i + ":");
            System.out.println("-------------");
            
        
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            
            System.out.println(); 
        }
    }
}
