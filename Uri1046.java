import java.util.Scanner;
public class Uri1046{
    public static void main (String arg[]){
        Scanner teclado = new Scanner (System.in);

        // variavel
        int hi,hf, duracao;

        // entradas
        hi = teclado.nextInt();
        hf = teclado.nextInt();

        // processamento das variaveis
        duracao = hf - hi;

        // condicoes

        if (duracao <=0){
            duracao = duracao + 24;
        }
        System.out.println("O JOGO DUROU "+duracao+" HORA(S)");
        
    }
}