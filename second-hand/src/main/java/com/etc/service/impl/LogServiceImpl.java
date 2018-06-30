package com.etc.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.etc.dao.LogMapper;
import com.etc.entity.Log;
import com.etc.service.LogService;

@Service(value="logServiceImpl")
public class LogServiceImpl implements LogService {
	
	@Resource(name="logDao")
	private LogMapper logMapper;

	@Override
	public boolean addLog(Log log) {
		// TODO Auto-generated method stub
		return logMapper.addLog(log);
	}
	


}
