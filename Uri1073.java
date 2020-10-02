import java.util.Scanner;
public class Uri1073{
    public static void main (String arg[]){
        Scanner teclado = new Scanner (System.in);

        //variaveis
        int N, quadrado;

        //entrada
        N = teclado.nextInt();


        //condicoes para mostrar o quadrado dos valores pares de 1 a N
        if ((N > 5) && (N < 2000)){
            for (int contador = 1; contador <= N;contador++){

                if (contador % 2 == 0){
                quadrado = contador * contador;

                //saida
                System.out.println(contador+"^2 = "+quadrado);
                }
            }
        }


    }
}