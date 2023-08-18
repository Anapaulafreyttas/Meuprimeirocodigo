package Comandobasicos;

public class Operacoes {
	
	public void soma(int n1 , int n2) {
		
		int soma = n1 + n2;
		System.out.println("O resultado da soma é:" + soma);
			
		
	}
	
	public void subtracao(int n1 , int n2) {
		int subtracao = n1 - n2;
		System.out.println("O resultado da subtração é :" + subtracao);
		
	}
	
  public void multiplicacao(int n1 , int n2) {
	  
	  int multiplicacao = n1 * n2;
	  System.out.println("O resultado da multiplicação é:" + multiplicacao);
  }
  
  
  public void divisao(int n1 , int n2) {
	  
	  int divisao = n1 / n2;
	  System.out.println("O resultado da divisão é:" + divisao);
  }
  
  
  public void conta(int n1 , int n2 , int n3 , int n4) {
	 
	  int conta = (n1 + n2 - n3) *( n4);
	  System.out.println("O resultado da conta é:" + conta);
	  
  }
  
  public void total(int n1 , int n2 , int n3 , int n4 , int n5 , int n6) {
	  
	  int total = (n1 + n2 - n3) * (n4 / n5 * n6);
	  System.out.println("O resultado do total é :" + total);
  }
  
  
}
  


