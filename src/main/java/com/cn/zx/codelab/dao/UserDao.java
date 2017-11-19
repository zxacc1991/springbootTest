package com.cn.zx.codelab.dao;

import org.apache.ibatis.annotations.Mapper;

import com.cn.zx.codelab.domain.User;

/**   
 * @ClassName: UserDao
 * @Description: 用户Dao，查询用户信息
 * @author: Gavin  
 * @date: 2017年11月19日 下午11:05:13  
 * @version  1.0
 */
@Mapper
public interface UserDao {
	
	
	/**
	 * @Title: findUserById 
	 * @Description: 根据用户编号查找用户信息
	 * @Author: Gavin
	 * @Create Date: 2017年11月19日下午11:04:34
	 * @param userId 用户编号
	 * @return User
	 */
    User findUserById(Integer id);
    
}