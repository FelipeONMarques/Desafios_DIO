package desafio_3;

import java.util.Scanner;

public class MainContaBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO: Criar uma nova conta bancária com o saldo inicial
        double saldoInicial = scanner.nextDouble();
        ContaBancaria conta = new ContaBancaria(saldoInicial);

        // Lê a Entrada com o valor do deposito e aciona o método "depositar"
        double valorDeposito = scanner.nextDouble();
        conta.depositar(valorDeposito);

        // Lê a Entrada com o valor do saque e aciona o método "sacar"
        double valorSaque = scanner.nextDouble();
        conta.sacar(valorSaque);

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}

class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        // TODO: Incrementar o saldo com o valor e imprimir "Deposito feito."
        this.saldo = valor + saldo;
        System.out.println("Deposito feito.");
        imprimirSaldo();
    }

    public void sacar(double valor) {
        // TODO: Verificar se o saldo é suficiente considerando o valor:
        // Se sim, atualizar o saldo e imprimir "Saque feito."
        if (valor <= saldo){
            this.saldo = saldo - valor ;
            System.out.println("Saque feito.");
        }
        // Se não, imprimir "Saldo insuficiente. Saque não realizado."
        else {
            System.out.println("Saldo insuficiente. Saque não realizado.");
        }
        imprimirSaldo();
    }

    private void imprimirSaldo() {
        System.out.printf("Saldo atual: %.1f\n", this.saldo);
    }

}
