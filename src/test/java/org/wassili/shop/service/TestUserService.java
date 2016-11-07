package org.wassili.shop.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.wassili.shop.entity.UserInfo;

import com.alibaba.fastjson.JSON;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml",  
        "classpath:spring-hibernate.xml"})
public class TestUserService {
	
	private static final Logger logger = LoggerFactory.getLogger(TestUserService.class);
	
	@Autowired
	private UserInfoService userInfoService;
	
	@Test
	public void save() {
		UserInfo userInfo = new UserInfo();  
        userInfo.setName("zty");  
        userInfo.setAge(23);  
        userInfo.setTelephone("13212221333");  
        Integer id = userInfoService.save(userInfo);  
        JSON.toJSONString(id);  
	}

}
