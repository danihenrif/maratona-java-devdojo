package academy.devdojo.maratonajava.javacore.LExceções.error.test;

public class StackOverflowTest01 {
    public static void main(String[] args) {
        /*
        * Todos os Errors em java descendem da classe Throwable
        * Há 3 tipos de erros
        * Error :
        *   Exs:  Não há tratamento ex : estouro de pilha para alocação de objetos - OutOfMemoryError
        *         Pilha de chamada de métodos excede o limite (chamadas recursivas por ex) - StackOverFlow
        * Exceptions :
        *   - Checked exceptions :
        *       Verificadas pelo compilador, Checked exceptions são verificadas pelo compilador. Se um método lança uma
        *       checked exception, ele deve ser tratado ou declarado no método com a palavra-chave throws.
        *       Exemplos incluem:
        *            IOException: Lançada em operações de I/O (Input/Output) falhas.
        *            SQLException: Lançada para erros relacionados a bancos de dados.
        *            ClassNotFoundException: Lançada quando uma classe não é encontrada durante a execução.
        *   - Unchecked exceptions(RunTimeException) (Geralmente erro de desenvolvimento) :
        *       Unchecked exceptions não são verificadas pelo compilador e podem ocorrer durante a execução do programa.
        *           Exemplos incluem:
            *           NullPointerException: Ocorre quando se tenta acessar um objeto que está com valor null.
            *           ArrayIndexOutOfBoundsException: Ocorre quando se tenta acessar um índice inválido de um array.
            *           IllegalArgumentException: Lançada para indicar que um método recebeu um argumento inválido.
         */
    }
}
