import java.util.Scanner;
public class Uri1059V1{
    public static void main (String arg []){
        Scanner teclado = new Scanner (System.in);

            //        DE        ATÉ         INDO DE 1 EM 1
        for (int valor = 1; valor <= 100; valor = valor + 1){
            if  (valor % 2 == 0){

                System.out.println(valor);
            }
        }
    }
}