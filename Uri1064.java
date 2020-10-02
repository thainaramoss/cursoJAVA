import java.util.Scanner;
public class Uri1064{
    public static void main (String arg []){
        Scanner teclado = new Scanner (System.in);

        /* P: Sei ler 6 valores?
             R: Sei ler 1 - 
        */
        
        //variaveis
        float valor;
        float somatoria,media;
        int numPositivos;

        //entradas
        numPositivos = 0;   // contar quantos dos valores são positivos
        somatoria = 0;      // acumular a somatória dos valores positivos
        
        for (int contador = 1; contador <=6; contador++){
            valor = teclado.nextFloat();
            if (valor > 0){
                numPositivos++;
                somatoria = somatoria + valor;
            }
        }
        //saidas
        System.out.println(numPositivos+" valores positivos");

        media = somatoria / numPositivos;

        System.out.printf("%.1f\n",media);

    }
}