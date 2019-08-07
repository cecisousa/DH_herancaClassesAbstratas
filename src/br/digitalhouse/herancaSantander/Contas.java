package br.digitalhouse.herancaSantander;

public abstract class Contas {
    private double saldo;

    public abstract void sacar(float dinheiro);
    public abstract void depositar(float dinheiro);
    public boolean consultarSaldo(boolean status){
        return true;
    }

}
