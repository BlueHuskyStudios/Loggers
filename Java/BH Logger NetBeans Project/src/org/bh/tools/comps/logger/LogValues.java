package org.bh.tools.comps.logger;

import org.bh.tools.util.json.JSONObject;
import org.bh.tools.util.json.JSONPair;

/**
 * LogValues, made for BH Logger, is copyright Blue Husky Programming ©2015 GPLv3 <hr/>
 * 
 * @author Kyli of Blue Husky Programming
 * @version 1.0.0
 *		- 2015-01-02 (1.0.0) - Kyli created LogValues
 * @since 2015-01-02
 */
public class LogValues extends JSONObject
{
	public static final String USERNAME_KEY = "user";
	public static final String PASSWORD_KEY = "pass";
	
	public LogValues()
	{
		set(USERNAME_KEY, new Username());
		set(PASSWORD_KEY, new Password());
	}
	
	/**
	 * Returns the current username
	 * @return the current username
	 */
	public Username getUsername()
	{
		return get(USERNAME_KEY);
	}
	
	/**
	 * Returns the current password
	 * @return the current password
	 */
	public Password getPassword()
	{
		return get(PASSWORD_KEY);
	}
	
	/**
	 * Changes the username
	 * @param newUsername the new username
	 */
	public void setUsername(Username newUsername)
	{
		set(USERNAME_KEY, newUsername);
	}
	
	/**
	 * Changes the password
	 * @param newPassword the new password
	 */
	public void setPassword(Password newPassword)
	{
		set(PASSWORD_KEY, newPassword);
	}
	
	/**
	 * Adds or changes a log value other than a password or username
	 * @param key the name of the value
	 * @param logValue the value
	 */
	public void setOtherLogValue(CharSequence key, LogValue logValue)
	{
		set(key, logValue);
	}
}
