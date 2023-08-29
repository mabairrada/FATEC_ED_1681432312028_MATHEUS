package Atividade_24;

import java.util.Scanner;

public class Loop {

	 public static void main(String[] args) {
	        
	        int anterior = 0;
	        int atual = 1;
	        int proximo = 0;
	        
			Scanner scannerEntrada = new Scanner(System.in);
	        
	        System.out.println("Digite a quantidade de elementos da sequência a serem impressos: ");
	        
	        int comprimentoSequencia = scannerEntrada.nextInt();
	        
	        for (int i = 0; i < comprimentoSequencia; i++) {
	            proximo = anterior + atual;
	            anterior = atual;
	            atual = proximo;
	            
	            System.out.print(anterior + " ");
	        }
	    }
}

