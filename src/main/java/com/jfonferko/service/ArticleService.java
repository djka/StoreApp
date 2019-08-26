package com.jfonferko.service;

import java.util.List;

import com.jfonferko.domain.Article;
import com.jfonferko.repository.ArticleRepository;

public class ArticleService {

    private ArticleRepository articleRepository;

    public ArticleService(final ArticleRepository pArticleRepository) {
        articleRepository = pArticleRepository;
    }

    public List<Article> findAll() {
        return articleRepository.findAll();
    }

}
