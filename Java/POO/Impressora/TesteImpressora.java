import java.util.Scanner;

public class TesteImpressora {

/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Impressora impressora1 = new Impressora();
		
		impressora1.exibir(10);
		impressora1.exibir(10, 10);
		impressora1.exibir(10, "String");
		impressora1.exibir("String", 10);
		impressora1.exibir(10, 10, "String");
		impressora1.exibir("String", "String", "String");
	

	}

}
*/
public static void main( String... args){ //varargs
	Scanner leitor = new Scanner (System.in);
	Impressora imprimir = new Impressora();
	System.out.println("1-Float(1)\n2-Float(x2)\n3-Float e String\n4-String e Float \n5-String (x3)\n6-Int (x2) e String");
	int opcao = leitor.nextInt();
	double resultado = 0;
	
	switch (opcao){
		case 1:
			System.out.println("Digite um número com decimal utilizando virgula");
			float valor1 = leitor.nextFloat();
			resultado = imprimir.exibir(valor1); // Resultado é uma variavel double
			break;
		case 2:
			System.out.println("Digite dois números com decimal Utilizando virgula");
			float valor2 = leitor.nextFloat();
			System.out.println("Digite o segundo número com decimal Utilizando virgula");
			float valor3 = leitor.nextFloat();
			imprimir.exibir(valor2,valor3); // Aqui para exibir o metodo novamente é só colocar void e chamar o método sem retorno. 
			//resultado = imprimir.exibir(valor2,valor3);
			break;
		case 3:
			System.out.println("Digite um número decimal utilizando virgula");
			float valor4 = leitor.nextFloat();
			System.out.println("Digite um texto");
			String valor5 = leitor.next();
			imprimir.exibir(valor4,valor5);
			System.out.println(resultado);
			break;
		case 4:
			System.out.println("Digite uma palavra.");
			String valor6 = leitor.next();
			System.out.println("Digite o número decimal utilizando virgula.");
			float valor7 = leitor.nextFloat();
			imprimir.exibir(valor6, valor7);
			break;
		case 5:
			System.out.println("Digite uma palavra.");
			String s1 = leitor.next();
			System.out.println("Digite outra palavra.");
			String s2 = leitor.next();
			System.out.println("Digite a terceira palavra.");
			String s3 = leitor.next();
			imprimir.exibir(s1, s2, s3); // Nessa parte do documento eu estava colocando em uma variavel o valor e não precisava
			break;
		case 6:
			System.out.println("Digite um número inteiro");
			int valor8 = leitor.nextInt();
			System.out.println("Digite outro número inteiro.");
			int valor9 = leitor.nextInt();
			System.out.println("Digite outra palavra.");
			String valor10 = leitor.next();
			System.out.println("\nOs valores digitados são:");
			imprimir.exibir(valor8, valor9,valor10);
			break;
		default:
			System.out.println("Opção inválida!");
			leitor.close();
			break;

	}
	//System.out.println("Resultado:" + resultado);
	leitor.close();
}
}