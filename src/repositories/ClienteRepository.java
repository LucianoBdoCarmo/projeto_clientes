package repositories;

import java.io.PrintWriter;

import entities.Cliente;

public class ClienteRepository {

	public void exportarDados(Cliente cliente) {

		try {

			// abrindo um arquivo para escrita (gravação)
			PrintWriter printWriter = new PrintWriter("c:\\temp\\cliente_" + cliente.getIdCliente() + ".txt");

			// escrevendo os dados do arquivo
			printWriter.write("\nID DO CLIENTE...: " + cliente.getIdCliente());
			printWriter.write("\nNOME............: " + cliente.getNome());
			printWriter.write("\nEMAIL...........: " + cliente.getEmail());
			printWriter.write("\nTELEFONE........: " + cliente.getTelefone());
			printWriter.write("\nCPF.............: " + cliente.getCpf());

			// salvando e fechando o arquivo
			printWriter.flush(); // salvar!
			printWriter.close(); // fechar!
			System.out.println("\nDados gravados com sucesso!");

		}

		catch (Exception e) {

			System.out.println("Falha ao gravar arquivo!");
			e.printStackTrace();
		}

	}

}
