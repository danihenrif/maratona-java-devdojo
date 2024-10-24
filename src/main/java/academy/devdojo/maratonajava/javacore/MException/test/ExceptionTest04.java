package academy.devdojo.maratonajava.javacore.MException.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class ExceptionTest04 {
    public static void main(String[] args) {
        try {
            teste();
            throw new ArrayIndexOutOfBoundsException();
            //Cai na primeira ocorrência, se for a mesma classe
            //ou se extender
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro do AIOOBE");
        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        //Colocar as classes mais abrangentes mais a baixo
        //visto que caso Exception estivesse no topo por exemplo
        //Os catchs específicos mais abaixo nunca seriam acionados
        //Ficariam unreachable
    }

        public static void teste() throws SQLException, FileNotFoundException{}
}
