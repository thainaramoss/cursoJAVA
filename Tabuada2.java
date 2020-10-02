import java.util.Scanner;
public class Tabuada2{
    public static void main (String arg []){
        Scanner teclado = new Scanner (System.in);

        //variaveis
        int num, contador;

        //entrada
        System.out.println("Digite o numero da tabuada");
        num = teclado.nextInt();

        // processo e saida
        contador = 1;
        do { // faça
            System.out.println(num+" x "+contador+" = "+(num*contador));
            contador = contador + 1
        } while (contador <=10); // enquanto condição for verdadeira
        
        }
    }
}
