import java.util.Scanner;
public class Uri1035{
    public static void main (String arg[]){
        Scanner teclado = new Scanner (System.in);

        /* condiçoes
        */

        // variaveis
        int A,B,C,D;

        // processamento
        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();
        D = teclado.nextInt();

        // entradas e saidas de acordo com as condições
        if (( B > C) && ( D > A) && ( C + D > A + B ) && ( C > 0 && D > 0 ) && ( A % 2 == 0 )){
        
           System.out.println("Valores aceitos");
        }

        else{
            System.out.println("Valores nao aceitos");
        }





    }
}