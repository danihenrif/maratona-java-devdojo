package academy.devdojo.maratonajava.javacore.WColecoes.domain;

import java.util.Comparator;
import java.util.Objects;

public class Manga implements Comparable<Manga> {
    public Long id;
    public String nomeManga;
    public Integer quantidade;


    public Manga(Long id, String nomeManga, Integer quantidade) {
        this.id = id;
        this.nomeManga = nomeManga;
        this.quantidade = quantidade;
    }

    public Manga(Long id, String nomeManga) {
        Objects.requireNonNull(id);
        Objects.requireNonNull(nomeManga);
        this.id = id;
        this.nomeManga = nomeManga;
    }

    @Override
    public int compareTo(Manga o) {
        //negativo se o this < o
        //0 se this = o
        //positivo se o this > o

        /*if(this.id < o.id) return -1;
        else if(this.id == o.id) return 1;
        else return 0;*/

        //Ou ainda de forma mais elegante...
        return this.id.compareTo(o.id);

        //imagine que agora eu quisesse ordenar por nome //usar comparator

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeManga() {
        return nomeManga;
    }

    public void setNomeManga(String nomeManga) {
        this.nomeManga = nomeManga;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", nomeManga='" + nomeManga + '\'' +
                ", quantidade=" + quantidade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Objects.equals(id, manga.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
