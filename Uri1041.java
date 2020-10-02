import java.util.Scanner;
public class Uri1041{
    public static void main (String arg[]){
        Scanner teclado = new Scanner (System.in);

        // variaveis
        double X,Y;

        // entradas
        X = teclado.nextDouble();
        Y = teclado.nextDouble();

        /* regras dos quadrantes
            Q1 - x > 0 e y > 0 ok
            Q2 - x < 0 e y > 0 ok
            Q3 - x < 0 e y < 0 ok
            Q4 - x > 0 e y < 0 ok
            Eixo X - x = 0 e y > 0 ou y < 0
            Eixo Y - x > 0 e y = 0 ou x < 0
            ORIGEM - x = 0 e y = 0
        */       

        // processo das condicoes
        if ((X > 0) && (Y > 0)){
            System.out.println("Q1");
        }
        else if ((X < 0) && (Y > 0)){
            System.out.println("Q2");
        }
        else if ((X < 0) && (Y < 0)){
            System.out.println("Q3");
        }
        else if ((X > 0) && (Y < 0)){
            System.out.println("Q4");
        }
        else if ((X == 0) && (Y != 0)) {
            System.out.println("Eixo Y");
        }
        else if ((Y == 0) && (X != 0)) {
            System.out.println("Eixo X");
        }
        else{
            System.out.println("Origem");
        }


    }
}