package com.hgc.repository;

import com.hgc.domain.Article;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author: zcs
 * @create: 2019/3/14 11:50
 **/
@Component
//@Repository
public interface ArticleRepository extends ElasticsearchRepository<Article,Long> {
}
