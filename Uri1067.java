import java.util.Scanner;
public class Uri1067{
    public static void main (String arg []){
        Scanner teclado = new Scanner(System.in);

        //variaveis
        int x;
        int impares;

        //condição
        x = teclado.nextInt();

        for (int contador =1; contador <= x;contador=contador+2){
        
        System.out.println(contador);
        }
    }
}