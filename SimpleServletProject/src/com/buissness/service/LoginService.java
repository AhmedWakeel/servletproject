package com.buissness.service;

public class LoginService {

	public boolean authenticate(String password)
	{
		if( password != null  && "1234".equals(password))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
