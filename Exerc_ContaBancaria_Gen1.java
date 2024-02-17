package exerciciosContaBancaria.Gen;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exerc_ContaBancaria_Gen1 {

	public static void main(String[] args) {
		Scanner Banco = new Scanner(System.in);
        Queue<Integer> Conta = new LinkedList<>();

        int valorDeposito = 0;
        int valorSaque = 0;
        int saldo = 0;  

        while (true) {
            System.out.println("\nBanco Poppi - Menu:");
            System.out.println("1. Saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = Banco.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Saldo atual: " + saldo);
                    break;

                case 2:
                    System.out.print("Informe o valor do depósito: ");
                    valorDeposito = Banco.nextInt();
                    saldo += valorDeposito;  // Atualiza o saldo após depósito
                    System.out.println("Depósito de " + valorDeposito + " realizado. Novo saldo: " + saldo);
                    break;

                case 3:
                    System.out.print("Informe o valor do saque: ");
                    valorSaque = Banco.nextInt();
                    if (saldo < valorSaque) {
                        System.out.println("Saldo insuficiente. Saldo atual: " + saldo);
                    } else {
                        saldo -= valorSaque;  // Atualiza o saldo após saque
                        System.out.println("Saque de " + valorSaque + " realizado. Novo saldo: " + saldo);
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
