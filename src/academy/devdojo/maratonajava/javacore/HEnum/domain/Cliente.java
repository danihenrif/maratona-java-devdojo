package academy.devdojo.maratonajava.javacore.HEnum.domain;

public class Cliente {
    private String nome;
    private TipoCliente tipo;

    public Cliente(String nome, TipoCliente tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipo() {
        return tipo;
    }

    public void setTipo(TipoCliente tipo) {
        this.tipo = tipo;
    }

    public String toString() {
        return "Cliente [nome=" + nome + ", tipo=" + tipo.getVALOR() + ", Nome=" + tipo.getNomeRelatorio() + "]";
    }
}
