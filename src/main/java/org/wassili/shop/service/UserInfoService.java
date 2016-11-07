package org.wassili.shop.service;

import java.util.List;

import org.wassili.shop.entity.UserInfo;

public interface UserInfoService {
	
	UserInfo load(Integer id);  
	  
    UserInfo get(Integer id);  
  
    List<UserInfo> findAll();  
  
    void persist(UserInfo entity);  
  
    Integer save(UserInfo entity);  
  
    void saveOrUpdate(UserInfo entity);  
  
    void delete(Integer id);  
  
    void flush(); 

}
