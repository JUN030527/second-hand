package com.etc.entity;

import java.io.Serializable;

public class Article implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int articleId ;
	private String articleTitle ;
	private String articleContent ;
	private String articleAuthor ;
	private String articleDate ;
	
	public Article() {
		// TODO Auto-generated constructor stub
	}
	
	public Article(String articleTitle, String articleContent, String articleAuthor) {
		super();
		this.articleTitle = articleTitle;
		this.articleContent = articleContent;
		this.articleAuthor = articleAuthor;
	}
	public int getArticleId() {
		return articleId;
	}
	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}
	public String getArticleTitle() {
		return articleTitle;
	}
	public void setArticleTitle(String articleTitle) {
		this.articleTitle = articleTitle;
	}
	public String getArticleContent() {
		return articleContent;
	}
	public void setArticleContent(String articleContent) {
		this.articleContent = articleContent;
	}
	public String getArticleAuthor() {
		return articleAuthor;
	}
	public void setArticleAuthor(String articleAuthor) {
		this.articleAuthor = articleAuthor;
	}
	public String getArticleDate() {
		return articleDate;
	}
	public void setArticleDate(String articleDate) {
		this.articleDate = articleDate;
	}
	@Override
	public String toString() {
		return "Article [articleId=" + articleId + ", articleTitle=" + articleTitle + ", articleContent="
				+ articleContent + ", articleAuthor=" + articleAuthor + ", articleDate=" + articleDate + "]";
	}
	
	
}
