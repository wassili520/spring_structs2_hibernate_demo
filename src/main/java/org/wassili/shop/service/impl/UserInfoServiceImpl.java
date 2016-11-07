package org.wassili.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wassili.shop.dao.UserInfoDao;
import org.wassili.shop.entity.UserInfo;
import org.wassili.shop.service.UserInfoService;

@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {
	
	@Autowired  
    private UserInfoDao userInfoDao;  
  
    @Override  
    public UserInfo load(Integer id) {  
        return null;  
    }  
  
    @Override  
    public UserInfo get(Integer id) {  
        return userInfoDao.get(id);  
    }  
  
    @Override  
    public List<UserInfo> findAll() {  
        return userInfoDao.findAll();  
    }  
  
    @Override  
    public void persist(UserInfo entity) {  
        userInfoDao.persist(entity);  
    }  
  
    @Override  
    public Integer save(UserInfo entity) {  
        return userInfoDao.save(entity);  
    }  
  
    @Override  
    public void saveOrUpdate(UserInfo entity) {  
        userInfoDao.saveOrUpdate(entity);  
    }  
  
    @Override  
    public void delete(Integer id) {  
        userInfoDao.delete(id);  
    }  
  
    @Override  
    public void flush() {  
        userInfoDao.flush();  
    }  

}
