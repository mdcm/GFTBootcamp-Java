import java.util.Scanner; 
 
public class FilaBanco { 
 
    public static void main(String[] args) { 
 
    String[] nomesFila = new String[3]; 
    Scanner nome = new Scanner(System.in); 

 //TODO: Implemente uma condição que simule uma fila bancaria, gerando o nome a posição do cliente na fila:
 
    for(int i = 0; i < nomesFila.length; i++){
        String pessoa = nome.next();
        nomesFila[i] = pessoa;
    }
    
    for(int i = 0; i < nomesFila.length; i++) {
        System.out.println(nomesFila[i] + " - esta na posicao: " + (i+1));
  
    }

}
}