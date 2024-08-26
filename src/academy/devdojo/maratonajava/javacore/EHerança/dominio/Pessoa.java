package academy.devdojo.maratonajava.javacore.EHerança.dominio;

public class Pessoa {

    /*
    * Com o protected qualquer subclasse de qualquer pacote vai ter acesso direto
    * aos atributos sem a nacessidade de usar o get.
    */
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    static {
        System.out.println("Static de pessoa");
    }

    public Pessoa(String nome) {
        System.out.println("Construtor de pessoa");
        this.nome = nome;
    }

    {
        System.out.println("Inicializacao de pessoa 1");
    }
    {
        System.out.println("Inicializacao de pessoa 2");
    }
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
