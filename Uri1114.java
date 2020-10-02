import java.util.Scanner;
public class Uri1114{
    public static void main (String arg[]){
        Scanner teclado = new Scanner (System.in);

        //variaveis
        int senha;

        

        //condicoes
        do {
            //entrada
            senha = teclado.nextInt();
            if (senha != 2002){
                //saida
                System.out.println("Senha Invalida");
            }
        }   while (senha != 2002);
            System.out.println("Acesso Permitido");

    
    }
}