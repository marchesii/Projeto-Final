package view;

import java.util.Scanner;
import controller.*;
import model.*;

public class Main {

	public static void main(String[] args) {
		Integer op;
		ProdutoController controller = new ProdutoController();
		FornecedorController controladorFornecedor = new FornecedorController();
      	ClienteController controladorCliente = new ClienteController();
      	
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.println("------------------ Menu ------------------");
			System.out.println("1 - Cadastro de Clientes ");
			System.out.println("2 - Cadastro de Fornecedores ");
			System.out.println("3 - Cadastro de Produtos ");
			System.out.println("4 - Adicionar Orçamento ");
			System.out.println("5 - Adicionar Fornecedor Principal ");
			System.out.println("6 - Atualizaçao de Produtos ");
			System.out.println("7 - Relatorios ");
			System.out.println("8 - Sair");
			System.out.print("Opção: ");
			
			op = ler.nextInt();
			ler.nextLine();
			
			switch (op)
			{
				case 1:
			      	String nome;
			      	String sobreNome;
			      	String documento;
			      	String email;
			      	Double telefone;
			      	Integer diaNascimento;
			      	Integer mesNascimento;
			      	Integer anoNascimento;
			      	String sexo;
			      	String rua;
			      	Integer numero;
			      	String complemento;
			      	String bairro;
			      	Integer cep;
			      	String cidade;
			      	

			      	System.out.println("Por favor digite seu nome: ");
			      	nome = ler.nextLine();
			      	System.out.println("Por favor digite seu sobrenome: ");
			      	sobreNome = ler.nextLine();
			      	System.out.println("Por favor digite seu documento: ");
			      	documento = ler.nextLine();
			      	System.out.println("Por favor digite seu email: ");
			      	email = ler.nextLine();
			      	System.out.println("Digite seu telefone (somente numeros) exemplo: 551612345678: ");
			      	telefone = ler.nextDouble();
			      	System.out.println("Digite o dia em que você nasceu: ");
			      	diaNascimento = ler.nextInt();
			      	System.out.println("Digite o mes em que você nasceu: ");
			      	mesNascimento = ler.nextInt();
			      	System.out.println("Digite o ano em que você nasceu: ");
			      	anoNascimento = ler.nextInt();
			      	ler.nextLine();
			      	System.out.println("Digite seu gênero sexual por favor: ");
			      	sexo = ler.nextLine();
			      	System.out.println("Digite o nome da sua rua: ");
			      	rua = ler.nextLine();
			      	System.out.println("Digite o complemento da sua rua: ");
			      	complemento = ler.nextLine();
			      	System.out.println("Digite o numero da sua casa: ");
			      	numero = ler.nextInt();
			      	ler.nextLine();
			      	System.out.println("Digite o nome do seu bairro: ");
			      	bairro = ler.nextLine();
			      	System.out.println("Digite o cep da sua rua (somente numeros): ");
			      	cep = ler.nextInt();
			      	ler.nextLine();
			      	System.out.println("Digite a cidade no qual você mora: ");
			      	cidade = ler.nextLine();
			      	
			      	System.out.println(controladorCliente.cadastrarCliente(nome, sobreNome, documento, email, telefone, diaNascimento, mesNascimento, anoNascimento, sexo, rua, numero, complemento, bairro, cep, cidade));
			      	System.out.println(controladorCliente.buscarCliente(nome).toString());
			      	break;
				case 2:
					
			      	System.out.println("Por favor digite seu nome: ");
			      	nome = ler.nextLine();
			      	System.out.println("Por favor digite seu sobrenome: ");
			      	sobreNome = ler.nextLine();
			      	System.out.println("Por favor digite seu documento: ");
			      	documento = ler.nextLine();
			      	System.out.println("Por favor digite seu email: ");
			      	email = ler.nextLine();
			      	System.out.println("Digite seu telefone (somente numeros) exemplo: 551612345678: ");
			      	telefone = ler.nextDouble();
			      	System.out.println("Digite o dia em que você nasceu: ");
			      	diaNascimento = ler.nextInt();
			      	System.out.println("Digite o mes em que você nasceu: ");
			      	mesNascimento = ler.nextInt();
			      	System.out.println("Digite o ano em que você nasceu: ");
			      	anoNascimento = ler.nextInt();
			      	ler.nextLine();
			      	System.out.println("Digite seu gênero sexual por favor: ");
			      	sexo = ler.nextLine();
			      	System.out.println("Digite o nome da sua rua: ");
			      	rua = ler.nextLine();
			      	System.out.println("Digite o complemento da sua rua: ");
			      	complemento = ler.nextLine();
			      	System.out.println("Digite o numero da sua casa: ");
			      	numero = ler.nextInt();
			      	ler.nextLine();
			      	System.out.println("Digite o nome do seu bairro: ");
			      	bairro = ler.nextLine();
			      	System.out.println("Digite o cep da sua rua (somente numeros): ");
			      	cep = ler.nextInt();
			      	ler.nextLine();
			      	System.out.println("Digite a cidade no qual você mora: ");
			      	cidade = ler.nextLine();

			      	System.out.println(controladorFornecedor.cadastrarFornecedor(nome, sobreNome, documento, email, telefone, diaNascimento, mesNascimento, anoNascimento, sexo, rua, numero, complemento, bairro, cep, cidade));
			      	System.out.println(controladorFornecedor.buscarFornecedor(nome).toString());
					break;
				case 3:
					
					Integer codigo;
					Double precoCompra;
					Integer quantidade;
					
					System.out.println("Digite o nome do seu produto: ");
					nome = ler.nextLine();
					System.out.println("Digite o codigo do produto: ");
					codigo = ler.nextInt();
					System.out.println("Digite quanto custa o produto: ");
					precoCompra = ler.nextDouble();
					System.out.println("Digite a quantidade desse produto: ");
					quantidade = ler.nextInt();
					
					System.out.println(controller.cadastrarProduto(nome, codigo, precoCompra, quantidade));
					break;
				case 4:
					break;
				case 5:
					System.out.println("Qual produto vai ganhar um novo fornecedor?");
					String nomeProduto = ler.nextLine();
					System.out.println("Qual fornecedor irá distribuir esse produto?");
					String fornecedorNome = ler.nextLine();
					Produto produto = controller.buscarProduto(nomeProduto);
					Fornecedor fornecedor = controladorFornecedor.buscarFornecedor(fornecedorNome);
					if(fornecedor != null && produto != null) {
						produto.setFornecedor(fornecedor);
					}
					break;
				case 6:
					System.out.println("Digite o nome do produto a ser atualizado: ");
					nomeProduto = ler.nextLine();
					
					if(controller.buscarProduto(nomeProduto) != null) {
						System.out.println("Digite o nome do seu produto: ");
						nome = ler.nextLine();
						System.out.println("Digite o codigo do produto: ");
						codigo = ler.nextInt();
						System.out.println("Digite quanto custa o produto: ");
						precoCompra = ler.nextDouble();
						System.out.println("Digite a quantidade desse produto: ");
						quantidade = ler.nextInt();
						
						System.out.println(controller.alterarProduto(nomeProduto, codigo, precoCompra, quantidade));
					}else {
						System.out.println("Esse produto não está cadastrado.");
					}
					
					break;
					
				case 7:
					System.out.println(controller.listaProdutos());
					break;
			}
			
		}while (op != 8);
	}

}