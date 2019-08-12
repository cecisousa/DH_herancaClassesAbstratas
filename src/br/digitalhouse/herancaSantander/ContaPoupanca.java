package br.digitalhouse.herancaSantander;

public class ContaPoupanca extends Contas {

    private double taxa;

    public ContaPoupanca(Cliente novoCliente, double novoSaldo, double novaTaxa) {
        super(novoCliente, novoSaldo);
        taxa = novaTaxa;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double novaTaxa) {
        taxa = novaTaxa;
    }

    @Override
    public void depositar(double dinheiro) {
        super.depositar(dinheiro);
    }

    @Override
    public void sacar(double dinheiro) {
        super.sacar(dinheiro);
    }

    public void recolherJuros(){
        setSaldo(getSaldo() + getSaldo()* (taxa/100));
    }

}
