import java.util.Scanner;
public class Uri1014{
    public static void main (String arg[]){
        Scanner teclado = new Scanner (System.in);

        // variaveis
        int X;          // DISTANCIA
        float Y;        // CONSUMO
        float media;    // MEDIA DE CONSUMO

        // entradas
        X = teclado.nextInt();   // espera o usuario digitar um valor inteiro
        Y = teclado.nextFloat(); // espera o usuario digitar um valor real (com virgula)

        // processamento
        media = X / Y;

        // saida
        System.out.printf("%.3f km/l\n", media);
        
    } 
}