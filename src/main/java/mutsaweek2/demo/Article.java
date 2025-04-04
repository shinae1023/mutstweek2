package mutsaweek2.demo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Article {
    private String title;
    private String content;

    public Article(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
