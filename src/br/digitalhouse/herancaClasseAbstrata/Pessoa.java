package br.digitalhouse.herancaClasseAbstrata;

public abstract class Pessoa {
    private String nome;
    private String sobrenome;
    private String cpf;
    protected String sexo;

    public Pessoa(String novoNome, String novoSexo){
        nome = novoNome;
        sexo = novoSexo;
    }

    public abstract void respirar(String nome);

    public void cadastroPessoa(String nome, String sobrenome){
        System.out.println("Dados da pessoa: " + nome + " " + sobrenome);
    }

    public void cadastroPessoa(String nome, String sobrenome, String sexo){
        System.out.println("Dados atualizados: " + nome + " e " + sexo);
    }

    public void cadastroPessoa(String nome){
        System.out.println("Dados simples: " + nome);
    }

    public boolean estudar(boolean status){
        return false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
