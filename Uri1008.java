import java.util.Scanner;
public class Uri1008{
    public static void main (String arg []){
        Scanner teclado = new Scanner (System.in);

        // variaveis
        int A, B, NUMBER;
        double C, SALARY;

        // entradas
        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextDouble();

        // processamento
        NUMBER = A;
        SALARY = (C * B);

        // saida
        System.out.println("NUMBER = "+NUMBER);
        System.out.printf("SALARY = U$ %.2f\n",SALARY);


    }
}