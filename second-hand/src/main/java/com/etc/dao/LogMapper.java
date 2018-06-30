package com.etc.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.etc.entity.Article;
import com.etc.entity.Log;

@Repository(value="logDao")
public interface LogMapper {
	
	/**
	 * ��ѯ��������
	 * @return
	 */
	public List<Log> getLog();
	/**
	 * ����Id��ѯ������Ϣ
	 * @param logId
	 * @return
	 */
	public Article getLogById(int logId);
	
	/**
	 * �������
	 * @param log
	 * @return
	 */
	public boolean addLog(Log log);
	
	
	

}
