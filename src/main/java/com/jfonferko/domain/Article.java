package com.jfonferko.domain;


import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ARTICLE")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ARTICLEID")
    private Long id;

    @Column(name = "CONTENT")
    private String content;

    @Column(name = "CREATED")
    private LocalDateTime created;

    @ManyToOne
    @JoinColumn(name = "CUSTOMERID")
    private Customer creator;

    public Article() {
    }

    public Article(final String pContent, final LocalDateTime pCreated, final Customer pCreator) {
        content = pContent;
        created = pCreated;
        creator = pCreator;
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

    public Customer getCreator() {
        return creator;
    }

    @Override
    public boolean equals(final Object pO) {
        if (this == pO)
        {
            return true;
        }
        if (pO == null || getClass() != pO.getClass())
        {
            return false;
        }
        Article article = (Article) pO;
        return Objects.equals(content, article.content) &&
                Objects.equals(created, article.created) &&
                Objects.equals(creator, article.creator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, created, creator);
    }
}
