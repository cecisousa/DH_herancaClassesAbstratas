package br.digitalhouse.herancaSantander;

public abstract class Contas {
    private Cliente cliente;
    private double saldo;

    public Contas (Cliente novoCliente, double novoSaldo){
        cliente = novoCliente;
        saldo = novoSaldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setCliente(Cliente novoCliente) {
        cliente = novoCliente;
    }

    public void setSaldo(double novoSaldo) {
        saldo = novoSaldo;
    }

    public void depositar(double dinheiro) {
        System.out.println("Realizando depósito... Quantia: R$" + dinheiro);
        saldo += dinheiro;
        System.out.println("Depósito realizado!" + cliente.getSobrenome() + " , seu novo saldo é de R$ " + saldo);

    }

    public void sacar(double dinheiro) {
        System.out.println("Realizando saque no valor de R$ " + dinheiro);
        if (saldo < dinheiro){
            System.out.println("Saldo insuficiente para realizar esta operação, " + cliente.getSobrenome());
        }
        saldo -= dinheiro;
        System.out.println("Saque realizado, " + cliente.getSobrenome() + ". Seu novo saldo é de R$ " + saldo);

    }

    public boolean consultarSaldo(boolean status){
        return true;
    }


}
