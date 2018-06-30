package com.etc.service;

import java.util.List;

import com.etc.entity.Article;

public interface ArticleService {

	public List<Article> getArticles();
	
	public Article getArticlesById(int articleId);
		
	public boolean addArticle(Article article);
	
	public boolean delArticle(int articleId);
	
	public boolean updArticleById(Article article,int articleId);
	

}
