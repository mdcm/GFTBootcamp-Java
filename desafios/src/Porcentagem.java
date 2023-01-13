import java.util.Scanner;

public class Porcentagem {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
            
        int M = input.nextInt();
        int S = input.nextInt();  
        
        //TODO:  Retorne o percentual de desconto que foi aplicado no produto
        double desconto = ((double)(M-S)/M) * 100;
        String porcentagem = String.format("%.0f", desconto);
        
        System.out.print("O desconto foi de " + porcentagem + "%");
      
    }
    
}
