package academy.devdojo.maratonajava.javacore.ZZFJDBC.test;

import academy.devdojo.maratonajava.javacore.ZZFJDBC.domain.Producer;
import academy.devdojo.maratonajava.javacore.ZZFJDBC.domain.ProducerWithLombok;
import academy.devdojo.maratonajava.javacore.ZZFJDBC.repository.ProducerRepository;

import java.sql.SQLException;

public class ConnectionFactoryTest02 {
    public static void main(String[] args) throws SQLException {
        ProducerWithLombok p = ProducerWithLombok.builder().name("Kafka").id(1).build();
        ProducerWithLombok p2 = ProducerWithLombok.builder().name("Atualizei o nome").id(2).build();
        ProducerRepository.save2(p);
        ProducerRepository.deleteById(4);
        ProducerRepository.update(p2);
        System.out.println(ProducerRepository.findAll());
        System.out.println(ProducerRepository.findByName("Kafka"));
        ProducerRepository.showProducerMetaData();
    }
}
