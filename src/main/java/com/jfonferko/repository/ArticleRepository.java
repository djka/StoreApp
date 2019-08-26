package com.jfonferko.repository;

import java.util.List;

import com.jfonferko.domain.Article;

public interface ArticleRepository {

    List<Article> findAll();

    Article save(Article pArticle);

}
