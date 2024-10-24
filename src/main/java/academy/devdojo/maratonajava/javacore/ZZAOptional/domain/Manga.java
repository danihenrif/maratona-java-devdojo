package academy.devdojo.maratonajava.javacore.ZZAOptional.domain;

public class Manga {
    private Integer id;
    private String title;
    private Integer chapters;

    public Manga(Integer id, String title, Integer chapters) {
        this.id = id;
        this.title = title;
        this.chapters = chapters;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getChapters() {
        return chapters;
    }

    public void setChapters(Integer chapters) {
        this.chapters = chapters;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", chapters=" + chapters +
                '}';
    }
}
