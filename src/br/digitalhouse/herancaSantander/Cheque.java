package br.digitalhouse.herancaSantander;

import java.util.Date;

public class Cheque {
    private double valor;
    private String bancoEmissor;
    private Date dataPagto;

    public Cheque (double novoValor, String novoBancoEmissor, Date novaDataPagto){
        valor = novoValor;
        bancoEmissor = novoBancoEmissor;
        dataPagto = novaDataPagto;
    }

    public double getValor() {
        return valor;
    }

    public String getBancoEmissor() {
        return bancoEmissor;
    }

    public Date getDataPagto() {
        return dataPagto;
    }

    public void setValor(double novoValor) {
        valor = novoValor;
    }

    public void setBancoEmissor(String novoBancoEmissor) {
        bancoEmissor = novoBancoEmissor;
    }

    public void setDataPagto(Date novaDataPagto) {
        dataPagto = novaDataPagto;
    }
}
