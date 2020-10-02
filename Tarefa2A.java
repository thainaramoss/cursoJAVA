import java.util.Scanner;
public class Tarefa2A{
    public static void main (String args []){
    Scanner teclado = new Scanner (System.in);
    // defino as variáveis que preciso
    Double lado, area;

    // passo 1 - entrada
    System.out.println("Digite o valor do LADO");
    lado = teclado.nextDouble();
    System.out.println("Digite o valor da AREA");
    area = teclado.nextDouble();

    // passo 2 - processamento
    area = lado * lado;

    // passo 3 - saida
    System.out.println("Area de um quadrado = " + area);
    }
}    
