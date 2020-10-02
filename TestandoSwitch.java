import java.util.Scanner;
public class TestadoSwitch{
    public static void main (String arg []){
        Scanner teclado = new Scanner (System.in);

        // variaveis
        int valor;

        //entrada
        System.out.println("Digite um valor: ");
        valor = teclado.nextInt();

        //procesamento
        switch (valor){
            case 1:
                System.out.println("Digitou o valor 1");
                break; 
            case 2:
                System.out.println("Digitou o valor 2");
                break;
            case 3:
                System.out.println("Digitou o valor 3");
                break; 
            default:
            


        }


    }
}