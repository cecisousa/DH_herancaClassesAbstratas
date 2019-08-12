package br.digitalhouse.herancaSantander;

public class Principal {
    public static void main(String[] args) {
        Cliente novoCliente = new Cliente(1234, "Sousa", 46111, 396111);

        ContaCorrente novaContaCorrente = new ContaCorrente(novoCliente, 1000, 500);

        novaContaCorrente.sacar(600);
        novaContaCorrente.sacar(600);
        novaContaCorrente.sacar(500);

    }

}
