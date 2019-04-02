package com.hgc.controller;

import com.hgc.domain.Article;
import com.hgc.domain.JsonData;
import com.hgc.repository.ArticleRepository;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zcs
 * @create: 2019/3/14 13:52
 **/
@RestController
@RequestMapping("/api")
public class ArticleController {
    @Autowired
    private ArticleRepository articleRepository;
    @GetMapping("/save")
    public Object save(){
        Article article=new Article();
        article.setId(3L);
        article.setPv(888);
        article.setContent("this is 内容");
        article.setTitle("i love xdclass教程");
        article.setSummary("概要搜索");
        articleRepository.save(article);
        return JsonData.buildSuccess();
    }
    @GetMapping("/search")
    public Object search(String title){
//        QueryBuilder queryBuilder2=QueryBuilders.matchAllQuery();//搜索全部文档
        QueryBuilder queryBuilder= QueryBuilders.matchQuery("title",title);
        Iterable<Article> list=articleRepository.search(queryBuilder);
        return JsonData.buildSuccess(list);
    }
}
