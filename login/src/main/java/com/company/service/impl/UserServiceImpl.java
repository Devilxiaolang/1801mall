package com.company.service.impl;

import com.company.dao.idao.UserDao;
import com.company.service.dto.Loginvo;
import com.company.service.iservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	@Qualifier("userDao")
    UserDao userdao;
	@Override
	public boolean login(Loginvo loginvo){
		boolean flag = false;
		try {
			if(userdao.login(loginvo)!=0){
				flag=true;
			}
		} catch (Exception e) {
		}
		return flag;
	}

	@Override
	public boolean isUserExist(String username) {
		boolean flag  =false;
		try {
			if(userdao.isUserExist(username)!=0){
				flag=true;
			}
		} catch (Exception e) {
		}
		return flag;
	}

}
