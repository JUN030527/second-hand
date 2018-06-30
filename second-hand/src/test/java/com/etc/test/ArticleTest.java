package com.etc.test;
import java.util.List;
import javax.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.etc.entity.Article;
import com.etc.service.ArticleService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:mybatis-config.xml"})
public class ArticleTest {
	
	@Resource(name="articleService")
	private ArticleService articleService ;
	
	@Test
	public void getArticle() {
		List<Article> list = articleService.getArticles();
		list.forEach(System.out::println);
	}

}
