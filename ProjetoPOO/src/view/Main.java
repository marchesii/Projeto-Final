package view;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Integer op;
		
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.println("------------------ Menu ------------------");
			System.out.println("1 - Cadastro de Clientes ");
			System.out.println("2 - Cadastro de Fornecedores ");
			System.out.println("3 - Cadastro de Produtos ");
			System.out.println("4 - Atualizaçao de Produtos ");
			System.out.println("5 - Relatorios ");
			System.out.println("6 - Sair");
			System.out.print("Opção: ");
			
			op = ler.nextInt();
			
			switch (op)
			{
				case 1:
			      // código 1
					break;
				case 2:
			      // código 2
					break;
				case 3:
			      // código 3
					break;
				case 4:
			      // código 4
					break;
				case 5:
			      // código 5
					break;
			}
			
		}while (op != 6);
	}

}