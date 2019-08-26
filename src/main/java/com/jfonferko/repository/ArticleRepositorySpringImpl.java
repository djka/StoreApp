package com.jfonferko.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jfonferko.domain.Article;

@Repository
public class ArticleRepositorySpringImpl implements ArticleRepository {

    protected interface ArticleDBRepository extends CrudRepository<Article, Long> {
        Article save(Article entity);

        List<Article> findAll();
    }

    private ArticleDBRepository articleDBRepository;


    public ArticleRepositorySpringImpl(final ArticleDBRepository pArticleDBRepository) {
        articleDBRepository = pArticleDBRepository;
    }

    @Override
    public List<Article> findAll() {
        return articleDBRepository.findAll();
    }

    @Override
    public Article save(final Article pArticle) {
        return articleDBRepository.save(pArticle);
    }
}
