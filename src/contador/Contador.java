package contador;

import java.util.Scanner;

import exception.ParametrosInvalidosException;

public class Contador {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero");
		int numeroUm = scanner.nextInt();
		
		System.out.println("Digite o segundo numero");
		int numeroDois = scanner.nextInt();
		
		try {
			contar(numeroUm, numeroDois);
		} catch (ParametrosInvalidosException e) {
			System.out.println(e.getMessage());
		}
	}
	
	static void contar(int numeroUm, int numeroDois) throws ParametrosInvalidosException {
		if(numeroUm > numeroDois) {
			throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");			
		} else {
			int contagem = numeroDois - numeroUm;
			
			for(int i = 1; contagem >= i; i++) {
				System.out.println("imprimindo o numero " + i);
			}
		}		
	}
}
