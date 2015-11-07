package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.LogTest;
import com.dao.LogTestMapper;
import com.service.LogTestService;
@Service
public class LogTestServiceImpl implements LogTestService{
         
	@Autowired
	   private LogTestMapper logTestMapper;
	public void save(LogTest logTest) {
		// TODO Auto-generated method stub
		logTestMapper.insert(logTest);
	}

}
