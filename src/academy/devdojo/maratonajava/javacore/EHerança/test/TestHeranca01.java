package academy.devdojo.maratonajava.javacore.EHerança.test;

import academy.devdojo.maratonajava.javacore.EHerança.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.EHerança.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.EHerança.dominio.Pessoa;

public class TestHeranca01 {
    public static void main(String[] args) {
        Endereco endereco =  new Endereco();
        endereco.setRua("3");
        endereco.setCep("59074-210");

        Pessoa pessoa =  new Pessoa();
        pessoa.setNome("Maradona");
        pessoa.setCpf("074.214.246-04");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("MaradonaFuncionario");
        funcionario.setCpf("074.214.246-04");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(400);

        System.out.println();

        funcionario.imprime();

        System.out.println();

        funcionario.relatorioPagamento();
    }
}
