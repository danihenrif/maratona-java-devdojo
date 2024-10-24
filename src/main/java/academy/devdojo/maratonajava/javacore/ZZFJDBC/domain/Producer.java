package academy.devdojo.maratonajava.javacore.ZZFJDBC.domain;

import lombok.Builder;
import lombok.Value;

import java.util.Objects;

public class Producer {
    private Integer id;
    private String name;

    private Producer(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producer producer = (Producer) o;
        return Objects.equals(id, producer.id) && Objects.equals(name, producer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static final class ProducerBuilder{
        private Integer id;
        private String name;


        public ProducerBuilder name(String name){
            this.name = name;
            return this;
        }

        public ProducerBuilder id(Integer id){
            this.id = id;
            return this;
        }

        public Producer build(){
            return new Producer(id,name);
        }
    }
}
