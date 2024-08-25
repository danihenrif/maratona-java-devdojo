package academy.devdojo.maratonajava.javacore.EHerança.dominio;

public class Pessoa {
    private String nome;
    private String cpf;
    private Endereco endereco;

    public void imprime(){
        System.out.println("Nome: " + nome);
        System.out.println("Cpf: " + cpf);
        if(endereco != null){
            System.out.println("Endereço: " + endereco.getRua() + " " + endereco.getCep());
        }
    }

    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
