package com.etc.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.etc.entity.Article;
import com.etc.entity.Log;

@Repository(value="logDao")
public interface LogMapper {
	
	/**
	 * 查询所有文章
	 * @return
	 */
	public List<Log> getLog();
	/**
	 * 根据Id查询文章信息
	 * @param logId
	 * @return
	 */
	public Article getLogById(int logId);
	
	/**
	 * 添加文章
	 * @param log
	 * @return
	 */
	public boolean addLog(Log log);
	
	
	

}
