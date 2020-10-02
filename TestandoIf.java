import java.util.Scanner;
public class TestandoIf{
    public static void main (String arg[]){
        Scanner teclado = new Scanner (System.in);

        // variaveis
        float n1,n2,media;

        // entradas
        System.out.print("Digite a N1: ");
        n1 = teclado.nextFloat();
        System.out.print("Digite a N2: ");
        n2 = teclado.nextFloat();

        // processamento

        media = (n1 + n2)/2;

        // saida
        System.out.println("Média do aluno = "+media);

        if ( media >= 9 && media <= 10){
            System.out.println("Aprovado com conteito A");
        }
        else if(media >= 8 && media <9){
            System.out.println("Aprovado com conceito B");
            }
            else if(media >= 6 && media < 8){
                System.out.println("Aprovado com conceito C");
                }
                else if(media >= 3 && media < 6){
                    System.out.println("Em exame");
                    }
                    else{
                        System.out.println("Reprovado");
                    }
                }
            }
        }

    }
}