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
	
	//���������Ա���Ϊ�ӿ��ࣨArticleSerivce��������ע������ǽӿڵ�ʵ���ࣨArticleSerivceImpl��
	@Resource(name="articleService")
	private ArticleService articleSerivce;

	/**
	 * ��ѯ����������Ϣ
	 * @param model 
	 * @return ����һ��String�ַ���������springMVC�����ļ������ַ�����һ��jspҳ�棬����չʾ
	 */
	@RequestMapping("/article/show")
	public String getArticle(Model model) {

		List<Article> list = articleSerivce.getArticles();
		model.addAttribute("articleList", list);

		return "showArticles";
	}

	/**
	 * �������
	 * @return ���ص�������µı�ҳ��
	 */
	@RequestMapping("/article/add")
	public String toAddArticle() {

		return "addArticle";
	}

	/**
	 *  ��ӳɹ�
	 * @param article
	 * @param model
	 * @return ת����չʾҳ��
	 */
	@RequestMapping("/article/addArticleEnd")
	public String addArticle(Article article) {

		articleSerivce.addArticle(article);

		return "redirect:show";
	}
	
	/**
	 * ɾ������
	 * @param articleId
	 * @return ɾ���ɹ���ת����չʾҳ��
	 */
	@RequestMapping("/article/del")
	public String delArticle(int articleId) {
		articleSerivce.delArticle(articleId);
			
		return "redirect:show";
	}
	
	/**
	 * ��������
	 * @param articleId
	 * @param model
	 * @return ת������д������Ϣ��ҳ��
	 */
	@RequestMapping("/article/upd")
	public String updArticle(int articleId,Model model) {
		Article article = articleSerivce.getArticlesById(articleId);
		model.addAttribute("article", article);
		return "updArticle";
	}
	
	/**
	 * ������³ɹ�
	 * @param articleId
	 * @param article
	 * @return ת��������չʾҳ��
	 */
	@RequestMapping("/article/updArticleEnd")
	public String updArticleEnd(int articleId,Article article) {
		
		articleSerivce.updArticleById(article, articleId);
		
		return "redirect:show";
	}
	
	

}
