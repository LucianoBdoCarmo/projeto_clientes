package principal;

import java.util.Scanner;

import entities.Cliente;
import repositories.ClienteRepository;

public class Program {

	public static void main(String[] args) {

		System.out.println(" *** CADASTRO DE CLIENTES *** ");

		//criando um objeto para a classe Cliente
		Cliente cliente = new Cliente();
		
		//classe para captura de dados atraves do console
		Scanner scanner = new Scanner(System.in);

		//preenchendo os dados do cliente
		System.out.print("Entre com o ID do cliente......: ");
		cliente.setIdCliente(Integer.parseInt(scanner.nextLine()));
		
		System.out.print("Entre com o nome do cliente....: ");
		cliente.setNome(scanner.nextLine());
		
		System.out.print("Entre com o CPF do cliente.....: ");
		cliente.setCpf(scanner.nextLine());
		
		System.out.print("Entre com o telefone do cliente: ");
		cliente.setTelefone(scanner.nextLine());
		
		System.out.print("Entre com o email do cliente...: ");
		cliente.setEmail(scanner.nextLine());

		// imprimindo os dados do cliente no console
		System.out.println("\nDADOS DO CLIENTE:\n");
		System.out.println("ID DO CLIENTE......: " + cliente.getIdCliente());
		System.out.println("NOME...............: " + cliente.getNome());
		System.out.println("EMAIL..............: " + cliente.getEmail());
		System.out.println("CPF................: " + cliente.getCpf());
		System.out.println("TELEFONE...........: " + cliente.getTelefone());
		
		//instanciando a classe ClienteRepository
		ClienteRepository clienteRepository = new ClienteRepository();
		clienteRepository.exportarDados(cliente);

	}
}
