package com.etc.controller;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.etc.entity.Article;
import com.etc.service.ArticleService;

@Controller
@RequestMapping(value="/api")
public class ArticleController {
	
	//声明的属性必须为接口类（ArticleSerivce），依赖注入必须是接口的实现类（ArticleSerivceImpl）
	@Resource(name="articleService")
	private ArticleService articleSerivce;

	/**
	 * 查询所有文章信息
	 * @param model 
	 * @return 返回一个String字符串，根据springMVC配置文件，该字符串是一个jsp页面，数据展示
	 */
	@RequestMapping("/article/show")
	public String getArticle(Model model) {

		List<Article> list = articleSerivce.getArticles();
		model.addAttribute("articleList", list);

		return "showArticles";
	}

	/**
	 * 添加文章
	 * @return 返回到添加文章的表单页面
	 */
	@RequestMapping("/article/add")
	public String toAddArticle() {

		return "addArticle";
	}

	/**
	 *  添加成功
	 * @param article
	 * @param model
	 * @return 转发到展示页面
	 */
	@RequestMapping("/article/addArticleEnd")
	public String addArticle(Article article) {

		articleSerivce.addArticle(article);

		return "redirect:show";
	}
	
	/**
	 * 删除文章
	 * @param articleId
	 * @return 删除成功，转发到展示页面
	 */
	@RequestMapping("/article/del")
	public String delArticle(int articleId) {
		articleSerivce.delArticle(articleId);
			
		return "redirect:show";
	}
	
	/**
	 * 更新文章
	 * @param articleId
	 * @param model
	 * @return 转发到填写文章信息的页面
	 */
	@RequestMapping("/article/upd")
	public String updArticle(int articleId,Model model) {
		Article article = articleSerivce.getArticlesById(articleId);
		model.addAttribute("article", article);
		return "updArticle";
	}
	
	/**
	 * 添加文章成功
	 * @param articleId
	 * @param article
	 * @return 转发到数据展示页面
	 */
	@RequestMapping("/article/updArticleEnd")
	public String updArticleEnd(int articleId,Article article) {
		
		articleSerivce.updArticleById(article, articleId);
		
		return "redirect:show";
	}
	
	

}
