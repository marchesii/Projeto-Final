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
			System.out.println("4 - Atualiza�ao de Produtos ");
			System.out.println("5 - Relatorios ");
			System.out.println("6 - Sair");
			System.out.print("Op��o: ");
			
			op = ler.nextInt();
			
			switch (op)
			{
				case 1:
			      // c�digo 1
					break;
				case 2:
			      // c�digo 2
					break;
				case 3:
			      // c�digo 3
					break;
				case 4:
			      // c�digo 4
					break;
				case 5:
			      // c�digo 5
					break;
			}
			
		}while (op != 6);
	}

}