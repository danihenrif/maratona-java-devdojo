package academy.devdojo.maratonajava.javacore.KPolimorfismo.domain;

public abstract class Product {
    protected String nome;
    protected Float valor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public Product(String nome, Float valor) {
        this.nome = nome;
        this.valor = valor;
    }
}
