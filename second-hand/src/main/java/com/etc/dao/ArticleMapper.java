package com.etc.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.etc.entity.Article;

@Repository(value="articleDao")
public interface ArticleMapper {
	
	/**
	 * 查询所有文章
	 * @return
	 */
	public List<Article> getArticle();
	/**
	 * 根据Id查询文章信息
	 * @param articleId
	 * @return
	 */
	public Article getArticleById(int articleId);
	
	/**
	 * 添加文章
	 * @param article
	 * @return
	 */
	public boolean addArticle(Article article);
	
	/**
	 * 删除文章
	 * @param articleId
	 * @return
	 */
	public boolean delArticleById(int articleId);
	
	/**
	 * 更新文章
	 * @param article 参数是一个article对象，想要早mybatis中的配置文件中使用，
	 *             就必须在参数前@param，指明一个value，然后在配置文件中使用
	 * @param articleId
	 * @return
	 */
	public boolean updArticleById(@Param(value="article") Article article,@Param(value="articleId") int articleId);
	
	
	

}
