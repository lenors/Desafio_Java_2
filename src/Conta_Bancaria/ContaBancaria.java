package Conta_Bancaria;

import java.util.Scanner;

public class ContaBancaria {
	
		public static void main(String[] args) {
			
			String nome = "Ikki";
			String tipoConta = "Corrente";
			double Saldo = 1599.99;
			int opcao = 0;

			System.out.println("*************************");
			System.out.println("\nNome do cliente: " + nome);
			System.out.println("Tipo conta: " + tipoConta);
			System.out.println("Saldo atual: " + Saldo);
			System.out.println("\n*************************");
			String menu = """
					     **Digite sua opção**
					     1 - Consultar saldo
					     2 - Transferir valor
					     3 - Receber valor
					     4 - Sair
					""";

			Scanner leitura = new Scanner(System.in);

			while (opcao != 4) {
				System.out.println(menu);
				opcao = leitura.nextInt();

				if (opcao == 1) {
					System.out.println("O saldo atualizado é " + Saldo);
				} else if (opcao == 2) {
					System.out.println("Qual o valor que deseja transferir ?");
					double valor = leitura.nextDouble();
					if (valor > Saldo) {
						System.out.println("Não há saldo para realizar a transferencia ");
					} else {
						Saldo -= valor;
						System.out.println("Novo saldo" + Saldo);
					}
				} else if (opcao == 3) {
					System.out.println("Valor recebido: " + Saldo);
					double valor = leitura.nextDouble();
					Saldo += valor;

				} else if (opcao != 4) {
					System.out.println("Opção invalida");
				}

			}
		
	}

}
