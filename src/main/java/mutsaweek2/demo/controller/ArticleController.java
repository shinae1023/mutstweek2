package mutsaweek2.demo.controller;

import mutsaweek2.demo.Article;
import mutsaweek2.demo.service.ArticleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {
    private ArticleService articleService;

    @PostMapping("/articles/write")
    public String write(Article article) {

    }
}
