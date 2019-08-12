package br.digitalhouse.herancaSantander;

public class ContaCorrente extends Contas {

    private double chequeEspecial;

    public ContaCorrente(Cliente novoCliente, double novoSaldo, double novoChequeEspecial) {
        super(novoCliente, novoSaldo);
        chequeEspecial = novoChequeEspecial;
    }

    @Override
    public void depositar(double dinheiro) {
        super.depositar(dinheiro);
    }

    public void depositar(Cheque cheque) {
        System.out.println("Realizando depósito de cheque no valor de R$ " + cheque.getValor());
        setSaldo(getSaldo() + cheque.getValor());
        System.out.println("Depósito realizado! " + getCliente().getSobrenome() + " , seu novo saldo é de R$ " + getSaldo());
    }

    @Override
    public void sacar(double dinheiro) {
        System.out.println("Realizando saque no valor de R$ " + dinheiro);

        if (getSaldo() >= dinheiro) {
            setSaldo(getSaldo() - dinheiro);
            System.out.println("Saque realizado! Seu novo saldo é de R$ " + getSaldo() + " e você ainda pode utilizar o cheque especial no valor de R$ " + chequeEspecial);
        }
        else {
            if (getSaldo() + chequeEspecial >= dinheiro) {
                setSaldo(getSaldo() - dinheiro);
                System.out.println("Você usou R$ " + -getSaldo() + " do cheque especial e ainda pode utilizar R$ " + (chequeEspecial + getSaldo()));
            } else {
                System.out.println("Saldo insuficiente!");
            }
        }
    }
}





