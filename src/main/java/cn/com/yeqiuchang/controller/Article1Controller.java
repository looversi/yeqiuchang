package cn.com.yeqiuchang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.com.yeqiuchang.domain.Article;
import cn.com.yeqiuchang.domain.Index;
import cn.com.yeqiuchang.service.IService.IArticleService;

@Controller
public class Article1Controller {
	@Autowired
	@Qualifier("articleService")
	private IArticleService articleService;
	//测试，通过id进行查询Article
	@RequestMapping(value="/api/article/1",method=RequestMethod.GET)
	public @ResponseBody Article getArticle(@RequestBody Index index){
		return articleService.getArticle(index.getId());
	}
}
