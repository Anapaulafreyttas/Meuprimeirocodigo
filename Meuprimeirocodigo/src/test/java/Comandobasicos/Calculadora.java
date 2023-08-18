package Comandobasicos;

public class Calculadora {

	
	public static void main(String[] args) {
	
		// Comando para chamar ex:soma
		Operacoes op = new Operacoes();

		op.soma(41, 8);
		op.subtracao(12, 12);
		op.multiplicacao(4, 4);
		op.divisao(5, 12);
		op.conta(4, 30, 5, 6);
		op.total(40, 5, 10, 4, 7, 9);
		
		
	}

}
