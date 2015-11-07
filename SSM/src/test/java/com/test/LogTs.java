package com.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bean.LogTest;
import com.service.LogTestService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:applicationContext-context.xml")
public class LogTs {
	@Autowired
	  private LogTestService logTestService;
	
	@Test
	 public void save(){
		 LogTest log = new LogTest();
		 log.setText(" log inf ");
		 logTestService.save(log);
	 }

}
