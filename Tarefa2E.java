import java.util.Scanner;
public class Tarefa2E{
    public static void main (String args []){
        Scanner teclado = new Scanner (System.in);
    // defino as variáveis que preciso
        double baseMaior, baseMenor, altura;

    // passo 1 - entrada
    System.out.println("Digite o valor da BASE MAIOR");
    baseMaior = teclado.nextDouble();
    System.out.println("Digite o valor da BASE MENOR");
    baseMenor = teclado.nextDouble();
    System.out.println("Digite o valor da ALTURA");
    altura = teclado.nextDouble();

    // passo 2 - processamento
     area = (baseMaior + baseMenor)* altura / 2 

    // passo 3 - saida
    System.out.println("Area de um trapezio = " + area);
}