package com.etc.service.impl;

import java.util.Date;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.etc.dao.ArticleMapper;
import com.etc.entity.Article;
import com.etc.entity.Log;
import com.etc.service.ArticleService;
import com.etc.service.LogService;

@Service(value="articleService")
public class ArticleServiceImpl implements ArticleService {
	
	@Resource(name="articleDao")
	private ArticleMapper articlemapper;
	@Resource(name="logServiceImpl")
	private LogService logService;

	@Override
	public List<Article> getArticles() {
		// TODO Auto-generated method stub
		return articlemapper.getArticle();
	}

	@Override
	public Article getArticlesById(int articleId) {
		// TODO Auto-generated method stub
		return articlemapper.getArticleById(articleId);
	}

	/**
	 * 添加文章时，同时一条添加一条日志记录，该处用到事务管理，事务应写在service层
	 * 使用spring的注解（@Transactional）来实现事务管理
	 * propagation传播方式，isolation隔离级别
	 */
	@Override
	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.READ_COMMITTED)
	public boolean addArticle(Article article) {
		// TODO Auto-generated method stub
		boolean flag1 = articlemapper.addArticle(article);
		Log log = new Log();
		log.setLogop("添加文章");
		log.setLogDate(new Date().toLocaleString());
		
		//测试失败的情况
		/*int a = 10 ;
		System.out.println(a/0);*/
		
		boolean flag2 = logService.addLog(log);
		if (flag1 && flag2)
			return true ;
		return false ;
	}

	@Override
	public boolean delArticle(int articleId) {
		// TODO Auto-generated method stub
		return articlemapper.delArticleById(articleId);
	}

	@Override
	public boolean updArticleById(Article article, int articleId) {
		// TODO Auto-generated method stub
		return articlemapper.updArticleById(article, articleId);
	}

}
