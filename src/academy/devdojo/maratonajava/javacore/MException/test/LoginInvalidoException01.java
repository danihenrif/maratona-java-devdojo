package academy.devdojo.maratonajava.javacore.MException.test;

import academy.devdojo.maratonajava.javacore.MException.test.domain.LoginInvalidException;

public class LoginInvalidoException01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidException e) {
            e.printStackTrace();
        }
    }
    private static void logar() throws LoginInvalidException {
        String login = "login";
        String password = "password";

        if(!login.equals(password) || !password.equals(login)){
            throw new LoginInvalidException("Login ou senha inválido");
        }
        System.out.println("Usuário logado com sucesso !!!");
    }
}
