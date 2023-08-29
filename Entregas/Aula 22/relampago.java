package Busca;

import java.util.Scanner;

 

public class relampago {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um n�mero para calcular o fatorial: ");

        int numero = scanner.nextInt();

        scanner.close();

 

        long fatorial = calcularFatorial(numero);

        System.out.println(numero + "! = " + fatorial);

    }

 

    public static long calcularFatorial(int n) {

        if (n < 0) {

            throw new IllegalArgumentException("O fatorial n�o � definido para n�meros negativos.");

        }

        

        if (n == 0 || n == 1) {

            return 1;

        }

 

        long resultado = 1;

        for (int i = 2; i <= n; i++) {

            resultado *= i;

        }

 

        return resultado;

    }

}