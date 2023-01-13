import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        

//TODO: Implemente uma solução para que seja impresso a saída correto do seu turno:   
        System.out.println("Qual turno você estuda?");
        System.out.print("M-matutino | V-vespertino | N-noturno: ");
        
        char turno = leitor.next().toUpperCase().charAt(0);
        
        if (turno == 'M')
          System.out.print("Bom Dia!");
        else if(turno == 'V')
          System.out.print("Boa Tarde!");
        else if(turno == 'N')
          System.out.print("Boa Noite!");
        else
          System.out.print("Valor Invalido!");
        
    }
}