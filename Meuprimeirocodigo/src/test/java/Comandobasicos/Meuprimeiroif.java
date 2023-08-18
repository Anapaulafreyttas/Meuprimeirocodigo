package Comandobasicos;

import java.util.Scanner;

public class Meuprimeiroif {
	
	

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	// Operadores logicos
		// > maior
		// < menor
		// == igual
		// && = e
		// || = ou
		// >= maior ou igual
		
		System.out.println("Bem vindos ao banco Inter!");
		System.out.println("Digite o seu Loguin:");
		String loguin = scanner.nextLine();
		System.out.println("Digite sua senha:");
		String senha = scanner.nextLine();
		System.out.println("Digite o valor do boleto:");
		int boleto = scanner.nextInt();
		int saldo = 600;
		int saldofinal = saldo - boleto;
		int deposito = 200;
		int saldo2 = saldofinal + deposito;
		
		
	if (saldo >= boleto) {
		System.out.println("O valor do saldo " + " da sua conta já com o deposito é de $" + saldo2 + ",00");
		System.out.println("Obrigada pela preferencia!");
	} else {
		System.out.println("Saldo insuficiente!");

	}	
		
		
		
		

	}

}
