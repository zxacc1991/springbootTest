package com.cn.zx.codelab.domain;

/**   
 * @ClassName: User
 * @Description: 用户类(用户的基本信息) 
 * @author: Gavin  
 * @date: 2017年11月19日 下午9:59:04  
 * @version 1.0
 */
public class User {
	
	/**     
	 * @Fields userName : 用户名称
	 */
	private String userName;
	
	/**     
	 * @Fields userAge : 用户年龄
	 */
	private int userAge;
	
	/**     
	 * @Fields addr : 用户地址
	 */
	private String addr;
	
	/**     
	 * @Fields phone : 用户手机号
	 */
	private String phone;
	
	/**     
	 * @Fields sex : 用户性别
	 */
	private int sex;
	
	/**     
	 * @Fields email : 用户邮箱
	 */
	private String email;
	
	public User() {
		super();
	}
	
	public User(String userName, int userAge, String addr, String phone, int sex) {
		super();
		this.userName = userName;
		this.userAge = userAge;
		this.addr = addr;
		this.phone = phone;
		this.sex = sex;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	
}
