package TerceiraSemana.EstruturasDeRepetição;
import java.util.Scanner;
/**
 * Faça um programa que calcule fatorial de um número inteiro fornecido por entrada;
 * Ex: !5 = 120 -> (5 x 4 x 3 x 2 x 1);
 */
public class Fatorial {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Fatorial: ");
            int fatorial = scan.nextInt();

            int multiplicacao = 1;//Multiplicação em fatorial não pode coomeçar com 0 se não os resultados serão 0;

            System.out.print(fatorial + "! = ");
            for (int i = fatorial; i >= 1; i--) {//Em fatorial usamos i-- ou seja decomposição para diminuir o fator;
                multiplicacao = multiplicacao * i;

            }

            System.out.println(multiplicacao);


        }
    }

