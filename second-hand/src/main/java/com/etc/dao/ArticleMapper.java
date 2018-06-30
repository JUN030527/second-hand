package com.etc.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.etc.entity.Article;

@Repository(value="articleDao")
public interface ArticleMapper {
	
	/**
	 * ��ѯ��������
	 * @return
	 */
	public List<Article> getArticle();
	/**
	 * ����Id��ѯ������Ϣ
	 * @param articleId
	 * @return
	 */
	public Article getArticleById(int articleId);
	
	/**
	 * �������
	 * @param article
	 * @return
	 */
	public boolean addArticle(Article article);
	
	/**
	 * ɾ������
	 * @param articleId
	 * @return
	 */
	public boolean delArticleById(int articleId);
	
	/**
	 * ��������
	 * @param article ������һ��article������Ҫ��mybatis�е������ļ���ʹ�ã�
	 *             �ͱ����ڲ���ǰ@param��ָ��һ��value��Ȼ���������ļ���ʹ��
	 * @param articleId
	 * @return
	 */
	public boolean updArticleById(@Param(value="article") Article article,@Param(value="articleId") int articleId);
	
	
	

}
