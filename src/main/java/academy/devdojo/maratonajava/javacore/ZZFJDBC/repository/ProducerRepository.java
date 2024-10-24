package academy.devdojo.maratonajava.javacore.ZZFJDBC.repository;

import academy.devdojo.maratonajava.javacore.ZZFJDBC.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZFJDBC.domain.Producer;
import academy.devdojo.maratonajava.javacore.ZZFJDBC.domain.ProducerWithLombok;
import lombok.extern.log4j.Log4j2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


@Log4j2
public class ProducerRepository {
    public static void save(Producer p) throws SQLException {
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s');".formatted(p.getName());
        try (Connection conn = ConnectionFactory.getConnection()) {
            Statement smt = conn.createStatement();
            int rowsAffected = smt.executeUpdate(sql);
            log.info("Database rows affected by this change {}", rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void save2(ProducerWithLombok p) throws SQLException {
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s');".formatted(p.getName());
        try (Connection conn = ConnectionFactory.getConnection()) {
            Statement smt = conn.createStatement();
            int rowsAffected = smt.executeUpdate(sql);
            //log.info("Database rows affected by this change {}", rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteById(Integer id) {
        String sql = "DELETE FROM `anime_store`.`producer` WHERE (`id` = '%d');".formatted(id);
        try (Connection conn = ConnectionFactory.getConnection()) {
            Statement smt = conn.createStatement();
            int rowsAffected = smt.executeUpdate(sql);
            System.out.println(rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void update(ProducerWithLombok p2) {
        String sql = "UPDATE `anime_store`.`producer` SET `name` = '%s' WHERE (`id` = '%d');".formatted(p2.getName(), p2.getId());
        try (Connection conn = ConnectionFactory.getConnection()) {
            Statement smt = conn.createStatement();
            int rowsAffected = smt.executeUpdate(sql);
            System.out.println(rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<ProducerWithLombok> findAll() {
        String sql = "SELECT * FROM `anime_store`.`producer`;";
        List<ProducerWithLombok> list = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection()) {
            Statement smt = conn.createStatement();
            ResultSet result = smt.executeQuery(sql);
            while (result.next()) {
                int id = result.getInt("id");
                String name = result.getString("name");
                ProducerWithLombok producer = ProducerWithLombok.builder().id(id).name(name).build();
                list.add(producer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static List<ProducerWithLombok> findByName(String name) {
        String sql = "SELECT * FROM anime_store.producer WHERE NAME LIKE '%s';".formatted(name);
        List<ProducerWithLombok> list = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection()) {
            Statement smt = conn.createStatement();
            ResultSet result = smt.executeQuery(sql);
            while (result.next()) {
                int id = result.getInt("id");
                ProducerWithLombok producer = ProducerWithLombok.builder().id(id).name(name).build();
                list.add(producer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void showProducerMetaData() {
        String sql = "SELECT * FROM anime_store.producer;";
        List<ProducerWithLombok> list = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection()) {
            Statement smt = conn.createStatement();
            ResultSet result = smt.executeQuery(sql);

            ResultSetMetaData metaData = result.getMetaData();
            result.next();

            int columnCount = metaData.getColumnCount();
            System.out.println(columnCount + "<- Quantidade de colunas");

            for (int i = 1; i <= columnCount; i++) {
                System.out.println("table name " + metaData.getTableName(i));
                System.out.println("column name " + metaData.getColumnName(i));
                System.out.println("column type " + metaData.getColumnTypeName(i));
                System.out.println("column size " + metaData.getColumnDisplaySize(i) );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
