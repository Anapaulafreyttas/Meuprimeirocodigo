package Comandobasicos;

import java.util.Scanner;

public class Meuprimeiroswitch {

	public static void main(String[] args) {
		
     Scanner s = new  Scanner(System.in);
     
     
        System.out.println(" Bem vindos a loja Ross! ");
        System.out.println("Digite seu nome:");
		String nome = s.nextLine();
		System.out.println("Digite seu endereço:");
		String endereco = s.nextLine();
		System.out.println("Digite a marca de roupa da sua preferência:");
		System.out.println("Broksfiel / Hugo boss / Zara");
		String marcaroupa = s.nextLine();
		System.out.println(" Digite tamanho desejado:");
		System.out.println(" P M G");
		String tamanho = s.nextLine();
		System.out.println("Digite a cor desejada:");
		System.out.println(" Azul / vermelho / Preto");
		String cor = s.nextLine();
		System.out.println("O valor da camiseta P: 100 / M: 1000 / G 1000");
		System.out.println("Digite o valor da sua camiseta:");
		String valor = s.next();
		System.out.println("Escolha a forma de pagamento: Cartão de Debito ou Dinheiro");
		String formapagamento = s.next();
		
		System.out.println(" Obrigada pela preferência!");
		String agradecimento = s.next();
		
		
		
		
		switch (nome) {
		case "Bem vindos a loja Ross!":
			
			break;
		case "agradecimento":
			System.out.println("Obrigada pela preferência!");
			break;
		default:
			System.out.println("Informação invalida!");
			break;
		}
	}

}
