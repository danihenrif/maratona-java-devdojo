package academy.devdojo.maratonajava.javacore.IClassesAbstratas.domain;

// Funcionário "não existe" é um TEMPLATE, o que existe é dentista, médico...
public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
