import java.util.Scanner;

public class MediaIdade {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int idade1 = leitor.nextInt();
        int idade2 = leitor.nextInt();
        int idade3 = leitor.nextInt();

 //TODO: Implemente um condição de verifique a média de idade da turma conforme a descrição do desafio:
        int media = (idade1 + idade2 + idade3)/3;
        
        if(media>=0 && media<=25)
          System.out.print("Jovem!");
        else if(media>=26 && media<=60)
          System.out.print("Adulta!");
        else
          System.out.print("Idosa!");
    }
}

