/*Calculadora Cientifica
Desenvolvido por Rafael de Oliveira Ferreira
RA.1430961921025
*/
import java.util.Scanner;

public class TesteCalculadoraCientifica {
    public static void main(String... args){ //varargs
        Scanner leitor = new Scanner (System.in);
        CalculadoraCientifica c = new CalculadoraCientifica();
        System.out.println("1-Raiz Inteiros\n2-Raiz Reais\n3-Raiz String\n4-Potenciacao 2 Bytes\n5-Potenciacao 2 Strings\n6-Potencia");
        int opcao = leitor.nextInt();
        double resultado = 0;
        switch (opcao){
            case 1:
                System.out.println("Qual o número que deseja saber a raiz?");
                int operando1 = leitor.nextInt();
                resultado = c.raiz(operando1);
                break;
            case 2:
                System.out.println("Qual o número que deseja saber a raiz?");
                double operando2 = leitor.nextDouble();
                resultado = c.raiz(operando2);
                break;
            case 3:
                System.out.println("Qual o número que deseja saber a raiz?");
                String operando3 = leitor.next();
                resultado = c.raiz(operando3);
                break;
            case 4:
                System.out.println("Digite o número para saber sua potencia.");
                byte operando4 = leitor.nextByte();
                byte operando5 = leitor.nextByte();
                resultado = c.potencia(operando4, operando5);
                break;
            case 5:
                System.out.println("Digite o número para saber sua potencia.");
                String s1 = leitor.next();
                String s2 = leitor.next();
                resultado = c.potencia(s1, s2);
                break;
            case 6:
                System.out.println("Digite o número para saber sua potencia.");
                int operando6 = leitor.nextInt();
                double operando7 = leitor.nextDouble();
                resultado = c.potencia(operando6, operando7);
                break;
            default:
                System.out.println("Opção inválida!");
                leitor.close();
                break;

        }
        System.out.println("Resultado:" + resultado);
        leitor.close();
    }
}