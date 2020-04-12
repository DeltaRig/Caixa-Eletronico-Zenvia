package zenvia;
/**
 * @author Daniela Pereira Rigoli
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String var;
        System.out.print("Digite o valor para o saque: ");
        var = scan.nextLine();
        
        try {
            Integer.parseInt(var);
        } catch (NumberFormatException e) {
            System.out.println("Você não digitou um número inteiro.");
            System.exit(0);
        } 

        int valor = Integer.parseInt(var);
        
        if (valor < 0)
            System.out.println("Não é possível sacar um valor negativo.");
        else if ((valor%10) > 0)
            System.out.println("Não trabalhamos com notas menores do que a de R$10,00 e para esse saque seria necessário.");
        else {
            Caixa caixa = new Caixa();
            int[] notas = caixa.sacar(valor);
            //lembrando no array temos {nota100, nota50, nota20, nota10}
            
            System.out.print("Entregar ");
            if (notas[0] > 0)
                System.out.print(notas[0] + " nota(s) de R$100,00 ");
            if (notas[1] > 0)
                System.out.print(notas[1] + " nota(s) de R$50,00 ");
            if (notas[2] > 0)
                System.out.print(notas[2] + " nota(s) de R$20,00 ");
            if (notas[3] > 0)
                System.out.print(" e " + notas[3] + " nota(s) de R$10,00");            
        }
    } 
}