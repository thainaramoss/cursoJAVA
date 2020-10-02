import java.util.Scanner;
public class Exercicio20{
    public static void main (String arg []){
        Scanner teclado = new Scanner (System.in);


        //variaveis
        char sexo;
        double altura, pesoIdeal;

        //entrada
        System.out.print("Digite o sexo da pessoa (M-m/F-f) :");
        sexo = teclado.nextLine().chartAt(0);
        System.out.print("Digite a altura em metros:");
        altura = teclado.nextDouble();

        //processo e saidas 
        switch (sexo){
            case 'M':           // para tipo CHAR usar aspas simples
            case 'm':           // função é cumulativa e considera verdadeiro tudo antes break
                pesoIdeal = (72.7 * altura) - 58;
                System.out.printf("Seu peso ideal masculino é de %.1f\n",pesoIdeal);
                break;
            case 'F':           // para tipo CHAR usar aspas simples
            case 'f':
                pesoIdeal = (62.1 * altura) - 44.7;
                System.out.printf("Seu peso ideal feminino é de %.1f\n",pesoIdeal);
                break;
            default:
                System.out.println("Valor inválido para sexo do indivíduo");
            
            
        
        }
    }
}