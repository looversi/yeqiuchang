package cn.com.yeqiuchang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.yeqiuchang.domain.Article;
import cn.com.yeqiuchang.service.IService.IArticleService;

@Controller
@RequestMapping("/api/article/1")
public class Article1Controller {
	@Autowired
	@Qualifier("articleService")
	private IArticleService articleService;
	//测试，通过id进行查询Article
	@RequestMapping(method=RequestMethod.GET)
	public @ResponseBody Article getArticle(@PathVariable() int id){
		return articleService.getArticle(id);
	}
}
