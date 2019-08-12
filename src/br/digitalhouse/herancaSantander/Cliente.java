package br.digitalhouse.herancaSantander;

public class Cliente {
    private int numCliente;
    private String sobrenome;
    private int rg;
    private int cpf;

    public Cliente(int novoNumCliente, String novoSobrenome, int novoRg, int novoCpf){
        numCliente = novoNumCliente;
        sobrenome = novoSobrenome;
        rg = novoRg;
        cpf = novoCpf;
    }

    public int getNumCliente(){
        return numCliente;
    }

    public String getSobrenome(){
        return sobrenome;
    }

    public int getRg(){
        return rg;
    }

    public int getCpf(){
        return cpf;
    }

    public void setNumCliente(int novoNumCliente){
        numCliente = novoNumCliente;
    }

    public void setSobrenome (String novoSobrenome){
        sobrenome = novoSobrenome;
    }

    public void setRg (int novoRg){
        rg = novoRg;
    }

    public void setCpf (int novoCpf){
        cpf = novoCpf;
    }

}
