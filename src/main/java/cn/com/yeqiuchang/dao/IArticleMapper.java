package cn.com.yeqiuchang.dao;

import org.springframework.stereotype.Repository;

import cn.com.yeqiuchang.domain.Article;
@Repository
public interface IArticleMapper {
	Article getArticle(int id);
}
