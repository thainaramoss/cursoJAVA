import java.util.Scanner;
public class Uri1070{
    public static void main (String arg []){
        Scanner teclado = new Scanner (System.in);

        //variaveis
        int x;
        int impares;
        
        //entrada
        x = teclado.nextInt();

        //condição
        if (x % 2 == 0){
            x++;
        }
        for (int contador = 1; contador <= 6; contador+=1){

            System.out.println(x);
            x = x + 2;

        }

    }
}