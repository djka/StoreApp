package com.jfonferko.rest;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jfonferko.appservice.ArticleAppService;
import com.jfonferko.dto.ArticleDto;

@RestController
@RequestMapping("/article")
public class ArticleRestService {

    private ArticleAppService articleAppService;

    public ArticleRestService(ArticleAppService pArticleAppService) {
        this.articleAppService = pArticleAppService;
    }

    @PostMapping()
    public List<ArticleDto> findAll() {
        return this.articleAppService.findAll();
    }

}
