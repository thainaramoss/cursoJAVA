import java.util.Scanner;
public class Uri1065{
    public static void main (String agr []){
        Scanner teclado = new Scanner (System.in);

        // variaveis
        int valor;
        int pares;

        // condicao
        pares = 0; // contar quantos dos valores são pares
        
        for (int contador = 1; contador <=5; contador++){
            valor = teclado.nextInt();
                if (valor % 2 == 0){
                    pares++;
                }

        }

        // saida
        System.out.println(pares+" valores pares");




    }
}