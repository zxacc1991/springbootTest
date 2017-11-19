package com.cn.zx.codelab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.zx.codelab.dao.UserDao;
import com.cn.zx.codelab.domain.User;


@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	/**
	 * @Title: findUserById 
	 * @Description: 根据用户编号查找用户信息
	 * @Author: Gavin
	 * @Create Date: 2017年11月19日下午11:04:34
	 * @param userId 用户编号
	 * @return User
	 */
	public User findUserById(String userId){
		return new User();
	}

}
