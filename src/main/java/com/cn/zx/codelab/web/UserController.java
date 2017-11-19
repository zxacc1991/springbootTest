package com.cn.zx.codelab.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cn.zx.codelab.domain.User;
import com.cn.zx.codelab.service.UserService;

@RestController
@RequestMapping("/user")  
public class UserController {

	@Autowired 
	private UserService userService;
	
	@RequestMapping("/test")  
	public String test(){
		System.out.println("Hello World ！");
		return "Hello World !";
	}
	
	/**
	 * @Title: findUserById 
	 * @Description: 根据用户编号查找用户信息
	 * @Author: Gavin
	 * @Create Date: 2017年11月19日下午11:05:56
	 * @param userId 用户编号
	 * @return 
	 */
	@RequestMapping("/findUserById")
    public User findUserById(@RequestParam(value="userId") String userId) {
		
		if(StringUtils.isEmpty(userId)){
			
		}
        User user = userService.findUserById(userId);
        return user;
    }
}
