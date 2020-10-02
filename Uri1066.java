import java.util.Scanner;
public class Uri1066{
    public static void main (String arg []){
        Scanner teclado = new Scanner (System.in);

        //variaveis
        int valor, pares, impares, positivos, negativos;

        //contagem
        pares = 0;
        impares = 0;
        positivos = 0;
        negativos = 0;

        //processo
        for (int contador = 1; contador <=5; contador++){
            valor = teclado.nextInt();
            if (valor % 2 == 0){
                pares++;
            }
            else {
                impares++;
            }
            if (valor > 0){
                positivos++;
            }
            else if (valor < 0){
                negativos++;
            }
                
        }
        //saida
        System.out.println(pares+" valor(es) par(es)");
        System.out.println(impares+" valor(es) impar(es)");
        System.out.println(positivos+" valor(es) positivo(s)");
        System.out.println(negativos+" valor(es) negativo(s)");    

    }
}