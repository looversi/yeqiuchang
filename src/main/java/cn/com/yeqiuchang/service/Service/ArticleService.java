package cn.com.yeqiuchang.service.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.yeqiuchang.dao.IArticleMapper;
import cn.com.yeqiuchang.domain.Article;
import cn.com.yeqiuchang.service.IService.IArticleService;

@Service("articleService")
public class ArticleService implements IArticleService{
	@Autowired
	private IArticleMapper iArticleMapper;
	public Article getArticle(int id) {
		return iArticleMapper.getArticle(id);
	}

}
