import java.util.Scanner;
public class Uri1048{
    public static void main (String arg []){
        Scanner teclado = new Scanner (System.in);

        // variaveis
        double salario;
        double novoSalario15, novoSalario12, novoSalario10, novoSalario7, novoSalario4;
        double reaj15,reaj12,reaj10,reaj7,reaj4;

        // entrada
        salario = teclado.nextDouble();

        // processamcoento
        reaj15 = salario * 15 / 100;  // % de rejuste para salarios de: 0 - 400.00
        novoSalario15 = salario + reaj15;

        reaj12 = salario * 12 / 100;  // % de rejuste para salarios de: 400.01 - 800.00
        novoSalario12 = salario + reaj12;

        reaj10 = salario * 10 / 100;  // % de rejuste para salarios de: 800.01 - 1200.00
        novoSalario10 = salario + reaj10;

        reaj7 = salario * 7 / 100;    // % de rejuste para salarios de: 1200.01 - 2000.00
        novoSalario7 = salario + reaj7;

        reaj4 = salario * 4 / 100;    // % de rejuste para salarios acima de: 2000.00
        novoSalario4 = salario + reaj4;

        // condicoes
        if (salario <= 400){
            System.out.printf("Novo Salario: %.2f\n",novoSalario15);
            System.out.printf("Reajuste Ganho: %.2f\n",reaj15);
            System.out.println("Em percentual: 15%");
        }
        else if ((salario > 400) && (salario <= 800)){
            System.out.printf("Novo Salario: %.2f\n",novoSalario12);
            System.out.printf("Reajuste Ganho: %.2f\n",reaj12);
            System.out.println("Em percentual: 12%");    
        }
        else if ((salario > 800) && (salario <=1200)){
            System.out.printf("Novo Salario: %.2f\n",novoSalario10);
            System.out.printf("Reajuste Ganho: %.2f\n",reaj10);
            System.out.println("Em percentual: 10%");    
        }
        else if ((salario > 1200) && (salario <= 2000)){
            System.out.printf("Novo Salario: %.2f\n",novoSalario7);
            System.out.printf("Reajuste Ganho: %.2f\n",reaj7);
            System.out.println("Em percentual: 7%");
        }
        else {
            System.out.printf("Novo Salario: %.2f\n",novoSalario4);
            System.out.printf("Reajuste Ganho: %.2f\n", reaj4);
            System.out.println("Em percentual: 4%");    
        }
    }
}