import java.util.Scanner;
public class Uri1044{
    public static void main (String arg[]){
        Scanner teclado = new Scanner (System.in);

        // variaveis
        int A,B, multiplo;

        // entradas
        A = teclado.nextInt();
        B = teclado.nextInt();

        // processo
        if  ( ((B % A) == 0) || ((A % B) == 0) ){
            System.out.println("Sao Multiplos");
        }
        else
        System.out.println("Nao sao Multiplos");

    }
}