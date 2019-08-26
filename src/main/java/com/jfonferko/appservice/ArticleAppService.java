package com.jfonferko.appservice;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.jfonferko.dto.ArticleDto;
import com.jfonferko.service.ArticleService;
import com.jfonferko.service.CustomerService;

@Service
public class ArticleAppService {

    private ArticleService articleService;
    private CustomerService customerService;


    public ArticleAppService(final ArticleService pArticleService, final CustomerService pCustomerService) {
        this.articleService = pArticleService;
        this.customerService = pCustomerService;
    }

    public List<ArticleDto> findAll() {
        return articleService.findAll().stream().map(ArticleDto::of).collect(Collectors.toList());
    }

}
