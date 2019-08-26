package com.jfonferko.dto;

import java.time.LocalDateTime;

import com.jfonferko.domain.Article;

public class ArticleDto {

    private Long id;
    private String content;
    private LocalDateTime created;
    private CustomerDto creator;

    public ArticleDto(final Long pId, final String pContent, final LocalDateTime pCreated, final CustomerDto pCreator) {
        id = pId;
        content = pContent;
        created = pCreated;
        creator = pCreator;
    }


    public static ArticleDto of(Article pArticle) {
        return new ArticleDto(pArticle.getId(), pArticle.getContent(), pArticle.getCreated(), CustomerDto.of(pArticle.getCreator()));
    }

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public CustomerDto getCreator() {
        return creator;
    }
}
