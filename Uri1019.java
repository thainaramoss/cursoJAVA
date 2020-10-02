import java.util.Scanner;
public class Uri1019{
    public static void main (String arg[]){
        Scanner teclado = new Scanner (System.in);

        //variaveis
        int tempo;
        int h, m, s;
        int resto;

        // entrada
        tempo = teclado.nextInt();

        // processamento
        h = tempo / 3600;
        resto = tempo % 3600;
        m = resto / 60;
        s = resto % 60;

        // saida
        System.out.println(h+":"+m":"+s);

    }
}
        
