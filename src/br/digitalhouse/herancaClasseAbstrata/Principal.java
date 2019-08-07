package br.digitalhouse.herancaClasseAbstrata;

public class Principal {
    public static void main(String[] args) {
        Crianca bebe = new Crianca("Maria", "feminino");
        System.out.println(bebe.getNome());
        System.out.println(bebe.getSexo());
        System.out.println(bebe.getNome() + "\n" + bebe.getSexo());

        bebe.estudar(true);

//        Pessoa adulto = new Pessoa ("João", "masculino");
//        adulto.estudar(false);
//        adulto.cadastroPessoa("Cecilia", "Sousa", "feminino");

        bebe.respirar("Jessica");
    }
}
