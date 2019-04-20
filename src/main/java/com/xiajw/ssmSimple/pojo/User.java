package com.xiajw.ssmSimple.pojo;

import java.io.Serializable;

public class User implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private String userName;

	private String userNumber;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + 
				", userNumber=" + userNumber + "]";
	}

}
